package org.emoflon.ibex.gt.testsuite.SimpleFamiliesToSimplePersons;

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
public class SimpleFamiliesToSimplePersonsTest extends GTTestCase<SimpleFamiliesGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "SimpleFamiliesToSimplePersons";
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

	protected SimplePersonsGraphTransformationAPI getSecondAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SimplePersonsGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	protected SimplePersonsGraphTransformationAPI initSecondAPI(final ResourceSet model) {
		DemoclesGTEngine engine = new DemoclesGTEngine();
		engine.setDebugPath("./debug/" + this.getTestName());
		return this.getSecondAPI(engine, model);
	}

	@Test
	public void simpleFamiliesToPersons() {
		ResourceSet familiesModel = initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI familiesAPI = this.initAPI(familiesModel);

		ResourceSet personsModel = initResourceSet("PersonRegister.xmi");
		SimplePersonsGraphTransformationAPI personsAPI = this.initSecondAPI(personsModel);

		familiesAPI.findRegister().findMatches().forEach(familyRegisterMatch -> {
			FamilyRegister familyRegister = familyRegisterMatch.getRegister();
			personsAPI.createRegister().apply().ifPresent(personRegisterMatch -> {
				PersonRegister personRegister = personRegisterMatch.getRegister();
				familiesAPI.findFamily().bindRegister(familyRegister).findMatches().forEach(familyMatch -> {
					Family family = familyMatch.getFamily();
					familiesAPI.findFather().bindFamily(family).forEachMatch(fatherMatch -> {
						syncMale(personsAPI, personRegister, fatherMatch.getFamily(), fatherMatch.getMember());
					});
					familiesAPI.findSon().bindFamily(family).forEachMatch(sonMatch -> {
						syncMale(personsAPI, personRegister, sonMatch.getFamily(), sonMatch.getMember());
					});
					familiesAPI.findMother().bindFamily(family).forEachMatch(fatherMatch -> {
						syncFemale(personsAPI, personRegister, fatherMatch.getFamily(), fatherMatch.getMember());
					});
					familiesAPI.findDaughter().bindFamily(family).forEachMatch(sonMatch -> {
						syncFemale(personsAPI, personRegister, sonMatch.getFamily(), sonMatch.getMember());
					});
				});
			});
		});

		saveResourceSet(familiesModel);
		saveResourceSet(personsModel);
	}

	private void syncMale(SimplePersonsGraphTransformationAPI personsAPI, PersonRegister personRegister, Family family,
			FamilyMember member) {
		String fullName = family.getName() + ", " + member.getName();
		personsAPI.createMale().bindRegister(personRegister).apply().ifPresent(personMatch -> {
			personMatch.getPerson().setName(fullName);
		});
	}

	private void syncFemale(SimplePersonsGraphTransformationAPI personsAPI, PersonRegister personRegister,
			Family family, FamilyMember member) {
		String fullName = family.getName() + ", " + member.getName();
		personsAPI.createFemale().bindRegister(personRegister).apply().ifPresent(personMatch -> {
			personMatch.getPerson().setName(fullName);
		});
	}
}
