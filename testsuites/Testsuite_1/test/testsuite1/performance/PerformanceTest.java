package testsuite1.performance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import testsuite1.testUtil.performance.Operationalization;
import testsuite1.testUtil.performance.PerformanceTestUtil;
import testsuite1.testUtil.performance.TestDataCollector;
import testsuite1.testUtil.performance.TestDataPoint;

public class PerformanceTest {
	private List<TestDataPoint> testData;
	private PerformanceTestUtil util = new PerformanceTestUtil(testData);
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PerformanceTest test = new PerformanceTest();
		TestDataCollector collector = new TestDataCollector();
		test.testData = collector.collectData();
		
		test.saveDataForTGGSizeDiagramMODELGEN();
		
	}
	
	public void saveDataForTGGSizeDiagramMODELGEN() {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(null, Operationalization.MODELGEN, 100, true);
		List<TestDataPoint> refinementData = util.filterTestResults(null, Operationalization.MODELGEN, 100, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.tgg.getRules().size()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			double median = refinementData.stream()
					   					  .filter(r -> r.tgg.getName().equals(p.tgg.getName()))
					   					  .findAny()
					   					  .get()
					   					  .median();
			diagramStrings.add(util.makeLine(p.tgg.getName(), p.median()+"", median+""));
		}

		// save data in file
		util.saveDataAndCreatePlot(diagramStrings, "TGGSizeDiagramMODELGEN");
				
	}
}
