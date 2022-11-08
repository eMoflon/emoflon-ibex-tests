package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import triangles.gt.api.GtGtAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleDeletionTest extends TrianglesAbstractTest {

	@Test
	public void deleteTriangleSides() {
		GtGtAPI<?> api = this.init("triangles2.xmi");
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicableAndApply(api.deleteAB());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicableAndApply(api.connectA2B());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		
		assertApplicableAndApply(api.deleteAC());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicableAndApply(api.connectA2C());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicableAndApply(api.deleteBC());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicableAndApply(api.connectB2C());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		api.terminate();
	}
	
	@Test
	public void deleteTriangleInvocations() {
		GtGtAPI<?> api = this.init("triangles2.xmi");
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicableAndApply(api.deleteDA());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicableAndApply(api.connectDA());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicableAndApply(api.deleteEB());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicableAndApply(api.connectEB());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		api.terminate();
	}
}	