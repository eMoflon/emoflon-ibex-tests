package testsuite1.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import testsuite1.performance.util.PerformanceConstants;
import testsuite1.performance.util.PerformanceTestUtil;
import testsuite1.performance.util.TestDataPoint;
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.Operationalization;

public class PlotGenerator {
	public static final int standardModelSize = PerformanceConstants.standardModelSize;
	public static final int bigModelSize = PerformanceConstants.bigModelSize;
	
	public List<TestDataPoint> testData;
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private GNUPlotScripts scripts = new GNUPlotScripts();

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PlotGenerator test = new PlotGenerator();
		TestDataCollector collector = new TestDataCollector();
		
		test.testData = collector.loadData();
		
		// save data in tables suited for the plots and create the plots
		test.saveDataForTGGsWithoutRefinement();
		for (Operationalization op : Operationalization.values()) {
			test.saveDataForAllTGGsDiagram(op);
			test.saveDataForAllTGGsInitDiagram(op);
			for (String tgg : Constants.testProjects) {
				test.saveDataForInitTimesDiagram(tgg, op);
				test.saveDataForModelSizeDiagram(tgg, op);
			}
		}
	}

	
	/**
	 * Saves the data for one plot in the specified file.
	 */
	public void saveData(List<String> data, String fileName) {
		try {				
			Path file = Paths.get("performance/data/"+fileName+".dat");
			Files.write(file, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Concatenates the Strings in contents with tabs. Used to define one
	 * line for the .dat file, where the columns are separated by tabs.
	 */
	public String makeLine(String... contents) {
		return String.join("	", contents);
	}
	
	public void saveDataForAllTGGsDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize);

		refinementData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianExecutionTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(makeLine("TGG", "ExecutionTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(makeLine(p.testCase.tgg(), p.medianExecutionTime()+""));
		}

		// save data in file
		saveData(diagramStrings, "AllTGGs"+op);
		// create plot
		scripts.allTGGsComparison("AllTGGs"+op, op.name());
	}
	
	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(makeLine("#", "ClassInhHier2DB", "CompanyToIT"));
		diagramStrings.add(makeLine("Operationalization", "ExecutionTime"));

		for (Operationalization op : Operationalization.values()) {
				diagramStrings.add(makeLine(op+"", util.filterTestResults(testData, "ClassInhHier2DB", op, standardModelSize).get(0).executionTimes[0]+"",
														util.filterTestResults(testData, "CompanyToIT", op, standardModelSize).get(0).executionTimes[0]+""
				));
		}
		
		// save data in file
		saveData(diagramStrings, "TGGsWithoutRefinement");
		// create plot
		scripts.tggsWithoutRefinementComparison("TGGsWithoutRefinement");
	}
	
	public void saveDataForModelSizeDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);
		
		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.testCase.modelSize()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(makeLine("ModelSize", "ExecutionTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(makeLine(p.testCase.modelSize()+"", p.medianExecutionTime()+""));
		}

		// save data in file
		saveData(diagramStrings, "ModelSize"+op+"_"+tgg);
		// create plot
		scripts.modelSizeComparison("ModelSize"+op+"_"+tgg, tgg, op.toString());
	}

	public void saveDataForInitTimesDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);
		
		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.testCase.modelSize()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(makeLine("ModelSize", "InitTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(makeLine(p.testCase.modelSize()+"", p.medianInitTime()+""));
		}

		// save data in file
		saveData(diagramStrings, "InitTimes"+op+"_"+tgg);
		// create plot
		scripts.initTimes("InitTimes"+op+"_"+tgg, tgg, op.toString());
	}
	
	public void saveDataForAllTGGsInitDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize);

		refinementData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianInitTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(makeLine("TGG", "InitTime"));
		
		for (TestDataPoint p : refinementData) {
			diagramStrings.add(makeLine(p.testCase.tgg(), p.medianInitTime()+""));
		}

		// save data in file
		saveData(diagramStrings, "AllTGGsInit"+op);
		// create plot
		scripts.allTGGsInitComparison("AllTGGsInit"+op, op.toString());
				
	}
}
