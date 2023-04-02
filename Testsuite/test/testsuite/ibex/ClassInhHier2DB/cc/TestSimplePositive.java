package testsuite.ibex.ClassInhHier2DB.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
		checker = new CC_App("ClassInhHier2DB", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn2() throws IOException {
		createGenerator("in/AttributeToColumn2_FWD", "expected/AttributeToColumn2_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testLargeExample() throws IOException {
		createGenerator("in/LargeExample_FWD", "expected/LargeExample_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
}