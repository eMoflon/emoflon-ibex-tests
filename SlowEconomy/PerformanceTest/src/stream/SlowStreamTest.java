package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.URI;

import SlowStreamTransform.api.SlowStreamTransformAPI;
import SlowStreamTransform.api.SlowStreamTransformApp;
import SlowStreamTransform.api.SlowStreamTransformDemoclesApp;
import SlowStreamTransform.api.SlowStreamTransformHiPEApp;
import SlowStreamTransform.api.matches.FindAllTwoNodesMatch;
import SlowStreamTransform.api.rules.FindAllTwoNodesRule;
import performanceTests.GTPerformanceTest;

public class SlowStreamTest extends GTPerformanceTest {


	@Override
	protected String getTestName() {
		return "SlowAttrStreamTest";
	}

	@Override
	protected List<String> getColumnNames() {
		return Arrays.asList("matchApplicationTime", "memoryUsage");
	}

	@Override
	protected void prepare(int[] modelSizes) {
		for (int modelSize : modelSizes) {
			SlowStreamTransformApp app = new SlowStreamTransformHiPEApp(WORKSPACE_PATH);
			app.createModel(createURI(modelSize));
			SlowStreamTransformAPI api = app.initAPI();
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
		SlowStreamTransformApp app = new SlowStreamTransformHiPEApp(WORKSPACE_PATH);
//		SlowStreamTransformApp app = new SlowStreamTransformDemoclesApp(WORKSPACE_PATH);
		// Initialization.
		app.loadModel(createURI(modelSize));
		SlowStreamTransformAPI api = app.initAPI();
		Random rnd = new Random();
		// Execute apply
		long countMatchesStart = System.currentTimeMillis();
		api.updateMatches();

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