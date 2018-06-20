package org.emoflon.ibex.gt.testsuite.SimpleFamiliesToSimplePersons;

import static org.junit.Assert.assertEquals;

import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.SimpleFamiliesToSimplePersonsGraphTransformationAPI;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.SimpleFamiliesToSimplePersonsGraphTransformationApp;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.DaughterToFemaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.FatherToMaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.MotherToFemaleRule;
import SimpleFamiliesToSimplePersonsGraphTransformation.api.rules.SonToMaleRule;
import SimplePersons.Person;
import SimplePersonsGraphTransformation.api.SimplePersonsGraphTransformationAPI;

/**
 * Tests for the SimpleFamiliesToSimplePersons Graph Transformation API.
 */
public class SimpleFamiliesToSimplePersonsTest extends
		GTAppTestCase<SimpleFamiliesToSimplePersonsGraphTransformationApp, SimpleFamiliesToSimplePersonsGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "SimpleFamiliesToSimplePersons";
	}

	@Override
	protected SimpleFamiliesToSimplePersonsGraphTransformationApp getApp() {
		return new SimpleFamiliesToSimplePersonsGraphTransformationApp();
	}

	/**
	 * Apply rules automatically once on each match.
	 */
	@Test
	public void simpleFamiliesToPersons() {
		SimpleFamiliesToSimplePersonsGraphTransformationAPI api = this.init("Registers.xmi", "FamilyRegister.xmi");
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

		saveAndTerminate(api);

		assertEquals(2, motherRule.countRuleApplications());
		assertEquals(2, daughterRule.countRuleApplications());
		assertEquals(2, fatherRule.countRuleApplications());
		assertEquals(1, sonRule.countRuleApplications());

		SimplePersonsGraphTransformationAPI personsAPI = new SimplePersonsGraphTransformationAPI(new DemoclesGTEngine(),
				api.getModel(), workspacePath);
		assertMatchCount(1, personsAPI.findRegister());
		assertMatchCount(3, personsAPI.findMale());
		assertMatchCount(4, personsAPI.findFemale());
	}

	private void setName(final Person person, final Family family, final FamilyMember member) {
		person.setName(family.getName() + ", " + member.getName());
	}
}
