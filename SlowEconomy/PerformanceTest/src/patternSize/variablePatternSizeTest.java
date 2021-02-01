package patternSize;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;

import performanceTests.GTPerformanceTest;
import variableDisjunct.api.VariableDisjunctAPI;
import variableDisjunct.api.VariableDisjunctApp;
import variableDisjunct.api.VariableDisjunctDemoclesApp;
import variableDisjunct.api.VariableDisjunctHiPEApp;

public class variablePatternSizeTest extends GTPerformanceTest{
	@Override
	protected String getTestName() {
		return "variablePatternTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			VariableDisjunctApp app = new VariableDisjunctHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			VariableDisjunctAPI api = app.initAPI();
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
//		VariableDisjunctApp app = new VariableDisjunctHiPEApp(WORKSPACE_PATH);
		VariableDisjunctApp app = new VariableDisjunctDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		VariableDisjunctAPI api = app.initAPI();
		
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
