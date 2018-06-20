package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

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
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Move.xmi", "Instance1.xmi");

		Character blueCharacter = api.findCharacterNotOnExit().findAnyMatch().get().getCharacter();
		assertApplicable(api.moveCharacterAcrossBridge().bindCharacter(blueCharacter));
		assertApplicable(api.moveCharacterToNeighboringPlatform().bindCharacter(blueCharacter));
		assertAnyMatchExists(api.findCharacterOnExit().bindCharacter(blueCharacter));

		saveAndTerminate(api);
	}

	@Test
	public void createCharacters() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("CreateCharacters.xmi", "EmptyGame.xmi");

		assertCharacterColorCount(api, 0, 0, 0);
		assertApplicable(api.createBlueCharacter()).getCharacter();
		assertApplicable(api.createRedCharacter()).getCharacter();
		assertApplicable(api.createCharacterOfColor(COLOR.PURPLE)).getCharacter();
		assertCharacterColorCount(api, 1, 1, 1);

		saveAndTerminate(api);
	}

	@Test
	public void transformCharacters() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("TransformCharacters.xmi", "Instance2.xmi");

		assertApplicable(api.transformBlueAndRedToPurpleCharacter());
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicable(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0);

		saveAndTerminate(api);
	}
}
