package testsuite.ibex.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import testsuite.ibex.performance.GNUPlotScripts;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.PerformanceTestUtil;
import testsuite.ibex.performance.util.TestCaseParameters;
import testsuite.ibex.performance.util.TestDataPoint;
import testsuite.ibex.testUtil.Constants;

public class PlotGenerator {

	public static final int standardModelSize = PerformanceConstants.standardModelSize;
	public static final int bigModelSize = PerformanceConstants.bigModelSize;

	public List<TestDataPoint> testData;
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private GNUPlotScripts scripts = new GNUPlotScripts();

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		PlotGenerator test = new PlotGenerator();
		TestDataCollector collector = new TestDataCollector();

		test.testData = collector.getData();

		// save data in tables suited for the plots and create the plots //
		for (Operationalization op : Operationalization.values()) {
			test.saveDataForAllTGGsDiagram(op);
			test.saveDataForAllTGGsInitDiagram(op);
			for (String tgg : Constants.testProjects) {
				test.saveDataForInitTimesDiagram(tgg, op);
				test.saveDataForModelSizeDiagram(tgg, op);
			}
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
			diagramStrings.add(util.makeLine(p.testCase.tgg(), p.medianExecutionTime() + ""));
		}

		// save data in file
		util.saveData(diagramStrings, "AllTGGs" + op);
		// create plot
		scripts.allTGGsComparison("AllTGGs" + op, op.name());
	}

	public void saveDataForTGGsWithoutRefinement() {
		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("#", "ClassInhHier2DB", "CompanyToIT"));
		diagramStrings.add(util.makeLine("Operationalization", "ExecutionTime"));

		try {
			for (Operationalization op : Operationalization.values()) {
				diagramStrings.add(util.makeLine(op + "",
						util.filterTestResults(testData, "ClassInhHier2DB", op, bigModelSize).get(0).executionTimes[0]
								+ "",
						util.filterTestResults(testData, "CompanyToIT", op, bigModelSize).get(0).executionTimes[0]
								+ ""));
			}
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Data for TGGsWithoutRefinement diagram not available!");
			return;
		}

		// save data in file
		util.saveData(diagramStrings, "TGGsWithoutRefinement");
		// create plot
		scripts.tggsWithoutRefinementComparison("TGGsWithoutRefinement");
	}

	public void saveDataForModelSizeDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);

		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.testCase.modelSize()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "ExecutionTime"));

		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.testCase.modelSize() + "", p.medianExecutionTime() + ""));
		}

		// save data in file
		util.saveData(diagramStrings, "ModelSize" + op + "_" + tgg);
		// create plot
		scripts.modelSizeComparison("ModelSize" + op + "_" + tgg, tgg, op.toString());
	}

	public void saveDataForInitTimesDiagram(String tgg, Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, tgg, op, null);

		refinementData.sort(Comparator.comparingInt((TestDataPoint p) -> p.testCase.modelSize()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("ModelSize", "InitTime"));

		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.testCase.modelSize() + "", p.medianInitTime() + ""));
		}

		// save data in file
		util.saveData(diagramStrings, "InitTimes" + op + "_" + tgg);
		// create plot
		scripts.initTimes("InitTimes" + op + "_" + tgg, tgg, op.toString());
	}

	public void saveDataForAllTGGsInitDiagram(Operationalization op) {
		// get data for plot
		List<TestDataPoint> refinementData = util.filterTestResults(testData, null, op, standardModelSize);

		refinementData.sort(Comparator.comparingDouble((TestDataPoint p) -> p.medianInitTime()));

		// arrange data in lines
		List<String> diagramStrings = new ArrayList<>();
		diagramStrings.add(util.makeLine("TGG", "InitTime"));

		for (TestDataPoint p : refinementData) {
			diagramStrings.add(util.makeLine(p.testCase.tgg(), p.medianInitTime() + ""));
		}

		// save data in file
		util.saveData(diagramStrings, "AllTGGsInit" + op);
		// create plot
		scripts.allTGGsInitComparison("AllTGGsInit" + op, op.toString());

	}
}
