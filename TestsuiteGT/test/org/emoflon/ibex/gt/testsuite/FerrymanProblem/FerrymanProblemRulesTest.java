package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FerrymanProblem.Cabbage;
import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import ferryman.gt.api.GtGtAPI;
import ferryman.gt.api.match.EatCoMatch;

/**
 * Tests for rule applications with the FerrymanProblem Graph Transformation
 * API.
 */
public class FerrymanProblemRulesTest extends FerrymanProblemAbstractTest {

	@Test
	public void wolfEatsGoat() {
		GtGtAPI<?> api = this.init("WolfEatsGoat.xmi");

		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		EatCoMatch match = assertApplicableAndApply(api.eat());
		assertTrue(match.eater() instanceof Wolf);
		assertTrue(match.typedMatch.eaten() instanceof Goat);

		// Test whether the goat was killed.
		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		terminate(api);
	}

	@Test
	public void move() {
		GtGtAPI<?> api = this.init("Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		assertApplicableAndApply(api.moveThing());
		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		terminate(api);
	}

	@Test
	public void moveAllSuccess() {
		GtGtAPI<?> api = this.init("Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		Cabbage cabbage = api.findCabbage().findAnyMatch(true).get().cabbage();
		Goat goat = api.findGoat().findAnyMatch(false).get().goat();
		Wolf wolf = api.findWolf().findAnyMatch(false).get().wolf();

		assertApplicableAndApply(api.moveThing().bindThing(goat));
		api.eat().applyAny(true);
		assertApplicableAndApply(api.move());
		api.eat().applyAny(true);
		assertApplicableAndApply(api.moveThing().bindThing(cabbage));
		api.eat().applyAny(true);
		assertApplicableAndApply(api.moveThing().bindThing(goat));
		api.eat().applyAny(true);
		assertApplicableAndApply(api.moveThing().bindThing(wolf));
		api.eat().applyAny(true);
		assertApplicableAndApply(api.move());
		api.eat().applyAny(true);
		assertApplicableAndApply(api.moveThing().bindThing(goat));
		api.eat().applyAny(true);

		assertMatchCount(0, api.findSubjectOnLeftBank());
		assertMatchCount(4, api.findSubjectOnRightBank());
		assertEquals(0, api.eat().countRuleApplications());

		terminate(api);
	}

	@Test
	public void moveAllFail() {
		GtGtAPI<?> api = this.init("Start.xmi");

		assertMatchCount(4, api.findSubjectOnLeftBank());
		assertMatchCount(0, api.findSubjectOnRightBank());

		Wolf wolf = api.findWolf().findAnyMatch(true).get().wolf();
		assertApplicableAndApply(api.moveThing().bindThing(wolf));
		api.eat().applyAny(true);

		// Goat eats the cabbage due to rule application.
		assertNoMatch(api.findCabbage());
		api.eat().applyAny(true);

		assertApplicableAndApply(api.moveThing().bindThing(wolf));
		api.eat().applyAny(true);
		assertApplicableAndApply(api.move());
		api.eat().applyAny(true);

		// Wolf eats the goat due to rule application.
		assertNoMatch(api.findGoat());
		api.eat().applyAny(true);

		assertMatchCount(1, api.findSubjectOnLeftBank());
		assertMatchCount(1, api.findSubjectOnRightBank());
		assertEquals(2, api.eat().countRuleApplications());

		terminate(api);
	}

}
