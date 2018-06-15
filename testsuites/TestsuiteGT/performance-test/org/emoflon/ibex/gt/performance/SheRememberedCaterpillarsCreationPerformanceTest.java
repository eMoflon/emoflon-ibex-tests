package org.emoflon.ibex.gt.performance;

import java.util.List;

import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationAPI;
import SheRememberedCaterpillarsGraphTransformation.api.SheRememberedCaterpillarsGraphTransformationDemoclesApp;

public class SheRememberedCaterpillarsCreationPerformanceTest extends GTPerformanceTest {

	protected String getTestName() {
		return "SheRememberedCaterpillars-createPlatforms";
	}
	
	@Override
	protected List<String> getColumnNames() {
		List<String> list = super.getColumnNames();
		list.add("query duration");
		return list;
	}

	@Override
	public void run(int modelSize) {
		SheRememberedCaterpillarsGraphTransformationDemoclesApp app = new SheRememberedCaterpillarsGraphTransformationDemoclesApp();

		// Initialization.
		long initStart = System.nanoTime();
		app.createModel(createDateURI(modelSize));
		app.setWorkspacePath("../../gt-rules/");
		SheRememberedCaterpillarsGraphTransformationAPI api = app.initAPI();
		long initEnd = System.nanoTime();

		// Test.
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
		
		long queryStart = System.nanoTime();
		int count = api.findStandalonePlatform().countMatches() + api.findEmptyExit().countMatches();
		if (count != modelSize) {
			System.out.println("ERROR");
		}
		long queryEnd = System.nanoTime();

		long initDuration = timeDifference(initStart, initEnd);
		long testDuration = timeDifference(testStart, testEnd);
		long queryDuration = timeDifference(queryStart, queryEnd);
		addResult(modelSize, initDuration, testDuration, queryDuration);
		save(app);
	}
}
