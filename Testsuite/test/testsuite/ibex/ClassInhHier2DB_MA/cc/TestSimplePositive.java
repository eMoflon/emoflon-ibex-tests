package testsuite.ibex.ClassInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSuperAttToSubTable() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSuperAttAndSubAttToSubTable() throws IOException {
		createGenerator("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneSuperThreeSubAttToSubTable() throws IOException {
		createGenerator("in/07_OneSuperAtt_TwoSubAtt_FWD", "expected/07_OneSuperAtt_TwoSubAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testThreeSuperAttOneSubAttToSubTable() throws IOException {
		createGenerator("in/08_ThreeSuperAtt_OneSubAtt_FWD", "expected/08_ThreeSuperAtt_OneSubAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneTransitiveAttToSubTables() throws IOException {
		createGenerator("in/09_OneSuperSuperAtt_FWD", "expected/09_OneSuperSuperAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneTransitiveAttOneSuperAttOneSubAttToSubTable() throws IOException {
		createGenerator("in/10_OneSuperSuperAtt_OneSuperAtt_OneSubAtt_FWD", "expected/10_OneSuperSuperAtt_OneSuperAtt_OneSubAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneSuperAttToTwoSubTables() throws IOException {
		createGenerator("in/11_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/11_OneSuperSuperAtt_OneSuperAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneSuperAttOneSubAttToTwoSubTables() throws IOException {
		createGenerator("in/12_OneSuperAtt_OneSubAtt_OneSubAtt_FWD", "expected/12_OneSuperAtt_OneSubAtt_OneSubAtt_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	
}