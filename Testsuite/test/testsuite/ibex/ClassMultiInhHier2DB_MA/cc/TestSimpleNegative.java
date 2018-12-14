package testsuite.ibex.ClassMultiInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CC_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase{
	
	public void createCC(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createCC("in/01_PackageToDatabase_FWD", "expected/02_ClassToTable_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createCC("in/02_ClassToTable_FWD", "expected/03_AttributeToColumn_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createCC("in/04_SubClassToTable_FWD", "expected/05_OneSuperAtt_FWD");
		runCC();
		checker.generateConsistencyReport();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testSuperAttToSubTable_V1() throws IOException {
		createCC("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V1_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
			
	}
	
	@Ignore("Non-deterministic")
	@Test
	public void testSuperAttToSubTable_V2() throws IOException {
		createCC("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V2_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
			
	}
	
	@Ignore("Non-deterministic")
	@Test
	public void testTransitiveAttToSubTables2_V1() throws IOException {
		createCC("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V1_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTransitiveAttToSubTables2_V2() throws IOException {
		createCC("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V2_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Ignore("Appears to be non-deterministic!")
	@Test
	public void testTransitiveAttToSubTables2_V3() throws IOException {
		createCC("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V3_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables_V1() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V1_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables_V2() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V2_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables_V3() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V3_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables2_V1() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V1_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables2_V2() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V2_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables2_V3() throws IOException {
		createCC("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V3_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Ignore("Re-enable after consolidating GT and TGG (a NAC has been removed)")
	@Test
	public void testTwoDiffTransitiveSuperToSubTables_V1() throws IOException {
		createCC("in/11_TwoDiffTransitiveSuperAtt_OneSubAtt_FWD", "expected/11_TwoDiffTransitiveSuperAtt_OneSubAtt_INCONS_V1_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}

}
