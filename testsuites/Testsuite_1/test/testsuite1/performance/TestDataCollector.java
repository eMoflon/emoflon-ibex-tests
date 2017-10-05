package testsuite1.performance;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
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
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.performance.CCPerformanceTest;
import testsuite1.testUtil.performance.CC_App;
import testsuite1.testUtil.performance.IncrementalEditor;
import testsuite1.testUtil.performance.MODELGENPerformanceTest;
import testsuite1.testUtil.performance.MODELGEN_App;
import testsuite1.testUtil.performance.Operationalization;
import testsuite1.testUtil.performance.PerformanceTestUtil;
import testsuite1.testUtil.performance.SYNCPerformanceTest;
import testsuite1.testUtil.performance.SYNC_App;
import testsuite1.testUtil.performance.TestDataPoint;

public class TestDataCollector {
	
	private static final String dataLocation = "performance/data/allTestDataPoints.ser";
	private static final String maxSizeLocation = "performance/data/maxSizes.ser";
	
	private IncrementalEditor incEditor = new IncrementalEditor();
	private PerformanceTestUtil util = new PerformanceTestUtil();
	private List<TestDataPoint> data;
	private List<TestDataPoint> maxModelSizes;
	
	public int[] modelSizes = {//10, 20, 50, 100, 200, 
			500, 1000, 5000, 10000, 100000, 1000000, 10000000};
	public int repetitions = 7;
	
	public static void main(String[] args) throws IOException {
		new TestDataCollector().saveHardCodedMaxModelSizes();
	}
	
	/**
	 * Calculates the TestDataPoints for all combinations of operationalization,
	 * tgg and model size. After collectData() finishes, the collected data can be accessed
	 * via getData().
	 * @throws IOException 
	 * @throws ClassNotFoundException
	 */
	public List<TestDataPoint> collectData() throws IOException {
		data = new ArrayList<TestDataPoint>(100);
		saveHardCodedMaxModelSizes();
//		initMaxModelSizes();
		loadData();
				
		for (String tgg : Constants.testProjects) {
//			if (tgg.equals("VHDLTGGCodeAdapter")) continue; // skip the slow VHDLTGGCodeAdapter for testing
			if (tgg.equals("ProcessCodeAdapter")) continue;
			if (tgg.equals("FamiliesToPersons_V1")) continue;
			if (tgg.equals("FamiliesToPersons_V0")) continue;
			if (tgg.equals("CompanyToIT")) continue;
			if (tgg.equals("ClassInhHier2DB")) continue;
			if (tgg.equals("BlockDiagramCodeAdapter")) continue;
			if (tgg.equals("BlockCodeAdapter")) continue;
			for (int size : modelSizes) {
				boolean[] networks = {false, true};
				for (boolean flattened : networks) {
					collectMODELGENData(tgg, size, flattened);
					collectCCData(tgg, size, flattened);
					collectSYNCData(tgg, size, flattened);
				}
			}
			saveData();
		}
		System.out.println("\n"+data.size()+" measurements have been performed.");
		saveData();
		return data;
	}
	
	private void initMaxModelSizes() throws IOException {
		try {
			loadMaxSizes();
		} catch (Exception e) {
			// max model sizes have to be calculated
			collectMaxSizes();
			saveMaxSizes();
		}
	}
	
	private void collectMaxSizes() throws IOException {
		maxModelSizes = new ArrayList<TestDataPoint>();
		Arrays.sort(modelSizes);
		for (String tgg : Constants.testProjects) {
			boolean[] networks = {false, true};
			for (boolean flattened : networks) {
				for (Operationalization op : Operationalization.values()) {
					if (op.equals(Operationalization.INCREMENTAL_FWD) || op.equals(Operationalization.INCREMENTAL_BWD))
						continue;
					if (!flattened) //remove this
						continue;
					for (int size : modelSizes) {
						System.out.println("Checking "+tgg+":");
						if (isMaxSize(tgg, size, flattened, op))
							break;
					}
				}
			}
		}
	}

	private boolean isMaxSize(String tgg, int size, boolean flattened, Operationalization op) throws IOException {
		switch (op) {
			case MODELGEN:
				return isMODELGENMaxSize(tgg, size, flattened);
			case CC:
				return isCCMaxSize(tgg, size, flattened);
			case FWD: 
				return isFWDmaxSize(tgg, size, flattened);
			case BWD:
				return isBWDmaxSize(tgg, size, flattened);
			default:
				throw new IllegalArgumentException("isMaxSize() should not be called with operationalizations INCREMENTAL_FWD or INCREMENTAL_BWD");
		}
	}

	@SuppressWarnings("unchecked")
	private void loadMaxSizes() throws FileNotFoundException, IOException, ClassNotFoundException {
		FileInputStream file = new FileInputStream(maxSizeLocation);
		ObjectInputStream in = new ObjectInputStream(file);
		maxModelSizes = (List<TestDataPoint>)in.readObject();
		in.close();
		file.close();
	}
	
	private void saveMaxSizes() {
		try {
			FileOutputStream file = new FileOutputStream(maxSizeLocation);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(maxModelSizes);
			out.close();
			file.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	public List<TestDataPoint> addVHDLMeasurements() throws IOException {
		data = loadData();
		String tgg = "VHDLTGGCodeAdapter";
		
		for (int size : modelSizes) {
			boolean[] networks = {true, false};
			for (boolean flattened : networks) {
				collectMODELGENData(tgg, size, flattened);
				if (size <= 50)
					collectCCData(tgg, size, flattened);
				collectSYNCData(tgg, size, flattened);
			}
		}
		saveData();
		return data;
	}

	public List<TestDataPoint> getData() {
		if (data == null)
			throw new IllegalStateException("No data has been collected yet. Call collectData() or loadData() before this method.");
		
		return data;
	}

	public List<TestDataPoint> getMaxModelSizes() throws IOException {
		if (maxModelSizes == null)
			initMaxModelSizes();
		
		return maxModelSizes;
	}

	public void setMaxModelSizes(List<TestDataPoint> maxModelSizes) {
		this.maxModelSizes = maxModelSizes;
	}

	private void collectMODELGENData(String tggName, int size, boolean flattened) throws IOException {
		if (size > util.filterTestResults(maxModelSizes, tggName, Operationalization.MODELGEN, null, flattened)
				.get(0).modelSize) //skip sizes that are to large to handle
			return;
		
		MODELGENPerformanceTest test = new MODELGENPerformanceTest();

		Supplier<MODELGEN> generator = () -> {
			try {
				MODELGEN gen = new MODELGEN_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"));
				gen.setUpdatePolicy(new TimedUpdatePolicy(new RandomMatchUpdatePolicy(), Constants.timeout, TimeUnit.SECONDS));
				return gen;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		Function<TGG, MODELGENStopCriterion> stops = util.createStopCriterion(tggName, size);

		System.out.println("Collecting MODELGEN data for "+tggName+", size: "+size+", flattened: "+flattened);
		TestDataPoint point = test.timedExecutionAndInit(generator, stops, size, repetitions, flattened);
		
		data.add(point);
	}

	private void collectCCData(String tggName, int size, boolean flattened) throws IOException {
		if (size > util.filterTestResults(maxModelSizes, tggName, Operationalization.CC, null, flattened)
				.get(0).modelSize) //skip sizes that are to large to handle
			return;
		
		CCPerformanceTest test = new CCPerformanceTest();

		Supplier<CC> checker = () -> {
			try {
				CC cc = new CC_App(tggName, Constants.workspacePath, flattened, false, size+"Element"+(flattened ? "_flattened" : "_refinement"));
				cc.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), Constants.timeout, TimeUnit.SECONDS));
				return cc;
			} catch (Exception e) {
				throw new RuntimeException("CC_App for "+tggName+" could not be found. "
						+ "Check if it is in the default package 'org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+"'", e);
			}
		};
		
		System.out.println("Collecting CC data for "+tggName+", size: "+size+", flattened: "+flattened);
		TestDataPoint point = null;
		try { //TODO remove this try/catch
			point = test.timedExecutionAndInit(checker, size, repetitions, flattened);
		} catch (GRBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		data.add(point);
	}

	private void collectSYNCData(String tggName, int size, boolean flattened) throws IOException {
		SYNCPerformanceTest test = new SYNCPerformanceTest();
		boolean fwd = true;
		
		// FWD
		if (size <= util.filterTestResults(maxModelSizes, tggName, Operationalization.FWD, null, flattened)
				.get(0).modelSize) { //skip sizes that are to large to handle
			Supplier<SYNC> transformator = () -> {
				try {
					SYNC sync = new SYNC_App(tggName, Constants.workspacePath, flattened, false,
							tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), fwd, false);
					sync.setUpdatePolicy(new TimedUpdatePolicy(new NextMatchUpdatePolicy(), Constants.timeout, TimeUnit.SECONDS));
					return sync;
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			};
	
			System.out.println("Collecting SYNC data for "+tggName+", size: "+size+", flattened: "+flattened);
			List<TestDataPoint> points = test.timedSyncAndInit(transformator, size, repetitions, flattened, fwd, incEditor.getEdit(tggName, fwd), true);
			data.addAll(points);
		}
		
		// BWD
		if (size <= util.filterTestResults(maxModelSizes, tggName, Operationalization.BWD, null, flattened)
				.get(0).modelSize) { //skip sizes that are to large to handle
			boolean bwd = !fwd;
			Supplier<SYNC> transformator = () -> {
				try {
					return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
							tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), bwd, false);
				} catch (IOException e) {
					e.printStackTrace();
					return null;
				}
			};
			
			List<TestDataPoint> points = test.timedSyncAndInit(transformator, size, repetitions, flattened, bwd, incEditor.getEdit(tggName, bwd), true);
			data.addAll(points);
		}
	}
	
	private boolean isMODELGENMaxSize(String tggName, int size, boolean flattened) throws IOException {
		MODELGENPerformanceTest test = new MODELGENPerformanceTest();
		test.setUseTimeouts(false);

		Supplier<MODELGEN> generator = () -> {
			try {
				MODELGEN gen = new MODELGEN_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"));
				return gen;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		Function<TGG, MODELGENStopCriterion> stops = util.createStopCriterion(tggName, size);
		
		try {
			test.timedExecutionAndInit(generator, stops, size, 1, flattened);
		} catch (OutOfMemoryError e) {
			TestDataPoint maxSize = new TestDataPoint(null, null);
			maxSize.tggName = tggName;
			maxSize.modelSize = size;
			maxSize.operationalization = Operationalization.MODELGEN;
			maxModelSizes.add(maxSize);
			return true;
		}
		
		return false;
	}

	private boolean isCCMaxSize(String tggName, int size, boolean flattened) throws IOException {
		CCPerformanceTest test = new CCPerformanceTest();
		test.setUseTimeouts(false);

		Supplier<CC> checker = () -> {
			try {
				CC cc = new CC_App(tggName, Constants.workspacePath, flattened, false, size+"Element"+(flattened ? "_flattened" : "_refinement"));
				return cc;
			} catch (Exception e) {
				throw new RuntimeException("CC_App for "+tggName+" could not be found. "
						+ "Check if it is in the default package 'org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+"'", e);
			}
		};
		

		try {
			test.timedExecutionAndInit(checker, size, 1, flattened);
		} catch (OutOfMemoryError | GRBException e) {
			TestDataPoint maxSize = new TestDataPoint(null, null);
			maxSize.tggName = tggName;
			maxSize.modelSize = size;
			maxSize.operationalization = Operationalization.CC;
			maxModelSizes.add(maxSize);
			return true;
		}
		
		return false;
	}

	private boolean isFWDmaxSize(String tggName, int size, boolean flattened) throws IOException {
		SYNCPerformanceTest test = new SYNCPerformanceTest();
		test.setUseTimeouts(false);
		
		Supplier<SYNC> transformator = () -> {
			try {
				SYNC sync = new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), true, false);
				return sync;
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		try {
			test.timedSyncAndInit(transformator, size, 1, flattened, true, incEditor.getEdit(tggName, true), true);
		} catch (OutOfMemoryError e) {
			TestDataPoint maxSize = new TestDataPoint(null, null);
			maxSize.tggName = tggName;
			maxSize.modelSize = size;
			maxSize.operationalization = Operationalization.FWD;
			maxModelSizes.add(maxSize);
			return true;
		}
		
		return false;
	}

	private boolean isBWDmaxSize(String tggName, int size, boolean flattened) throws IOException {
		SYNCPerformanceTest test = new SYNCPerformanceTest();
		test.setUseTimeouts(false);
		
		Supplier<SYNC> transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), false, false);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		try {
			test.timedSyncAndInit(transformator, size, 1, flattened, false, incEditor.getEdit(tggName, false), true);
		} catch (OutOfMemoryError e) {
			TestDataPoint maxSize = new TestDataPoint(null, null);
			maxSize.tggName = tggName;
			maxSize.modelSize = size;
			maxSize.operationalization = Operationalization.BWD;
			maxModelSizes.add(maxSize);
			return true;
		}
		
		return false;
	}
	
	public void saveHardCodedMaxModelSizes() {
		int[][][] modelSizeLimits = {{{10000,500,50,50},{5000,1000,1000,1000}},
									 {{10000,1000,100,100},{10000,1000,1000,1000}},
									 {{100000, 10000, 1000, 10000},{100000, 10000, 10000, 10000}},
									 {{100000,1000,1000,1000},{100000,1000,1000,1000}},
									 {{100000,500,1000,1000},{100000,500,10000,1000}},
									 {{100000,1000,1000,1000},{100000,1000,1000,1000}},
									 {{100000,1000,50,50},{100000,10000,10000,10000}},
									 {{5000,1000,50,50},{1000,500,1000,1000}}};
		
		List<TestDataPoint> maxData = new ArrayList<TestDataPoint>(64);
		for (int i = 0; i < modelSizeLimits.length; i++) {
			boolean[] networks = {false, true};
			for (int j = 0; j < 2; j++) {
				for (int k = 0; k < 4; k++) {
					TestDataPoint maxDataPoint = new TestDataPoint(null, null);
					maxDataPoint.tggName = Constants.testProjects[i];
					maxDataPoint.flattenedNetwork = networks[j];
					maxDataPoint.operationalization = Operationalization.values()[k];
					maxDataPoint.modelSize = modelSizeLimits[i][j][k];
					maxData.add(maxDataPoint);
				}
			}
		}
		
		maxModelSizes = maxData;
		saveMaxSizes();
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

	@SuppressWarnings("unchecked")
	public List<TestDataPoint> loadData() {
		try {
			FileInputStream file = new FileInputStream(dataLocation);
			ObjectInputStream in = new ObjectInputStream(file);
			data = (List<TestDataPoint>)in.readObject();
			in.close();
			file.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return data;
	}
}
