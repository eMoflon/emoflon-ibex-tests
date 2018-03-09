package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.Assert.assertTrue;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.matches.NoTwoCharactersOnAnExitPlatformMatch;

/**
 * Tests for simple constraints with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsConstraintsTest extends SheRememberedCaterpillarsAbstractTest {
	@Test
	public void testFindCharacters() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
	}

	@Test
	public void testNoIllegalSituation() {
		ResourceSet model = this.initResourceSet("SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertNoMatch(api.noTwoCharactersOnAnExitPlatform());
	}

	@Test
	public void testIllegalSituation() {
		ResourceSet model = this.initResourceSet("TwoCharactersAtSameExit.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);
		assertAnyMatchExists(api.noTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.noTwoCharactersOnAnExitPlatform());
		assertTrue(api.noTwoCharactersOnAnExitPlatform().findAnyMatch()
				.map(NoTwoCharactersOnAnExitPlatformMatch::getPlatform).map(ExitPlatform.class::isInstance).get());
	}
}
