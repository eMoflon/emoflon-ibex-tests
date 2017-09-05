package testsuite1.performance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import testsuite1.testUtil.Constants;
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
//		System.out.println(test.testData.toString());
		
//		for (Operationalization op : Operationalization.values()) {
//			test.saveDataForTGGSizeDiagram(op);
//		}
		
//		test.saveDataForTGGsWithoutRefinement();
		
		for (Operationalization op : Operationalization.values()) {
			for (String tgg : Constants.testProjects) {
				if (tgg.equals("BlockCodeAdapter"))
					test.saveDataForModelSizeDiagram(tgg, op);
			}
		}
		
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
		util.saveDataAndCreatePlot(diagramStrings, "TGGSize", "TGGSize"+op, op.toString());
				
	}
	
	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("#", "ClassInhHier2DB", "", "CompanyToIT"));
		diagramStrings.add(util.makeLine("Operationalization", "Flattened", "Refinement"));

		for (Operationalization op : Operationalization.values()) {
				diagramStrings.add(util.makeLine(op+"", util.filterTestResults(testData, "ClassInhHier2DB", op, standardModelSize, true).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "ClassInhHier2DB", op, standardModelSize, false).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, standardModelSize, true).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, standardModelSize, false).get(0).executionTimes[0]+""
				));
		}

		// save data in file
		util.saveDataAndCreatePlot(diagramStrings, "TGGsWithoutRefinement", "TGGsWithoutRefinement");
				
	}
	
	public void saveDataForModelSizeDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, tgg, op, null, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			double median = refinementData.stream()
					   					  .filter(r -> r.modelSize == p.modelSize)
					   					  .findAny()
					   					  .get()
					   					  .medianExecutionTime();
			diagramStrings.add(util.makeLine(p.modelSize+"", p.medianExecutionTime()+"", median+""));
		}

		// save data in file
		util.saveDataAndCreatePlot(diagramStrings, "ModelSize", "ModelSize"+op+"_"+tgg, tgg, op.toString());
				
	}
}
