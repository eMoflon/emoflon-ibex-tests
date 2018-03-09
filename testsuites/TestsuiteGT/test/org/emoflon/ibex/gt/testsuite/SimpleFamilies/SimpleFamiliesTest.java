package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import SimpleFamilies.Family;
import SimpleFamilies.FamilyRegister;
import SimpleFamilies.SimpleFamiliesFactory;
import SimpleFamilies.SimpleFamiliesPackage;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * JUnit tests for SimpleFamilies Graph Transformation API
 */
public class SimpleFamiliesTest extends GTTestCase<SimpleFamiliesGraphTransformationAPI> {
	private boolean familyDeleted = false;

	@Override
	public String getTestName() {
		return "SimpleFamilies";
	}

	@Override
	protected SimpleFamiliesGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SimpleFamiliesGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SimpleFamiliesPackage.eNS_URI, SimpleFamiliesPackage.eINSTANCE);
		return map;
	}

	@Test
	public void testConstraints() {
		ResourceSet model = this.initResourceSet("FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findRegister());
		assertAnyMatchExists(api.findRegister());

		assertMatchCount(2, api.findFamily());
		List<String> familyNames = api.findFamily().findMatches().stream().map(m -> m.getFamily().getName())
				.collect(Collectors.toList());
		assertEquals(Arrays.asList("Simpson", "Watson"), familyNames);

		assertMatchCount(2, api.findFather());
		assertMatchCount(2, api.findMother());
		assertMatchCount(2, api.findDaughter());
		assertMatchCount(1, api.findSon());
	}

	@Test
	public void testNotifications() {
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

	@Test
	public void testCreateAndDeleteRegister() {
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
	public void testCreateFamily() {
		ResourceSet model = this.initResourceSet("CreateFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		api.createFamily().apply();
		assertMatchCount(3, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void testDeleteAnyFamily() {
		ResourceSet model = this.initResourceSet("DeleteAnyFamily.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		// DPO: Families have members, so they cannot be deleted.
		assertNotApplicable(api.deleteFamily().apply(PushoutApproach.DPO));
		assertMatchCount(2, api.findFamily());

		// SPO: Deletion is possible, references to members deleted as well.
		assertApplicable(api.deleteFamily().apply(PushoutApproach.SPO));
		assertMatchCount(1, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void testDeleteRegister() {
		ResourceSet model = this.initResourceSet("DeleteRegister.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findRegister());
		// DPO: Register has families, so the register cannot be deleted.
		assertNotApplicable(api.deleteRegister().apply(PushoutApproach.DPO));
		assertMatchCount(1, api.findRegister());

		// SPO: Deletion is possible, deleted families as well.
		assertApplicable(api.deleteRegister().apply(PushoutApproach.SPO));
		assertMatchCount(0, api.findRegister());

		saveResourceSet(model);
	}
}
