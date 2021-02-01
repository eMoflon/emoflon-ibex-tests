package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;

import FastStreamTransform.api.FastStreamTransformAPI;
import FastStreamTransform.api.FastStreamTransformApp;
import FastStreamTransform.api.FastStreamTransformDemoclesApp;
import FastStreamTransform.api.FastStreamTransformHiPEApp;
import FastStreamTransform.api.matches.FindAllTwoNodesMatch;
import FastStreamTransform.api.rules.FindAllTwoNodesRule;
import performanceTests.GTPerformanceTest;

public class FastStreamTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "FastAttrStreamTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			FastStreamTransformApp app = new FastStreamTransformHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			FastStreamTransformAPI api = app.initAPI();
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
		FastStreamTransformApp app = new FastStreamTransformHiPEApp(WORKSPACE_PATH);
//		FastStreamTransformApp app = new FastStreamTransformDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		FastStreamTransformAPI api = app.initAPI();
		
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();
		Random rnd = new Random();
		for(int i = 0; i<100; i++) {		
			for(FindAllTwoNodesMatch m: api.findAllTwoNodes(rnd.nextInt()).matchStream().collect(Collectors.toList())) {
				api.findAllTwoNodes(rnd.nextInt()).apply(m);
			}
		}			
		long countMatchesEnd = System.currentTimeMillis();
		
		long memoryUsage = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		long applyDuration = timeDifference(countMatchesStart, countMatchesEnd);

		addResult(modelSize, applyDuration, memoryUsage);
	}
}