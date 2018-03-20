package testsuite.ibex.Classes2Documents_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2doc_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2Doc_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, 
				srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToContainer() throws IOException {
		createGenerator("in/01_PackageToContainer", "expected/01_PackageToContainer");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void tesClassToDoc() throws IOException {
		createGenerator("in/02_ClassToDoc", "expected/02_ClassToDoc");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToDoc() throws IOException {
		createGenerator("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubSubClassToDoc() throws IOException {
		createGenerator("in/04_SubSubClassToDoc", "expected/04_SubSubClassToDoc");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoDifSuperOneSubClassToDoc() throws IOException {
		createGenerator("in/05_TwoDifSuperOneSubClassToDoc", "expected/05_TwoDifSuperOneSubClassToDoc");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoDifSuperTwoDifSubClassToDoc() throws IOException {
		createGenerator("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDoc");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

}
