package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.matches.FindFamilyMatch;
import SimpleFamiliesGraphTransformation.api.rules.FindFamilyPattern;

/**
 * Tests for rule applications with the SimpleFamilies Graph Transformation API.
 */
public class SimpleFamiliesSubscriptionsTest extends SimpleFamiliesAbstractTest {
	private boolean familyDeleted = false;
	private boolean familyDeleted2 = false;

	@Test
	public void subscribeAppearingAndDisappearingFamilies() {
		SimpleFamiliesGraphTransformationAPI api = this.init("SubscribeAppearingAndDisappearingFamilies.xmi",
				"FamilyRegister.xmi");

		// Get the list of family names.
		List<String> namesOfFamilies = api.findFamily().matchStream() //
				.map(m -> m.getFamily().getName()) //
				.collect(Collectors.toList());

		// Register subscriptions.
		api.findFamily().matchStream() //
				.filter(m -> m.getFamily().getName().equals("Watson")) //
				.findAny() //
				.ifPresent(m -> api.findFamily().subscribeMatchDisappears(m, x -> this.familyDeleted = true));

		List<String> namesOfNewFamilies = new ArrayList<String>();
		api.findFamily().subscribeAppearing(m -> namesOfNewFamilies.add(m.getFamily().getName()));
		api.findFamily().subscribeAppearing(m -> namesOfFamilies.add(m.getFamily().getName()));

		List<String> namesOfRemovedFamilies = new ArrayList<String>();
		api.findFamily().subscribeDisappearing(m -> namesOfRemovedFamilies.add(m.getFamily().getName()));
		api.findFamily().subscribeDisappearing(m -> namesOfFamilies.remove(m.getFamily().getName()));

		// Remove Watson family, add Smith family.
		FamilyRegister register = (FamilyRegister) api.getModel().getResources().get(0).getContents().get(0);
		register.getFamilies().removeIf(f -> f.getName().equals("Watson"));
		Family family = SimpleFamiliesFactory.eINSTANCE.createFamily();
		family.setName("Smith");
		register.getFamilies().add(family);


		api.updateMatches();
		assertEquals(Arrays.asList("Smith"), namesOfNewFamilies);
		assertEquals(Arrays.asList("Watson"), namesOfRemovedFamilies);
		assertEquals(Arrays.asList("Simpson", "Smith"), namesOfFamilies);
		assertTrue(this.familyDeleted);
	}

	@Test
	public void unsubscribeDisappearingFamilies() {
		SimpleFamiliesGraphTransformationAPI api = this.init("UnsubscribeDisappearingFamilies.xmi",
				"FamilyRegister2.xmi");

		// Delete two families and receive notifications.
		List<String> namesOfRemovedFamilies = new ArrayList<String>();
		FindFamilyPattern familyPattern = api.findFamily();
		Consumer<FindFamilyMatch> familyDisappearedAction = m -> namesOfRemovedFamilies.add(m.getFamily().getName());
		familyPattern.subscribeDisappearing(familyDisappearedAction);
		assertEquals(2, api.deleteFamily().apply(2).size());
		assertEquals(2, namesOfRemovedFamilies.size());

		// Delete two more families, but do not receive notifications anymore.
		familyPattern.unsubscribeDisappearing(familyDisappearedAction);
		assertEquals(2, api.deleteFamily().apply(2).size());
		assertEquals(2, namesOfRemovedFamilies.size());

		saveAndTerminate(api);
	}

	@Test
	public void unsubscribeFamilyMatchDisappears() {
		SimpleFamiliesGraphTransformationAPI api = this.init("UnsubscribeFamilyMatchDisappears.xmi",
				"FamilyRegister.xmi");

		FindFamilyPattern familyPattern = api.findFamily();
		Consumer<FindFamilyMatch> familyDisappearedAction = m -> familyDeleted2 = true;
		FindFamilyMatch match = api.findFamily().matchStream() //
				.filter(m -> m.getFamily().getName().equals("Watson")).findAny().get();
		familyPattern.subscribeMatchDisappears(match, familyDisappearedAction);
		familyPattern.unsubscribeMatchDisappears(match, familyDisappearedAction);

		assertApplicable(api.deleteFamily().bind(match));
		assertFalse(familyDeleted2);

		saveAndTerminate(api);
	}
}
