package testsuite.ibex.BlockDiagramCodeAdapter_EdgeRules.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;



public class TestSimplePositive  extends CCTestCase {
	
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("BlockDiagramCodeAdapter_EdgeRules", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testBlockToNode() throws IOException {
		createGenerator("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testPovideToNode() throws IOException {
		createGenerator("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testConnectorToNode() throws IOException {
		createGenerator("in/ConnectorToNode_FWD", "expected/ConnectorToNode_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testRequireToNode() throws IOException {
		createGenerator("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testSystemToNodeToNode() throws IOException {
		createGenerator("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}