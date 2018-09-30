package testsuite.ibex.ClassInhHier2DB.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToTable() throws IOException {
		createGenerator("in/PackageToDatabase_FWD", "expected/ClassToTable_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToColumn() throws IOException {
		createGenerator("in/ClassToTable_FWD", "expected/AttributeToColumn_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToTable() throws IOException {
		createGenerator("in/AttributeToColumn_FWD", "expected/SubClassToTable_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testLargeExample() throws IOException {
		createGenerator("in/LargeExample_FWD", "expected/AttributeToColumn2_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
}