package testsuite.ibex.ClassInhHier2DB.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testAttributeToColumn2() throws IOException {
		createGenerator("in/AttributeToColumn2_FWD", "expected/AttributeToColumn2_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testLargeExample() throws IOException {
		createGenerator("in/LargeExample_FWD", "expected/LargeExample_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
}