package simpleDisjunctTest;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import FastGraphTransformation.api.FastGraphTransformationAPI;
import FastGraphTransformation.api.FastGraphTransformationApp;
import FastGraphTransformation.api.FastGraphTransformationDemoclesApp;
import FastGraphTransformation.api.FastGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class FastSimpleDisjunctTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "FastSimpleDisjunctTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			FastGraphTransformationApp app = new FastGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			FastGraphTransformationAPI api = app.initAPI();
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
//		FastGraphTransformationApp app = new FastGraphTransformationHiPEApp(WORKSPACE_PATH);
		FastGraphTransformationApp app = new FastGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		FastGraphTransformationAPI api = app.initAPI();
		
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
