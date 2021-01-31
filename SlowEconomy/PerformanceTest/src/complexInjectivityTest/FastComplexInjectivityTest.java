package complexInjectivityTest;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;

import FastComplexInjectivityGraphTransformation.api.FastComplexInjectivityGraphTransformationAPI;
import FastComplexInjectivityGraphTransformation.api.FastComplexInjectivityGraphTransformationApp;
import FastComplexInjectivityGraphTransformation.api.FastComplexInjectivityGraphTransformationDemoclesApp;
import FastComplexInjectivityGraphTransformation.api.FastComplexInjectivityGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class FastComplexInjectivityTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "FastComplexInjectivityTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			FastComplexInjectivityGraphTransformationApp app = new FastComplexInjectivityGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			FastComplexInjectivityGraphTransformationAPI api = app.initAPI();
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
//		FastComplexInjectivityGraphTransformationApp app = new FastComplexInjectivityGraphTransformationHiPEApp(WORKSPACE_PATH);
		FastComplexInjectivityGraphTransformationApp app = new FastComplexInjectivityGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		FastComplexInjectivityGraphTransformationAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<100; i++) {
			if((i/10)%2 == 0) {
				api.createAAA().apply();			
			}
			else {
				api.removeAAA();
			}
		}	
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}
