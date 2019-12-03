package testsuite.ibex.FeatureModelConciseToSafe.cc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class SingleGroups extends CCTestCase {
	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FeatureModelConciseToSafe", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testORGroupConsistent() throws IOException {
		createChecker("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
		runCC();
		assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testORGroupInconsistent() throws IOException {
		createChecker("XORGroup3FeaturesConciseOther", "XORGroup3FeaturesSafe");
		runCC();
		assertFalse(checker.modelsAreConsistent());
	}
}