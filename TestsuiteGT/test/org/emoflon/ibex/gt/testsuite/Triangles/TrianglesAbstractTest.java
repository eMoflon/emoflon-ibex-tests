package org.emoflon.ibex.gt.testsuite.Triangles;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import triangles.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the Triangles Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class TrianglesAbstractTest extends
		GTAppTestCase<GtHiPEGtAPI> {

	@Override
	protected String getTestName() {
		return "Triangles";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}
}
