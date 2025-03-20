package org.emoflon.ibex.gt.testsuite.BPMN;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import bpmn.gt.api.GtGtApi;
import bpmn.gt.api.GtHiPEGtApi;

/**
 * Abstract test class for the BPMN Graph Transformation Api. All tests for this
 * Api should inherit from this class.
 */
public class BPMNAbstractTest extends GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "BPMN";
	}

	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			default -> {yield new GtHiPEGtApi();}
		};
	}
}
