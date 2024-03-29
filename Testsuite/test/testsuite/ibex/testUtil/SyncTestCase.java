package testsuite.ibex.testUtil;

import org.benchmarx.util.BenchmarxUtil;
import org.eclipse.emf.ecore.EObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public abstract class SyncTestCase<S extends EObject, T extends EObject> extends TestCase {
	private final String resourcePath = "../../" + getProjectName() + "/resources/";

	protected IbexAdapter<S, T> tool;
	protected BenchmarxUtil<S, T, Decisions> util;
	
	protected SyncTestCase(IbexAdapter<S, T> tool) {
		this.tool = tool;
	}
	
	@BeforeEach
	public void initialise() {
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		
		// Initialise the bx tool
		tool.ilpSolver = this.ilpSolver;
		tool.initiateSynchronisationDialogue();
		
		initHelpers();
	}
	
	protected abstract void initHelpers();
	
	protected abstract String getProjectName();

	@AfterEach
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
