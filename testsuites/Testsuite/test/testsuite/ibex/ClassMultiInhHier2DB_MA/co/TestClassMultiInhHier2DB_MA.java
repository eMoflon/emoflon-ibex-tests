package testsuite.ibex.ClassMultiInhHier2DB_MA.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.CO_App;
import org.junit.Assert;
import org.junit.Test;

import org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma.FWD_OPT_App;
import testsuite.ibex.testUtil.COTestCase;

public class TestClassMultiInhHier2DB_MA extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("ClassMultipleInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation("/instances/src", "/instances/trg", "/instances/corr", "/instances/protocol");
		runForward();
		createGenerator("/instances/src", "/instances/trg", "/instances/corr", "/instances/protocol");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmptyCorrModel() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runGenerator();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}
