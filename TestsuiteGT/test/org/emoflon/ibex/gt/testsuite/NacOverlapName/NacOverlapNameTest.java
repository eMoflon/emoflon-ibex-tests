package org.emoflon.ibex.gt.testsuite.NacOverlapName;

import org.junit.jupiter.api.Test;

import NacOverlapNameGraphTransformation.api.NacOverlapNameGraphTransformationAPI;

/**
 * This test checks a case that seems to be a bug in eMoflon::IBeX-GT. When a GT
 * rule creates a new node of type `X` with the name `x`, it does not make sense
 * to overlap it with a NAC node with the same name `x`. A node to be created
 * can not already exist in the model in any case.
 */
public class NacOverlapNameTest extends NacOverlapNameAbstractTest {

	/**
	 * This test checks that the GT rule in question can be applied if no device
	 * exists in the model.
	 */
	@Test
	public void testNodeDoesNotExist() {
		final NacOverlapNameGraphTransformationAPI api = this.init("NacOverlapName.xmi", "NacOverlapName-RS.xmi");

		// Check preconditions
		assertMatchCount(0, api.createDeviceOnly());
		assertMatchCount(1, api.createNetworkOnly());
		api.createNetworkOnly().apply(true);

		assertMatchCount(1, api.createDeviceOnly());
		api.updateMatches();

		// Actual test
		assertMatchCount(1, api.createDevice());

		saveAndTerminate(api);
	}

	/**
	 * This test checks that the GT rule in question can also be applied if the
	 * device already exists in the model.
	 */
	@Test
	public void testNodeDoesExist() {
		final NacOverlapNameGraphTransformationAPI api = this.init("NacOverlapName.xmi", "NacOverlapName-RS.xmi");

		// Check preconditions
		assertMatchCount(0, api.createDeviceOnly());
		assertMatchCount(1, api.createNetworkOnly());
		api.createNetworkOnly().apply(true);

		assertMatchCount(1, api.createDeviceOnly());
		api.createDeviceOnly().apply(true);
		api.updateMatches();

		// Actual test
		assertMatchCount(1, api.createDevice());

		saveAndTerminate(api);
	}

}
