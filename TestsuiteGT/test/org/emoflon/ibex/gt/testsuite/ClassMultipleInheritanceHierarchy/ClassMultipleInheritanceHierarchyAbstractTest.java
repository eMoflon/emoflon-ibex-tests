package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import classmultipleinheritance.gt.api.GtHiPEGtAPI;
import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class ClassMultipleInheritanceHierarchyAbstractTest extends GTAppTestCase<GtHiPEGtAPI> {

	@Override
	protected String getTestName() {
		return "ClassMultipleInheritanceHierarchy";
	}

	@Override
	protected GtHiPEGtAPI getApi() {
		return new GtHiPEGtAPI();
	}
}
