package testsuite.ibex.BenchmarxFamiliesToPersons.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.CO_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.FWD_OPT_App;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Ignore;

import testsuite.ibex.testUtil.COTestCase;

public class TestBenchmarxFamiliesToPersons extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createForward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, true, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, true, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createForward("/instances/src", "/instances/trg", "/instances/corr", "/instances/protocol");
		runForward();
		createGenerator("/instances/src", "/instances/trg", "/instances/corr", "/instances/protocol");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore
	public void testBWD_OPT() throws IOException {
		createBackward("/instances/src", "/instances/trg", "/instances/corr", "/instances/protocol");
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
	public void testSuperfluousLink() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}
