package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import ferryman.gt.api.GtHiPEGtAPI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;


/**
 * Abstract test class for the FerrymanProblem Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class FerrymanProblemAbstractTest
		extends GTAppTestCase<GtHiPEGtAPI> {

	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}
}
