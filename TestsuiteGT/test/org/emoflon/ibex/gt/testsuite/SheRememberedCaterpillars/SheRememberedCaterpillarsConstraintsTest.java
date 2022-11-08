package org.emoflon.ibex.gt.testsuite.SheRememberedCaterpillars;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import SheRememberedCaterpillars.COLOR;
import SheRememberedCaterpillars.ExitPlatform;
import SheRememberedCaterpillars.Game;
import SheRememberedCaterpillars.SheRememberedCaterpillarsFactory;
import SheRememberedCaterpillars.SimplePlatform;
import caterpillars.gt.api.GtGtAPI;
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
		GtGtAPI<?> api = this.init("Instance1.xmi");

		assertMatchCount(2, api.findCharacter());
		assertAnyMatchExists(api.findCharacterNotOnExit());
		assertAnyMatchExists(api.findCharacterOnExit());
		
		api.terminate();
	}

	@Test
	public void findCharactersOfColor() {
		GtGtAPI<?> api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findCharacterOfColor(COLOR.BLUE));
		assertMatchCount(1, api.findCharacterOfColor(COLOR.RED));
		assertMatchCount(0, api.findCharacterOfColor(COLOR.PURPLE));
		
		api.terminate();
	}

	@Test
	public void noIllegalSituation() {
		GtGtAPI<?> api = this.initEmpty("SheRememberedCaterpillars.xmi");

		assertNoMatch(api.findTwoCharactersOnAnExitPlatform());
		
		api.terminate();
	}

	@Test
	public void illegalSituation() {
		GtGtAPI<?> api = this.init("TwoCharactersAtSameExit.xmi");

		assertAnyMatchExists(api.findTwoCharactersOnAnExitPlatform());
		assertMatchCount(2, api.findTwoCharactersOnAnExitPlatform());
		assertTrue(api.findTwoCharactersOnAnExitPlatform().findAnyMatch(true)
				.map(FindTwoCharactersOnAnExitPlatformMatch::platform).map(ExitPlatform.class::isInstance).get());
	
		api.terminate();
	}

	@Test
	public void findEmptyExit() {
		GtGtAPI<?> api = this.init("Instance1.xmi");

		assertMatchCount(1, api.findEmptyExit());
	
		api.terminate();
	}

	@Test
	public void findStandalonePlatform() {
		GtGtAPI<?> api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findStandalonePlatform());
		FindStandalonePlatformMatch m = assertAnyMatchExists(api.findStandalonePlatform());
		assertTrue(m.platform().getNeighbors().isEmpty());
		assertTrue(m.platform().getConnectedBy() == null);
	
		api.terminate();
	}

	@Test
	public void findPlatformWithNeighbors() {
		GtGtAPI<?> api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithExactlyOneNeighbor());
		assertMatchCount(2, api.findPlatformWithNeighbor());
		assertMatchCount(1, api.findPlatformWithTwoNeighbors());
	
		api.terminate();
	}
	
	@Test
	public void findPlatformWithNeighbors_inc_create() {
		GtGtAPI<?> api = this.init("Instance3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		FindPlatformWithExactlyOneNeighborPattern findPlatformWithExactlyOneNeighbor = api.findPlatformWithExactlyOneNeighbor();
		FindPlatformWithTwoNeighborsPattern findPlatformWithTwoNeighbors = api.findPlatformWithTwoNeighbors();
		FindPlatformWithNeighborPattern findPlatformWithNeighbor = api.findPlatformWithNeighbor();
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(1, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(1, findPlatformWithTwoNeighbors);
		
		SimplePlatform platform = findPlatformWithExactlyOneNeighbor.findAnyMatch().get().platform();
		Game game = (Game) platform.eContainer();
		SimplePlatform newPlatform = SheRememberedCaterpillarsFactory.eINSTANCE.createSimplePlatform();
		game.getObjects().add(newPlatform);
		platform.getNeighbors().add(newPlatform);
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(0, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(2, findPlatformWithTwoNeighbors);
	
		api.terminate();
	}
	
	@Test
	public void findPlatformWithNeighbors_inc_del() {
		GtGtAPI<?> api = this.init("Instance3.xmi");
		api.getGTEngine().setAlwaysUpdateAfter(true);
		api.getGTEngine().setAlwaysUpdatePrior(true);

		FindPlatformWithExactlyOneNeighborPattern findPlatformWithExactlyOneNeighbor = api.findPlatformWithExactlyOneNeighbor();
		FindPlatformWithTwoNeighborsPattern findPlatformWithTwoNeighbors = api.findPlatformWithTwoNeighbors();
		FindPlatformWithNeighborPattern findPlatformWithNeighbor = api.findPlatformWithNeighbor();
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(1, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(1, findPlatformWithTwoNeighbors);
		
//		System.out.println("-----------CHANGE------------");
		
		SimplePlatform platform = findPlatformWithTwoNeighbors.findAnyMatch().get().platform();
		platform.getNeighbors().remove(platform.getNeighbors().stream().findFirst().get());
//		platform.getNeighbors().remove(0);
		
		assertMatchCount(2, findPlatformWithNeighbor);
		assertMatchCount(2, findPlatformWithExactlyOneNeighbor);
		assertMatchCount(0, findPlatformWithTwoNeighbors);
	
		api.terminate();
	}


	@Test
	public void findPlatformWithConnections() {
		GtGtAPI<?> api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findPlatformWithConnection());
		assertMatchCount(0, api.findPlatformWithTwoConnections());
	
		api.terminate();
	}

	@Test
	public void findPlatformWithTwoWays() {
		GtGtAPI<?> api = this.init("Instance3.xmi");

		assertMatchCount(1, api.findPlatformWithTwoWays());
	
		api.terminate();
	}

	@Test
	public void findDeadEnd() {
		GtGtAPI<?> api = this.init("Instance3.xmi");

		assertMatchCount(2, api.findDeadEnd());
	
		api.terminate();
	}

	@Test
	public void noPlatformWithSelfNeighborship() {
		GtGtAPI<?> api = this.init("Instance1.xmi");

		api.findPlatformSelfNeighbor().getMatches(true).forEach(m -> {
			System.out.println(m);
		});

		assertMatchCount(0, api.findPlatformSelfNeighbor());
	
		api.terminate();
	}
	
	@Test
	public void findPlatformWithSelfNeighborship() {
		GtGtAPI<?> api = this.init("Instance1.xmi");

		api.findPlatformSelfNeighbor().getMatches(true).forEach(m -> {
			System.out.println(m);
		});
		
		SimplePlatform platform = api.findPlatformWithNeighbor().findAnyMatch(true).get().platform();
		platform.getNeighbors().add(platform);

		assertMatchCount(1, api.findPlatformSelfNeighbor());
	
		api.terminate();
	}
}
