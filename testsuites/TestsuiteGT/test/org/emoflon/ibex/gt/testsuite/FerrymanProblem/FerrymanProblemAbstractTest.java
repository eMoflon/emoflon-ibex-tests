package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;

import FerrymanProblem.FerrymanProblemPackage;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;

/**
 * Abstract test class for the FerrymanProblem Graph Transformation API. All
 * tests for this API should inherit from this class.
 */
public abstract class FerrymanProblemAbstractTest extends GTTestCase<FerrymanProblemGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

	@Override
	protected FerrymanProblemGraphTransformationAPI getAPI(final IContextPatternInterpreter engine,
			final ResourceSet model) {
		return new FerrymanProblemGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(FerrymanProblemPackage.eNS_URI, FerrymanProblemPackage.eINSTANCE);
		return map;
	}
}
