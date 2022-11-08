package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.jupiter.api.Test;

import triangles.gt.api.GtGtAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleConstructionTest extends TrianglesAbstractTest {

	@Test
	public void buildManualTriangles() {
		GtGtAPI<?> api = this.init("triangles1.xmi");
		
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
		
		api.terminate();
	}
	
	@Test
	public void buildIncrementalTriangles() {
		GtGtAPI<?> api = this.init("triangles1.xmi");
		
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
		
		api.terminate();
	}
	
	@Test
	public void buildFullTriangles() {
		GtGtAPI<?> api = this.init("triangles1.xmi");
		
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
		
		api.terminate();
	}

}
