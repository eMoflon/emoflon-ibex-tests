package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import triangles.gt.api.GtGtApi;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation Api.
 */
public class TriangleConstructionOrderedTest extends TrianglesAbstractTest {

	@Test
	public void buildManualTriangles() {
		GtGtApi<?> api = this.init("triangles1.xmi");
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectA2BOrdered());
		assertApplicableAndApply(api.connectB2COrdered());
		assertApplicableAndApply(api.connectA2COrdered());
		
		assertApplicableAndApply(api.connectA2COrdered());
		assertApplicableAndApply(api.connectB2COrdered());
		assertApplicableAndApply(api.connectA2BOrdered());
		
		assertApplicableAndApply(api.connectA2BOrdered());
		assertApplicableAndApply(api.connectB2COrdered());
		assertApplicableAndApply(api.connectA2COrdered());
		
		assertMatchCount(4, api.simpleTriangle1());
		assertMatchCount(4, api.simpleTriangle2());
		assertMatchCount(4, api.simpleTriangle3());
		assertMatchCount(4, api.simpleTriangle4());
		
		api.terminate();
	}

}
