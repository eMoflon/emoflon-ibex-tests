package org.emoflon.ibex.gt.testsuite.NacOverlapName;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import NacOverlapNameGraphTransformation.api.NacOverlapNameGraphTransformationAPI;
import NacOverlapNameGraphTransformation.api.NacOverlapNameGraphTransformationApp;

/**
 * Abstract test class for the NAC overlap name Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public class NacOverlapNameAbstractTest
		extends GTAppTestCase<NacOverlapNameGraphTransformationApp, NacOverlapNameGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "NacOverlapName";
	}

	@Override
	protected NacOverlapNameGraphTransformationApp getApp() {
		return new NacOverlapNameGraphTransformationApp(initEngine(), workspacePath);
	}
}
