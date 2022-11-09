package org.emoflon.ibex.gt.testsuite.FamiliesToPersons;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationApp;
import SimpleFamiliesGraphTransformation.api.matches.FindFamilyMatch;
import SimpleFamiliesGraphTransformation.api.matches.FindRegisterMatch;
import SimpleFamiliesGraphTransformation.api.rules.FindFamilyPattern;
import SimplePersons.PersonRegister;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationApp;

/**
 * Tests for the SimpleFamilies and SimplePersons Graph Transformation API.
 */
public class FamiliesToSimplePersons2Test
		extends GTAppTestCase<SimplePersonsGraphTransformationApp, SimplePersonsGraphTransformationAPI> {
	SimplePersonsGraphTransformationAPI personsAPI;
	SimpleFamiliesGraphTransformationAPI familiesAPI;

	@Override
	public String getTestName() {
		return "SimpleFamiliesToSimplePersons2";
	}

	@Override
	protected SimplePersonsGraphTransformationApp getApp() {
		return new SimplePersonsGraphTransformationApp(initEngine(), workspacePath);
	}

	/**
	 * Read objects from the FamilyRegister via the SimpleFamilies API and create
	 * objects in the PersonRegister via the SimplePersons API.
	 */
	@Test
	public void simpleFamiliesToPersons2() {
		personsAPI = this.init("PersonRegisters.xmi");

		SimpleFamiliesGraphTransformationApp familiesApp = new SimpleFamiliesGraphTransformationApp(initEngine(),
				workspacePath);
		familiesApp.loadModel(URI.createFileURI(resourcePath + this.getTestName() + "/" + "FamilyRegisters.xmi"));
		familiesAPI = familiesApp.initAPI();

		transformRegisters();

		assertMatchCount(2, personsAPI.findRegister());
		assertMatchCount(4, personsAPI.findFemale());
		assertMatchCount(4, personsAPI.findMale());
		assertMatchCount(8, personsAPI.findPerson());

		saveAndTerminate(personsAPI);
	}

	private void transformRegisters() {
		for (FindRegisterMatch familyRegisterMatch : familiesAPI.findRegister().findMatches()) {
			personsAPI.createRegister().apply().ifPresent(personRegisterMatch -> {
				transformFamilies(familyRegisterMatch.getRegister(), personRegisterMatch.getRegister());
			});
		}
	}

	private void transformFamilies(FamilyRegister familyRegister, PersonRegister personRegister) {
		FindFamilyPattern familyPattern = familiesAPI.findFamily().bindRegister(familyRegister);
		for (FindFamilyMatch familyMatch : familyPattern.findMatches()) {
			Family family = familyMatch.getFamily();
			familiesAPI.findFather().bindFamily(family)
					.forEachMatch(fatherMatch -> createMale(family, fatherMatch.getMember(), personRegister));
			familiesAPI.findSon().bindFamily(family)
					.forEachMatch(sonMatch -> createMale(family, sonMatch.getMember(), personRegister));
			familiesAPI.findMother().bindFamily(family)
					.forEachMatch(motherMatch -> createFemale(family, motherMatch.getMember(), personRegister));
			familiesAPI.findDaughter().bindFamily(family)
					.forEachMatch(daughterMatch -> createFemale(family, daughterMatch.getMember(), personRegister));
		}
	}

	private void createMale(final Family family, final FamilyMember member, final PersonRegister personRegister) {
		personsAPI.createMale(this.getFullName(family, member)).bindRegister(personRegister).apply();
	}

	private void createFemale(final Family family, final FamilyMember member, final PersonRegister personRegister) {
		personsAPI.createFemale(this.getFullName(family, member)).bindRegister(personRegister).apply();
	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}
}
