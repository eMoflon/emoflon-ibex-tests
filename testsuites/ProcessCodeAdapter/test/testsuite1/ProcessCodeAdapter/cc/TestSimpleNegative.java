package testsuite1.ProcessCodeAdapter.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
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