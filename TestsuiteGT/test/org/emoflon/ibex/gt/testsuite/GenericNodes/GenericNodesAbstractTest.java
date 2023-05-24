package org.emoflon.ibex.gt.testsuite.GenericNodes;

import genericnodes.gt.api.GtGtApi;
import genericnodes.gt.api.GtHiPEGtApi;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

public abstract class GenericNodesAbstractTest extends GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "GenericNodes";
	}
	
	@Override
	protected GtGtApi<?> getApi() {
		return getApi(patternMatcher);
	}
	
	@Override
	protected GtGtApi<?> getApi(String patternMatcher) {
		return switch(patternMatcher) {
			case PM_HIPE -> {yield new GtHiPEGtApi();}
			case PM_VIATRA -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_VIATRA);}
			case PM_DEMOCLES -> {throw new IllegalArgumentException("Unknown or unimplemented pattern matcher type: " + PM_DEMOCLES);}
			default -> {yield new GtHiPEGtApi();}
		};
	}
	
}
