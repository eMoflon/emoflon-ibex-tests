package testsuite1.VHDLTGGCodeAdapter.modelgen;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.vhdlModel.core.VHDLModelComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import MocaTree.File;
import VHDLModel.VHDLSpecification;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<File, VHDLSpecification> {

	public SimpleModelgenTest(Boolean flatten) {
		super(flatten);
	}

	@Override
	protected String getProjectName() {
		return "VHDLTGGCodeAdapter";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite1.testUtil.Constants.workspacePath, flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new MocaTreeFileComparator(false);
		targetComp = new VHDLModelComparator(false);
	}
	
	@Test
	public void testFile2VHDLSpec() throws IOException {
		stop.setMaxRuleCount("File2VHDLSpec", 1);
		runGenerator(stop);
		assertPostcondition("in/File2VHDLSpec_FWD", "expected/File2VHDLSpec_FWD");
	}
	
	@Test
	public void testEntity2CompositeBlock() throws IOException {
		stop.setMaxRuleCount("File2VHDLSpec", 1);
		stop.setMaxRuleCount("Entity2CompositeBlock", 1);
		runGenerator(stop);
		assertPostcondition("in/Entity2CompositeBlock_FWD", "expected/Entity2CompositeBlock_FWD");
	}
}
