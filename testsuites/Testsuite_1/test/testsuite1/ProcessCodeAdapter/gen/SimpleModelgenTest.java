package testsuite1.ProcessCodeAdapter.gen;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFolderComparator;
import org.benchmarx.processDefinition.core.ProcessDefinitionComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.processcodeadapter.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import MocaTree.Folder;
import ProcessDefinition.SystemModule;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<Folder, SystemModule> {

	public SimpleModelgenTest(Boolean flatten) {
		super(flatten);
	}
	
	@Override
	protected String getProjectName() {
		return "ProcessCodeAdapter";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite1.testUtil.Constants.workspacePath, flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new MocaTreeFolderComparator(false);
		targetComp = new ProcessDefinitionComparator(false);
	}
	
	@Test
	public void testSystemModule() throws IOException {
		stop.setMaxRuleCount("RootToSystemRule", 1);
		runGenerator(stop);
		assertPostcondition("in/SystemModule_FWD", "expected/SystemModule_FWD");
	}
	
	@Test
	public void testModules() throws IOException {
		stop.setMaxRuleCount("RootToSystemRule", 1);
		stop.setMaxRuleCount("SubFolderToModuleRule", 2);
		runGenerator(stop);
		assertPostcondition("in/Modules_FWD", "expected/Modules_FWD");
	}
	
	@Test
	public void testInvocationRecursive() throws IOException {
		stop.setMaxRuleCount("RootToSystemRule", 1);
		stop.setMaxRuleCount("SubFolderToModuleRule", 1);
		stop.setMaxRuleCount("FileToTaskRule", 1);
		stop.setMaxRuleCount("NodeToInvocationRecursiveRule", 1);
		runGenerator(stop);
		assertPostcondition("in/InvocationRecursive_FWD", "expected/InvocationRecursive_FWD");
	}
}
