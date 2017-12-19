package testsuite.ibex.ClassMultiInhHier2DB_MA.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CO_App;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestClassMultiInhHier2DB_MA extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("src", "trg", "corr");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testEmptyCorrModel() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
}
