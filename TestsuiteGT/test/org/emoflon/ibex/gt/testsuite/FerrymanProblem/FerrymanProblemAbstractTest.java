package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import ferryman.gt.api.GtGtAPI;
import ferryman.gt.api.GtHiPEGtAPI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;


/**
 * Abstract test class for the FerrymanProblem Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class FerrymanProblemAbstractTest
		extends GTAppTestCase<GtGtAPI<?>> {

	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

	@Override
	protected GtGtAPI<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtAPI<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtAPI();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtAPI();}
		};
	}
}
