package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.junit.Test;

import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.Character;

/**
 * Tests for simple constraints with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsRulesTest extends SheRememberedCaterpillarsAbstractTest {
	@Test
	public void move() {
		ResourceSet model = this.initResourceSet("Move.xmi", "Instance1.xmi");
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

	@Test
	public void createCharacters() {
		ResourceSet model = this.initResourceSet("CreateCharacters.xmi", "EmptyGame.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertCharacterColorCount(api, 0, 0, 0);
		assertApplicable(api.createBlueCharacter().apply()).getCharacter();
		assertApplicable(api.createRedCharacter().apply()).getCharacter();
		assertApplicable(api.createCharacterOfColor(COLOR.PURPLE).apply()).getCharacter();
		assertCharacterColorCount(api, 1, 1, 1);

		saveResourceSet(model);
	}

	@Test
	public void transformCharacters() {
		ResourceSet model = this.initResourceSet("TransformCharacters.xmi", "Instance2.xmi");
		SheRememberedCaterpillarsGraphTransformationAPI api = this.initAPI(model);

		assertApplicable(api.transformBlueAndRedToPurpleCharacter().apply());
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicable(api.transformPurpleToBlueAndRedCharacter().apply());
		assertCharacterColorCount(api, 1, 1, 0);

		saveResourceSet(model);
	}
}
