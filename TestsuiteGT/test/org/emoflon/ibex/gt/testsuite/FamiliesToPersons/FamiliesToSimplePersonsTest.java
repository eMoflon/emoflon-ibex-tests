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
import families2persons.gt.api.match.CreateRegisterCoMatch;
import families2persons.gt.api.match.FindFamilyMatch;
import families2persons.gt.api.match.FindFamilyRegisterMatch;
import families2persons.gt.api.pattern.FindFamilyPattern;
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

		transformRegisters(api);

		assertMatchCount(2, api.findRegister());
		assertMatchCount(4, api.findFemale());
		assertMatchCount(4, api.findMale());
		assertMatchCount(8, api.findPerson());

		api.terminate();
	}

	private void transformRegisters(GtGtAPI<?> api) {
		for (FindFamilyRegisterMatch familyRegisterMatch : api.findFamilyRegister().getMatches()) {
			CreateRegisterCoMatch m = api.createRegister().applyAny();
			if(m != null) {
				transformFamilies(api, familyRegisterMatch.register(), m.register());
			}
		}
	}

	private void transformFamilies(GtGtAPI<?> api, FamilyRegister familyRegister, PersonRegister personRegister) {
		FindFamilyPattern familyPattern = api.findFamily().bindRegister(familyRegister);
		for (FindFamilyMatch familyMatch : familyPattern.getMatches()) {
			Family family = familyMatch.family();
			api.findFather().bindFamily(family).getMatches().forEach(fatherMatch -> createMale(api, family, fatherMatch.member(), personRegister));
			api.findSon().bindFamily(family).getMatches().forEach(sonMatch -> createMale(api, family, sonMatch.member(), personRegister));
			api.findMother().bindFamily(family).getMatches().forEach(motherMatch -> createFemale(api, family, motherMatch.member(), personRegister));
			api.findDaughter().bindFamily(family).getMatches().forEach(daughterMatch -> createFemale(api, family, daughterMatch.member(), personRegister));
		}
	}

	private void createMale(GtGtAPI<?> api, final Family family, final FamilyMember member, final PersonRegister personRegister) {
		api.createMale(this.getFullName(family, member)).bindRegister(personRegister).applyAny();
	}

	private void createFemale(GtGtAPI<?> api, final Family family, final FamilyMember member, final PersonRegister personRegister) {
		api.createFemale(this.getFullName(family, member)).bindRegister(personRegister).applyAny();
	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}

	private void setName(final Person person, final Family family, final FamilyMember member) {
		person.setName(family.getName() + ", " + member.getName());
	}
}
