package simpleAttribute;

import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import FastSimpleGraphTransformation.api.FastSimpleGraphTransformationAPI;
import FastSimpleGraphTransformation.api.FastSimpleGraphTransformationApp;
import FastSimpleGraphTransformation.api.FastSimpleGraphTransformationDemoclesApp;
import FastSimpleGraphTransformation.api.FastSimpleGraphTransformationHiPEApp;
import performanceTests.GTPerformanceTest;

public class FastSimpleAttributeTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "FastSimpleAttributeTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			FastSimpleGraphTransformationApp app = new FastSimpleGraphTransformationHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			FastSimpleGraphTransformationAPI api = app.initAPI();
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
//		FastSimpleGraphTransformationApp app = new FastSimpleGraphTransformationHiPEApp(WORKSPACE_PATH);
		FastSimpleGraphTransformationApp app = new FastSimpleGraphTransformationDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		FastSimpleGraphTransformationAPI api = app.initAPI();
		
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
