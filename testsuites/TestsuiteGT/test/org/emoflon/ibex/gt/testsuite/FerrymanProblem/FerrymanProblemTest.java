package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.IContextPatternInterpreter;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.emoflon.ibex.gt.testsuite.GTTestCase;
import org.junit.Test;

import FerrymanProblem.FerrymanProblemPackage;
import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.matches.CanEatMatch;
import FerrymanProblemGraphTransformation.api.matches.EatMatch;

/**
 * JUnit tests for FerrymanProblem Graph Transformation API
 */
public class FerrymanProblemTest extends GTTestCase<FerrymanProblemGraphTransformationAPI> {
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

	@Test
	public void testStart() {
		ResourceSet model = this.initResourceSet("Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);
		assertNoMatch(api.canEat());
		assertNoMatch(api.checkAllThingsAtRightBank());
		assertNoMatch(api.findSubjectsOnRightBank());
	}

	@Test
	public void testWolfCanEatGoat() {
		ResourceSet model = this.initResourceSet("WolfCanEatGoat.xmi", "WolfEatsGoat.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);
		assertMatchCount(2, api.findSubjectsOnLeftBank());
		assertMatchCount(2, api.findSubjectsOnRightBank());

		CanEatMatch match = assertAnyMatchExists(api.canEat());
		assertTrue(match.getEater() instanceof Wolf);
		assertTrue(match.getEaten() instanceof Goat);
	}

	@Test
	public void testWolfEatsGoat() {
		ResourceSet model = this.initResourceSet("WolfEatsGoat.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);
		assertMatchCount(2, api.findSubjectsOnLeftBank());
		assertMatchCount(2, api.findSubjectsOnRightBank());

		EatMatch match = assertApplicable(api.eat().apply());
		assertTrue(match.getEater() instanceof Wolf);
		assertTrue(match.getEaten() instanceof Goat);

		// Test whether the goat was killed.
		assertMatchCount(1, api.findSubjectsOnLeftBank());
		assertMatchCount(2, api.findSubjectsOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void testMovement() {
		ResourceSet model = this.initResourceSet("Movement.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);
		assertMatchCount(4, api.findSubjectsOnLeftBank());
		assertMatchCount(0, api.findSubjectsOnRightBank());

		assertApplicable(api.moveToOtherBank().apply());
		assertMatchCount(2, api.findSubjectsOnLeftBank());
		assertMatchCount(2, api.findSubjectsOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void testPushoutSemanticsKillGoat() {
		ResourceSet model = this.initResourceSet("KillGoatSPO.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findGoat());
		assertNotApplicable(api.killGoat().apply(PushoutApproach.DPO));
		assertMatchCount(1, api.findGoat());

		assertApplicable(api.killGoat().apply());
		assertNoMatch(api.findGoat());

		saveResourceSet(model);
	}
}
