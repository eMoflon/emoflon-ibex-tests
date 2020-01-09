package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.Test;

import TrianglesGraphTransformation.api.TrianglesGraphTransformationAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleDeletionTest extends TrianglesAbstractTest {

	@Test
	public void deleteTriangleSides() {
		TrianglesGraphTransformationAPI api = this.init("triangles2.xmi");
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicable(api.deleteAB());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicable(api.connectA2B());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		
		assertApplicable(api.deleteAC());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicable(api.connectA2C());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicable(api.deleteBC());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicable(api.connectB2C());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
	}
	
	@Test
	public void deleteTriangleInvocations() {
		TrianglesGraphTransformationAPI api = this.init("triangles2.xmi");
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicable(api.deleteDA());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(0, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicable(api.connectDA());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		assertApplicable(api.deleteEB());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(0, api.invocationTriangle2());
		
		assertApplicable(api.connectEB());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(1, api.invocationTriangle2());
		
		
	}
}	