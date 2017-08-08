package testsuite1.BlockCodeAdapter.modelgen;

import java.io.IOException;

import org.benchmarx.blockLanguage.core.BlockLanguageComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.blockcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import BlockLanguage.Specification;
import MocaTree.File;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

public class SyncResourcesTest extends ModelGenTestCase<File, Specification> {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
	}

	@Override
	protected String getProjectName() {
		return "BlockCodeAdapter";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite1.testUtil.Constants.workpacePath, flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}

		sourceComp = new MocaTreeFileComparator(false);
		targetComp = new BlockLanguageComparator(false);
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
	// AssertionError mentioned in issue #14
	public void testPort() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		stop.setMaxRuleCount("Node2BlockRule", 1);
		stop.setMaxRuleCount("Node2PortRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Port_FWD", "expected/Port_FWD");
	}
	
	@Test
	// AssertionError mentioned in issue #14
	public void testWireCloseLoop() throws IOException {
		stop.setMaxRuleCount("File2SpecRule", 1);
		stop.setMaxRuleCount("Node2BlockRule", 1);
		stop.setMaxRuleCount("Node2PortRule", 2);
		stop.setMaxRuleCount("Mapping2WireClosedLoopRule", 1);
		runGenerator(stop);
		assertPostcondition("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
	}
}
