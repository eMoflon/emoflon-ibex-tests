
package simpleInjectivity;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;

import SlowSimpleInjectivityGraphTransformation.api.SlowSimpleInjectivityGraphTransformationAPI;
import SlowSimpleInjectivityGraphTransformation.api.SlowSimpleInjectivityGraphTransformationApp;
import SlowSimpleInjectivityGraphTransformation.api.SlowSimpleInjectivityGraphTransformationDemoclesApp;
import SlowSimpleInjectivityGraphTransformation.api.SlowSimpleInjectivityGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class SlowSimpleInjectivityGraphTransformationTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "SlowSimpleInjectivityTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SlowSimpleInjectivityGraphTransformationApp app = new SlowSimpleInjectivityGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SlowSimpleInjectivityGraphTransformationAPI api = app.initAPI();
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
//		SlowSimpleInjectivityGraphTransformationApp app = new SlowSimpleInjectivityGraphTransformationHiPEApp(WORKSPACE_PATH);
		SlowSimpleInjectivityGraphTransformationApp app = new SlowSimpleInjectivityGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		SlowSimpleInjectivityGraphTransformationAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<100; i++) {
			if((i/10)%2 == 0) {
				api.createAA().apply();				
			}
			else {
				api.removeAA().apply();
			}
		}
		api.createAA().apply();		
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}