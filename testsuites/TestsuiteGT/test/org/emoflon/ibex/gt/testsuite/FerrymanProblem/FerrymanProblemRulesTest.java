package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import FerrymanProblem.Cabbage;
import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.matches.EatMatch;

/**
 * Tests for rule applications with the FerrymanProblem Graph Transformation
 * API.
 */
public class FerrymanProblemRulesTest extends FerrymanProblemAbstractTest {
	@Test
	public void wolfEatsGoat() {
		ResourceSet model = this.initResourceSet("WolfEatsGoat.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		EatMatch match = assertApplicable(api.eat().apply());
		assertTrue(match.getEater() instanceof Wolf);
		assertTrue(match.getEaten() instanceof Goat);

		// Test whether the goat was killed.
		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void move() {
		ResourceSet model = this.initResourceSet("Move.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		assertApplicable(api.moveThing().apply());
		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void moveAllSuccess() {
		ResourceSet model = this.initResourceSet("MoveAllSuccess.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		// Apply eat as soon as possible.
		api.eat().enableAutoApply();

		Cabbage cabbage = api.findCabbage().findAnyMatch().get().getCabbage();
		Goat goat = api.findGoat().findAnyMatch().get().getGoat();
		Wolf wolf = api.findWolf().findAnyMatch().get().getWolf();

		assertApplicable(api.moveThing().bindThing(goat).apply());
		assertApplicable(api.move().apply());
		assertApplicable(api.moveThing().bindThing(cabbage).apply());
		assertApplicable(api.moveThing().bindThing(goat).apply());
		assertApplicable(api.moveThing().bindThing(wolf).apply());
		assertApplicable(api.move().apply());
		assertApplicable(api.moveThing().bindThing(goat).apply());

		assertMatchCount(0, api.findSubjectOnLeftBank());
		assertMatchCount(4, api.findSubjectOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void moveAllFail() {
		ResourceSet model = this.initResourceSet("MoveAllFail.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		// Apply eat as soon as possible.
		api.eat().enableAutoApply();

		Wolf wolf = api.findWolf().findAnyMatch().get().getWolf();
		assertApplicable(api.moveThing().bindThing(wolf).apply());

		// Need to call updateMatches here to trigger notifications.
		api.updateMatches(); // Goat eats the cabbage.

		assertApplicable(api.moveThing().bindThing(wolf).apply());
		assertApplicable(api.move().apply());

		api.updateMatches(); // Wolf eats the goat.

		assertNoMatch(api.findCabbage());
		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(1, api.findSubjectOnRightBank());

		saveResourceSet(model);
	}

	@Test
	public void killGoatPushoutApproaches() {
		ResourceSet model = this.initResourceSet("KillGoatSPO.xmi", "Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findGoat());
		assertNotApplicable(api.killGoat().setDPO().apply());
		assertMatchCount(1, api.findGoat());

		assertApplicable(api.killGoat().apply());
		assertNoMatch(api.findGoat());

		saveResourceSet(model);
	}
}
