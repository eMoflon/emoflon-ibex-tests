package org.emoflon.ibex.gt.testsuite.MetamodelInheritance;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import MetamodelInheritanceTransformation.api.MetamodelInheritanceTransformationAPI;
import MetamodelInheritanceTransformation.api.MetamodelInheritanceTransformationApp;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class MetamodelInheritanceAbstractTest extends
		GTAppTestCase<MetamodelInheritanceTransformationApp, MetamodelInheritanceTransformationAPI> {

	@Override
	protected String getTestName() {
		return "MetamodelInheritance";
	}

	@Override
	protected MetamodelInheritanceTransformationApp getApp() {
		return new MetamodelInheritanceTransformationApp(initEngine(), workspacePath);
	}
}
