package org.emoflon.ibex.gt.testsuite.Families;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import families.gt.api.GtGtApi;
import families.gt.api.match.FindFamilyMatch;
import families.gt.api.pattern.FindFamilyPattern;

/**
 * Tests for rule applications with the SimpleFamilies Graph Transformation Api.
 */
public class FamiliesSubscriptionsTest extends FamiliesAbstractTest {
	private boolean familyDeleted = false;
	private boolean familyDeleted2 = false;

	@Test
	public void subscribeAppearingAndDisappearingFamilies() {
		GtGtApi<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		// Get the list of family names.
		List<String> namesOfFamilies = api.findFamily().matchStream() //
				.map(m -> m.family().getName()) //
				.collect(Collectors.toList());

		// Register subscriptions.
		api.findFamily().matchStream() //
				.filter(m -> m.family().getName().equals("Watson")) //
				.findAny() //
				.ifPresent(m -> api.findFamily().subscribeMatchDisappears(m, x -> this.familyDeleted = true));

		List<String> namesOfNewFamilies = new ArrayList<String>();
		api.findFamily().subscribeAppearing(m -> namesOfNewFamilies.add(m.family().getName()));
		api.findFamily().subscribeAppearing(m -> namesOfFamilies.add(m.family().getName()));

		List<String> namesOfRemovedFamilies = new ArrayList<String>();
		api.findFamily().subscribeDisappearing(m -> namesOfRemovedFamilies.add(m.family().getName()));
		api.findFamily().subscribeDisappearing(m -> namesOfFamilies.remove(m.family().getName()));

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
		
		terminate(api);
	}

	@Test
	public void unsubscribeDisappearingFamilies() {
		GtGtApi<?> api = this.init("FamilyRegister2.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		// Delete two families and receive notifications.
		List<String> namesOfRemovedFamilies = new ArrayList<String>();
		FindFamilyPattern familyPattern = api.findFamily();
		Consumer<FindFamilyMatch> familyDisappearedAction = m -> namesOfRemovedFamilies.add(m.family().getName());
		familyPattern.subscribeDisappearing(familyDisappearedAction);
		for(int i = 0; i<2; i++) {
			api.deleteFamily().applyAny();
		}
		assertEquals(2, api.deleteFamily().countRuleApplications());
		assertEquals(2, namesOfRemovedFamilies.size());

		// Delete two more families, but do not receive notifications anymore.
		familyPattern.unsubscribeDisappearing(familyDisappearedAction);
		for(int i = 0; i<2; i++) {
			api.deleteFamily().applyAny();
		}
		assertEquals(4, api.deleteFamily().countRuleApplications());
		assertEquals(2, namesOfRemovedFamilies.size());

		terminate(api);
	}

	@Test
	public void unsubscribeFamilyMatchDisappears() {
		GtGtApi<?> api = this.init("FamilyRegister.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);
		
		FindFamilyPattern familyPattern = api.findFamily();
		Consumer<FindFamilyMatch> familyDisappearedAction = m -> familyDeleted2 = true;
		FindFamilyMatch match = api.findFamily().matchStream() //
				.filter(m -> m.family().getName().equals("Watson")).findAny().get();
		familyPattern.subscribeMatchDisappears(match, familyDisappearedAction);
		familyPattern.unsubscribeMatchDisappears(match, familyDisappearedAction);

		assertApplicableAndApply(api.deleteFamily().bindFamily(match.family()));
		assertFalse(familyDeleted2);

		terminate(api);
	}
}
