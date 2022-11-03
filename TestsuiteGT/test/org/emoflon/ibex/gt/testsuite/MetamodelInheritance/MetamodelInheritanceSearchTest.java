package org.emoflon.ibex.gt.testsuite.MetamodelInheritance;

import org.junit.jupiter.api.Test;

import metamodelinheritance.gt.api.GtHiPEGtAPI;


/**
 * Tests for pattern matching with the ClassMultipleInheritanceHierarchy Graph
 * Transformation API.
 */
public class MetamodelInheritanceSearchTest extends MetamodelInheritanceAbstractTest {

	@Test
	public void findNodes() {
		GtHiPEGtAPI api = this.init("test1.xmi");

		assertMatchCount(2, api.childC());
		assertMatchCount(2, api.childD());
	}
	
	@Test
	public void findEdgeCD() {
		GtHiPEGtAPI api = this.init("test1.xmi");
		assertMatchCount(1, api.findCD());
	}
	
	@Test
	public void findEdgeCDInvocation() {
		GtHiPEGtAPI api = this.init("test1.xmi");
		assertMatchCount(1, api.findCDInvocation());
	}


}
