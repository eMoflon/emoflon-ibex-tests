package org.emoflon.ibex.gt.performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import SheRememberedCaterpillars.SimplePlatform;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationDemoclesApp;

/**
 * Performance test for the following steps
 * <ul>
 * <li>Initialize the API with an empty model.</li>
 * <li>Create a new model with 1 game and x platforms (simple platform or exit
 * randomly chosen).</li>
 * <li>Find all matches for two patterns.</li>
 * <li>Add 100 elements to the model.</li>
 * <li>Delete the same 100 elements.</li>
 * </ul>
 */
public class SheRememberedCaterpillarsPerformanceTest1 extends GTPerformanceTest {

	@Override
	protected String getTestName() {
		return "SheRememberedCaterpillars1";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("init", "test", "query count", "query all matches", "add 100 platforms",
				"delete 100 specific platforms", "delete any 100 platforms");
	}

	@Override
	public void run(int modelSize) {
		SheRememberedCaterpillarsGraphTransformationDemoclesApp app = new SheRememberedCaterpillarsGraphTransformationDemoclesApp(
				WORKSPACE_PATH);

		// Initialization.
		long initStart = System.nanoTime();
		app.createModel(createDateURI(modelSize));
		SheRememberedCaterpillarsGraphTransformationAPI api = app.initAPI();
		long initEnd = System.nanoTime();

		// Create a model with the given size.
		long testStart = System.nanoTime();
		api.createGame().apply();
		for (int i = 1; i <= modelSize; i++) {
			if (Math.random() < 0.5) {
				api.createPlatform().apply();
			} else {
				api.createExit().apply();
			}
		}
		long testEnd = System.nanoTime();

		// Execute query for count.
		long queryCountStart = System.nanoTime();
		long count = api.findStandalonePlatform().countMatches() + api.findEmptyExit().countMatches();
		if (count != modelSize) {
			System.out.println("ERROR");
		}
		long queryCountEnd = System.nanoTime();

		// Execute query for matches.
		long queryMatchesStart = System.nanoTime();
		api.findStandalonePlatform().findMatches();
		api.findEmptyExit().findMatches();
		long queryMatchesEnd = System.nanoTime();

		// Add additional elements.
		long addStart = System.nanoTime();
		ArrayList<SimplePlatform> platforms = new ArrayList<SimplePlatform>();
		for (int i = 1; i <= 100; i++) {
			api.createPlatform().apply().ifPresent(m -> platforms.add(m.getPlatform()));
		}
		long addEnd = System.nanoTime();

		// Delete specific elements.
		long deleteStart = System.nanoTime();
		for (SimplePlatform platform : platforms) {
			api.deletePlatform().bindPlatform(platform).apply();
		}
		long deleteEnd = System.nanoTime();

		// Delete any elements.
		long deleteAnyStart = System.nanoTime();
		int deletedElements = api.deletePlatform().apply(100).size();
		if (deletedElements != 100) {
			System.out.println("ERROR");
		}
		long deleteAnyEnd = System.nanoTime();

		long initDuration = timeDifference(initStart, initEnd);
		long testDuration = timeDifference(testStart, testEnd);
		long queryCountDuration = timeDifference(queryCountStart, queryCountEnd);
		long queryMatchesDuration = timeDifference(queryMatchesStart, queryMatchesEnd);
		long addDuration = timeDifference(addStart, addEnd);
		long deletionDuration = timeDifference(deleteStart, deleteEnd);
		long deletionAnyDuration = timeDifference(deleteAnyStart, deleteAnyEnd);

		addResult(modelSize, initDuration, testDuration, queryCountDuration, queryMatchesDuration, addDuration,
				deletionDuration, deletionAnyDuration);
	}
}
