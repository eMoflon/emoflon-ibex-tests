package testsuite1.ProcessCodeAdapter.modelgen;

import java.io.IOException;

import org.junit.Test;

public class SyncResourcesTest extends ModelGenTestCase {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
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
	public void testInvocationSameModule() throws IOException {
		stop.setMaxRuleCount("RootToSystemRule", 1);
		stop.setMaxRuleCount("SubFolderToModuleRule", 1);
		stop.setMaxRuleCount("FileToTaskRule", 2);
		stop.setMaxRuleCount("NodeToInvocationRule", 1);
		runGenerator(stop);
		assertPostcondition("in/InvocationSameModule_FWD", "expected/InvocationSameModule_FWD");
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
