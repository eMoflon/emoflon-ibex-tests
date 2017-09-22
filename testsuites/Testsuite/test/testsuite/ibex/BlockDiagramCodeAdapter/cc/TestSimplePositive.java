package testsuite.ibex.BlockDiagramCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("BlockDiagramCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testSystemToNode() throws IOException {
		createGenerator("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testBlockToNode() throws IOException {
		createGenerator("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testProvideToNode() throws IOException {
		createGenerator("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testRequireToNode() throws IOException {
		createGenerator("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testConnectorToNode() throws IOException {
		createGenerator("in/ConnectorToNode_FWD", "expected/ConnectorToNode_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
}