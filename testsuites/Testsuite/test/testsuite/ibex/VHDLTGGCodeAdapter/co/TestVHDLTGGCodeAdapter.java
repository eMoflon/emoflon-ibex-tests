package testsuite.ibex.VHDLTGGCodeAdapter.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.FWD_OPT_App;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.CO_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestVHDLTGGCodeAdapter extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		checker = new CO_App("VHDLTGGCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		forward = new FWD_OPT_App("VHDLTGGCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		backward = new BWD_OPT_App("VHDLTGGCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, this.ilpSolver);
	}
	
	@Ignore("featureID is 0 when trying to add the edge spec__blocks__composite_eMoflonEdge --> probably problems with containment yes or no")
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runForward();
		createGenerator("/resources/co/src", "/resources/co/trg-tmp", "/resources/co/corr-tmp", "/resources/co/prot-tmp");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

	@Ignore("NPE while trying to create edge")
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
	public void testMissingLink() throws IOException {
		createGenerator("/resources/co/src", "/resources/co/trg", "/resources/co/corr_inc", "/resources/co/protocol");
		runGenerator();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}