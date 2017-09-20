package testsuite1.performance;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;
import testsuite1.testUtil.Constants;
import testsuite1.testUtil.performance.MODELGEN_App;
import testsuite1.testUtil.performance.PerformanceTestUtil;

public class AverageRuleSizeExtractor {
	
	public static void main(String[] args) throws IOException {
		PerformanceTestUtil util = new PerformanceTestUtil();
		
		for (String tggName : Constants.testProjects) {
			TGG tgg = getFlattenedTGGFromName(tggName);
			System.out.println("Average rule size of TGG '"+tggName+"': "+util.getAverageRuleSize(tgg));
//			System.out.println("Max rule size of TGG '"+tggName+"': "+util.getMaxRuleSize(tgg));
		}
	}

	private static TGG getFlattenedTGGFromName(String tggName) throws IOException {
		MODELGEN gen = new MODELGEN_App(tggName, Constants.workspacePath, true, false, "");
		gen.registerPatternMatchingEngine(new DemoclesEngine());
		return gen.getFlattenedTGG();
	}
}
