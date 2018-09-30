package testsuite.ibex.BlockDiagramCodeAdapter_EdgeRules.gen;

import java.io.IOException;

import org.benchmarx.blockDiagram.core.BlockDiagramComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import BlockDiagram.BlockSystem;
import MocaTree.File;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;


public class SimpleModelGenTest extends ModelGenTestCase<BlockSystem, File> {
	@Override
	protected String getProjectName() {
		return "BlockDiagramCodeAdapter_EdgeRules";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}

		targetComp = new MocaTreeFileComparator(false);
		sourceComp = new BlockDiagramComparator(false);
	}
	
	@Test
	public void testSpec() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/SystemToNode_FWD", "expected/SystemToNode_FWD");
	}
	
	@Test
	public void testBlockToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/BlockToNode_FWD", "expected/BlockToNode_FWD");
	}
	
	@Test
	public void testProvideToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		stop.setMaxRuleCount("ProvideToNodeRule", 1);
		stop.setMaxRuleCount("PortEdgeRule", 1);
		runGenerator(stop);
		assertPostcondition("in/ProvideToNode_FWD", "expected/ProvideToNode_FWD");
	}
	
	@Test
	public void testRequireToNode() throws IOException {
		stop.setMaxRuleCount("SystemToNodeRule", 1);
		stop.setMaxRuleCount("BlockToNodeRule", 1);
		stop.setMaxRuleCount("RequireToNodeRule", 1);
		stop.setMaxRuleCount("PortEdgeRule", 1);
		runGenerator(stop);
		generator.saveModels();
		assertPostcondition("in/RequireToNode_FWD", "expected/RequireToNode_FWD");
	}
	
	
	
	
}
