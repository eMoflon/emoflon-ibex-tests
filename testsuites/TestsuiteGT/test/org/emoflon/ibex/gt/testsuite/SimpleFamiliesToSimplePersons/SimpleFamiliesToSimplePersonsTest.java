package org.emoflon.ibex.gt.testsuite.SimpleFamiliesToSimplePersons;

import static org.junit.Assert.assertEquals;

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
import SimpleFamilies.SimpleFamiliesPackage;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.SimpleFamiliesToSimplePersonsGraphTransformationAPI;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.DaughterToFemaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.FatherToMaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.MotherToFemaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.SonToMaleRule;
import SimplePersons.Person;
import SimplePersons.SimplePersonsPackage;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;

/**
 * Tests for the SimpleFamiliesToSimplePersons Graph Transformation API.
 */
public class SimpleFamiliesToSimplePersonsTest extends GTTestCase<SimpleFamiliesToSimplePersonsGraphTransformationAPI> {
	@Override
	protected String getTestName() {
		return "SimpleFamiliesToSimplePersons";
	}

	@Override
	protected SimpleFamiliesToSimplePersonsGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SimpleFamiliesToSimplePersonsGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SimpleFamiliesPackage.eNS_URI, SimpleFamiliesPackage.eINSTANCE);
		map.put(SimplePersonsPackage.eNS_URI, SimplePersonsPackage.eINSTANCE);
		return map;
	}

	/**
	 * Apply rules automatically once on each match.
	 */
	@Test
	public void simpleFamiliesToPersons() {
		ResourceSet model = this.initResourceSet("Registers.xmi", "FamilyRegister.xmi");
		SimpleFamiliesToSimplePersonsGraphTransformationAPI api = this.initAPI(model);

		api.familyRegisterToPersonRegister().enableAutoApply();

		MotherToFemaleRule motherRule = api.motherToFemale();
		motherRule.enableAutoApply();
		motherRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));

		DaughterToFemaleRule daughterRule = api.daughterToFemale();
		daughterRule.enableAutoApply();
		daughterRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));

		FatherToMaleRule fatherRule = api.fatherToMale();
		fatherRule.enableAutoApply();
		fatherRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));

		SonToMaleRule sonRule = api.sonToMale();
		sonRule.enableAutoApply();
		sonRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));

		api.updateMatches();

		saveResourceSet(model);

		assertEquals(2, motherRule.countRuleApplications());
		assertEquals(2, daughterRule.countRuleApplications());
		assertEquals(2, fatherRule.countRuleApplications());
		assertEquals(1, sonRule.countRuleApplications());

		SimplePersonsGraphTransformationAPI personsAPI = new SimplePersonsGraphTransformationAPI(new DemoclesGTEngine(),
				model, workspacePath);
		assertMatchCount(1, personsAPI.findRegister());
		assertMatchCount(3, personsAPI.findMale());
		assertMatchCount(4, personsAPI.findFemale());
	}

	private void setName(final Person person, final Family family, final FamilyMember member) {
		person.setName(family.getName() + ", " + member.getName());
	}
}
