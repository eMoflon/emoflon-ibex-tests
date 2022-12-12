package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import ferryman.gt.api.GtGtApi;
import ferryman.gt.api.GtHiPEGtApi;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;


/**
 * Abstract test class for the FerrymanProblem Graph Transformation Api. All
 * tests for this Api should inherit from this class.
 */
public abstract class FerrymanProblemAbstractTest
		extends GTAppTestCase<GtGtApi<?>> {

	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			case PM_VIATRA ->{throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtApi();}
		};
	}
}
