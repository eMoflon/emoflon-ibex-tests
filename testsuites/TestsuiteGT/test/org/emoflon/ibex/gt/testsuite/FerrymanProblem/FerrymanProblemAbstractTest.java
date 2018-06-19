package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationApp;

/**
 * Abstract test class for the FerrymanProblem Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class FerrymanProblemAbstractTest
		extends GTAppTestCase<FerrymanProblemGraphTransformationApp, FerrymanProblemGraphTransformationAPI> {

	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

	@Override
	protected FerrymanProblemGraphTransformationApp getApp() {
		return new FerrymanProblemGraphTransformationApp();
	}
}
