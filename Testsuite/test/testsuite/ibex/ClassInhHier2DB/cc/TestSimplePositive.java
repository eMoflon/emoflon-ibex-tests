package testsuite.ibex.ClassInhHier2DB.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.emoflon.ibex.tgg.run.classinhhier2db.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.classinhhier2db.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.classinhhier2db.config.ViatraRegistrationHelper;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new CC_App("ClassInhHier2DB", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn2() throws IOException {
		createGenerator("in/AttributeToColumn2_FWD", "expected/AttributeToColumn2_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testLargeExample() throws IOException {
		createGenerator("in/LargeExample_FWD", "expected/LargeExample_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}