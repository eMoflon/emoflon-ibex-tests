package testsuite.ibex.ProcessCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.processcodeadapter.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ProcessCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testSystemModuleToModules() throws IOException {
		createGenerator("in/SystemModule_FWD", "expected/Modules_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testModulesToTasks() throws IOException {
		createGenerator("in/Modules_FWD", "expected/Tasks_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationToSameOtherModule() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationOtherModule_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationToSameRecursive() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationRecursive_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
}