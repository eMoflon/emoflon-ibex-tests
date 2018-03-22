package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.matches.FindTwoCharactersOnAnExitPlatformMatch;

/**
 * Tests for rule applications with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsConstraintsTest extends SheRememberedCaterpillarsAbstractTest {
	@Test
	public void findCharacters() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
	}

	@Test
	public void findCharactersOfColor() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertMatchCount(1, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(1, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(0, api.findCharacterOfColor(COLOR.PURPLE));
	}

	@Test
	public void noIllegalSituation() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertNoMatch(api.findTwoCharactersOnAnExitPlatform());
	}

	@Test
	public void illegalSituation() {
		ResourceSet model = this.initResourceSet("TwoCharactersAtSameExit.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertAnyMatchExists(api.findTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.findTwoCharactersOnAnExitPlatform());
		assertTrue(api.findTwoCharactersOnAnExitPlatform().findAnyMatch()
				.map(FindTwoCharactersOnAnExitPlatformMatch::getPlatform).map(ExitPlatform.class::isInstance).get());
	}
}
