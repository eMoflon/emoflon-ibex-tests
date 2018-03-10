package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import static org.junit.Assert.assertEquals;

import java.util.function.Supplier;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.junit.Test;

import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
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
		api.createFamily().apply();
		assertMatchCount(3, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void createFamilies() {
		ResourceSet model = this.initResourceSet("CreateFamilies.xmi", "FamilyRegister.xmi");
		SimpleFamiliesGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findFamily());
		assertEquals(20, api.createFamily().apply(20).size());
		assertMatchCount(22, api.findFamily());

		Supplier<FindFamilyMatch> findNullFamily = () -> api.findFamily().findMatches().stream()
				.filter(m -> m.getFamily().getName() == null).findAny().orElse(null);
		assertEquals(20, api.deleteFamily().bindAndApply(findNullFamily).size());
		assertMatchCount(2, api.findFamily());

		saveResourceSet(model);
	}

	@Test
	public void deleteAnyFamilyForDifferentPushoutApproaches() {
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
	public void deleteRegisterForDifferentPushoutApproaches() {
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
