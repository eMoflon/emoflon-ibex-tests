package testsuite1.testUtil.performance;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

import language.TGG;
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.MODELGEN_App;
import testsuite1.testUtil.SYNC_App;

public class TestDataCollector {
	
	private static final String dataLocation = "performance/data/allTestDataPoints.ser";
	
	private IncrementalEditor incEditor = new IncrementalEditor();
	private List<TestDataPoint> data;
	
	public int[] modelSizes = {500, 50, 5};
	public int repetitions = 3;
	
	/**
	 * Calculates the TestDataPoints for all combinations of operationalization,
	 * tgg and model size. After collectData() finishes, the collected data can be accessed
	 * via getData().
	 * @throws IOException 
	 * @throws ClassNotFoundException
	 */
	public List<TestDataPoint> collectData() throws IOException {
		data = new ArrayList<TestDataPoint>(100);
		for (String tgg : Constants.testProjects) {
			if (tgg.equals("VHDLTGGCodeAdapter")) continue; // skip the slow VHDLTGGCodeAdapter for testing
			if (tgg.equals("ProcessCodeAdapter")) continue;
			if (tgg.equals("FamiliesToPersons_V1")) continue;
//			if (tgg.equals("FamiliesToPersons_V0")) continue;
//			if (tgg.equals("CompanyToIT")) continue;
//			if (tgg.equals("ClassInhHier2DB")) continue;
//			if (tgg.equals("BlockDiagramCodeAdapter")) continue;
			if (tgg.equals("BlockCodeAdapter")) continue;
			for (int size : modelSizes) {
				boolean[] networks = {true, false};
				for (boolean flattened : networks) {
					collectMODELGENData(tgg, size, flattened);
//					if (size <= 50)
						collectCCData(tgg, size, flattened);
					collectSYNCData(tgg, size, flattened);
					collectINCREMENTALData(tgg, size, flattened);
				}
			}
		}
		System.out.println("\n"+data.size()+" measurements have been performed.");
		saveData();
		return data;
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
				collectINCREMENTALData(tgg, size, flattened);
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

	private void collectMODELGENData(String tggName, int size, boolean flattened) throws IOException {
		MODELGENPerformanceTest test = new MODELGENPerformanceTest();

		Supplier<MODELGEN> generator = () -> {
			try {
				return new MODELGEN_App(tggName, Constants.workspacePath, flattened, false,
					tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"));
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		Function<TGG, MODELGENStopCriterion> stops = createStopCriterion(tggName, size);
		
		TestDataPoint point = test.timedExecutionAndInit(generator, stops, size, repetitions, flattened);
		data.add(point);
	}

	
	/**
	 * Creates a MODELGENStopCriterion for a given TGG which ensures that only one
	 * axiom is applied. Needs to be extended for every new test project, or more
	 * specifically for every new axiom.
	 */
	private Function<TGG, MODELGENStopCriterion> createStopCriterion(String tggName, int size) {
		return (TGG tgg) -> {
			MODELGENStopCriterion stop = new MODELGENStopCriterion(tgg);
			stop.setMaxElementCount(size);
			
			switch (tgg.getName()) {
				case "BlockCodeAdapter":
					stop.setMaxRuleCount("File2SpecRule", 1);
					break;
				case "BlockDiagramCodeAdapter":
					stop.setMaxRuleCount("SystemToNodeRule", 1);
					break;
				case "ClassInhHier2DB":
					stop.setMaxRuleCount("PackageToDatabaseRule", 1);
					break;
				case "CompanyToIT":
					stop.setMaxRuleCount("CompanyToITRule", 1);
					break;
				case "FamiliesToPersons_V0":
					stop.setMaxRuleCount("HandleRegisters", 1);
					stop.setMaxRuleCount("HandleRegistersLoose", 0);
					break;
				case "FamiliesToPersons_V1":
					stop.setMaxRuleCount("HandleRegisters", 1);
					break;
				case "ProcessCodeAdapter":
					stop.setMaxRuleCount("RootToSystemRule", 1);
					break;
				case "VHDLTGGCodeAdapter":
					stop.setMaxRuleCount("File2VHDLSpec", 1);
					break;
			}
			return stop;
		};
	}

	private void collectCCData(String tggName, int size, boolean flattened) throws IOException {
		CCPerformanceTest test = new CCPerformanceTest();

		Supplier<CC> checker = () -> {
			try {
				// Since the CC_App to be used depends on the tgg-project, it is accessed reflectively using the tgg's name
				return (CC) Class.forName("org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+".CC_App")
						.getConstructor(String.class, String.class, boolean.class, boolean.class, String.class, String.class)
						.newInstance(tggName, Constants.workspacePath, flattened, false,
								"../instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement")+"/src",
								"../instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement")+"/trg");
			} catch (Exception e) {
				throw new RuntimeException("CC_App for "+tggName+" could not be found. "
						+ "Check if it is in the default package 'org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+"'", e);
			}
		};
		
		TestDataPoint point = test.timedExecutionAndInit(checker, size, repetitions, flattened);
		data.add(point);
	}

	private void collectSYNCData(String tggName, int size, boolean flattened) throws IOException {
		SYNCPerformanceTest test = new SYNCPerformanceTest();

		Supplier<SYNC> transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), true, false);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		TestDataPoint point = test.timedFwdAndInit(transformator, size, repetitions, flattened);
		data.add(point);

		transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), false, false);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		point = test.timedBwdAndInit(transformator, size, repetitions, flattened);
		data.add(point);
	}

	private void collectINCREMENTALData(String tggName, int size, boolean flattened) throws IOException {
		if (!tggName.equals("CompanyToIT") && !tggName.equals("ClassInhHier2DB")) // currently measurements are only supported for these TGGs
			return;
		
		SYNCPerformanceTest test = new SYNCPerformanceTest();

		Supplier<SYNC> transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), true, true);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		
		TestDataPoint point = test.timedFwdAndInit(transformator, size, repetitions, flattened, incEditor.getEdit(tggName, true), true);
		data.add(point);

		transformator = () -> {
			try {
				return new SYNC_App(tggName, Constants.workspacePath, flattened, false,
						tggName+"/instances/"+size+"Element"+(flattened ? "_flattened" : "_refinement"), false, true);
			} catch (IOException e) {
				e.printStackTrace();
				return null;
			}
		};
		point = test.timedBwdAndInit(transformator, size, repetitions, flattened, incEditor.getEdit(tggName, false), true);
		data.add(point);
		
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
