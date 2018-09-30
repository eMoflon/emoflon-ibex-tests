package testsuite.ibex.MocaTreeToProcess.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.mocatreetoprocess.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.mocatreetoprocess.CO_App;
import org.emoflon.ibex.tgg.run.mocatreetoprocess.FWD_OPT_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestMocaTreeToProcess extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("MocaTreeToProcess", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("MocaTreeToProcess", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("MocaTreeToProcess", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runFWD_OPT();
		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

	@Test
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runBWD_OPT();
		createGenerator("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr", "/resources/co/protocol");
		runCO();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testMissingLink() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runCO();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
}
