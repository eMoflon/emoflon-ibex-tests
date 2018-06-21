package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.matches.FindStandalonePlatformMatch;
import SheRememberedCaterpillarsGraphTransformation.api.matches.FindTwoCharactersOnAnExitPlatformMatch;

/**
 * Tests for rule applications with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsConstraintsTest extends SheRememberedCaterpillarsAbstractTest {

	@Test
	public void findCharacters() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance1.xmi");

		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
	}

	@Test
	public void findCharactersOfColor() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(1, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(0, api.findCharacterOfColor(COLOR.PURPLE));
	}

	@Test
	public void noIllegalSituation() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("SheRememberedCaterpillars.xmi");

		assertNoMatch(api.findTwoCharactersOnAnExitPlatform());
	}

	@Test
	public void illegalSituation() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("TwoCharactersAtSameExit.xmi");

		assertAnyMatchExists(api.findTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.findTwoCharactersOnAnExitPlatform());
		assertTrue(api.findTwoCharactersOnAnExitPlatform().findAnyMatch()
				.map(FindTwoCharactersOnAnExitPlatformMatch::getPlatform).map(ExitPlatform.class::isInstance).get());
	}

	@Test
	public void findEmptyExit() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findEmptyExit());
	}

	@Test
	public void findStandalonePlatform() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findStandalonePlatform());
		FindStandalonePlatformMatch m = assertAnyMatchExists(api.findStandalonePlatform());
		assertTrue(m.getPlatform().getNeighbors().isEmpty());
		assertTrue(m.getPlatform().getConnectedBy() == null);
	}

	@Test
	public void findPlatformWithNeighbors() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithExactlyOneNeighbor());
		assertMatchCount(2, api.findPlatformWithNeighbor());
		assertMatchCount(1, api.findPlatformWithTwoNeighbors());
	}

	@Test
	public void findPlatformWithConnections() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findPlatformWithConnection());
		assertMatchCount(0, api.findPlatformWithTwoConnections());
	}

	@Test
	public void findPlatformWithTwoWays() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithTwoWays());
	}

	@Test
	public void findDeadEnd() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findDeadEnd());
	}

	@Ignore("Invalid matches reported by Democles: https://github.com/eMoflon/emoflon-ibex-democles/issues/74")
	@Test
	public void findPlatformWithSelfNeighborship() {
		SheRememberedCaterpillarsGraphTransformationAPI api = this.init("Instance1.xmi");

		api.findPlatformSelfNeighbor().forEachMatch(m -> {
			System.out.println(m);
		});

		assertMatchCount(0, api.findPlatformSelfNeighbor());
	}
}
