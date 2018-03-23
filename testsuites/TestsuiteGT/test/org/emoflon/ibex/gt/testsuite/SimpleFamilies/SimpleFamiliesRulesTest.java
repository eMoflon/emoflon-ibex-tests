package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SimpleFamilies.Family;
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
		ResourceSet model = this.initResourceSet("CreateAndDeleteRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);
		assertNoMatch(api.findRegister());

		assertMatchCount(1, api.createRegister()); // create rule is applicable
		assertApplicable(api.createRegister().apply());
		assertMatchCount(1, api.findRegister());

		assertApplicable(api.deleteRegister().apply());
		assertNoMatch(api.findRegister());

		saveResourceSet(model);
	}

	@Test
	public void createFamily() {
		ResourceSet model = this.initResourceSet("CreateFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		assertApplicable(api.createFamily("Smith").apply());
		assertMatchCount(3, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void createMillerFamily() {
		ResourceSet model = this.initResourceSet("CreateMillerFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		api.createMillerFamily().apply();
		assertMatchCount(3, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void create20Families() {
		ResourceSet model = this.initResourceSet("Create20Families.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		assertEquals(20, api.createUnnamedFamily().apply(20).size());
		assertMatchCount(22, api.findFamily());

		Supplier<FindFamilyMatch> findNullFamily = () -> api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName() == null).findAny().orElse(null);
		assertEquals(20, api.deleteFamily().bindAndApply(findNullFamily).size());
		assertMatchCount(2, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void deleteWatsonFamilyWithFamilyBinding() {
		ResourceSet model = this.initResourceSet("DeleteWatsonFamilyWithFamilyBinding.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		Family watsonFamily = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.map(m -> m.getFamily()) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bindFamily(watsonFamily).apply());
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveResourceSet(model);
	}

	@Test
	public void deleteWatsonFamilyWithMatchBinding() {
		ResourceSet model = this.initResourceSet("DeleteWatsonFamilyWithMatchBinding.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		FindFamilyMatch watsonMatch = api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.findAny().get();
		DeleteFamilyMatch m = assertApplicable(api.deleteFamily().bindAndApply(watsonMatch));
		assertMatchCount(1, api.findFamily());
		assertEquals("Watson", m.getFamily().getName());

		saveResourceSet(model);
	}

	@Test
	public void deleteAnyFamilyForDifferentPushoutApproaches() {
		ResourceSet model = this.initResourceSet("DeleteAnyFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		// DPO: Families have members, so they cannot be deleted.
		assertNotApplicable(api.deleteFamily().setDPO().apply());
		assertMatchCount(2, api.findFamily());

		// SPO: Deletion is possible, references to members deleted as well.
		assertApplicable(api.deleteFamily().setSPO().apply());
		assertMatchCount(1, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void deleteRegisterForDifferentPushoutApproaches() {
		ResourceSet model = this.initResourceSet("DeleteRegister.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findRegister());
		// DPO: Register has families, so the register cannot be deleted.
		assertNotApplicable(api.deleteRegister().setDPO().apply());
		assertMatchCount(1, api.findRegister());

		// SPO: Deletion is possible, deleted families as well.
		assertApplicable(api.deleteRegister().setSPO().apply());
		assertMatchCount(0, api.findRegister());

		saveResourceSet(model);
	}

	@Test
	public void renameFamily() {
		ResourceSet model = this.initResourceSet("RenameFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertApplicable(api.renameFamily("Watson", "Watson-Smith").apply());
		saveResourceSet(model);

		List<String> familyNames = api.findFamily().findMatches().stream() //
				.map(m -> m.getFamily().getName()) //
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("Simpson", "Watson-Smith"), familyNames);
	}

	@Test
	public void createFamiliesWithMembers() {
		ResourceSet model = this.initResourceSet("FamiliesWithMembers.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

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

		saveResourceSet(model);
	}
}
