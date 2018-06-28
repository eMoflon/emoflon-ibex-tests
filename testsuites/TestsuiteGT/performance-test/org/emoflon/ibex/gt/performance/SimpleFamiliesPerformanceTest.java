package org.emoflon.ibex.gt.performance;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationAPI;
import SimpleFamiliesGraphTransformation.api.SimpleFamiliesGraphTransformationDemoclesApp;

/**
 * Performance test for the following steps
 * <ul>
 * <li>Initialize the API with an empty model.</li>
 * <li>Create a new model with 1 register and x families).</li>
 * </ul>
 */
public class SimpleFamiliesPerformanceTest extends GTPerformanceTest {

	@Override
	protected String getTestName() {
		return "SimpleFamilies";
	}

	@Override
	public void run(int modelSize) {
		SimpleFamiliesGraphTransformationDemoclesApp app = new SimpleFamiliesGraphTransformationDemoclesApp(
				WORKSPACE_PATH);

		// Initialization.
		long initStart = System.nanoTime();
		app.createModel(createDateURI(modelSize));
		SimpleFamiliesGraphTransformationAPI api = app.initAPI();
		long initEnd = System.nanoTime();

		Random random = new Random();
		List<String> familyNames = new ArrayList<String>();
		for (int i = 1; i <= modelSize; i++) {
			familyNames.add("Family " + random.nextInt());
		}

		// Test.
		long testStart = System.nanoTime();
		api.createRegister().apply();
		familyNames.forEach(name -> api.createFamily(name).apply());
		long testEnd = System.nanoTime();

		long initDuration = timeDifference(initStart, initEnd);
		long testDuration = timeDifference(testStart, testEnd);
		addResult(modelSize, initDuration, testDuration);
		save(app);
	}
}
