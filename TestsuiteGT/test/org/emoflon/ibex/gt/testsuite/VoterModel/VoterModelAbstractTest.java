package org.emoflon.ibex.gt.testsuite.VoterModel;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import votermodel.gt.api.GtGtApi;
import votermodel.gt.api.GtHiPEGtApi;

/**
 * Abstract test class for the VoterModel Graph
 * Transformation Api. All tests for this Api should inherit from this class.
 */
public class VoterModelAbstractTest extends
		GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "VoterModel";
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
