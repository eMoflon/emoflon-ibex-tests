package testsuite1.testUtil;

import org.benchmarx.BXTool;
import org.benchmarx.util.BenchmarxUtil;
import org.eclipse.emf.ecore.EObject;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class SyncTestCase<S extends EObject, T extends EObject> extends TestCase {

	protected BXTool<S, T, Decisions> tool;
	protected BenchmarxUtil<S, T, Decisions> util;
	
	protected SyncTestCase(IbexAdapter<S, T> tool, boolean flatten) {
		super(flatten);
		this.tool = tool;
	}
	
	@Before
	public void initialise() {
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		initHelpers();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}
	
	protected abstract void initHelpers();
}
