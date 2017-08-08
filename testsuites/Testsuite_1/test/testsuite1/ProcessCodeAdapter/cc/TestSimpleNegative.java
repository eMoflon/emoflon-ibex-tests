package testsuite1.ProcessCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.processcodeadapter.CC_App;
import org.junit.Test;

import testsuite1.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		generator = new CC_App("ProcessCodeAdapter", testsuite1.testUtil.Constants.workpacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testSystemModuleToModules() throws IOException {
		createGenerator("in/SystemModule_FWD", "expected/Modules_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testModulesToTasks() throws IOException {
		createGenerator("in/Modules_FWD", "expected/Tasks_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testInvocationToSameOtherModule() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationOtherModule_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testInvocationToSameRecursive() throws IOException {
		createGenerator("in/InvocationSameModule_FWD", "expected/InvocationRecursive_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
}