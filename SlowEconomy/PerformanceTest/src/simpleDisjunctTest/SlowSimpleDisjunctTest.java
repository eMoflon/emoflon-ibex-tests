package simpleDisjunctTest;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;

import FastGraphTransformation.api.FastGraphTransformationAPI;
import SlowGraphTransformation.api.SlowGraphTransformationAPI;
import SlowGraphTransformation.api.SlowGraphTransformationApp;
import SlowGraphTransformation.api.SlowGraphTransformationDemoclesApp;
import SlowGraphTransformation.api.SlowGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class SlowSimpleDisjunctTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "SlowSimpleDisjunctTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SlowGraphTransformationApp app = new SlowGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SlowGraphTransformationAPI api = app.initAPI();
			api.createModel().apply();
			for (int i = 1; i <= modelSize; i++) {
				api.createClasses().apply();
			}
			save(app);
		}
	}

	private URI createURI(final int modelSize) {
		return URI.createFileURI(String.format("%s/model-%s.xmi", RESULT_DIRECTORY + getTestName(), modelSize));
	}

	@Override
	public void run(int modelSize) {
//		SlowGraphTransformationApp app = new SlowGraphTransformationHiPEApp(WORKSPACE_PATH);
		SlowGraphTransformationApp app = new SlowGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		SlowGraphTransformationAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<100; i++) {
			if((i/10)%2 == 0) {
				api.createAB().apply();				
			}
			else {
				api.removeAB().apply();
			}
		}
		api.createAB().apply();		
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}