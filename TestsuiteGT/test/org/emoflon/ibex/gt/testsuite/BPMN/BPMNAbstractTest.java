package org.emoflon.ibex.gt.testsuite.BPMN;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import bpmn.gt.api.GtGtAPI;
import bpmn.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the BPMN Graph Transformation API. All tests for this
 * API should inherit from this class.
 */
public class BPMNAbstractTest extends GTAppTestCase<GtGtAPI<?>> {

	@Override
	protected String getTestName() {
		return "BPMN";
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
