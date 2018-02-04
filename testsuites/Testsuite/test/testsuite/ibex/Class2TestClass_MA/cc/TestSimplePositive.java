package testsuite.ibex.Class2TestClass_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2testclass_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2TestClass_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testPackageToTestSuite() throws IOException {
		createGenerator("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToMandatoryTestClass() throws IOException {
		createGenerator("in/02_OneClass", "expected/02_OneTestClass");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testMandatoryClassToTestClass2() throws IOException {
		createGenerator("in/03_ThreeClasses", "expected/04_SixTestClasses");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}