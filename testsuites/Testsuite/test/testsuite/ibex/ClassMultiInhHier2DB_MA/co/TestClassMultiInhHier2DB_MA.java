package testsuite.ibex.ClassMultiInhHier2DB_MA.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CO_App;
import org.junit.Test;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.FWD_OPT_App;
import testsuite.ibex.testUtil.COTestCase;

public class TestClassMultiInhHier2DB_MA extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	public void createTransformation() throws IOException {
		forward = new FWD_OPT_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation();
		runForward();
		testSimplePositive();
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
