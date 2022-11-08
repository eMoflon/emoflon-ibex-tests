package org.emoflon.ibex.gt.testsuite.MetamodelInheritance;

import org.junit.jupiter.api.Test;

import metamodelinheritance.gt.api.GtGtAPI;


/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class MetamodelInheritanceSearchTest extends MetamodelInheritanceAbstractTest {

	@Test
	public void findNodes() {
		GtGtAPI<?> api = this.init("test1.xmi");

		assertMatchCount(2, api.childC());
		assertMatchCount(2, api.childD());
		
		api.terminate();
	}
	
	@Test
	public void findEdgeCD() {
		GtGtAPI<?> api = this.init("test1.xmi");
		assertMatchCount(1, api.findCD());
		
		api.terminate();
	}
	
	@Test
	public void findEdgeCDInvocation() {
		GtGtAPI<?> api = this.init("test1.xmi");
		assertMatchCount(1, api.findCDInvocation());
		
		api.terminate();
	}


}
