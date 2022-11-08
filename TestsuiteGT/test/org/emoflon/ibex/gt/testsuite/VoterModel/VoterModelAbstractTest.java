package org.emoflon.ibex.gt.testsuite.VoterModel;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import votermodel.gt.api.GtGtAPI;
import votermodel.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the VoterModel Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class VoterModelAbstractTest extends
		GTAppTestCase<GtGtAPI<?>> {

	@Override
	protected String getTestName() {
		return "VoterModel";
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
