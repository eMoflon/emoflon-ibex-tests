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
import families2persons.gt.api.GtGtApi;
import families2persons.gt.api.GtHiPEGtApi;
import families2persons.gt.api.match.CreateRegisterCoMatch;
import families2persons.gt.api.match.FindFamilyMatch;
import families2persons.gt.api.match.FindFamilyRegisterMatch;
import families2persons.gt.api.pattern.FindFamilyPattern;
import families2persons.gt.api.rule.DaughterToFemaleRule;
import families2persons.gt.api.rule.FatherToMaleRule;
import families2persons.gt.api.rule.MotherToFemaleRule;
import families2persons.gt.api.rule.SonToMaleRule;

/**
 * Tests for the SimpleFamiliesToSimplePersons Graph Transformation Api.
 */
public class FamiliesToSimplePersonsTest extends
		GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "FamiliesToPersons";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			default -> {yield new GtHiPEGtApi();}
		};
	}

	/**
	 * Apply rules automatically once on each match.
	 */
	@Test
	public void simpleFamiliesToPersons() {
		GtGtApi<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		api.familyRegisterToPersonRegister().applyAny();
//		TODO: Reimplement when subscriptions have returned -> so.. never
		MotherToFemaleRule motherRule = api.motherToFemale();
		motherRule.subscribeApplications((m, cm) -> this.setName(cm.person(), m.family(), m.member()));
		motherRule.applyAsLongAsPossible(10);

		DaughterToFemaleRule daughterRule = api.daughterToFemale();
		daughterRule.subscribeApplications((m, cm) -> this.setName(cm.person(), m.family(), m.member()));
		daughterRule.applyAsLongAsPossible(10);

		FatherToMaleRule fatherRule = api.fatherToMale();
		fatherRule.subscribeApplications((m, cm) -> this.setName(cm.person(), m.family(), m.member()));
		fatherRule.applyAsLongAsPossible(10);

		SonToMaleRule sonRule = api.sonToMale();
		sonRule.subscribeApplications((m, cm) -> this.setName(cm.person(), m.family(), m.member()));
		sonRule.applyAsLongAsPossible(10);

		assertEquals(2, motherRule.countRuleApplications());
		assertEquals(2, daughterRule.countRuleApplications());
		assertEquals(2, fatherRule.countRuleApplications());
		assertEquals(1, sonRule.countRuleApplications());

		assertMatchCount(1, api.findRegister());
		assertMatchCount(3, api.findMale());
		assertMatchCount(4, api.findFemale());
	}
	
	/**
	 * Read objects from the FamilyRegister via the SimpleFamilies Api and create
	 * objects in the PersonRegister via the SimplePersons Api.
	 */
	@Test
	public void simpleFamiliesToPersons2() {
		GtGtApi<?> api = this.init("PersonRegisters.xmi", "FamilyRegisters.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		transformRegisters(api);

		assertMatchCount(2, api.findRegister());
		assertMatchCount(4, api.findFemale());
		assertMatchCount(4, api.findMale());
		assertMatchCount(8, api.findPerson());

		api.terminate();
	}

	private void transformRegisters(GtGtApi<?> api) {
		for (FindFamilyRegisterMatch familyRegisterMatch : api.findFamilyRegister().getMatches()) {
			CreateRegisterCoMatch m = api.createRegister().applyAny();
			if(m != null) {
				transformFamilies(api, familyRegisterMatch.register(), m.register());
			}
		}
	}

	private void transformFamilies(GtGtApi<?> api, FamilyRegister familyRegister, PersonRegister personRegister) {
		FindFamilyPattern familyPattern = api.findFamily().bindRegister(familyRegister);
		for (FindFamilyMatch familyMatch : familyPattern.getMatches()) {
			Family family = familyMatch.family();
			api.findFather().bindFamily(family).getMatches().forEach(fatherMatch -> createMale(api, family, fatherMatch.member(), personRegister));
			api.findSon().bindFamily(family).getMatches().forEach(sonMatch -> createMale(api, family, sonMatch.member(), personRegister));
			api.findMother().bindFamily(family).getMatches().forEach(motherMatch -> createFemale(api, family, motherMatch.member(), personRegister));
			api.findDaughter().bindFamily(family).getMatches().forEach(daughterMatch -> createFemale(api, family, daughterMatch.member(), personRegister));
		}
	}

	private void createMale(GtGtApi<?> api, final Family family, final FamilyMember member, final PersonRegister personRegister) {
		api.createMale(this.getFullName(family, member)).bindRegister(personRegister).applyAny();
	}

	private void createFemale(GtGtApi<?> api, final Family family, final FamilyMember member, final PersonRegister personRegister) {
		api.createFemale(this.getFullName(family, member)).bindRegister(personRegister).applyAny();
	}

	private String getFullName(final Family family, final FamilyMember member) {
		return family.getName() + ", " + member.getName();
	}

	private void setName(final Person person, final Family family, final FamilyMember member) {
		person.setName(family.getName() + ", " + member.getName());
	}
}
