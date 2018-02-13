package testsuite.ibex.BenchmarxFamiliesToPersons.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.CO_App;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.FWD_OPT_App;
import org.junit.Test;

import org.junit.Assert;
import org.junit.Ignore;

import testsuite.ibex.testUtil.COTestCase;

public class TestBenchmarxFamiliesToPersons extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, true, srcInstance, trgInstance, corrInstance);
	}
	
	public void createTransformation() throws IOException {
		forward = new FWD_OPT_App("BenchmarxFamiliesToPersons", testsuite.ibex.testUtil.Constants.workspacePath, true);
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
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSuperfluousLink() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}
