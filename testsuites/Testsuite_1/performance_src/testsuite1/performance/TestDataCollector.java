package testsuite1.performance;

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
import org.emoflon.ibex.tgg.operational.util.NextMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.util.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.util.TimedUpdatePolicy;

import gurobi.GRBException;
import language.TGG;
import testsuite1.performance.run.CC_App;
import testsuite1.performance.run.MODELGEN_App;
import testsuite1.performance.run.PerformanceTestCC;
import testsuite1.performance.run.PerformanceTestMODELGEN;
import testsuite1.performance.run.PerformanceTestSYNC;
import testsuite1.performance.run.SYNC_App;
import testsuite1.performance.util.IncrementalEditor;
import testsuite1.performance.util.PerformanceConstants;
import testsuite1.performance.util.PerformanceTestUtil;
import testsuite1.performance.util.TestDataPoint;
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.Operationalization;

public class TestDataCollector {
	
	private static final String dataLocation = "performance/data/allTestDataPoints.ser";
	
	private IncrementalEditor incEditor = new IncrementalEditor();
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private List<TestDataPoint> data;
	
	public int[] modelSizes = PerformanceConstants.modelSizes;
	public int repetitions = PerformanceConstants.repetitions;
	
//	public static void main(String[] args) throws IOException {
//		new TestDataCollector().saveHardCodedMaxModelSizes();
//	}
	
	/**
	 * 
	 * @param args[0] Boolean value which determines if the collected data should be reset.
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
			throw new IllegalStateException("No data has been collected yet. Call collectData() or loadData() before this method.");
		
		return data;
	}

	@SuppressWarnings("unchecked")
	public List<TestDataPoint> loadData() {
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
	
	public void saveData() {
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
	
	public void deleteData() {
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
