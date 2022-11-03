package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillars.Game;
import SheRememberedCaterpillars.SheRememberedCaterpillarsFactory;
import SheRememberedCaterpillars.SimplePlatform;
import caterpillars.gt.api.GtHiPEGtAPI;
import caterpillars.gt.api.match.FindStandalonePlatformMatch;
import caterpillars.gt.api.match.FindTwoCharactersOnAnExitPlatformMatch;
import caterpillars.gt.api.pattern.FindPlatformWithExactlyOneNeighborPattern;
import caterpillars.gt.api.pattern.FindPlatformWithNeighborPattern;
import caterpillars.gt.api.pattern.FindPlatformWithTwoNeighborsPattern;

/**
 * Tests for rule applications with the SheRememberedCaterpillars Graph
 * Transformation API.
 */
public class SheRememberedCaterpillarsConstraintsTest extends SheRememberedCaterpillarsAbstractTest {

	@Test
	public void findCharacters() {
		GtHiPEGtAPI api = this.init("Instance1.xmi");

		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
	}

	@Test
	public void findCharactersOfColor() {
		GtHiPEGtAPI api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(1, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(0, api.findCharacterOfColor(COLOR.PURPLE));
	}

	@Test
	public void noIllegalSituation() {
		GtHiPEGtAPI api = this.initEmpty("SheRememberedCaterpillars.xmi");

		assertNoMatch(api.findTwoCharactersOnAnExitPlatform());
	}

	@Test
	public void illegalSituation() {
		GtHiPEGtAPI api = this.init("TwoCharactersAtSameExit.xmi");

		assertAnyMatchExists(api.findTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.findTwoCharactersOnAnExitPlatform());
		assertTrue(api.findTwoCharactersOnAnExitPlatform().findAnyMatch(true)
				.map(FindTwoCharactersOnAnExitPlatformMatch::platform).map(ExitPlatform.class::isInstance).get());
	}

	@Test
	public void findEmptyExit() {
		GtHiPEGtAPI api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findEmptyExit());
	}

	@Test
	public void findStandalonePlatform() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findStandalonePlatform());
		FindStandalonePlatformMatch m = assertAnyMatchExists(api.findStandalonePlatform());
		assertTrue(m.platform().getNeighbors().isEmpty());
		assertTrue(m.platform().getConnectedBy() == null);
	}

	@Test
	public void findPlatformWithNeighbors() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithExactlyOneNeighbor());
		assertMatchCount(2, api.findPlatformWithNeighbor());
		assertMatchCount(1, api.findPlatformWithTwoNeighbors());
	}
	
	@Test
	public void findPlatformWithNeighbors_inc_create() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		FindPlatformWithExactlyOneNeighborPattern findPlatformWithExactlyOneNeighbor = api.findPlatformWithExactlyOneNeighbor();
		FindPlatformWithTwoNeighborsPattern findPlatformWithTwoNeighbors = api.findPlatformWithTwoNeighbors();
		FindPlatformWithNeighborPattern findPlatformWithNeighbor = api.findPlatformWithNeighbor();
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(1, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(1, findPlatformWithTwoNeighbors);
		
		SimplePlatform platform = findPlatformWithExactlyOneNeighbor.findAnyMatch(true).get().platform();
		Game game = (Game) platform.eContainer();
		SimplePlatform newPlatform = SheRememberedCaterpillarsFactory.eINSTANCE.createSimplePlatform();
		game.getObjects().add(newPlatform);
		platform.getNeighbors().add(newPlatform);
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(0, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(2, findPlatformWithTwoNeighbors);
	}
	
	@Test
	public void findPlatformWithNeighbors_inc_del() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		FindPlatformWithExactlyOneNeighborPattern findPlatformWithExactlyOneNeighbor = api.findPlatformWithExactlyOneNeighbor();
		FindPlatformWithTwoNeighborsPattern findPlatformWithTwoNeighbors = api.findPlatformWithTwoNeighbors();
		FindPlatformWithNeighborPattern findPlatformWithNeighbor = api.findPlatformWithNeighbor();
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(1, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(1, findPlatformWithTwoNeighbors);
		
//		System.out.println("-----------CHANGE------------");
		
		SimplePlatform platform = findPlatformWithTwoNeighbors.findAnyMatch(true).get().platform();
		platform.getNeighbors().remove(platform.getNeighbors().stream().findFirst().get());
//		platform.getNeighbors().remove(0);
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(2, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(0, findPlatformWithTwoNeighbors);
	}


	@Test
	public void findPlatformWithConnections() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findPlatformWithConnection());
		assertMatchCount(0, api.findPlatformWithTwoConnections());
	}

	@Test
	public void findPlatformWithTwoWays() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithTwoWays());
	}

	@Test
	public void findDeadEnd() {
		GtHiPEGtAPI api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findDeadEnd());
	}

	@Test
	public void noPlatformWithSelfNeighborship() {
		GtHiPEGtAPI api = this.init("Instance1.xmi");

		api.findPlatformSelfNeighbor().getMatches(true).forEach(m -> {
			System.out.println(m);
		});

		assertMatchCount(0, api.findPlatformSelfNeighbor());
	}
	
	@Test
	public void findPlatformWithSelfNeighborship() {
		GtHiPEGtAPI api = this.init("Instance1.xmi");

		api.findPlatformSelfNeighbor().getMatches(true).forEach(m -> {
			System.out.println(m);
		});
		
		SimplePlatform platform = api.findPlatformWithNeighbor().findAnyMatch(true).get().platform();
		platform.getNeighbors().add(platform);

		assertMatchCount(1, api.findPlatformSelfNeighbor());
	}
}
