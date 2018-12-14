package org.emoflon.ibex.gt.performance;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationDemoclesApp;

/**
 * Performance test for the following steps
 * <ul>
 * <li>Initialize the API with a model of the given size (load model).</li>
 * <li>Find all matches for two patterns.</li>
 * </ul>
 */
public class SheRememberedCaterpillarsPerformanceTest2 extends GTPerformanceTest {

	@Override
	protected String getTestName() {
		return "SheRememberedCaterpillars2";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("init", "update", "query count", "query all matches");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SheRememberedCaterpillarsGraphTransformationDemoclesApp app = new SheRememberedCaterpillarsGraphTransformationDemoclesApp(
					WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SheRememberedCaterpillarsGraphTransformationAPI api = app.initAPI();
			api.createGame().apply();
			for (int i = 1; i <= modelSize; i++) {
				if (Math.random() < 0.5) {
					api.createPlatform().apply();
				} else {
					api.createExit().apply();
				}
			}
			save(app);
		}
	}

	private URI createURI(final int modelSize) {
		return URI.createFileURI(String.format("%s/model-%s.xmi", RESULT_DIRECTORY + getTestName(), modelSize));
	}

	@Override
	public void run(int modelSize) {
		SheRememberedCaterpillarsGraphTransformationDemoclesApp app = new SheRememberedCaterpillarsGraphTransformationDemoclesApp(
				WORKSPACE_PATH);

		// Initialization.
		long initStart = System.nanoTime();
		app.loadModel(createURI(modelSize));
		SheRememberedCaterpillarsGraphTransformationAPI api = app.initAPI();
		long initEnd = System.nanoTime();

		long updateStart = System.nanoTime();
		api.updateMatches();
		long updateEnd = System.nanoTime();

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

		long initDuration = timeDifference(initStart, initEnd);
		long updateDuration = timeDifference(updateStart, updateEnd);
		long queryCountDuration = timeDifference(queryCountStart, queryCountEnd);
		long queryMatchesDuration = timeDifference(queryMatchesStart, queryMatchesEnd);

		addResult(modelSize, initDuration, updateDuration, queryCountDuration, queryMatchesDuration);
	}
}
