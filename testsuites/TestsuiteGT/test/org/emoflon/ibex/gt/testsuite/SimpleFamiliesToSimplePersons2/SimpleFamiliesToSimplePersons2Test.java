package org.emoflon.ibex.gt.testsuite.SimpleFamiliesToSimplePersons2;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationApp;
import SimplePersons.PersonRegister;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationApp;

/**
 * Tests for the SimpleFamilies and SimplePersons Graph Transformation API.
 */
public class SimpleFamiliesToSimplePersons2Test
		extends GTAppTestCase<SimplePersonsGraphTransformationApp, SimplePersonsGraphTransformationAPI> {

	@Override
	public String getTestName() {
		return "SimpleFamiliesToSimplePersons2";
	}

	@Override
	protected SimplePersonsGraphTransformationApp getApp() {
		return new SimplePersonsGraphTransformationApp();
	}

	/**
	 * Read objects from the FamilyRegister via the SimpleFamilies API and create
	 * objects in the PersonRegister via the SimplePersons API.
	 */
	@Test
	public void simpleFamiliesToPersons2() {
		SimplePersonsGraphTransformationAPI personsAPI = this.init("PersonRegisters.xmi");

		SimpleFamiliesGraphTransformationApp familiesApp = new SimpleFamiliesGraphTransformationApp();
		familiesApp.setWorkspacePath(workspacePath);
		familiesApp.loadModel(URI.createFileURI(resourcePath + this.getTestName() + "/" + "FamilyRegisters.xmi"));
		SimpleFamiliesGraphTransformationAPI familiesAPI = familiesApp.initAPI(initEngine());

		familiesAPI.findRegister().findMatches().forEach(familyRegisterMatch -> {
			FamilyRegister familyRegister = familyRegisterMatch.getRegister();
			personsAPI.createRegister().apply().ifPresent(personRegisterMatch -> {
				PersonRegister personRegister = personRegisterMatch.getRegister();
				familiesAPI.findFamily().bindRegister(familyRegister).findMatches().forEach(familyMatch -> {
					Family family = familyMatch.getFamily();
					familiesAPI.findFather().bindFamily(family).forEachMatch(fatherMatch -> {
						personsAPI.createMale(this.getFullName(family, fatherMatch.getMember()))
								.bindRegister(personRegister).apply();
					});
					familiesAPI.findSon().bindFamily(family).forEachMatch(sonMatch -> {
						personsAPI.createMale(this.getFullName(family, sonMatch.getMember()))
								.bindRegister(personRegister).apply();
					});
					familiesAPI.findMother().bindFamily(family).forEachMatch(motherMatch -> {
						personsAPI.createFemale(this.getFullName(family, motherMatch.getMember()))
								.bindRegister(personRegister).apply();
					});
					familiesAPI.findDaughter().bindFamily(family).forEachMatch(daughterMatch -> {
						personsAPI.createFemale(this.getFullName(family, daughterMatch.getMember()))
								.bindRegister(personRegister).apply();
					});
				});
			});
		});

		assertMatchCount(2, personsAPI.findRegister());
		assertMatchCount(4, personsAPI.findFemale());
		assertMatchCount(4, personsAPI.findMale());
		assertMatchCount(8, personsAPI.findPerson());

		saveAndTerminate(personsAPI);
	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}
}
