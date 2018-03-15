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

import org.gervarro.util.Pair;

import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.PerformanceTestUtil;
import testsuite.ibex.performance.util.TestCaseParameters;
import testsuite.ibex.performance.util.TestDataPoint;
import testsuite.ibex.testUtil.Constants;

/**
 * Tool for comparing several performance tests with the same configuration but different options, e.g. for pattern 
 * matching
 * @author Nils Weidmann
 *
 */
public class EvaluationGenerator {

	private PerformanceTestUtil util = new PerformanceTestUtil();
	private HashMap<String, List<TestDataPoint>> evaluationData = new HashMap<>();
	private HashMap<Integer, List<TestCaseValue>> mappedTestData = new HashMap<>();
	private long maxTime = PerformanceConstants.timeout * TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS);
	private GNUPlotScripts scripts = new GNUPlotScripts();

	/**
	 * Combines all relevant information about one test case, including the parameters, times for execution and 
	 * initialization and the correspondence ranks in comparison to the other tests
	 * @author Nils Weidmann
	 *
	 */
	public class TestCaseValue {
		private String test;
		private TestCaseParameters tcp;
		private double executionTime;
		private double initTime;
		private int executionRank;
		private int initRank;

		public TestCaseValue(String test, TestCaseParameters tcp, double executionTime, double initTime) {
			this.test = test;
			this.tcp = tcp;
			this.executionTime = executionTime;
			this.initTime = initTime;
		}

		public void setExecutionRank(int rank) {
			this.executionRank = rank;
		}

		public void setInitRank(int rank) {
			this.initRank = rank;
		}

		public int getExecutionRank() {
			return executionRank;
		}

		public int getInitRank() {
			return initRank;
		}

		public double getExecutionTime() {
			return executionTime;
		}

		public double getInitTime() {
			return initTime;
		}

		public TestCaseParameters getTcp() {
			return tcp;
		}
	}
	
	/**
	 * Compares the execution time of TestCaseValues
	 * @author Nils Weidmann
	 *
	 */
	public class ExecutionTimeComparator implements Comparator<TestCaseValue> {

		@Override
		public int compare(TestCaseValue o1, TestCaseValue o2) {
			if ((o1.executionTime - o2.executionTime) == 0)
				return 0;
			else if ((o1.executionTime - o2.executionTime) < 0)
				return -1;
			else
				return 1;
		}
	}
	
	/**
	 * Compares the initialization time of TestCaseValues
	 * @author Nils Weidmann
	 *
	 */
	public class InitTimeComparator implements Comparator<TestCaseValue> {

		@Override
		public int compare(TestCaseValue o1, TestCaseValue o2) {
			if ((o1.initTime - o2.initTime) == 0)
				return 0;
			else if ((o1.initTime - o2.initTime) < 0)
				return -1;
			else
				return 1;
		}
	}
	
	/**
	 * Compares average ranks of two test runs
	 * @author Nils
	 *
	 */
	public class RankComparator implements Comparator<Pair<String, Double>> {

		@Override
		public int compare(Pair<String, Double> o1, Pair<String, Double> o2) {
			if ((o1.getRight() - o2.getRight()) == 0)
				return 0;
			else if ((o1.getRight() - o2.getRight()) < 0)
				return -1;
			else
				return 1;
		}

	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		EvaluationGenerator test = new EvaluationGenerator();
		TestDataCollector collector = new TestDataCollector();

		// save all data points in one full report for evaluation purposes
		test.evaluationData = collector.loadEvaluationData();
		List<String> evaluationReport = test.generateFullReport(test.evaluationData);
		test.saveFullReport(evaluationReport, collector.evalLocation + "/FullReport.dat");

		// generate plots for TGGs
		for (String tgg : Constants.testProjects)
			test.saveDataPerTestAndTGGDiagram(tgg);

		// generate plots for Operationalizations
		for (Operationalization op : Operationalization.values())
			test.saveDataPerTestAndOperationalizationDiagram(op);
		
		// generate overall plot
		test.saveDataPerTestDiagram();
	}

	/**
	 * Generates a full overview of all collected data points
	 * 
	 * @param testData:
	 *            Mapping of file name and collected data points
	 */
	private List<String> generateFullReport(HashMap<String, List<TestDataPoint>> testData) {

		mapTestData(testData);
		List<String> dataStrings = new ArrayList<>();
		dataStrings.add(util.makeLine("TestCase", "Operationalization", "ModelSize", "TGG", "ExecutionTime", "InitTime",
				"ExecutionRank", "InitRank"));

		// arrange Data in lines
		for (Integer hashCode : mappedTestData.keySet()) {
			List<TestCaseValue> values = mappedTestData.get(hashCode);
			for (TestCaseValue tcv : values) {
				dataStrings.add(util.makeLine(tcv.test, tcv.tcp.operationalization() + "", tcv.tcp.modelSize() + "",
						tcv.tcp.tgg(), tcv.executionTime + "", tcv.initTime + "", tcv.executionRank + "",
						tcv.initRank + ""));
			}
		}

		return dataStrings;
	}
	
	/**
	 * Saves the complete evaluation report
	 * @param data: Evaluation report
	 * @param fileName: Location on disk
	 */
	public void saveFullReport(List<String> data, String fileName) {
		try {
			Path file = Paths.get(fileName);
			Files.write(file, data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Generates a mapping of test case parameters and the corresponding data points of the respective test runs.
	 * The ranks for execution time and initialization time are computed as well.
	 * @param testData: Mapping of test run and the corresponding data points
	 */
	private void mapTestData(HashMap<String, List<TestDataPoint>> testData) {

		for (String tgg : Constants.testProjects)
			for (Operationalization op : Operationalization.values())
				for (int modelSize : PerformanceConstants.modelSizes) {
					TestCaseParameters tcp = new TestCaseParameters(tgg, op, modelSize);
					mappedTestData.put(tcp.hashCode(), new ArrayList<>());
				}

		for (String test : testData.keySet()) {
			List<TestDataPoint> subset = testData.get(test);
			for (TestDataPoint p : subset) {
				List<TestCaseValue> values = mappedTestData.get(p.testCase.hashCode());
				if (values != null) {
					double executionTime = p.medianExecutionTime() == 0 ? maxTime : p.medianExecutionTime();
					double initTime = p.medianInitTime() == 0 ? maxTime : p.medianInitTime();
					values.add(new TestCaseValue(test, p.testCase, executionTime, initTime));
				}
			}
		}

		for (List<TestCaseValue> subset : mappedTestData.values()) {
			Set<String> tests = testData.keySet();

			if (subset.isEmpty())
				continue;

			subset.sort(new ExecutionTimeComparator());
			for (int i = 0; i < subset.size(); i++) {
				if (subset.get(i).getExecutionTime() == maxTime)
					subset.get(i).setExecutionRank(tests.size());
				else
					subset.get(i).setExecutionRank(i + 1);
			}

			subset.sort(new InitTimeComparator());
			for (int i = 0; i < subset.size(); i++) {
				if (subset.get(i).getInitTime() == maxTime)
					subset.get(i).setInitRank(tests.size());
				else
					subset.get(i).setInitRank(i + 1);
			}

			for (String test : tests) {
				TestCaseParameters tcp = subset.get(0).tcp;
				if (util.filterTestResults(testData.get(test), tcp.tgg(), tcp.operationalization(), tcp.modelSize())
						.isEmpty()) {
					// add dummy TestCaseValue with worst rank possible
					TestCaseValue tcv = new TestCaseValue(test, tcp, maxTime, maxTime);
					tcv.executionRank = tests.size();
					tcv.initRank = tests.size();
					subset.add(tcv);

					// add dummy data point to evalutionData to compute average ranks correctly
					List<TestDataPoint> testRun = evaluationData.get(test);
					long[] times = { maxTime };
					TestDataPoint tdp = new TestDataPoint(times, times);
					tdp.testCase = tcp;
					testRun.add(tdp);
				}
			}
		}
	}
	
	/**
	 * Computes the average execution time of a test.
	 * @param list: List of relevant test data points
	 * @param test: Name of the test
	 * @return Average execution time
	 */
	double averageExecutionTime(List<TestDataPoint> list, String test) {
		double nominator = 0;
		int denominator = 0;

		for (TestDataPoint p : list) {
			for (TestCaseValue tcv : mappedTestData.get(p.testCase.hashCode())) {
				if (tcv.test.equals(test)) {
					nominator += tcv.getExecutionTime();
					denominator++;
				}
			}
		}

		return nominator / denominator;
	}
	
	/**
	 * Computes the average rank of a test with respect to the execution times.
	 * @param list: List of relevant test data points
	 * @param test: Name of the test
	 * @return Average rank
	 */
	double averageExecutionRank(List<TestDataPoint> list, String test) {
		double nominator = 0;
		int denominator = 0;

		for (TestDataPoint p : list) {
			for (TestCaseValue tcv : mappedTestData.get(p.testCase.hashCode())) {
				if (tcv.test.equals(test)) {
					nominator += tcv.getExecutionRank();
					denominator++;
				}
			}
		}

		return nominator / denominator;
	}
	
	/**
	 * Saves and plots the average ranks per test run for all tggs and operationalizations
	 */
	public void saveDataPerTestDiagram() {
		// get data for plot
		List<Pair<String, Double>> testToValue = new ArrayList<>();
 		List<Pair<String, Double>> testToRank = new ArrayList<>();
		Set<String> tests = evaluationData.keySet();

		for (String test : tests) {
			double value = averageExecutionTime(util.filterTestResults(evaluationData.get(test), null, null, 
					PerformanceConstants.standardModelSize), test);
			double rank = averageExecutionRank(util.filterTestResults(evaluationData.get(test), null, null, 
					PerformanceConstants.standardModelSize), test);

			if (rank != Double.NaN)
				testToRank.add(Pair.newInstance(test, rank));
			
			if (value != Double.NaN)
				testToValue.add(Pair.newInstance(test, value));
		}

		createEvaluationDiagram(testToValue, testToRank, "Overall");
	}
	
	/**
	 * Saves and plots the average ranks per test run for a given TGG
	 * @param tgg: Given TGG
	 */
	public void saveDataPerTestAndTGGDiagram(String tgg) {
		// get data for plot
				List<Pair<String, Double>> testToValue = new ArrayList<>();
		 		List<Pair<String, Double>> testToRank = new ArrayList<>();
				Set<String> tests = evaluationData.keySet();

				for (String test : tests) {
					double value = averageExecutionTime(util.filterTestResults(evaluationData.get(test), tgg, null, 
							PerformanceConstants.standardModelSize), test);
					double rank = averageExecutionRank(util.filterTestResults(evaluationData.get(test), tgg, null, 
							PerformanceConstants.standardModelSize), test);

					if (rank != Double.NaN)
						testToRank.add(Pair.newInstance(test, rank));
					
					if (value != Double.NaN)
						testToValue.add(Pair.newInstance(test, value));
				}

		createEvaluationDiagram(testToValue, testToRank, tgg);
	}
	
	/**
	 * Saves and plots the average ranks per test run for a given operationalization
	 * @param op: Given operationalization
	 */
	public void saveDataPerTestAndOperationalizationDiagram(Operationalization op) {
		// get data for plot
		List<Pair<String, Double>> testToValue = new ArrayList<>();
 		List<Pair<String, Double>> testToRank = new ArrayList<>();
		Set<String> tests = evaluationData.keySet();

		for (String test : tests) {
			double value = averageExecutionTime(util.filterTestResults(evaluationData.get(test), null, op, 
					PerformanceConstants.standardModelSize), test);
			double rank = averageExecutionRank(util.filterTestResults(evaluationData.get(test), null, op, 
					PerformanceConstants.standardModelSize), test);

			if (rank != Double.NaN)
				testToRank.add(Pair.newInstance(test, rank));
			
			if (value != Double.NaN)
				testToValue.add(Pair.newInstance(test, value));
		}

		createEvaluationDiagram(testToValue, testToRank, op.name());
	}
	
	/**
	 * Sorts the average rank data and creates a plot
	 * @param testToValue: Execution time data for each test run
	 * @param testToRank: Rank data for each test run
	 * @param name: Name of the diagram to be created
	 */
	private void createEvaluationDiagram(List<Pair<String, Double>> testToValue, List<Pair<String, Double>> testToRank, 
			String name) {
		testToRank.sort(new RankComparator());
		testToValue.sort(new RankComparator());

		// arrange time data in lines
		List<String> valueStrings = new ArrayList<>();
		valueStrings.add(util.makeLine("Test", "AverageExecutionTime"));

		for (Pair<String, Double> test : testToValue) {
			valueStrings.add(util.makeLine(test.getLeft(), test.getRight() + ""));
		}
		
		// arrange rank data in lines
		List<String> rankStrings = new ArrayList<>();
		rankStrings.add(util.makeLine("Test", "AverageRank"));

		for (Pair<String, Double> test : testToRank) {
			rankStrings.add(util.makeLine(test.getLeft(), test.getRight() + ""));
		}

		// save data in files
		util.saveData(valueStrings, "AllTestValues" + name, "performance/evaluation/data/");
		util.saveData(rankStrings, "AllTestRanks" + name, "performance/evaluation/data/");
		
		// create plots
		scripts.allTestsComparisonOnValues("AllTestValues" + name, name);
		scripts.allTestsComparisonOnRanks("AllTestRanks" + name, name);
	}
}
