package testsuite1.BlockDiagramCodeAdapter.modelgen;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class SyncResourcesTest extends ModelGenTestCase {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testSystemToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
	}
	
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testBlockToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
	}
	
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testProvideToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		stop.setMaxRuleCount("ProvideToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
	}
	
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testRequireToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		stop.setMaxRuleCount("RequireToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
	}
}
