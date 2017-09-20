package testsuite.ibex.FeatureModelConciseToSafe.cc;

import static org.junit.Assert.*;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class SingleGroups extends CCTestCase {
	
	public SingleGroups(boolean flatten) {
		super(flatten);
	}
	
	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FeatureModelConciseToSafe", testsuite.ibex.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testORGroupConsistent() throws IOException {
		createChecker("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
		runGenerator();
		assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testORGroupInconsistent() throws IOException {
		createChecker("XORGroup3FeaturesConciseOther", "XORGroup3FeaturesSafe");
		runGenerator();
		assertFalse(checker.modelsAreConsistent());
	}
}