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
	private static final int standardModelSize = 50;
	
	private List<TestDataPoint> testData;
	private PerformanceTestUtil util = new PerformanceTestUtil();
	
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PerformanceTest test = new PerformanceTest();
		TestDataCollector collector = new TestDataCollector();
		test.testData = collector.collectData();
//		test.testData = collector.loadData();
		
		test.saveDataForTGGSizeDiagram(Operationalization.MODELGEN);
		test.saveDataForTGGSizeDiagram(Operationalization.CC);
		test.saveDataForTGGSizeDiagram(Operationalization.FWD);
		test.saveDataForTGGSizeDiagram(Operationalization.BWD);
//		test.saveDataForTGGSizeDiagram(Operationalization.INCREMENTAL_SYNC);
		
		test.saveDataForTGGsWithoutRefinement();
		
	}
	
	public void saveDataForTGGSizeDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, null, op, standardModelSize, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.tggSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			double median = refinementData.stream()
					   					  .filter(r -> r.tggName.equals(p.tggName))
					   					  .findAny()
					   					  .get()
					   					  .medianExecutionTime();
			diagramStrings.add(util.makeLine(p.tggName, p.medianExecutionTime()+"", median+""));
		}

		// save data in file
		util.saveDataAndCreatePlot(diagramStrings, "TGGSize"+op);
				
	}
	
	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("#", "ClassInhHier2DB", "", "CompanyToIT"));
		diagramStrings.add(util.makeLine("Operationalization", "Flattened", "Refinement"));

		for (Operationalization op : Operationalization.values()) {
			if (op != Operationalization.INCREMENTAL_SYNC)
				diagramStrings.add(util.makeLine(op+"", util.filterTestResults(testData, "ClassInhHier2DB", op, standardModelSize, true).get(0).medianExecutionTime()+"",
														util.filterTestResults(testData, "ClassInhHier2DB", op, standardModelSize, false).get(0).medianExecutionTime()+"",
														util.filterTestResults(testData, "CompanyToIT", op, standardModelSize, true).get(0).medianExecutionTime()+"",
														util.filterTestResults(testData, "CompanyToIT", op, standardModelSize, false).get(0).medianExecutionTime()+""
				));
		}

		// save data in file
		util.saveDataAndCreatePlot(diagramStrings, "TGGsWithoutRefinement");
				
	}
}
