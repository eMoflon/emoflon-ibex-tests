package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.junit.Test;

import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * JUnit tests for notifications in the SimpleFamilies Graph Transformation API
 */
public class SimpleFamiliesRuleApplicationTest extends SimpleFamiliesAbstractTest {
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
	public void deleteAnyFamily() {
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
	public void deleteRegister() {
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
