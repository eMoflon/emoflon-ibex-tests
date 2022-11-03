package org.emoflon.ibex.gt.testsuite.MetamodelInheritance;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import metamodelinheritance.gt.api.GtHiPEGtAPI;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class MetamodelInheritanceAbstractTest extends
		GTAppTestCase<GtHiPEGtAPI> {

	@Override
	protected String getTestName() {
		return "MetamodelInheritance";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}
}
