package testsuite.ibex.ProcessCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.processcodeadapter.CC_App;
import org.emoflon.ibex.tgg.run.processcodeadapter.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
		checker = new CC_App("ProcessCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testSystemModule() throws IOException {
		createGenerator("in/SystemModule_FWD", "expected/SystemModule_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testModules() throws IOException {
		createGenerator("in/Modules_FWD", "expected/Modules_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testTasks() throws IOException {
		createGenerator("in/Tasks_FWD", "expected/Tasks_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testImport() throws IOException {
		createGenerator("in/Import_FWD", "expected/Import_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationOtherModule() throws IOException {
		createGenerator("in/InvocationOtherModule_FWD", "expected/InvocationOtherModule_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationSameModule() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationSameModule_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testInvocationRecursive() throws IOException {
		createGenerator("in/InvocationRecursive_FWD", "expected/InvocationRecursive_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
}