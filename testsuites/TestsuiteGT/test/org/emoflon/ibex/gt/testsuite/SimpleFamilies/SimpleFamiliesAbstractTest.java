package org.emoflon.ibex.gt.testsuite.SimpleFamilies;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import SimpleFamilies.SimpleFamiliesPackage;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;

/**
 * Abstract JUnit test class for SimpleFamilies Graph Transformation API
 */
public abstract class SimpleFamiliesAbstractTest extends GTTestCase<SimpleFamiliesGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "SimpleFamilies";
	}

	@Override
	protected SimpleFamiliesGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new SimpleFamiliesGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(SimpleFamiliesPackage.eNS_URI, SimpleFamiliesPackage.eINSTANCE);
		return map;
	}
}
