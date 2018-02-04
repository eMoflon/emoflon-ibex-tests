package testsuite.ibex.ClassMultiInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase{
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
		runGenerator();
		checker.generateConsistencyReport();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSuperAttToSubTable() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
			
	}
	
	@Test
	public void testSubAttToSubTable() throws IOException {
		createGenerator("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTransitiveAttToSubTables() throws IOException {
		createGenerator("in/07_OneSuperSuperAtt_FWD", "expected/07_OneSuperSuperAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTransitiveAttToSubTables2() throws IOException {
		createGenerator("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTransitiveAttToSubTables3() throws IOException {
		createGenerator("in/09_OneSuperAtt_OneSubAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoSuperClassesToSubTables() throws IOException {
		createGenerator("in/10_TwoDiffSuperAtt_FWD", "expected/10_TwoDiffSuperAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

	@Test
	public void testTwoTransitiveSuperClassesToSubTables() throws IOException {
		createGenerator("in/11_TwoDiffTransitiveSuperAtt_FWD", "expected/11_TwoDiffTransitiveSuperAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTwoTransitiveSuperClassesToSubTables2() throws IOException {
		createGenerator("in/11_TwoDiffTransitiveSuperAtt_OneSubAtt_FWD", "expected/11_TwoDiffTransitiveSuperAtt_OneSubAtt_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}

}
