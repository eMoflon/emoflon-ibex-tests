package testsuite.ibex.ClassInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/02_ClassToTable_FWD", "expected/01_PackageToDatabase_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/03_AttributeToColumn_FWD", "expected/02_ClassToTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/04_SubClassToTable_FWD", "expected/02_ClassToTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSuperAttToSubTable() throws IOException {
		createGenerator("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/03_AttributeToColumn_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubAttToSubTable_V1() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubAttToSubTable_V2() throws IOException {
		createGenerator("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTransitiveAttToSubTables_V1() throws IOException {
		createGenerator("in/11_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/11_OneSuperSuperAtt_OneSuperAtt_INCONS_V1_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTransitiveAttToSubTables_V2() throws IOException {
		createGenerator("in/11_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/11_OneSuperSuperAtt_OneSuperAtt_INCONS_V2_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testTransitiveAttToSubTables_V3() throws IOException {
		createGenerator("in/11_OneSuperSuperAtt_OneSuperAtt_FWD", "expected/11_OneSuperSuperAtt_OneSuperAtt_INCONS_V3_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
}