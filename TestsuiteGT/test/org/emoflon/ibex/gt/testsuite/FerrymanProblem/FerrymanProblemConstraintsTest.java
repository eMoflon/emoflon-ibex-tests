package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import ferryman.gt.api.GtGtApi;
import ferryman.gt.api.match.CanEatMatch;

/**
 * Tests for simple constraints with the FerrymanProblem Graph Transformation
 * Api.
 */
public class FerrymanProblemConstraintsTest extends FerrymanProblemAbstractTest {

	@Test
	public void constraints() {
		GtGtApi<?> api = this.init("Start.xmi");

		assertNoMatch(api.canEat());
		assertNoMatch(api.checkAllThingsAtRightBank());
		assertNoMatch(api.findSubjectOnRightBank());
		
		api.terminate();
	}

	@Test
	public void canWolfEatGoat() {
		GtGtApi<?> api = this.init("WolfEatsGoat.xmi");

		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		CanEatMatch match = assertAnyMatchExists(api.canEat());
		assertTrue(match.eater() instanceof Wolf);
		assertTrue(match.eaten() instanceof Goat);
		
		api.terminate();
	}
}
