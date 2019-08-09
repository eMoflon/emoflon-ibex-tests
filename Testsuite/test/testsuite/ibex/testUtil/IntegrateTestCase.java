package testsuite.ibex.testUtil;

import org.benchmarx.util.BenchmarxUtil;
import org.eclipse.emf.ecore.EObject;
import org.junit.After;
import org.junit.Before;

public abstract class IntegrateTestCase<S extends EObject, T extends EObject> extends TestCase {

	private final String resourcePath = "../../" + getProjectName() + "/resources/";

	protected IntegIbexAdapter<S, T> tool;
	protected BenchmarxUtil<S, T, Decisions> util;

	public IntegrateTestCase(IntegIbexAdapter<S, T> tool) {
		this.tool = tool;
	}

	@Before
	public void initialise() {
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		initHelpers();

		// Initialise the bx tool
		tool.initiateIntegrationDialogue();
	}

	@After
	public void terminate() {
		tool.terminateIntegrationDialogue();
	}

	protected abstract void initHelpers();

	protected abstract String getProjectName();

	protected void assertPrecondition(String source, String target) {
		util.assertPrecondition(tool.getResourceSet(), resourcePath + source, resourcePath + target);
	}

	protected void assertPostcondition(String source, String target) {
		util.assertPostcondition(tool.getResourceSet(), resourcePath + source, resourcePath + target);
	}

	protected void assertCondition(String src, String trg, String corr) {
		util.assertPostcondition(tool.getResourceSet(), resourcePath + src, resourcePath + trg);
//		tool.assertConditionCorr(resourcePath + corr);
	}

}
