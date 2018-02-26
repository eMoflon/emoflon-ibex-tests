package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IPatternInterpreter;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import FerrymanProblem.FerrymanProblemPackage;
import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.matches.CanEatMatch;

/**
 * JUnit tests for FerrymanProblem Graph Transformation API
 */
public class FerrymanProblemTest extends GTTestCase<FerrymanProblemGraphTransformationAPI> {
	@Override
	public String getTestName() {
		return "FerrymanProblem";
	}

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
		FerrymanProblemGraphTransformationAPI api = this.initAPI("Start.xmi");
		assertNoMatch(api.canEat());
		assertNoMatch(api.checkAllThingsAtRightBank());
	}

	@Test
	public void testCheckWolfCanEatGoat() {
		FerrymanProblemGraphTransformationAPI api = this.initAPI("WolfAndGoat.xmi");
		Optional<CanEatMatch> match = api.canEat().findAnyMatch();
		assertTrue(match.isPresent());
		assertTrue(match.get().getEatingThing() instanceof Wolf);
		assertTrue(match.get().getEatenThing() instanceof Goat);
	}
}
