package testsuite.ibex.performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.operational.updatepolicy.NextMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.TimedUpdatePolicy;

import gurobi.GRBException;
import language.TGG;
import testsuite.ibex.performance.run.CC_App;
import testsuite.ibex.performance.run.MODELGEN_App;
import testsuite.ibex.performance.run.PerformanceTestCC;
import testsuite.ibex.performance.run.PerformanceTestMODELGEN;
import testsuite.ibex.performance.run.PerformanceTestSYNC;
import testsuite.ibex.performance.run.SYNC_App;
import testsuite.ibex.performance.util.IncrementalEditor;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.PerformanceTestUtil;
import testsuite.ibex.performance.util.TestDataPoint;
import testsuite.ibex.testUtil.Constants;

public class TestDataCollector {
	
	private static final String dataLocation = "performance/data/allTestDataPoints.ser";
	
	public int[] modelSizes = PerformanceConstants.modelSizes;
	public int repetitions = PerformanceConstants.repetitions;
	
	private IncrementalEditor incEditor = new IncrementalEditor();
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private List<TestDataPoint> data;
	
	/**
	 * @param args[0] Boolean value which determines if the collected data should be reset.
	 * 				  Used in the first run of a new test data collection.
	 * @param args[1] The name of the TGG.
	 * @param args[2] The name of the operationalization.
	 * @param args[3] The model size.
	 * 
	 * */
	public static void main(String[] args) throws IOException {
		TestDataCollector collector = new TestDataCollector();
		if (Boolean.parseBoolean(args[0]))
			collector.deleteData();
		collector.executeAndSave(args[1], Operationalization.valueOf(args[2]), Integer.parseInt(args[3]));
	}
	
	private void executeAndSave(String tggName, Operationalization operationalization, int modelSize) throws IOException {
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
			case INCREMENTAL_FWD:
			case INCREMENTAL_BWD:
				throw new IllegalArgumentException("A test case should not contain the operationalization "
						+"INCREMENTAL_FWD/INCREMENTAL_BWD because both batch and incremental SYNC are included in the FWD/BWD test cases.");
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
			data = (List<TestDataPoint>)in.readObject();
			in.close();
			file.close();
		} catch(IOException e) {
			data = new ArrayList<>();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	private void saveData() {
		try {
			FileOutputStream file = new FileOutputStream(dataLocation);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(data);
			out.close();
			file.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	private void deleteData() {
		try {
			Files.delete(Paths.get(dataLocation));
		} catch(NoSuchFileException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void collectMODELGENData(String tggName, int size) throws IOException {
		PerformanceTestMODELGEN test = new PerformanceTestMODELGEN();

		Supplier<MODELGEN> generator = () -> {
			try {
				MODELGEN gen = new MODELGEN_App(tggName, Constants.workspacePath, false,
						tggName+"/instances/"+size+"Element");
				gen.setUpdatePolicy(new TimedUpdatePolicy(new RandomMatchUpdatePolicy(), PerformanceConstants.timeout, TimeUnit.SECONDS));
				return gen;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		Function<TGG, MODELGENStopCriterion> stops = util.createStopCriterion(tggName, size);

		System.out.println("Collecting MODELGEN data for "+tggName+", size: "+size);
		TestDataPoint point = test.repeatedTimedExecutionAndInit(generator, stops, size, repetitions);
		
		data.add(point);
	}

	private void collectCCData(String tggName, int size) throws IOException {
		PerformanceTestCC test = new PerformanceTestCC();

		Supplier<CC> checker = () -> {
			try {
				CC cc = new CC_App(tggName, Constants.workspacePath, false, size+"Element");
				cc.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout, TimeUnit.SECONDS));
				return cc;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		System.out.println("Collecting CC data for "+tggName+", size: "+size);
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
		
		Supplier<SYNC> transformator = () -> {
			try {
				SYNC sync = new SYNC_App(tggName, Constants.workspacePath, false,
						tggName+"/instances/"+size+"Element", true, false);
				sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), PerformanceConstants.timeout, TimeUnit.SECONDS));
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};

		System.out.println("Collecting SYNC data for "+tggName+", size: "+size);
		List<TestDataPoint> points = test.timedExecutionAndInit(transformator, size, repetitions, true, incEditor.getEdit(tggName, true));
		data.addAll(points);
	}
	

	private void collectBWDData(String tggName, int size) throws IOException {
		PerformanceTestSYNC test = new PerformanceTestSYNC();
	
		Supplier<SYNC> transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, false,
						tggName+"/instances/"+size+"Element", false, false);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		List<TestDataPoint> points = test.timedExecutionAndInit(transformator, size, repetitions, false, incEditor.getEdit(tggName, false));
		data.addAll(points);
	}
}
