package testsuite1.testUtil.performance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

import language.TGG;
import testsuite1.testUtil.Constants;

public class TestDataCollector {
	
	private List<TestDataPoint> data;
	
	public int[] modelSizes = {100};
	public int repetitions = 2;
	
	/**
	 * Calculates the TestDataPoints for all combinations of operationalization,
	 * tgg and model size. After collectData() finishes, the collected data can be accessed
	 * via getData().
	 * @throws IOException 
	 * @throws ClassNotFoundException
	 */
	public List<TestDataPoint> collectData() throws ClassNotFoundException, IOException {
		data = new ArrayList<TestDataPoint>(100);
		for (String tgg : Constants.testProjects) {
			if (tgg.equals("VHDLTGGCodeAdapter")) continue; // skip the slow VHDLTGGCodeAdapter for testing
			for (int size : modelSizes) {
				boolean[] networks = {true, false};
				for (boolean flattened : networks) {
					collectMODELGENData(tgg, size, flattened);
					collectCCData(tgg, size, flattened);
					collectSYNCData(tgg, size, flattened);
					collectINCREMENTALData(tgg, size, flattened);
				}
			}
		}
		System.out.println(data.size()+" measurements have been performed.");
		return data;
	}
	
	public List<TestDataPoint> getData() {
		if (data == null)
			throw new IllegalStateException("No data has been collected yet. Call collectData() before this method.");
		
		return data;
	}

	private void collectMODELGENData(String tggName, int size, boolean flattened) throws ClassNotFoundException, IOException {
		MODELGENPerformanceTest test = new MODELGENPerformanceTest();

		Supplier<MODELGEN> generator = () -> {
			try {
				// Since the MODELGEN_App to be used depends on the tgg-project, it is accessed reflectively using the tgg's name
				return (MODELGEN) Class.forName("org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+".MODELGEN_App")
						.getConstructor(String.class, String.class, boolean.class, boolean.class)
						.newInstance(tggName, Constants.workspacePath, flattened, false);
			} catch (Exception e) {
				throw new RuntimeException("MODELGEN_App for "+tggName+" could not be found. "
						+ "Check if it is in the default package 'org.emoflon.ibex.tgg.run."+tggName.toLowerCase()+"'", e);
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

	private void collectCCData(String tgg, int size, boolean flattened) {
		// TODO Auto-generated method stub
		
	}

	private void collectSYNCData(String tgg, int size, boolean flattened) {
		// TODO Auto-generated method stub
		
	}

	private void collectINCREMENTALData(String tgg, int size, boolean flattened) {
		// TODO Auto-generated method stub
		
	}
}
