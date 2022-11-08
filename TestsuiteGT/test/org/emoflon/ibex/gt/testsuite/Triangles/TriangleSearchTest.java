package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import triangles.gt.api.GtGtAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleSearchTest extends TrianglesAbstractTest {

	@Test
	public void findSimpleTriangles() {
		GtGtAPI<?> api = this.init("triangles0.xmi");

		assertMatchCount(2, api.simpleTriangle1());
		assertMatchCount(2, api.simpleTriangle2());
		assertMatchCount(2, api.simpleTriangle3());
		assertMatchCount(2, api.simpleTriangle4());
		
		api.terminate();
	}
	
	@Test
	public void simpleTriangleInvocations() {
		GtGtAPI<?> api = this.init("triangles0.xmi");

		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		api.terminate();
	}

}
