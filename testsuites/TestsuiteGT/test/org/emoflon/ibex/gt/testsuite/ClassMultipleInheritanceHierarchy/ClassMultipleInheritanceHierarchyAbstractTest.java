package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import org.emoflon.ibex.gt.testsuite.GTAppTestCase;

import ClassMultipleInheritanceHierarchyGraphTransformation.api.ClassMultipleInheritanceHierarchyGraphTransformationAPI;
import ClassMultipleInheritanceHierarchyGraphTransformation.api.ClassMultipleInheritanceHierarchyGraphTransformationApp;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class ClassMultipleInheritanceHierarchyAbstractTest
		extends GTAppTestCase<ClassMultipleInheritanceHierarchyGraphTransformationApp, ClassMultipleInheritanceHierarchyGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "ClassMultipleInheritanceHierarchy";
	}

	@Override
	protected ClassMultipleInheritanceHierarchyGraphTransformationApp getApp() {
		return new ClassMultipleInheritanceHierarchyGraphTransformationApp();
	}
}
