package org.emoflon.ibex.gt.testsuite.Triangles;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import triangles.gt.api.GtGtApi;
import triangles.gt.api.GtHiPEGtApi;

/**
 * Abstract test class for the Triangles Graph
 * Transformation Api. All tests for this Api should inherit from this class.
 */
public class TrianglesAbstractTest extends
		GTAppTestCase<GtGtApi<?>> {

	@Override
	protected String getTestName() {
		return "Triangles";
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
