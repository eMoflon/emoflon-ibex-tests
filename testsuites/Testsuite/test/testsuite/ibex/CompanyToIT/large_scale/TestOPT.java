package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.FWD_OPT_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestOPT extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance);
	}
	
	@Test
	@Ignore
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runForward();
		createGenerator("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runBackward();
		createGenerator("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore
	public void testCO() throws IOException {
		createGenerator("/resources/large_scale/src", "/resources/large_scale/trg", "/resources/large_scale/corr", "/resources/large_scale/protocol");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}
