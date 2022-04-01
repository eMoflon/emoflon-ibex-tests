package org.emoflon.ibex.gt.testsuite.MetamodelInheritance;

import org.junit.jupiter.api.Test;

import MetamodelInheritanceTransformation.api.MetamodelInheritanceTransformationAPI;

/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class MetamodelInheritanceSearchTest extends MetamodelInheritanceAbstractTest {

	@Test
	public void findNodes() {
		MetamodelInheritanceTransformationAPI api = this.init("test1.xmi");

		assertMatchCount(2, api.childC());
		assertMatchCount(2, api.childD());
	}
	
	@Test
	public void findEdgeCD() {
		MetamodelInheritanceTransformationAPI api = this.init("test1.xmi");
		assertMatchCount(1, api.findCD());
	}
	
	@Test
	public void findEdgeCDInvocation() {
		MetamodelInheritanceTransformationAPI api = this.init("test1.xmi");
		assertMatchCount(1, api.findCDInvocation());
	}


}
