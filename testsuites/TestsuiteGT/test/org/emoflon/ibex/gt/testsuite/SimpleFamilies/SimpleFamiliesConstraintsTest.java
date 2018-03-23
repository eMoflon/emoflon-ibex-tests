package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * Tests for simple constraints and notifications in the SimpleFamilies Graph
 * Transformation API
 */
public class SimpleFamiliesConstraintsTest extends SimpleFamiliesAbstractTest {
	private boolean familyDeleted = false;

	@Test
	public void constraints() {
		ResourceSet model = this.initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findRegister());
		assertMatchCount(2, api.findFamily());
		List<String> familyNames = api.findFamily().findMatches().stream() //
				.map(m -> m.getFamily().getName()) //
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("Simpson", "Watson"), familyNames);

		assertMatchCount(2, api.findFather());
		assertMatchCount(2, api.findMother());
		assertMatchCount(2, api.findDaughter());
		assertMatchCount(1, api.findSon());
	}

	@Test
	public void findSimpsonFamily() {
		ResourceSet model = this.initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findSimpsonFamily());
		assertEquals("Simpson", api.findSimpsonFamily().findAnyMatch().get().getFamily().getName());

		assertMatchCount(1, api.findFamilyButNotSimpson());
		assertEquals("Watson", api.findFamilyButNotSimpson().findAnyMatch().get().getFamily().getName());
	}

	@Test
	public void parameterizedAttributeConstraintsForEquality() {
		ResourceSet model = this.initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findFamilyByName("Simpson"));
		assertMatchCount(1, api.findFamilyByName("Watson"));
		assertMatchCount(0, api.findFamilyByName("Smith"));

		assertMatchCount(1, api.findFamilyNotNamed("Simpson"));
		assertMatchCount(1, api.findFamilyNotNamed("Watson"));
		assertMatchCount(2, api.findFamilyNotNamed("Smith"));
		assertEquals("Watson", api.findFamilyNotNamed("Simpson").findAnyMatch().get().getFamily().getName());
		assertEquals("Simpson", api.findFamilyNotNamed("Watson").findAnyMatch().get().getFamily().getName());
	}

	@Test
	public void parameterizedAttributeConstraintsForGreater() {
		ResourceSet model = this.initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamilyWithNameGreaterThan("S"));
		assertMatchCount(1, api.findFamilyWithNameGreaterThan("Smith"));
		assertMatchCount(0, api.findFamilyWithNameGreaterThan("Watson"));

		assertMatchCount(2, api.findFamilyWithNameGreaterOrEqualThan("A"));
		assertMatchCount(1, api.findFamilyWithNameGreaterOrEqualThan("T"));
		assertMatchCount(0, api.findFamilyWithNameGreaterOrEqualThan("X"));
	}

	@Test
	public void notifications() {
		ResourceSet model = this.initResourceSet("Notifications.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		// Get the list of family names.
		List<String> namesOfFamilies = api.findFamily().findMatches().stream() //
				.map(m -> m.getFamily().getName()).collect(Collectors.toList());

		// Register subscriptions.
		api.findFamily().findMatches().stream().filter(m -> m.getFamily().getName().equals("Watson")).findAny()
				.ifPresent(m -> api.findFamily().subscribeMatchDisappears(m, x -> this.familyDeleted = true));

		List<String> namesOfNewFamilies = new ArrayList<String>();
		api.findFamily().subscribeAppearing(m -> namesOfNewFamilies.add(m.getFamily().getName()));
		api.findFamily().subscribeAppearing(m -> namesOfFamilies.add(m.getFamily().getName()));

		List<String> namesOfRemovedFamilies = new ArrayList<String>();
		api.findFamily().subscribeDisappearing(m -> namesOfRemovedFamilies.add(m.getFamily().getName()));
		api.findFamily().subscribeDisappearing(m -> namesOfFamilies.remove(m.getFamily().getName()));

		// Remove Watson family, add Smith family.
		FamilyRegister register = (FamilyRegister) model.getResources().get(0).getContents().get(0);
		register.getFamilies().remove(1);
		Family family = SimpleFamiliesFactory.eINSTANCE.createFamily();
		family.setName("Smith");
		register.getFamilies().add(family);

		api.updateMatches();
		assertEquals(Arrays.asList("Smith"), namesOfNewFamilies);
		assertEquals(Arrays.asList("Watson"), namesOfRemovedFamilies);
		assertEquals(Arrays.asList("Simpson", "Smith"), namesOfFamilies);
		assertTrue(this.familyDeleted);
	}
}
