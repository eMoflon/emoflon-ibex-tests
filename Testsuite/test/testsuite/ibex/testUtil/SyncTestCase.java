package testsuite.ibex.testUtil;

import org.benchmarx.util.BenchmarxUtil;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;

public abstract class SyncTestCase<S extends EObject, T extends EObject> extends TestCase {
	private final String resourcePath = "../../../tggs/"+getProjectName()+"/resources/";

	protected IbexAdapter<S, T> tool;
	protected BenchmarxUtil<S, T, Decisions> util;
	
	protected SyncTestCase(IbexAdapter<S, T> tool) {
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
	
	protected abstract String getProjectName();

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}

	protected void assertPrecondition(String source, String target) {
		util.assertPrecondition(tool.getResourceSet(), resourcePath+source, resourcePath+target);
	}
	
	protected void assertPostcondition(String source, String target) {
		util.assertPostcondition(tool.getResourceSet(), resourcePath+source, resourcePath+target);
	}
}
