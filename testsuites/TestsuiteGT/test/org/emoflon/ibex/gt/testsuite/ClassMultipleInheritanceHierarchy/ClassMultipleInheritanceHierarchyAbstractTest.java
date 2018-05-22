package org.emoflon.ibex.gt.testsuite.ClassMultipleInheritanceHierarchy;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import ClassMultipleInheritanceHierarchyGraphTransformation.api.ClassMultipleInheritanceHierarchyGraphTransformationAPI;
import classMultipleInheritanceHierarchy.ClassMultipleInheritanceHierarchyPackage;

/**
 * Abstract test class for the ClassMultipleInheritanceHierarchy Graph
 * Transformation API. All tests for this API should inherit from this class.
 */
public class ClassMultipleInheritanceHierarchyAbstractTest
		extends GTTestCase<ClassMultipleInheritanceHierarchyGraphTransformationAPI> {

	@Override
	protected String getTestName() {
		return "ClassMultipleInheritanceHierarchy";
	}

	@Override
	protected ClassMultipleInheritanceHierarchyGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new ClassMultipleInheritanceHierarchyGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(ClassMultipleInheritanceHierarchyPackage.eNS_URI, ClassMultipleInheritanceHierarchyPackage.eINSTANCE);
		return map;
	}
}
