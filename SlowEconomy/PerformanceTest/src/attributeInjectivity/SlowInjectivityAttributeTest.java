package attributeInjectivity;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import SlowDisjunctAttributeGraphTransformation.api.SlowDisjunctAttributeGraphTransformationAPI;
import SlowDisjunctAttributeGraphTransformation.api.SlowDisjunctAttributeGraphTransformationApp;
import SlowDisjunctAttributeGraphTransformation.api.SlowDisjunctAttributeGraphTransformationDemoclesApp;
import SlowDisjunctAttributeGraphTransformation.api.SlowDisjunctAttributeGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class SlowInjectivityAttributeTest extends GTPerformanceTest{
	@Override
	protected String getTestName() {
		return "SlowInjectivityAttributeTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SlowDisjunctAttributeGraphTransformationApp app = new SlowDisjunctAttributeGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SlowDisjunctAttributeGraphTransformationAPI api = app.initAPI();
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
//		SlowDisjunctAttributeGraphTransformationApp app = new SlowDisjunctAttributeGraphTransformationHiPEApp(WORKSPACE_PATH);
		SlowDisjunctAttributeGraphTransformationApp app = new SlowDisjunctAttributeGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		SlowDisjunctAttributeGraphTransformationAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<100; i++) {
				api.changeValue().apply();			
		}	
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}
