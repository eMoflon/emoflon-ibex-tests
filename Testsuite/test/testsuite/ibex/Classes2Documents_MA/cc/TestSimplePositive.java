package testsuite.ibex.Classes2Documents_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2doc_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2Doc_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, 
				srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToContainer() throws IOException {
		createChecker("in/01_PackageToContainer", "expected/01_PackageToContainer");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void tesClassToDoc() throws IOException {
		createChecker("in/02_ClassToDoc", "expected/02_ClassToDoc");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToDoc() throws IOException {
		createChecker("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubSubClassToDoc() throws IOException {
		createChecker("in/04_SubSubClassToDoc", "expected/04_SubSubClassToDoc");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoDifSuperOneSubClassToDoc() throws IOException {
		createChecker("in/05_TwoDifSuperOneSubClassToDoc", "expected/05_TwoDifSuperOneSubClassToDoc");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoDifSuperTwoDifSubClassToDoc() throws IOException {
		createChecker("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDoc");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

}
