package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import TrianglesGraphTransformation.api.TrianglesGraphTransformationAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleConstructionOrderedTest extends TrianglesAbstractTest {

	@Test
	public void buildManualTriangles() {
		TrianglesGraphTransformationAPI api = this.init("triangles1.xmi");
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicable(api.connectA2BOrdered());
		assertApplicable(api.connectB2COrdered());
		assertApplicable(api.connectA2COrdered());
		
		assertApplicable(api.connectA2COrdered());
		assertApplicable(api.connectB2COrdered());
		assertApplicable(api.connectA2BOrdered());
		
		assertApplicable(api.connectA2BOrdered());
		assertApplicable(api.connectB2COrdered());
		assertApplicable(api.connectA2COrdered());
		
		assertMatchCount(4, api.simpleTriangle1());
		assertMatchCount(4, api.simpleTriangle2());
		assertMatchCount(4, api.simpleTriangle3());
		assertMatchCount(4, api.simpleTriangle4());
	}
	
//	@Test
//	public void buildIncrementalTriangles() {
//		TrianglesGraphTransformationAPI api = this.init("triangles1.xmi");
//		
//		assertMatchCount(0, api.simpleTriangle1());
//		assertMatchCount(0, api.simpleTriangle2());
//		assertMatchCount(0, api.simpleTriangle3());
//		assertMatchCount(0, api.simpleTriangle4());
//		
//		assertApplicable(api.connectA2B());
//		assertApplicable(api.connectA2C());
//		assertApplicable(api.connectA2C());
//		assertApplicable(api.connectA2B());
//		assertApplicable(api.connectA2B());
//		assertApplicable(api.connectA2C());
//		assertApplicable(api.connectA2C());
//		assertApplicable(api.connectA2B());
//		
//		assertMatchCount(0, api.simpleTriangle1());
//		assertMatchCount(0, api.simpleTriangle2());
//		assertMatchCount(0, api.simpleTriangle3());
//		assertMatchCount(0, api.simpleTriangle4());
//		
//		assertApplicable(api.connectABCIncremental());
//		
//		assertMatchCount(2, api.simpleTriangle1());
//		assertMatchCount(2, api.simpleTriangle2());
//		assertMatchCount(2, api.simpleTriangle3());
//		assertMatchCount(2, api.simpleTriangle4());
//
//		assertApplicable(api.connectABCIncremental());
//		
//		assertMatchCount(4, api.simpleTriangle1());
//		assertMatchCount(4, api.simpleTriangle2());
//		assertMatchCount(4, api.simpleTriangle3());
//		assertMatchCount(4, api.simpleTriangle4());
//		
//	}
//	
//	@Test
//	public void buildFullTriangles() {
//		TrianglesGraphTransformationAPI api = this.init("triangles1.xmi");
//		
//		assertMatchCount(0, api.simpleTriangle1());
//		assertMatchCount(0, api.simpleTriangle2());
//		assertMatchCount(0, api.simpleTriangle3());
//		assertMatchCount(0, api.simpleTriangle4());
//		
//		assertApplicable(api.connectABCFull());
//		
//		assertMatchCount(1, api.simpleTriangle1());
//		assertMatchCount(1, api.simpleTriangle2());
//		assertMatchCount(1, api.simpleTriangle3());
//		assertMatchCount(1, api.simpleTriangle4());
//		
//		assertApplicable(api.connectABCFull());
//		
//		assertMatchCount(2, api.simpleTriangle1());
//		assertMatchCount(2, api.simpleTriangle2());
//		assertMatchCount(2, api.simpleTriangle3());
//		assertMatchCount(2, api.simpleTriangle4());
//		
//	}

}
