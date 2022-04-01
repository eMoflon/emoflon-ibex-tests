package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.jupiter.api.Assertions.*
import static org.junit.jupiter.api.Assertions.*
import static org.junit.jupiter.api.Assertions.*

import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.matches.CreateBlueCharacterMatch;
import SheRememberedCaterpillarsGraphTransformation.api.rules.CreateBlueCharacterRule;
import SheRememberedCaterpillarsGraphTransformation.api.rules.CreateCharacterOfColorOnEmptyPlatformRule;
import SheRememberedCaterpillarsGraphTransformation.api.rules.TransformBlueAndRedToPurpleCharacterRule;
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
		assertApplicable(api.createBlueCharacter());
		assertApplicable(api.createRedCharacter());
		assertApplicable(api.createCharacterOfColor(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 1);

		saveAndTerminate(api);
	}

	@Test
	public void createGameDefaultResource() {
		for (int i = 0; i < 2; i++) {
			SheRememberedCaterpillarsGraphTransformationAPI api = this.init(i, "createGameDefaultResource-" + i,
					"1.xmi", "2.xmi");

			assertApplicable(api.createGame());
			assertEquals(0, api.getModel().getResources().get(1 - i).getContents().size());
			assertEquals(1, api.getModel().getResources().get(i).getContents().size());

			saveAndTerminate(api);
		}
	}

	@Test
	public void createCharactersSubscriptions() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("CreateCharactersSubscriptions.xmi",
				"EmptyGame.xmi");

		CreateBlueCharacterRule pattern = api.createBlueCharacter();
		Consumer<CreateBlueCharacterMatch> action = m -> m.getCharacter().setColor(COLOR.RED);
		pattern.subscribeRuleApplications(action);
		assertApplicable(pattern);
		assertCharacterColorCount(api, 0, 1, 0); // rule application changes color directly after application to red

		pattern.unsubscribeRuleApplications(action);
		assertApplicable(pattern);
		assertCharacterColorCount(api, 1, 1, 0); // now the created character remains blue!

		pattern.subscribeRuleApplications(action);
		assertApplicable(pattern);
		assertCharacterColorCount(api, 1, 2, 0); // changed to red again

		pattern.unsubscribeRuleApplications();
		assertApplicable(pattern);
		assertCharacterColorCount(api, 2, 2, 0); // now the created character remains blue again!

		saveAndTerminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("CreateCharactersOnEmptyPlatformsOnly.xmi",
				"EmptyGame.xmi");

		assertApplicable(api.createCharacterOfColorOnEmptyPlatform(COLOR.BLUE));
		assertApplicable(api.createCharacterOfColorOnEmptyPlatform(COLOR.RED));
		// There are only two platforms -> is no empty platform for a third character.
		assertNotApplicable(api.createCharacterOfColorOnEmptyPlatform(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 0);

		saveAndTerminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly2() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("CreateCharactersOnEmptyPlatformsOnly2.xmi",
				"EmptyGame.xmi");

		CreateCharacterOfColorOnEmptyPlatformRule rule = api.createCharacterOfColorOnEmptyPlatform(COLOR.BLUE);
		// Due to the NAC only 2 applications are possible.
		assertEquals(2, rule.apply(5).size());
		assertEquals(2, rule.countRuleApplications());
		assertCharacterColorCount(api, 2, 0, 0);

		saveAndTerminate(api);
	}

	@Test
	public void transformCharacters() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("TransformCharacters.xmi", "Instance2.xmi");
		assertCharacterColorCount(api, 1, 1, 0);

		assertApplicable(api.transformBlueAndRedToPurpleCharacter());
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicable(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0);

		saveAndTerminate(api);
	}

	@Test
	public void transformCharactersAuto() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("TransformCharactersAuto.xmi", "Instance2.xmi");

		TransformBlueAndRedToPurpleCharacterRule autoToPurple = api.transformBlueAndRedToPurpleCharacter();
		autoToPurple.enableAutoApply();
		assertTrue(autoToPurple.isAutoApplyEnabled());
		assertCharacterColorCount(api, 0, 0, 1);

		autoToPurple.disableAutoApply();
		assertFalse(autoToPurple.isAutoApplyEnabled());
		assertApplicable(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0); // check that disable autoApply worked!

		saveAndTerminate(api);
	}
}
