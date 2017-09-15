package testsuite1.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import testsuite1.testUtil.Constants;
import testsuite1.testUtil.performance.Operationalization;
import testsuite1.testUtil.performance.PerformanceTestUtil;
import testsuite1.testUtil.performance.TestDataPoint;

public class PerformanceTest {
	public static final int standardModelSize = 50;
	public static final int bigModelSize = 1000;
	
	public List<TestDataPoint> testData;
	public List<TestDataPoint> maxModelSizes;
	private PerformanceTestUtil util = new PerformanceTestUtil();

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PerformanceTest test = new PerformanceTest();
		TestDataCollector collector = new TestDataCollector();
//		test.testData = collector.collectData();
		test.testData = collector.loadData();
		test.maxModelSizes = collector.getMaxModelSizes();
		
//		test.saveDataForTGGsWithoutRefinement();
		for (Operationalization op : Operationalization.values()) {
//			test.saveDataForAllTGGsDiagram(op);
//			test.saveDataForAllTGGsInitDiagram(op);
//			test.saveDataForMemoryUsageDiagram(op);
			for (String tgg : Constants.testProjects) {
				test.saveDataForInitTimesDiagram(tgg, op);
//				test.saveDataForModelSizeDiagram(tgg, op);
			}
		}
		
	}
	
	/**
	 * Saves the data as a .dat file in the performance/data directory
	 * of the testsuite. Also, generates the gnuplot script and executes it.
	 * @param data
	 * @param fileName Name of the .dat file
	 */
	public void saveDataAndCreatePlot(List<String> data, String diagramType, String fileName, String... args) {
		try {				
			Path file = Paths.get("performance/data/"+fileName+".dat");
			Files.write(file, data);
			GNUPlotScripts.createPlot(diagramType, fileName, "pdf", args);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveDataForAllTGGsDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, null, op, standardModelSize, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize, false);

		flattenedData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianExecutionTime()));

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
		saveDataAndCreatePlot(diagramStrings, "AllTGGs", "AllTGGs"+op, op.toString());
				
	}
	
	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("#", "ClassInhHier2DB", "", "CompanyToIT"));
		diagramStrings.add(util.makeLine("Operationalization", "Flattened", "Refinement"));

		for (Operationalization op : Operationalization.values()) {
				diagramStrings.add(util.makeLine(op+"", util.filterTestResults(testData, "ClassInhHier2DB", op, bigModelSize, true).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "ClassInhHier2DB", op, bigModelSize, false).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, bigModelSize, true).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, bigModelSize, false).get(0).executionTimes[0]+""
				));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "TGGsWithoutRefinement", "TGGsWithoutRefinement");
				
	}
	
	public void saveDataForModelSizeDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, tgg, op, null, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			Optional<String> median = refinementData.stream()
					   					  .filter(r -> r.modelSize == p.modelSize)
					   					  .findAny()
					   					  .map(t -> t.medianExecutionTime())
					   					  .map(m -> m.toString());
			diagramStrings.add(util.makeLine(p.modelSize+"", p.medianExecutionTime()+"", median.orElse("-")));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "ModelSize", "ModelSize"+op+"_"+tgg, tgg, op.toString());	
	}
	
	public void saveDataForMemoryUsageDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(maxModelSizes, null, op, null, true);
		List<TestDataPoint> refinementData = util.filterTestResults(maxModelSizes, null, op, null, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "Flattened", "Refinement"));
		
		// arrange data in lines		
		for (TestDataPoint p : flattenedData) {
			int refineModelSize = refinementData.stream()
					   					  .filter(r -> r.tggName.equals(p.tggName))
					   					  .findAny()
					   					  .get()
					   					  .modelSize;
			diagramStrings.add(util.makeLine(p.tggName, p.modelSize+"", refineModelSize+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "MemoryUsage", "MemoryUsage"+op, op.toString());
				
	}

	public void saveDataForInitTimesDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, tgg, op, null, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null, false);
		
		flattenedData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			Optional<String> median = refinementData.stream()
					   					  .filter(r -> r.modelSize == p.modelSize)
					   					  .findAny()
					   					  .map(t -> t.medianInitTime())
					   					  .map(m -> m.toString());
			diagramStrings.add(util.makeLine(p.modelSize+"", p.medianInitTime()+"", median.orElse("-")));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "InitTimes", "InitTimes"+op+"_"+tgg, tgg, op.toString());
	}
	
	public void saveDataForAllTGGsInitDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> flattenedData = util.filterTestResults(testData, null, op, standardModelSize, true);
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize, false);

		flattenedData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianInitTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "Flattened", "Refinement"));
		
		for (TestDataPoint p : flattenedData) {
			double median = refinementData.stream()
					   					  .filter(r -> r.tggName.equals(p.tggName))
					   					  .findAny()
					   					  .get()
					   					  .medianInitTime();
			diagramStrings.add(util.makeLine(p.tggName, p.medianInitTime()+"", median+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "AllTGGsInit", "AllTGGsInit"+op, op.toString());
				
	}
}
