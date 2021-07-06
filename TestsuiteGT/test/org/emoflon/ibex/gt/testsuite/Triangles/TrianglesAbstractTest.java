package org.emoflon.ibex.gt.testsuite.Triangles;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import TrianglesGraphTransformation.api.TrianglesGraphTransformationAPI;
import TrianglesGraphTransformation.api.TrianglesGraphTransformationApp;

/**
 * Abstract test class for the Triangles Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class TrianglesAbstractTest extends
		GTAppTestCase<TrianglesGraphTransformationApp, TrianglesGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "Triangles";
	}

	@Override
	protected TrianglesGraphTransformationApp getApp() {
		return new TrianglesGraphTransformationApp(initEngine(), workspacePath);
	}
}
