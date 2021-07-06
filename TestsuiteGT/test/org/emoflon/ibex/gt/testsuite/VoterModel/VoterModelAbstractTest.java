package org.emoflon.ibex.gt.testsuite.VoterModel;

import VoterModelGraphTransformation.api.VoterModelGraphTransformationAPI;
import VoterModelGraphTransformation.api.VoterModelGraphTransformationApp;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

/**
 * Abstract test class for the VoterModel Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class VoterModelAbstractTest extends
		GTAppTestCase<VoterModelGraphTransformationApp, VoterModelGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "VoterModel";
	}

	@Override
	protected VoterModelGraphTransformationApp getApp() {
		return new VoterModelGraphTransformationApp(initEngine(), workspacePath);
	}
}
