package complexSimpleDisjunct;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import ComplexSimpleDisjunctGraphTransformation.api.ComplexSimpleDisjunctGraphTransformationAPI;
import ComplexSimpleDisjunctGraphTransformation.api.ComplexSimpleDisjunctGraphTransformationApp;
import ComplexSimpleDisjunctGraphTransformation.api.ComplexSimpleDisjunctGraphTransformationHiPEApp;
import SlowComplexSimpleDisjunctGraphTransformation.api.SlowComplexSimpleDisjunctGraphTransformationAPI;
import SlowComplexSimpleDisjunctGraphTransformation.api.SlowComplexSimpleDisjunctGraphTransformationApp;
import SlowComplexSimpleDisjunctGraphTransformation.api.SlowComplexSimpleDisjunctGraphTransformationDemoclesApp;
import SlowComplexSimpleDisjunctGraphTransformation.api.SlowComplexSimpleDisjunctGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class SlowComplexDisjunctTest extends GTPerformanceTest{
	@Override
	protected String getTestName() {
		return "SlowComplexDisjunctTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SlowComplexSimpleDisjunctGraphTransformationApp app = new SlowComplexSimpleDisjunctGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SlowComplexSimpleDisjunctGraphTransformationAPI api = app.initAPI();
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
//		SlowComplexSimpleDisjunctGraphTransformationApp app = new SlowComplexSimpleDisjunctGraphTransformationHiPEApp(WORKSPACE_PATH);
		SlowComplexSimpleDisjunctGraphTransformationApp app = new SlowComplexSimpleDisjunctGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		SlowComplexSimpleDisjunctGraphTransformationAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		for(int i = 0; i<100; i++) {
			if((i/10)%2 == 0) {
				api.createAAA().apply();				
			}
			else {
				api.removeAAA().apply();
			}
		}
		api.createAAA().apply();		
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}
