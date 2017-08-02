package testsuite1.BlockCodeAdapter.modelgen;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class SyncResourcesTest extends ModelGenTestCase {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testSpec() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Spec_FWD", "expected/Spec_FWD");
	}
	
	@Test
	public void testBlock() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		stop.setMaxRuleCount("Node2BlockRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Block_FWD", "expected/Block_FWD");
	}
	
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testPort() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		stop.setMaxRuleCount("Node2BlockRule", 1);
		stop.setMaxRuleCount("Node2PortRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Port_FWD", "expected/Port_FWD");
	}
	
	@Test
	@Ignore("Waiting for Fix related to democles issue #14")
	public void testWireCloseLoop() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		stop.setMaxRuleCount("Node2BlockRule", 1);
		stop.setMaxRuleCount("Node2PortRule", 2);
		stop.setMaxRuleCount("Mapping2WireClosedLoopRule", 1);
		runGenerator(stop);
		assertPostcondition("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
	}
}
