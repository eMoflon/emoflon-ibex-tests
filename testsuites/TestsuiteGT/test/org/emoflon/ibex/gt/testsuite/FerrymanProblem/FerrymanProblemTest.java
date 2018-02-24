package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertFalse;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import FerrymanProblem.FerrymanProblemPackage;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;

/**
 * JUnit tests for FerrymanProblem Graph Transformation API
 */
public class FerrymanProblemTest extends GTTestCase<FerrymanProblemGraphTransformationAPI> {
	@Override
	protected FerrymanProblemGraphTransformationAPI getAPI(final IPatternInterpreter engine, final ResourceSet model) {
		return new FerrymanProblemGraphTransformationAPI(engine, model, GTTestCase.workspacePath);
	}

	@Override
	protected Map<String, EPackage> getMetaModelPackages() {
		HashMap<String, EPackage> map = new HashMap<String, EPackage>();
		map.put(FerrymanProblemPackage.eNS_URI, FerrymanProblemPackage.eINSTANCE);
		return map;
	}

	@Test
	public void testCheckAllAtRightBank() {
		FerrymanProblemGraphTransformationAPI api = this.initAPI("FerrymanProblem", "FerrymanProblemInit.xmi");
		assertFalse(api.checkAllThingsAtRightBank().findAnyMatch().isPresent());
	}
}
