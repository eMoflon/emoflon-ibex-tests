package testsuite.ibex.Class2TestClass_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2testclass_ma.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2TestClass_MA", testsuite.ibex.testUtil.Constants.workspacePath, false);
	}
	
	@Test
	public void testPackageToTestSuite() throws IOException {
		createGenerator("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
}