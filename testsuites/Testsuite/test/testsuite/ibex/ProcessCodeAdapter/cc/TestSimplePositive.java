package testsuite.ibex.ProcessCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.processcodeadapter.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ProcessCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testSystemModule() throws IOException {
		createGenerator("in/SystemModule_FWD", "expected/SystemModule_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testModules() throws IOException {
		createGenerator("in/Modules_FWD", "expected/Modules_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTasks() throws IOException {
		createGenerator("in/Tasks_FWD", "expected/Tasks_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testImport() throws IOException {
		createGenerator("in/Import_FWD", "expected/Import_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationOtherModule() throws IOException {
		createGenerator("in/InvocationOtherModule_FWD", "expected/InvocationOtherModule_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationSameModule() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationSameModule_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationRecursive() throws IOException {
		createGenerator("in/InvocationRecursive_FWD", "expected/InvocationRecursive_FWD");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}