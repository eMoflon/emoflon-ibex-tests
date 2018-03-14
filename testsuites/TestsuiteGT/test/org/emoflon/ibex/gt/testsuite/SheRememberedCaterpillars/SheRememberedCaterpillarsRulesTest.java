package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillars.Character;

/**
 * Tests for simple constraints with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsRulesTest extends SheRememberedCaterpillarsAbstractTest {
	@Test
	public void move() {
		ResourceSet model = this.initResourceSet("Move.xmi", "SheRememberedCaterpillars.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		Character blueCharacter = api.findCharacterNotOnExit() //
				.findAnyMatch().get().getCharacter();
		assertApplicable(api.moveCharacterAcrossBridge() //
				.bindCharacter(blueCharacter).apply());
		assertApplicable(api.moveCharacterToNeighboringPlatform() //
				.bindCharacter(blueCharacter).apply());
		assertAnyMatchExists(api.findCharacterOnExit().bindCharacter(blueCharacter));

		saveResourceSet(model);
	}
}
