package testsuite.ibex.Classes2Documents_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.class2doc_ma.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("Class2Doc_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, 
				srcInstance, trgInstance);
	}
	
	@Test
	public void testPackageToContainer() throws IOException {
		createGenerator("in/01_PackageToContainer", "expected/02_ClassToDoc");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	
	@Test
	public void testSubClassToDoc() throws IOException {
		createGenerator("in/03_SubClassToDoc", "expected/04_SubSubClassToDoc");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubSubClassToDoc() throws IOException {
		createGenerator("in/04_SubSubClassToDoc", "expected/03_SubClassToDoc");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoDifSuperOneSubClassToDoc() throws IOException {
		createGenerator("in/05_TwoDifSuperOneSubClassToDoc", "expected/05_TwoDifSuperOneSubClassToDocINCONS1");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoDifSuperOneSubClassToDoc2() throws IOException {
		createGenerator("in/05_TwoDifSuperOneSubClassToDoc", "expected/05_TwoDifSuperOneSubClassToDocINCONS2");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoDifSuperTwoDifSubClassToDoc() throws IOException {
		createGenerator("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDocINCONS");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoDifSuperTwoDifSubClassToDoc2() throws IOException {
		createGenerator("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDocINCONS2");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	

}
