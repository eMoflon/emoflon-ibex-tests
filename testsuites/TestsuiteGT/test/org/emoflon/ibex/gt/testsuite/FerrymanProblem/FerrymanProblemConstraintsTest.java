package org.emoflon.ibex.gt.testsuite.FerrymanProblem;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import FerrymanProblem.Goat;
import FerrymanProblem.Wolf;
import FerrymanProblemGraphTransformation.api.FerrymanProblemGraphTransformationAPI;
import FerrymanProblemGraphTransformation.api.matches.CanEatMatch;

/**
 * Tests for simple constraints with the FerrymanProblem Graph Transformation
 * API.
 */
public class FerrymanProblemConstraintsTest extends FerrymanProblemAbstractTest {
	@Test
	public void constraints() {
		ResourceSet model = this.initResourceSet("Start.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertNoMatch(api.canEat());
		assertNoMatch(api.checkAllThingsAtRightBank());
		assertNoMatch(api.findSubjectOnRightBank());
	}

	@Test
	public void canWolfEatGoat() {
		ResourceSet model = this.initResourceSet("WolfCanEatGoat.xmi", "WolfEatsGoat.xmi");
		FerrymanProblemGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findSubjectOnLeftBank());
		assertMatchCount(2, api.findSubjectOnRightBank());

		CanEatMatch match = assertAnyMatchExists(api.canEat());
		assertTrue(match.getEater() instanceof Wolf);
		assertTrue(match.getEaten() instanceof Goat);
	}
}
