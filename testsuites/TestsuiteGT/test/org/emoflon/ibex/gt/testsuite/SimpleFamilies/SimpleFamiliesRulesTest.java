package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyMember;
import SimpleFamilies.FamilyRegister;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.matches.DeleteFamilyMatch;
import SimpleFamiliesGraphTransformation.api.matches.FindFamilyMatch;

/**
 * Tests for rule applications with the SimpleFamilies Graph Transformation API.
 */
public class SimpleFamiliesRulesTest extends SimpleFamiliesAbstractTest {

	@Test
	public void createAndDeleteRegister() {
		SimpleFamiliesGraphTransformationAPI api = this.init("CreateAndDeleteRegister.xmi");

		assertNoMatch(api.findRegister());
		assertMatchCount(1, api.createRegister()); // create rule is applicable
		assertApplicable(api.createRegister());
		assertMatchCount(1, api.findRegister());

		assertApplicable(api.deleteRegister());
		assertNoMatch(api.findRegister());

		saveAndTerminate(api);
	}

	@Test
	public void createFamily() {
		SimpleFamiliesGraphTransformationAPI api = this.init("CreateFamily.xmi", "FamilyRegister.xmi");

		assertMatchCount(2, api.findFamily());
		assertApplicable(api.createFamily("Smith"));
		assertMatchCount(3, api.findFamily());

		saveAndTerminate(api);
	}

	@Test
	public void createMillerFamily() {
		SimpleFamiliesGraphTransformationAPI api = this.init("CreateMillerFamily.xmi", "FamilyRegister.xmi");

		assertMatchCount(2, api.findFamily());
		api.createMillerFamily().apply();
		assertMatchCount(3, api.findFamily());

		saveAndTerminate(api);
	}

	@Test
	public void create20Families() {
		SimpleFamiliesGraphTransformationAPI api = this.init("Create20Families.xmi", "FamilyRegister.xmi");

		assertMatchCount(2, api.findFamily());
		assertEquals(20, api.createUnnamedFamily().apply(20).size());
		assertMatchCount(22, api.findFamily());

		Supplier<FindFamilyMatch> findNullFamily = () -> api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName() == null).findAny().orElse(null);
		assertEquals(20, api.deleteFamily().bindAndApply(findNullFamily).size());
		assertMatchCount(2, api.findFamily());

		saveAndTerminate(api);
	}

	@Test
	public void deleteWatsonFamilyWithFamilyBinding() {
		SimpleFamiliesGraphTransformationAPI api = this.init("DeleteWatsonFamilyWithFamilyBinding.xmi",
				"FamilyRegister.xmi");

		Family watsonFamily = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.map(m -> m.getFamily()) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bindFamily(watsonFamily));
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveAndTerminate(api);
	}

	@Test
	public void deleteWatsonFamilyWithMatchBinding() {
		SimpleFamiliesGraphTransformationAPI api = this.init("DeleteWatsonFamilyWithMatchBinding.xmi",
				"FamilyRegister.xmi");

		FindFamilyMatch watsonMatch = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bindAndApply(watsonMatch));
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveAndTerminate(api);
	}

	@Test
	public void deleteAnyFamilyForDifferentPushoutApproaches() {
		SimpleFamiliesGraphTransformationAPI api = this.init("DeleteAnyFamily.xmi", "FamilyRegister.xmi");

		assertMatchCount(2, api.findFamily());
		// DPO: Families have members, so they cannot be deleted.
		assertNotApplicable(api.deleteFamily().setDPO());
		assertMatchCount(2, api.findFamily());

		// SPO: Deletion is possible, references to members deleted as well.
		assertApplicable(api.deleteFamily().setSPO());
		assertMatchCount(1, api.findFamily());

		saveAndTerminate(api);
	}

	@Test
	public void deleteRegisterForDifferentPushoutApproaches() {
		SimpleFamiliesGraphTransformationAPI api = this.init("DeleteRegister.xmi", "FamilyRegister.xmi");

		assertMatchCount(1, api.findRegister());
		// DPO: Register has families, so the register cannot be deleted.
		assertNotApplicable(api.deleteRegister().setDPO());
		assertMatchCount(1, api.findRegister());

		// SPO: Deletion is possible, deleted families as well.
		assertApplicable(api.deleteRegister().setSPO());
		assertMatchCount(0, api.findRegister());

		saveAndTerminate(api);
	}

	@Test
	public void renameFamily() {
		SimpleFamiliesGraphTransformationAPI api = this.init("RenameFamily.xmi", "FamilyRegister.xmi");

		assertApplicable(api.renameFamily("Watson", "Watson-Smith"));

		List<String> familyNames = api.findFamily().findMatches().stream() //
				.map(m -> m.getFamily().getName()) //
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("Simpson", "Watson-Smith"), familyNames);

		saveAndTerminate(api);
	}

	@Test
	public void createFamiliesWithMembers() {
		SimpleFamiliesGraphTransformationAPI api = this.init("FamiliesWithMembers.xmi");

		Map<String, FamilyRegister> familyNameToRegister = new HashMap<String, FamilyRegister>();
		api.findFamily().subscribeAppearing(m -> {
			familyNameToRegister.put(m.getFamily().getName(), m.getRegister());
		});

		api.createRegister().apply().ifPresent(r -> {
			api.createFamily("Simpson").bind(r).apply().ifPresent(f -> {
				api.addFather("Homer").bind(f).apply();
				api.addMother("Marge").bind(f).apply();
				api.addDaughter("Lisa").bind(f).apply();
				api.addDaughter("Maggie").bind(f).apply();
				api.addSon("Bart").bind(f).apply();
			});
		});
		api.createRegister().apply().ifPresent(r -> {
			api.createFamily("Watson").bind(r).apply().ifPresent(f -> {
				api.addFather("John").bind(f).apply();
				api.addMother("Mary").bind(f).apply();
			});
			api.createFamily("Holmes").bind(r).apply().ifPresent(f -> {
				api.addSon("Sherlock").bind(f).apply();
				api.addSon("Mycroft").bind(f).apply();
			});
		});

		assertMatchCount(2, api.findRegister());
		assertEquals(3, familyNameToRegister.size());
		assertEquals(familyNameToRegister.get("Watson"), familyNameToRegister.get("Holmes"));
		assertNotEquals(familyNameToRegister.get("Simpson"), familyNameToRegister.get("Watson"));

		Family simpsonFamily = api.findFamilyByName("Simpson").findAnyMatch().get().getFamily();
		assertMatchCount(1, api.findFather().bindFamily(simpsonFamily));
		assertMatchCount(1, api.findMother().bindFamily(simpsonFamily));
		assertMatchCount(2, api.findDaughter().bindFamily(simpsonFamily));
		assertMatchCount(1, api.findSon().bindFamily(simpsonFamily));

		assertMatchCount(1, api.findMemberByFirstName("Sherlock"));
		assertMatchCount(1, api.findMemberByFirstName("John"));

		saveAndTerminate(api);
	}

	@Test
	public void wedding() {
		SimpleFamiliesGraphTransformationAPI api = this.init("Wedding.xmi", "TwoFamilies.xmi");

		FamilyMember jason = api.findMemberByFirstName("Jason").findAnyMatch().get().getMember();
		FamilyMember sarah = api.findMemberByFirstName("Sarah").findAnyMatch().get().getMember();

		assertMatchCount(1, api.findFamilyByName("Jackson"));
		assertApplicable(api.marry("Jackson").bindBride(sarah).bindGroom(jason));
		assertMatchCount(2, api.findFamilyByName("Jackson"));

		assertMatchCount(0, api.findDaughter());
		assertMatchCount(0, api.findSon());
		assertApplicable(api.daughterBorn("Rachel").bindMother(sarah));
		assertApplicable(api.sonBorn("Daniel").bindMother(sarah).apply());
		assertMatchCount(1, api.findDaughter());
		assertMatchCount(1, api.findSon());
		assertMatchCount(1, api.findMemberByFirstName("Daniel"));
		assertMatchCount(1, api.findMemberByFirstName("Rachel"));

		saveAndTerminate(api);
	}

	@Test
	public void sonBornNamedAsFather() {
		SimpleFamiliesGraphTransformationAPI api = this.init("SonBornNamedAsFather.xmi", "TwoFamilies.xmi");

		assertMatchCount(0, api.findFatherAndSonWithSameName());
		FamilyMember sarah = api.findMemberByFirstName("Sally").findAnyMatch().get().getMember();
		assertApplicable(api.sonBornNamedAsFather().bindMother(sarah));
		assertMatchCount(1, api.findFatherAndSonWithSameName());

		saveAndTerminate(api);
	}
}
