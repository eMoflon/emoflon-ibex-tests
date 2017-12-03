package testsuite.ibex.ClassMultiInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CC_App;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative3 extends CCTestCase{
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testPackageToDatabase() throws IOException {
		createGenerator("in/01_PackageToDatabase_FWD", "expected/02_ClassToTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/02_ClassToTable_FWD", "expected/03_AttributeToColumn_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/04_SubClassToTable_FWD", "expected/05_OneSuperAtt_FWD");
		runGenerator();
		checker.generateConsistencyReport();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSuperAttToSubTable_V1() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
			
	}
	
	@Test
	public void testSuperAttToSubTable_V2() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
			
	}
	
	@Test
	public void testTransitiveAttToSubTables2_V1() throws IOException {
		createGenerator("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTransitiveAttToSubTables2_V2() throws IOException {
		createGenerator("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	// this one may fail!!!!
	@Test
	public void testTransitiveAttToSubTables2_V3() throws IOException {
		createGenerator("in/08_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V3_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore
	@Test
	public void testTwoSuperClassesToSubTables_V1() throws IOException {
		createGenerator("in/10_TwoSuperClassesToSubTable_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoSuperClassesToSubTables_V2() throws IOException {
		createGenerator("in/10_TwoSuperClassesToSubTable_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore
	@Test
	public void testTwoSuperClassesToSubTables_V3() throws IOException {
		createGenerator("in/10_TwoSuperClassesToSubTable_FWD", "expected/08_OneSuperSuperAtt_OneSuperAtt_INCONS_V3_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore
	@Test
	public void testTwoSuperClassesToSubTables2_V1() throws IOException {
		createGenerator("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTwoSuperClassesToSubTables2_V2() throws IOException {
		createGenerator("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore
	@Test
	public void testTwoSuperClassesToSubTables2_V3() throws IOException {
		createGenerator("in/10_TwoDiffSuperAtt_OneSubAtt_FWD", "expected/09_OneSuperAtt_OneSubAtt_OneSubAtt_INCONS_V3_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}

}
