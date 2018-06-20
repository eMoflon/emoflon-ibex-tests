package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

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
		FerrymanProblemGraphTransformationAPI api = this.init("WolfEatsGoat.xmi");

		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		EatMatch match = assertApplicable(api.eat());
		assertTrue(match.getEater() instanceof Wolf);
		assertTrue(match.getEaten() instanceof Goat);

		// Test whether the goat was killed.
		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		saveAndTerminate(api);
	}

	@Test
	public void move() {
		FerrymanProblemGraphTransformationAPI api = this.init("Move.xmi", "Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		assertApplicable(api.moveThing());
		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		saveAndTerminate(api);
	}

	@Test
	public void moveAllSuccess() {
		FerrymanProblemGraphTransformationAPI api = this.init("MoveAllSuccess.xmi", "Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		// Apply eat as soon as possible.
		api.eat().enableAutoApply();

		Cabbage cabbage = api.findCabbage().findAnyMatch().get().getCabbage();
		Goat goat = api.findGoat().findAnyMatch().get().getGoat();
		Wolf wolf = api.findWolf().findAnyMatch().get().getWolf();

		assertApplicable(api.moveThing().bindThing(goat));
		assertApplicable(api.move());
		assertApplicable(api.moveThing().bindThing(cabbage));
		assertApplicable(api.moveThing().bindThing(goat));
		assertApplicable(api.moveThing().bindThing(wolf));
		assertApplicable(api.move());
		assertApplicable(api.moveThing().bindThing(goat));

		assertMatchCount(0, api.findSubjectOnLeftBank());
		assertMatchCount(4, api.findSubjectOnRightBank());

		saveAndTerminate(api);
	}

	@Test
	public void moveAllFail() {
		FerrymanProblemGraphTransformationAPI api = this.init("MoveAllFail.xmi", "Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		// Apply eat as soon as possible.
		api.eat().enableAutoApply();

		Wolf wolf = api.findWolf().findAnyMatch().get().getWolf();
		assertApplicable(api.moveThing().bindThing(wolf));

		// Need to call updateMatches here to trigger notifications.
		api.updateMatches(); // Goat eats the cabbage.

		assertApplicable(api.moveThing().bindThing(wolf));
		assertApplicable(api.move());

		api.updateMatches(); // Wolf eats the goat.

		assertNoMatch(api.findCabbage());
		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(1, api.findSubjectOnRightBank());

		saveAndTerminate(api);
	}

	@Test
	public void killGoatPushoutApproaches() {
		FerrymanProblemGraphTransformationAPI api = this.init("KillGoatSPO.xmi", "Start.xmi");

		assertMatchCount(1, api.findGoat());
		assertNotApplicable(api.killGoat().setDPO().apply());
		assertMatchCount(1, api.findGoat());

		assertApplicable(api.killGoat());
		assertNoMatch(api.findGoat());

		saveAndTerminate(api);
	}
}
