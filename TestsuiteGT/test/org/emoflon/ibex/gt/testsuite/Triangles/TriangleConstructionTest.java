package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import triangles.gt.api.GtHiPEGtAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleConstructionTest extends TrianglesAbstractTest {

	@Test
	public void buildManualTriangles() {
		GtHiPEGtAPI api = this.init("triangles1.xmi");
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2B());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectB2C());
		
		assertMatchCount(2, api.simpleTriangle1());
		assertMatchCount(2, api.simpleTriangle2());
		assertMatchCount(2, api.simpleTriangle3());
		assertMatchCount(2, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectB2C());

		assertMatchCount(4, api.simpleTriangle1());
		assertMatchCount(4, api.simpleTriangle2());
		assertMatchCount(4, api.simpleTriangle3());
		assertMatchCount(4, api.simpleTriangle4());
		
	}
	
	@Test
	public void buildIncrementalTriangles() {
		GtHiPEGtAPI api = this.init("triangles1.xmi");
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2B());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2C());
		assertApplicableAndApply(api.connectA2B());
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectABCIncremental());
		
		assertMatchCount(2, api.simpleTriangle1());
		assertMatchCount(2, api.simpleTriangle2());
		assertMatchCount(2, api.simpleTriangle3());
		assertMatchCount(2, api.simpleTriangle4());

		assertApplicableAndApply(api.connectABCIncremental());
		
		assertMatchCount(4, api.simpleTriangle1());
		assertMatchCount(4, api.simpleTriangle2());
		assertMatchCount(4, api.simpleTriangle3());
		assertMatchCount(4, api.simpleTriangle4());
		
	}
	
	@Test
	public void buildFullTriangles() {
		GtHiPEGtAPI api = this.init("triangles1.xmi");
		
		assertMatchCount(0, api.simpleTriangle1());
		assertMatchCount(0, api.simpleTriangle2());
		assertMatchCount(0, api.simpleTriangle3());
		assertMatchCount(0, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectABCFull());
		
		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(1, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(1, api.simpleTriangle4());
		
		assertApplicableAndApply(api.connectABCFull());
		
		assertMatchCount(2, api.simpleTriangle1());
		assertMatchCount(2, api.simpleTriangle2());
		assertMatchCount(2, api.simpleTriangle3());
		assertMatchCount(2, api.simpleTriangle4());
		
	}

}
