package testsuite.ibex.BenchmarxFamiliesToPersons.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.CO_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.FWD_OPT_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestBenchmarxFamiliesToPersons extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createForward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createForward("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runForward();
		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

	@Test
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runBackward();
		createGenerator("/resources/co/src-tmp", "/resources/co/trg", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
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
	public void testSuperfluousLink() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}
