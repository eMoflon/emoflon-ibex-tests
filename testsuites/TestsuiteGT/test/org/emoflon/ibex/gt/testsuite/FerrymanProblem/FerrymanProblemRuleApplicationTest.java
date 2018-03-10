package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.common.operational.PushoutApproach;
import org.junit.Test;

import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.matches.EatMatch;

/**
 * Tests for rule applications with the FerrymanProblem Graph Transformation
 * API.
 */
public class FerrymanProblemRuleApplicationTest extends FerrymanProblemAbstractTest {
	@Test
	public void wolfEatsGoat() {
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
	public void move() {
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
	public void killGoatPushoutApproaches() {
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
