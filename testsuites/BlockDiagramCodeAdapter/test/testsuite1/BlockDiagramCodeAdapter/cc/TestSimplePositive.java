package testsuite1.BlockDiagramCodeAdapter.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testSystemToNode() throws IOException {
		createGenerator("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testBlockToNode() throws IOException {
		createGenerator("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testProvideToNode() throws IOException {
		createGenerator("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testRequireToNode() throws IOException {
		createGenerator("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testConnectorToNode() throws IOException {
		createGenerator("in/ConnectorToNode_FWD", "expected/ConnectorToNode_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
}