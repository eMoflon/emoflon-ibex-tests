package testsuite.ibex.FeatureModelConciseToSafe.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.CC_App;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.config.HiPERegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class SingleGroups extends CCTestCase {
	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
		checker = new CC_App("FeatureModelConciseToSafe", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testORGroupConsistent() throws IOException {
		createChecker("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testORGroupInconsistent() throws IOException {
		createChecker("XORGroup3FeaturesConciseOther", "XORGroup3FeaturesSafe");
		runCC();
		Assertions.assertFalse(checker.modelsAreConsistent());
	}
}