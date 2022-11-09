package org.emoflon.ibex.gt.testsuite.Families;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import families.gt.api.GtGtAPI;
import families.gt.api.match.CreateFamilyCoMatch;
import families.gt.api.match.CreateFamilyRegisterCoMatch;
import families.gt.api.match.DeleteFamilyCoMatch;
import families.gt.api.match.FindFamilyMatch;

/**
 * Tests for rule applications with the SimpleFamilies Graph Transformation API.
 */
public class FamiliesRulesTest extends FamiliesAbstractTest {

	@Test
	public void createAndDeleteRegister() {
		GtGtAPI<?> api = this.initEmpty("CreateAndDeleteRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertNoMatch(api.findFamilyRegister());
		assertMatchCount(1, api.createFamilyRegister()); // create rule is applicable
		assertApplicableAndApply(api.createFamilyRegister());
		assertMatchCount(1, api.findFamilyRegister());

		assertApplicableAndApply(api.deleteFamilyRegister());
		assertNoMatch(api.findFamilyRegister());

		terminate(api);
	}

	@Test
	public void createFamily() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findFamily());
		assertApplicableAndApply(api.createFamily("Smith"));
		assertMatchCount(3, api.findFamily());

		terminate(api);
	}

	@Test
	public void createMillerFamily() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findFamily());
		api.createMillerFamily().applyAny();
		assertMatchCount(3, api.findFamily());

		terminate(api);
	}

	@Test
	public void create20Families() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		//TODO: Check this with null values. HiPE and GT constraint checks are not null safe!
		assertMatchCount(2, api.findFamily());
		for(int i=0; i<20; i++) {
			api.createFamily().setParameters("NULL").applyAny();
		}
		assertEquals(20, api.createFamily().setParameters("NULL").countRuleApplications());
		assertMatchCount(22, api.findFamily());

		Supplier<FindFamilyMatch> findNullFamily = () -> api.findFamily().matchStream()
				.filter(m -> m.family().getName().equals("NULL")).findAny().orElse(null);
		while(findNullFamily.get() != null && api.deleteFamily().bindFamily(findNullFamily.get().family()).bindRegister(findNullFamily.get().register()).hasMatches())
			api.deleteFamily().applyAny();
		
		assertEquals(20, api.deleteFamily().countRuleApplications());
		assertMatchCount(2, api.findFamily());

		terminate(api);
	}

	@Test
	public void deleteWatsonFamilyWithFamilyBinding() {
		GtGtAPI<?> api = this.init(
				"FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		Family watsonFamily = api.findFamily().matchStream() //
				.filter(m -> m.family().getName().equals("Watson")) //
				.map(m -> m.family()) //
				.findAny().get();
		DeleteFamilyCoMatch m = assertApplicableAndApply(api.deleteFamily().bindFamily(watsonFamily));
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.typedMatch.family().getName());

		terminate(api);
	}

	@Test
	public void deleteWatsonFamilyWithMatchBinding() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		FindFamilyMatch watsonMatch = api.findFamily().matchStream()
				.filter(m -> m.family().getName().equals("Watson")) //
				.findAny().get();
		DeleteFamilyCoMatch m = assertApplicableAndApply(api.deleteFamily().bindFamily(watsonMatch.family()));
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.typedMatch.family().getName());

		terminate(api);
	}

	@Test
	public void deleteAnyFamilyForDifferentPushoutApproachesOnRuleLevel() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findFamily());
		//TODO: Removed the configuration option for the push-out approach, since no one was using anything other than SPO.
//		// DPO: Families have members, so they cannot be deleted.
//		assertNotApplicable(api.deleteFamily().setDPO());
//		assertMatchCount(2, api.findFamily());

		// SPO: Deletion is possible, references to members deleted as well.
		assertApplicableAndApply(api.deleteFamily());
		assertMatchCount(1, api.findFamily());

		terminate(api);
	}

	@Test
	public void deleteAnyFamilyForDifferentPushoutApproachesOnAPI() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(2, api.findFamily());
		//TODO: Removed the configuration option for the push-out approach, since no one was using anything other than SPO.
//		// DPO: Families have members, so they cannot be deleted.
//		api.setDPO();
//		assertNotApplicable(api.deleteFamily());
		assertMatchCount(2, api.findFamily());

		// SPO: Deletion is possible, references to members deleted as well.
//		api.setSPO();
		assertApplicableAndApply(api.deleteFamily());
		assertMatchCount(1, api.findFamily());

		terminate(api);
	}

	@Test
	public void deleteRegisterForDifferentPushoutApproachesOnRuleLevel() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(1, api.findFamilyRegister());
		//TODO: Removed the configuration option for the push-out approach, since no one was using anything other than SPO.
		// DPO: Register has families, so the register cannot be deleted.
//		assertNotApplicable(api.deleteFamilyRegister().setDPO());
		assertMatchCount(1, api.findFamilyRegister());

		// SPO: Deletion is possible, deleted families as well.
		assertApplicableAndApply(api.deleteFamilyRegister());
		assertMatchCount(0, api.findFamilyRegister());

		terminate(api);
	}

	@Test
	public void renameFamily() {
		GtGtAPI<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertApplicableAndApply(api.renameFamily("Watson", "Watson-Smith"));

		List<String> familyNames = api.findFamily().matchStream() //
				.map(m -> m.family().getName()) //
				.collect(Collectors.toList());

		assertTrue(familyNames.size() == 2);
		assertTrue(familyNames.contains("Simpson"));
		assertTrue(familyNames.contains("Watson-Smith"));
		
		terminate(api);
	}

	@Test
	public void createFamiliesWithMembers() {
		GtGtAPI<?> api = this.initEmpty("FamiliesWithMembers.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		Map<String, FamilyRegister> familyNameToRegister = new HashMap<String, FamilyRegister>();
		api.findFamily().subscribeAppearing(m -> {
			familyNameToRegister.put(m.family().getName(), m.register());
		});

		CreateFamilyRegisterCoMatch m1 = api.createFamilyRegister().applyAny();
		if(m1 != null) {
			CreateFamilyCoMatch m2 = api.createFamily("Simpson").bindRegister(m1.register()).applyAny();
			if(m2 != null) {
				api.addFather("Homer").bindFamily(m2.family()).applyAny();
				api.addMother("Marge").bindFamily(m2.family()).applyAny();
				api.addDaughter("Lisa").bindFamily(m2.family()).applyAny();
				api.addDaughter("Maggie").bindFamily(m2.family()).applyAny();
				api.addSon("Bart").bindFamily(m2.family()).applyAny();
			}
		}
		
		CreateFamilyRegisterCoMatch m3 = api.createFamilyRegister().applyAny();
		if(m3 != null) {
			CreateFamilyCoMatch m4 = api.createFamily("Watson").bindRegister(m3.register()).applyAny();
			if(m4 != null) {
				api.addFather("John").bindFamily(m4.family()).applyAny();
				api.addMother("Mary").bindFamily(m4.family()).applyAny();
			}
			
			CreateFamilyCoMatch m5 = api.createFamily("Holmes").bindRegister(m3.register()).applyAny();
			if(m5 != null) {
				api.addSon("Sherlock").bindFamily(m5.family()).applyAny();
				api.addSon("Mycroft").bindFamily(m5.family()).applyAny();
			}
		}

		assertMatchCount(2, api.findFamilyRegister());
		assertEquals(3, familyNameToRegister.size());
		assertEquals(familyNameToRegister.get("Watson"), familyNameToRegister.get("Holmes"));
		assertNotEquals(familyNameToRegister.get("Simpson"), familyNameToRegister.get("Watson"));

		Family simpsonFamily = api.findFamilyByName("Simpson").findAnyMatch().get().family();
		assertMatchCount(1, api.findFather().bindFamily(simpsonFamily));
		assertMatchCount(1, api.findMother().bindFamily(simpsonFamily));
		assertMatchCount(2, api.findDaughter().bindFamily(simpsonFamily));
		assertMatchCount(1, api.findSon().bindFamily(simpsonFamily));

		assertMatchCount(1, api.findMemberByFirstName("Sherlock"));
		assertMatchCount(1, api.findMemberByFirstName("John"));

		terminate(api);
	}

	@Test
	public void wedding() {
		GtGtAPI<?> api = this.init("TwoFamilies.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		FamilyMember jason = api.findMemberByFirstName("Jason").findAnyMatch().get().member();
		FamilyMember sarah = api.findMemberByFirstName("Sarah").findAnyMatch().get().member();

		assertMatchCount(1, api.findFamilyByName("Jackson"));
		assertApplicableAndApply(api.marry("Jackson").bindBride(sarah).bindGroom(jason));
		assertMatchCount(2, api.findFamilyByName("Jackson"));

		assertMatchCount(0, api.findDaughter());
		assertMatchCount(0, api.findSon());
		assertApplicableAndApply(api.daughterBorn("Rachel").bindMother(sarah));
		assertApplicableAndApply(api.sonBorn("Daniel").bindMother(sarah));
		assertMatchCount(1, api.findDaughter());
		assertMatchCount(1, api.findSon());
		assertMatchCount(1, api.findMemberByFirstName("Daniel"));
		assertMatchCount(1, api.findMemberByFirstName("Rachel"));

		terminate(api);
	}

	@Test
	public void sonBornNamedAsFather() {
		GtGtAPI<?> api = this.init("TwoFamilies.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		assertMatchCount(0, api.findFatherAndSonWithSameName());
		FamilyMember sarah = api.findMemberByFirstName("Sally").findAnyMatch().get().member();
		assertApplicableAndApply(api.sonBornNamedAsFather().bindMother(sarah));
		assertMatchCount(1, api.findFatherAndSonWithSameName());

		terminate(api);
	}
}
