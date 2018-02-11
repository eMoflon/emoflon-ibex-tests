package testsuite.ibex.ProcessCodeAdapter.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.processcodeadapter.FWD_OPT_App;
import org.emoflon.ibex.tgg.run.processcodeadapter.CO_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestProcessCodeAdapter extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("ProcessCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	public void createTransformation() throws IOException {
		forward = new FWD_OPT_App("ProcessCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false);
	}
	
	//FIXME [Nils]
	//@Ignore --> Feature-ID for the inverse EMFEdge of allModules (outgoing from SystemModule) is 0
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
	public void testWrongLinks() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}