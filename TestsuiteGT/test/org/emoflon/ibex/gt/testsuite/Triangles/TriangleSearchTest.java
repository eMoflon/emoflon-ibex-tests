package org.emoflon.ibex.gt.testsuite.Triangles;

import org.junit.Test;

import TrianglesGraphTransformation.api.TrianglesGraphTransformationAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class TriangleSearchTest extends TrianglesAbstractTest {

	@Test
	public void findPackageAndClasses() {
		TrianglesGraphTransformationAPI api = this.init("ClassDiagram1.xmi");

		assertMatchCount(1, api.simpleTriangle1());
		assertMatchCount(6, api.simpleTriangle2());
		assertMatchCount(1, api.simpleTriangle3());
		assertMatchCount(6, api.simpleTriangle4());
		assertMatchCount(1, api.invocationTriangle1());
		assertMatchCount(6, api.invocationTriangle2());
	}

}
