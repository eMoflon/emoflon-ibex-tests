package testsuite.ibex.ClassInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	
	@Test
	public void testClassToTable() throws IOException {
		createGenerator("in/ClassToTable_FWD", "expected/PackageToDatabase_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testAttributeToColumn() throws IOException {
		createGenerator("in/AttributeToColumn_FWD", "expected/ClassToTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSubClassToTable() throws IOException {
		createGenerator("in/SubClassToTable_FWD", "expected/ClassToTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable() throws IOException {
		createGenerator("in/SuperAttToSubTable_FWD", "expected/AttributeToColumn_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable() throws IOException {
		createGenerator("in/SubAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable2() throws IOException {
		createGenerator("in/SubAttToSubTable2_FWD", "expected/SubAttToSubTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTransitiveAttToSubTables() throws IOException {
		createGenerator("in/SuperSuperClassToSubTable_FWD", "expected/SubAttToSubTable_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
}