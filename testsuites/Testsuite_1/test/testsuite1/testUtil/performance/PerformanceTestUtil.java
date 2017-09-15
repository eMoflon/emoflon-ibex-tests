package testsuite1.testUtil.performance;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

import language.TGG;

public class PerformanceTestUtil {

	/**
	 * Returns those TestDataPoints from the testData which fit to the
	 * specified parameters tgg, op, modelSize and flattened. When null is
	 * passed for any parameter, then that parameter is not used for filtering.
	 */
	public List<TestDataPoint> filterTestResults(List<TestDataPoint> testData, String tgg, Operationalization op, Integer modelSize, Boolean flattened) {
		return testData.stream()
				  	   .filter(t -> t != null)
					   .filter(t -> tgg==null || t.tggName.equals(tgg))
					   .filter(t -> op==null || t.operationalization == op)
					   .filter(t -> modelSize==null || t.modelSize == modelSize)
					   .filter(t -> flattened==null || t.flattenedNetwork == flattened)
					   .collect(Collectors.toList());
	}
	
	/**
	 * Concatenates the Strings in contents with tabs. Used to define one
	 * line for the .dat file, where the columns are separated by tabs.
	 */
	public String makeLine(String... contents) {
		return String.join("	", contents);
	}
		
	/**
	 * Creates a MODELGENStopCriterion for a given TGG which ensures that only one
	 * axiom is applied. Needs to be extended for every new test project, or more
	 * specifically for every new axiom.
	 */
	public Function<TGG, MODELGENStopCriterion> createStopCriterion(String tggName, int size) {
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
					stop.setMaxRuleCount("HandleFamilyReg", 0);
					stop.setMaxRuleCount("HandleRegistersLoose", 0);
					stop.setMaxRuleCount("IgnoreFamilyLoose", 0);
					stop.setMaxRuleCount("CreateFather", 0);
					stop.setMaxRuleCount("FatherAndMale", 0);
					stop.setMaxRuleCount("FatherToNothing", 0);
					stop.setMaxRuleCount("ReplaceFatherWithSon", 0);
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

}
