package org.emoflon.ibex.gt.testsuite.SimpleFamiliesToSimplePersons2;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesPackage;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimplePersons.PersonRegister;
import SimplePersons.SimplePersonsPackage;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;

/**
 * Tests for the SimpleFamilies and SimplePersons Graph Transformation API.
 */
public class SimpleFamiliesToSimplePersons2Test extends GTTestCase<SimpleFamiliesGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "SimpleFamiliesToSimplePersons2";
	}

	@Override
	protected SimpleFamiliesGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SimpleFamiliesGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SimpleFamiliesPackage.eNS_URI, SimpleFamiliesPackage.eINSTANCE);
		map.put(SimplePersonsPackage.eNS_URI, SimplePersonsPackage.eINSTANCE);
		return map;
	}

	/**
	 * Read objects from the FamilyRegister via the SimpleFamilies API and create
	 * objects in the PersonRegister via the SimplePersons API.
	 */
	@Test
	public void simpleFamiliesToPersons2() {
		ResourceSet familiesModel = initResourceSet("FamilyRegisters.xmi");
		SimpleFamiliesGraphTransformationAPI familiesAPI = this.initAPI(familiesModel);

		ResourceSet personsModel = initResourceSet("PersonRegisters.xmi");
		SimplePersonsGraphTransformationAPI personsAPI = new SimplePersonsGraphTransformationAPI(new DemoclesGTEngine(),
				personsModel, GTTestCase.workspacePath);

		familiesAPI.findRegister().findMatches().forEach(familyRegisterMatch -> {
			FamilyRegister familyRegister = familyRegisterMatch.getRegister();
			personsAPI.createRegister().apply().ifPresent(personRegisterMatch -> {
				PersonRegister personRegister = personRegisterMatch.getRegister();
				familiesAPI.findFamily().bindRegister(familyRegister).findMatches().forEach(familyMatch -> {
					Family family = familyMatch.getFamily();
					familiesAPI.findFather().bindFamily(family).forEachMatch(fatherMatch -> {
						memberToMale(personsAPI, personRegister, fatherMatch.getFamily(), fatherMatch.getMember());
					});
					familiesAPI.findSon().bindFamily(family).forEachMatch(sonMatch -> {
						memberToMale(personsAPI, personRegister, sonMatch.getFamily(), sonMatch.getMember());
					});
					familiesAPI.findMother().bindFamily(family).forEachMatch(fatherMatch -> {
						memberToFemale(personsAPI, personRegister, fatherMatch.getFamily(), fatherMatch.getMember());
					});
					familiesAPI.findDaughter().bindFamily(family).forEachMatch(sonMatch -> {
						memberToFemale(personsAPI, personRegister, sonMatch.getFamily(), sonMatch.getMember());
					});
				});
			});
		});

		assertMatchCount(2, personsAPI.findRegister());
		assertMatchCount(4, personsAPI.findFemale());
		assertMatchCount(4, personsAPI.findMale());
		assertMatchCount(8, personsAPI.findPerson());

		saveResourceSet(familiesModel);
		saveResourceSet(personsModel);
	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}

	private void memberToMale(final SimplePersonsGraphTransformationAPI personsAPI, final PersonRegister personRegister,
			final Family family, final FamilyMember member) {
		personsAPI.createMale().bindRegister(personRegister).apply().ifPresent(personMatch -> {
			personMatch.getPerson().setName(this.getFullName(family, member));
		});
	}

	private void memberToFemale(final SimplePersonsGraphTransformationAPI personsAPI,
			final PersonRegister personRegister, final Family family, final FamilyMember member) {
		personsAPI.createFemale().bindRegister(personRegister).apply().ifPresent(personMatch -> {
			personMatch.getPerson().setName(this.getFullName(family, member));
		});
	}
}
