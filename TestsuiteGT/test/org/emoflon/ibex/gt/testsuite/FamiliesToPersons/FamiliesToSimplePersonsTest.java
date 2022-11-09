package org.emoflon.ibex.gt.testsuite.FamiliesToPersons;

import static org.junit.jupiter.api.Assertions.*;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;
import org.junit.jupiter.api.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimplePersons.Person;
import SimplePersons.PersonRegister;
import families2persons.gt.api.GtGtAPI;
import families2persons.gt.api.GtHiPEGtAPI;
import families2persons.gt.api.rule.DaughterToFemaleRule;
import families2persons.gt.api.rule.FatherToMaleRule;
import families2persons.gt.api.rule.MotherToFemaleRule;
import families2persons.gt.api.rule.SonToMaleRule;

/**
 * Tests for the SimpleFamiliesToSimplePersons Graph Transformation API.
 */
public class FamiliesToSimplePersonsTest extends
		GTAppTestCase<GtGtAPI<?>> {

	@Override
	protected String getTestName() {
		return "FamiliesToPersons";
	}

	@Override
	protected GtGtAPI<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtAPI<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtAPI();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtAPI();}
		};
	}

	/**
	 * Apply rules automatically once on each match.
	 */
	@Test
	public void simpleFamiliesToPersons() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
//		TODO: Reimplement when subscriptions have returned -> so.. never
//		MotherToFemaleRule motherRule = api.motherToFemale();
//		motherRule.enableAutoApply();
//		motherRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));
//
//		DaughterToFemaleRule daughterRule = api.daughterToFemale();
//		daughterRule.enableAutoApply();
//		daughterRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));
//
//		FatherToMaleRule fatherRule = api.fatherToMale();
//		fatherRule.enableAutoApply();
//		fatherRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));
//
//		SonToMaleRule sonRule = api.sonToMale();
//		sonRule.enableAutoApply();
//		sonRule.subscribeRuleApplications(m -> this.setName(m.getPerson(), m.getFamily(), m.getMember()));

		api.updateMatches();

//		saveAndTerminate(api);

//		assertEquals(2, motherRule.countRuleApplications());
//		assertEquals(2, daughterRule.countRuleApplications());
//		assertEquals(2, fatherRule.countRuleApplications());
//		assertEquals(1, sonRule.countRuleApplications());
//		
//		SimplePersonsGraphTransformationApp personsApp = new SimplePersonsGraphTransformationApp(this.initEngine(), workspacePath);
//		personsApp.setModel(api.getModel());
//		personsApp.registerMetaModels();
//		SimplePersonsGraphTransformationAPI personsAPI = personsApp.initAPI();
//		assertMatchCount(1, personsAPI.findRegister());
//		assertMatchCount(3, personsAPI.findMale());
//		assertMatchCount(4, personsAPI.findFemale());
	}
	
	/**
	 * Read objects from the FamilyRegister via the SimpleFamilies API and create
	 * objects in the PersonRegister via the SimplePersons API.
	 */
	@Test
	public void simpleFamiliesToPersons2() {
		GtGtAPI<?> api = this.init("PersonRegisters.xmi", "FamilyRegisters.xmi");

//		transformRegisters();

		assertMatchCount(2, api.findRegister());
		assertMatchCount(4, api.findFemale());
		assertMatchCount(4, api.findMale());
		assertMatchCount(8, api.findPerson());

		api.terminate();
	}

//	private void transformRegisters() {
//		for (FindRegisterMatch familyRegisterMatch : familiesAPI.findRegister().findMatches()) {
//			personsAPI.createRegister().apply().ifPresent(personRegisterMatch -> {
//				transformFamilies(familyRegisterMatch.getRegister(), personRegisterMatch.getRegister());
//			});
//		}
//	}
//
//	private void transformFamilies(FamilyRegister familyRegister, PersonRegister personRegister) {
//		FindFamilyPattern familyPattern = familiesAPI.findFamily().bindRegister(familyRegister);
//		for (FindFamilyMatch familyMatch : familyPattern.findMatches()) {
//			Family family = familyMatch.getFamily();
//			familiesAPI.findFather().bindFamily(family)
//					.forEachMatch(fatherMatch -> createMale(family, fatherMatch.getMember(), personRegister));
//			familiesAPI.findSon().bindFamily(family)
//					.forEachMatch(sonMatch -> createMale(family, sonMatch.getMember(), personRegister));
//			familiesAPI.findMother().bindFamily(family)
//					.forEachMatch(motherMatch -> createFemale(family, motherMatch.getMember(), personRegister));
//			familiesAPI.findDaughter().bindFamily(family)
//					.forEachMatch(daughterMatch -> createFemale(family, daughterMatch.getMember(), personRegister));
//		}
//	}
//
//	private void createMale(final Family family, final FamilyMember member, final PersonRegister personRegister) {
//		personsAPI.createMale(this.getFullName(family, member)).bindRegister(personRegister).apply();
//	}
//
//	private void createFemale(final Family family, final FamilyMember member, final PersonRegister personRegister) {
//		personsAPI.createFemale(this.getFullName(family, member)).bindRegister(personRegister).apply();
//	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}

	private void setName(final Person person, final Family family, final FamilyMember member) {
		person.setName(family.getName() + ", " + member.getName());
	}
}
