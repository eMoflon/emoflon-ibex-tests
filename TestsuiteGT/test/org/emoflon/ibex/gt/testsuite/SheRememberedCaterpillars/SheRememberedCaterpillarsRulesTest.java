package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.Character;
import caterpillars.gt.api.GtGtApi;
import caterpillars.gt.api.match.CreateBlueCharacterCoMatch;
import caterpillars.gt.api.match.CreateBlueCharacterMatch;
import caterpillars.gt.api.rule.CreateBlueCharacterRule;
import caterpillars.gt.api.rule.CreateCharacterOfColorOnEmptyPlatformRule;
import caterpillars.gt.api.rule.TransformBlueAndRedToPurpleCharacterRule;

/**
 * Tests for simple constraints with the SheRememberedCaterpillars Graph
 * Transformation Api.
 */
public class SheRememberedCaterpillarsRulesTest extends SheRememberedCaterpillarsAbstractTest {

	@Test
	public void move() {
		GtGtApi<?> api = this.init("Instance1.xmi");

		Character blueCharacter = api.findCharacterNotOnExit().findAnyMatch(true).get().character();
		assertApplicableAndApply(api.moveCharacterAcrossBridge().bindCharacter(blueCharacter));
		assertApplicableAndApply(api.moveCharacterToNeighboringPlatform().bindCharacter(blueCharacter));
		assertAnyMatchExists(api.findCharacterOnExit().bindCharacter(blueCharacter));

		terminate(api);
	}

	@Test
	public void createCharacters() {
		GtGtApi<?> api = this.init("EmptyGame.xmi");
		assertCharacterColorCount(api, 0, 0, 0);
		assertApplicableAndApply(api.createBlueCharacter());
		assertApplicableAndApply(api.createRedCharacter());
		assertApplicableAndApply(api.createCharacterOfColor(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 1);

		terminate(api);
	}

	@Test
	public void createGameDefaultResource() {
		GtGtApi<?> api = this.initEmpty("EmptyGame.xmi");
		assertApplicableAndApply(api.createGame());
		assertEquals(1, api.getModel().getResources().get(0).getContents().size());
	}

	@Test
	public void createCharactersSubscriptions() {
		GtGtApi<?> api = this.init("EmptyGame.xmi");
		
		CreateBlueCharacterRule pattern = api.createBlueCharacter();
		BiConsumer<CreateBlueCharacterMatch, CreateBlueCharacterCoMatch> action = pattern.subscribeApplications((m, cm) -> cm.character().setColor(COLOR.RED));
		assertApplicableAndApply(pattern);
		assertCharacterColorCount(api, 0, 1, 0); // rule application changes color directly after application to red

		pattern.unsubscribeApplications(action);
		assertApplicableAndApply(pattern);
		assertCharacterColorCount(api, 1, 1, 0); // now the created character remains blue!

		pattern.subscribeApplications(action);
		assertApplicableAndApply(pattern);
		assertCharacterColorCount(api, 1, 2, 0); // changed to red again

		pattern.unsubscribeApplications();
		assertApplicableAndApply(pattern);
		assertCharacterColorCount(api, 2, 2, 0); // now the created character remains blue again!

		terminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly() {
		GtGtApi<?> api = this.init("EmptyGame.xmi");
		assertApplicableAndApply(api.createCharacterOfColorOnEmptyPlatform(COLOR.BLUE));
		assertApplicableAndApply(api.createCharacterOfColorOnEmptyPlatform(COLOR.RED));
		// There are only two platforms -> is no empty platform for a third character.
		assertNotApplicable(api.createCharacterOfColorOnEmptyPlatform(COLOR.PURPLE));
		assertCharacterColorCount(api, 1, 1, 0);

		terminate(api);
	}

	@Test
	public void createCharactersOnEmptyPlatformsOnly2() {
		GtGtApi<?> api = this.init("EmptyGame.xmi");

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
		GtGtApi<?> api = this.init("Instance2.xmi");
		assertCharacterColorCount(api, 1, 1, 0);

		assertApplicableAndApply(api.transformBlueAndRedToPurpleCharacter());
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicableAndApply(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0);

		terminate(api);
	}

	@Test
	public void transformCharactersAuto() {
		GtGtApi<?> api = this.init("Instance2.xmi");

		TransformBlueAndRedToPurpleCharacterRule ToPurple = api.transformBlueAndRedToPurpleCharacter();
		while(ToPurple.hasMatches(true))
			assertApplicableAndApply(ToPurple);
			
		assertCharacterColorCount(api, 0, 0, 1);

		assertApplicableAndApply(api.transformPurpleToBlueAndRedCharacter());
		assertCharacterColorCount(api, 1, 1, 0); // check that disable autoApply worked!

		terminate(api);
	}
}
