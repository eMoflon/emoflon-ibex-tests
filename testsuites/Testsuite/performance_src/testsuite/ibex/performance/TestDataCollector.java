package testsuite.ibex.performance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.CO;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;
import org.emoflon.ibex.tgg.operational.updatepolicy.NextMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.TimedUpdatePolicy;

import gurobi.GRBException;
import language.TGG;
import testsuite.ibex.performance.run.BWD_OPT_App;
import testsuite.ibex.performance.run.CC_App;
import testsuite.ibex.performance.run.CO_App;
import testsuite.ibex.performance.run.FWD_OPT_App;
import testsuite.ibex.performance.run.Initial_SYNC_App;
import testsuite.ibex.performance.run.MODELGEN_App;
import testsuite.ibex.performance.run.PerformanceTestBWD_OPT;
import testsuite.ibex.performance.run.PerformanceTestCC;
import testsuite.ibex.performance.run.PerformanceTestCO;
import testsuite.ibex.performance.run.PerformanceTestFWD_OPT;
import testsuite.ibex.performance.run.PerformanceTestMODELGEN;
import testsuite.ibex.performance.run.PerformanceTestSYNC;
import testsuite.ibex.performance.run.SYNC_App;
import testsuite.ibex.performance.util.IncrementalEditor;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.PerformanceTestUtil;
import testsuite.ibex.performance.util.TestDataPoint;

public class TestDataCollector {

	public static final String dataLocation = "performance/data/allTestDataPoints.ser";
	public static final String evalLocation = "performance/evaluation";

	public int[] modelSizes = PerformanceConstants.modelSizes;
	public int repetitions = PerformanceConstants.repetitions;

	private IncrementalEditor incEditor = new IncrementalEditor();
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private List<TestDataPoint> data;

	/**
	 * @param args[0]
	 *            Boolean value which determines if the collected data should be
	 *            reset. Used in the first run of a new test data collection.
	 * @param args[1]
	 *            The name of the TGG.
	 * @param args[2]
	 *            The name of the operationalization.
	 * @param args[3]
	 *            The model size.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		TestDataCollector collector = new TestDataCollector();
		if (Boolean.parseBoolean(args[0]))
			collector.deleteData();
		collector.executeAndSave(args[1], Operationalization.valueOf(args[2]), Integer.parseInt(args[3]));
	}

	private void executeAndSave(String tggName, Operationalization operationalization, int modelSize)
			throws IOException {
		loadData();

		switch (operationalization) {
		case MODELGEN:
			this.collectMODELGENData(tggName, modelSize);
			break;
		case CC:
			this.collectCCData(tggName, modelSize);
			break;
		case FWD:
			this.collectFWDData(tggName, modelSize);
			break;
		case BWD:
			this.collectBWDData(tggName, modelSize);
			break;
		case CO:
			this.collectCOData(tggName, modelSize);
			break;
		case FWD_OPT:
			this.collectFWD_OPTData(tggName, modelSize);
			break;
		case BWD_OPT:
			this.collectBWD_OPTData(tggName, modelSize);
			break;
		case INITIAL_FWD:
			this.collectINITIAL_FWDData(tggName, modelSize);
			break;
		case INITIAL_BWD:
			this.collectINITIAL_BWDData(tggName, modelSize);
			break;
		case INCREMENTAL_FWD:
		case INCREMENTAL_BWD:
			throw new IllegalArgumentException("A test case should not contain the operationalization "
					+ "INCREMENTAL_FWD/INCREMENTAL_BWD because both batch and incremental SYNC are included in the FWD/BWD test cases.");
		}

		saveData();
	}

	public List<TestDataPoint> getData() {
		if (data == null)
			loadData();

		return data;
	}

	@SuppressWarnings("unchecked")
	private List<TestDataPoint> loadData() {
		try {
			FileInputStream file = new FileInputStream(dataLocation);
			ObjectInputStream in = new ObjectInputStream(file);
			data = (List<TestDataPoint>) in.readObject();
			in.close();
			file.close();
		} catch (IOException e) {
			data = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return data;
	}

	@SuppressWarnings("unchecked")
	/**
	 * Loads all data from the SER files in the evaluation data directory
	 * 
	 * @return Mapping of data file and the data points
	 */
	public HashMap<String, List<TestDataPoint>> loadEvaluationData() {
		HashMap<String, List<TestDataPoint>> result = new HashMap<>();
		try {
			File folder = new File(evalLocation);

			// all files in the specified directory are iterated
			for (File file : folder.listFiles()) {

				// only SER files should be handled
				if (file.getName().endsWith(".ser")) {
					FileInputStream stream = new FileInputStream(file);
					ObjectInputStream in = new ObjectInputStream(stream);
					data = (List<TestDataPoint>) in.readObject();
					result.put(file.getName().replace(".ser", ""), data);
					in.close();
					stream.close();
				}
			}
		} catch (IOException e) {
			data = new ArrayList<>();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		return result;
	}

	private void saveData() {
		try {
			FileOutputStream file = new FileOutputStream(dataLocation);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(data);
			out.close();
			file.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void deleteData() {
		try {
			Files.delete(Paths.get(dataLocation));
		} catch (NoSuchFileException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void collectMODELGENData(String tggName, int size) throws IOException {
		PerformanceTestMODELGEN test = new PerformanceTestMODELGEN();

		Supplier<MODELGEN> generator = () -> {
			try {
				MODELGEN gen = new MODELGEN_App(tggName, PerformanceConstants.workspacePath, false,
						tggName + "/instances/" + size + "Element");
				gen.setUpdatePolicy(new TimedUpdatePolicy(new RandomMatchUpdatePolicy(10), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return gen;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		Function<TGG, MODELGENStopCriterion> stops = util.createStopCriterion(tggName, size);

		System.out.println("Collecting MODELGEN data for " + tggName + ", size: " + size);
		TestDataPoint point = test.repeatedTimedExecutionAndInit(generator, stops, size, repetitions);

		data.add(point);
	}

	private void collectCCData(String tggName, int size) throws IOException {
		PerformanceTestCC test = new PerformanceTestCC();

		Supplier<CC> checker = () -> {
			try {
				CC cc = new CC_App(tggName, PerformanceConstants.workspacePath, false, size + "Element");
				cc.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return cc;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting CC data for " + tggName + ", size: " + size);
		TestDataPoint point;
		try {
			point = test.repeatedTimedExecutionAndInit(checker, size, repetitions);
			data.add(point);
		} catch (GRBException e) {
			e.printStackTrace();
		}
	}

	private void collectCOData(String tggName, int size) throws IOException {
		PerformanceTestCO test = new PerformanceTestCO();

		Supplier<CO> checker = () -> {
			try {
				CO co = new CO_App(tggName, PerformanceConstants.workspacePath, false, size + "Element");
				co.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return co;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting CO data for " + tggName + ", size: " + size);
		TestDataPoint point;
		try {
			point = test.repeatedTimedExecutionAndInit(checker, size, repetitions);
			data.add(point);
		} catch (GRBException e) {
			e.printStackTrace();
		}
	}

	private void collectFWDData(String tggName, int size) throws IOException {
		PerformanceTestSYNC test = new PerformanceTestSYNC();

		Supplier<SYNC_App> transformator = () -> {
			try {
				SYNC_App sync = new SYNC_App(tggName, PerformanceConstants.workspacePath, false,
						tggName + "/instances/" + size + "Element", true, false);
				sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting SYNC data for " + tggName + ", size: " + size);
		List<TestDataPoint> points = test.timedExecutionAndInit(transformator, size, repetitions,
				Operationalization.FWD, incEditor.getEdit(tggName, true));
		data.addAll(points);
	}

	private void collectINITIAL_FWDData(String tggName, int size) throws IOException {
		PerformanceTestSYNC test = new PerformanceTestSYNC();

		Supplier<SYNC_App> transformator = () -> {
			try {
				SYNC_App sync = new Initial_SYNC_App(tggName, PerformanceConstants.workspacePath, false,
						tggName + "/instances/" + size + "Element", true, false);
				sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting INITIAL_SYNC data for " + tggName + ", size: " + size);
		test.timedExecutionAndInit(transformator, size, repetitions, Operationalization.INITIAL_FWD,
				incEditor.getEdit(tggName, true));
	}

	private void collectFWD_OPTData(String tggName, int size) throws IOException {
		PerformanceTestFWD_OPT test = new PerformanceTestFWD_OPT();

		Supplier<FWD_OPT> transformator = () -> {
			try {
				FWD_OPT fwd_opt = new FWD_OPT_App(tggName, PerformanceConstants.workspacePath, false, size + "Element");
				fwd_opt.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return fwd_opt;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting FWD_OPT data for " + tggName + ", size: " + size);
		TestDataPoint point;
		try {
			point = test.repeatedTimedExecutionAndInit(transformator, size, repetitions);
			data.add(point);
		} catch (GRBException e) {
			e.printStackTrace();
		}
	}

	private void collectBWD_OPTData(String tggName, int size) throws IOException {
		PerformanceTestBWD_OPT test = new PerformanceTestBWD_OPT();

		Supplier<BWD_OPT> transformator = () -> {
			try {
				BWD_OPT bwd_opt = new BWD_OPT_App(tggName, PerformanceConstants.workspacePath, false, size + "Element");
				bwd_opt.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return bwd_opt;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting FWD_OPT data for " + tggName + ", size: " + size);
		TestDataPoint point;
		try {
			point = test.repeatedTimedExecutionAndInit(transformator, size, repetitions);
			data.add(point);
		} catch (GRBException e) {
			e.printStackTrace();
		}
	}

	private void collectBWDData(String tggName, int size) throws IOException {
		PerformanceTestSYNC test = new PerformanceTestSYNC();

		Supplier<SYNC_App> transformator = () -> {
			try {
				SYNC_App sync = new SYNC_App(tggName, PerformanceConstants.workspacePath, false,
						tggName + "/instances/" + size + "Element", false, false);
				sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		List<TestDataPoint> points = test.timedExecutionAndInit(transformator, size, repetitions,
				Operationalization.BWD, incEditor.getEdit(tggName, false));
		data.addAll(points);
	}

	private void collectINITIAL_BWDData(String tggName, int size) throws IOException {
		PerformanceTestSYNC test = new PerformanceTestSYNC();

		Supplier<SYNC_App> transformator = () -> {
			try {
				SYNC_App sync = new Initial_SYNC_App(tggName, PerformanceConstants.workspacePath, false,
						tggName + "/instances/" + size + "Element", false, false);
				sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout,
						TimeUnit.SECONDS));
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		List<TestDataPoint> points = test.timedExecutionAndInit(transformator, size, repetitions,
				Operationalization.INITIAL_BWD, incEditor.getEdit(tggName, false));
		data.addAll(points);
	}

	/**
	 * Copies the data collected in the SER file during the test run into the
	 * evaluation folder
	 */
	public void copyData() {
		// Copy data to evaluation folder
		try {
			LocalDateTime now = LocalDateTime.now();
			FileOutputStream copy = new FileOutputStream(evalLocation + "/" + String.format("%02d%02d-%02d%02d.ser",
					now.getMonthValue(), now.getDayOfMonth(), now.getHour(), now.getMinute()));
			ObjectOutputStream out = new ObjectOutputStream(copy);
			out.writeObject(data);
			out.close();
			copy.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
