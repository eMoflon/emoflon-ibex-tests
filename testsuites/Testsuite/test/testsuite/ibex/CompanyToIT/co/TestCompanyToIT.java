package testsuite.ibex.CompanyToIT.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.FWD_OPT_App;
import org.junit.Test;

import org.junit.Assert;
import testsuite.ibex.testUtil.COTestCase;

public class TestCompanyToIT extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	public void createTransformation() throws IOException {
		forward = new FWD_OPT_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false);
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
	public void testCyclicWrongLinks() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}
