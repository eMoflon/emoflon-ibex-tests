package testsuite1.BlockDiagramCodeAdapter.modelgen;

import java.io.IOException;

import org.benchmarx.blockDiagram.core.BlockDiagramComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

public class SyncResourcesTest extends ModelGenTestCase<BlockSystem, File> {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
	}

	@Override
	protected String getProjectName() {
		return "BlockDiagramCodeAdapter";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), "./../", flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new BlockDiagramComparator(false);
		targetComp = new MocaTreeFileComparator(false);
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
