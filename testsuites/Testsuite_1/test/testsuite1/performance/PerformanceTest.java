package testsuite1.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import testsuite1.performance.util.Operationalization;
import testsuite1.performance.util.PerformanceTestUtil;
import testsuite1.performance.util.TestDataPoint;
import testsuite1.testUtil.Constants;

public class PerformanceTest {
	public static final int standardModelSize = 50;
	public static final int bigModelSize = 1000;
	
	public List<TestDataPoint> testData;
	public List<TestDataPoint> maxModelSizes;
	private PerformanceTestUtil util = new PerformanceTestUtil();

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PerformanceTest test = new PerformanceTest();
		TestDataCollector collector = new TestDataCollector();
		
		// use this option if you want to perform new measurements
//		test.testData = collector.collectData();
		// use this option to re-plot all plots with existing data
		test.testData = collector.loadData();
		
		test.maxModelSizes = collector.getMaxModelSizes();
		
		// save data in tables suited for the plots and create the plots
//		test.saveDataForTGGsWithoutRefinement();
		for (Operationalization op : Operationalization.values()) {
//			test.saveDataForAllTGGsDiagram(op);
			test.saveDataForAllTGGsInitDiagram(op);
//			test.saveDataForMemoryUsageDiagram(op);
//			for (String tgg : Constants.testProjects) {
//				test.saveDataForInitTimesDiagram(tgg, op);
//				test.saveDataForModelSizeDiagram(tgg, op);
//			}
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
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize);

		refinementData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianExecutionTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "ExecutionTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.tggName, p.medianExecutionTime()+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "AllTGGs", "AllTGGs"+op, op.toString());
				
	}
	
	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("#", "ClassInhHier2DB", "CompanyToIT"));
		diagramStrings.add(util.makeLine("Operationalization", "ExecutionTime"));

		for (Operationalization op : Operationalization.values()) {
				diagramStrings.add(util.makeLine(op+"", util.filterTestResults(testData, "ClassInhHier2DB", op, bigModelSize).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, bigModelSize).get(0).executionTimes[0]+""
				));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "TGGsWithoutRefinement", "TGGsWithoutRefinement");
				
	}
	
	public void saveDataForModelSizeDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);
		
		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "ExecutionTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.modelSize+"", p.medianExecutionTime()+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "ModelSize", "ModelSize"+op+"_"+tgg, tgg, op.toString());	
	}
	
	public void saveDataForMemoryUsageDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(maxModelSizes, null, op, null);
		
		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "ExecutionTime"));
		
		// arrange data in lines		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.tggName, p.modelSize+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "MemoryUsage", "MemoryUsage"+op, op.toString());
	}

	public void saveDataForInitTimesDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);
		
		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.modelSize));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "InitTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.modelSize+"", p.medianInitTime()+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "InitTimes", "InitTimes"+op+"_"+tgg, tgg, op.toString());
	}
	
	public void saveDataForAllTGGsInitDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize);

		refinementData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianInitTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "InitTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.tggName, p.medianInitTime()+""));
		}

		// save data in file
		saveDataAndCreatePlot(diagramStrings, "AllTGGsInit", "AllTGGsInit"+op, op.toString());
				
	}
}
