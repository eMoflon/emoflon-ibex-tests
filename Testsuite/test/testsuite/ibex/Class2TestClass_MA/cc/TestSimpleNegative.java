package testsuite.ibex.Class2TestClass_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2testclass_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2TestClass_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testClassToMandatoryTestClass() throws IOException {
		createGenerator("in/02_OneClass", "expected/01_PackageToTestSuite_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTestClassWithoutClass() throws IOException {
		createGenerator("in/02_OneClass", "expected/03_TwoTestClasses");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
}