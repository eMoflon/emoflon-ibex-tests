package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.Character;
import caterpillars.gt.api.GtGtAPI;
import caterpillars.gt.api.rule.CreateCharacterOfColorOnEmptyPlatformRule;
import caterpillars.gt.api.rule.TransformBlueAndRedToPurpleCharacterRule;

/**
 * Tests for simple constraints with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsRulesTest extends SheRememberedCaterpillarsAbstractTest {

	@Test
	public void move() {
		GtGtAPI<?> api = this.init("Instance1.xmi");

		Character blueCharacter = api.findCharacterNotOnExit().findAnyMatch(true).get().character();
		assertApplicableAndApply(api.moveCharacterAcrossBridge().bindCharacter(blueCharacter));
		assertApplicableAndApply(api.moveCharacterToNeighboringPlatform().bindCharacter(blueCharacter));
		assertAnyMatchExists(api.findCharacterOnExit().bindCharacter(blueCharacter));

		terminate(api);
	}

	@Test
	public void createCharacters() {
		GtGtAPI<?> api = this.init("EmptyGame.xmi");
		assertCharacterColorCount(api, 0, 0, 0);
		assertApplicableAndApply(api.createBlueCharacter());
		assertApplicableAndApply(api.createRedCharacter());
		assertApplicableAndApply(api.createCharacterOfColor(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 1);

		terminate(api);
	}

	@Test
	public void createGameDefaultResource() {
		GtGtAPI<?> api = this.initEmpty("EmptyGame.xmi");
		assertApplicableAndApply(api.createGame());
		assertEquals(1, api.getModel().getResources().get(0).getContents().size());
	}

	@Test
	public void createCharactersSubscriptions() {
		GtGtAPI<?> api = this.initEmpty("EmptyGame.xmi");

		//TODO: Implement rule subscribers
//		CreateBlueCharacterRule pattern = api.createBlueCharacter();
//		Consumer<CreateBlueCharacterMatch> action = m -> m.character().setColor(COLOR.RED);
//		pattern.subscribeRuleApplications(action);
//		assertApplicable(pattern);
//		assertCharacterColorCount(api, 0, 1, 0); // rule application changes color directly after application to red
//
//		pattern.unsubscribeRuleApplications(action);
//		assertApplicable(pattern);
//		assertCharacterColorCount(api, 1, 1, 0); // now the created character remains blue!
//
//		pattern.subscribeRuleApplications(action);
//		assertApplicable(pattern);
//		assertCharacterColorCount(api, 1, 2, 0); // changed to red again
//
//		pattern.unsubscribeRuleApplications();
//		assertApplicable(pattern);
//		assertCharacterColorCount(api, 2, 2, 0); // now the created character remains blue again!

		terminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly() {
		GtGtAPI<?> api = this.init("EmptyGame.xmi");
		assertApplicableAndApply(api.createCharacterOfColorOnEmptyPlatform(COLOR.BLUE));
		assertApplicableAndApply(api.createCharacterOfColorOnEmptyPlatform(COLOR.RED));
		// There are only two platforms -> is no empty platform for a third character.
		assertNotApplicable(api.createCharacterOfColorOnEmptyPlatform(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 0);

		terminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly2() {
		GtGtAPI<?> api = this.init("EmptyGame.xmi");

		CreateCharacterOfColorOnEmptyPlatformRule rule = api.createCharacterOfColorOnEmptyPlatform(COLOR.BLUE);
		// Due to the NAC only 2 applications are possible.
		for(int i = 0; i<2; i++) {
			assertApplicableAndApply(rule);
		}
		assertNotApplicable(rule);
		
		assertEquals(2, rule.countRuleApplications());
		assertCharacterColorCount(api, 2, 0, 0);

		terminate(api);
	}

	@Test
	public void transformCharacters() {
		GtGtAPI<?> api = this.init("Instance2.xmi");
		assertCharacterColorCount(api, 1, 1, 0);

		assertApplicableAndApply(api.transformBlueAndRedToPurpleCharacter());
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicableAndApply(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0);

		terminate(api);
	}

	@Test
	public void transformCharactersAuto() {
		GtGtAPI<?> api = this.init("Instance2.xmi");

		TransformBlueAndRedToPurpleCharacterRule ToPurple = api.transformBlueAndRedToPurpleCharacter();
		while(ToPurple.hasMatches(true))
			assertApplicableAndApply(ToPurple);
			
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicableAndApply(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0); // check that disable autoApply worked!

		terminate(api);
	}
}
