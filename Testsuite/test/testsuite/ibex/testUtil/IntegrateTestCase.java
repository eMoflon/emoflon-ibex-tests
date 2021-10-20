package testsuite.ibex.testUtil;

import java.io.IOException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.After;
import org.junit.Before;

public abstract class IntegrateTestCase<S extends EObject, T extends EObject> extends TestCase {

	private final String resourcePath = getProjectName() + "/resources/";

	protected IntegIbexAdapter<S, T> tool;

	public IntegrateTestCase(IntegIbexAdapter<S, T> tool) {
		this.tool = tool;
	}

	@Before
	public void initialise() {
		// Initialise the bx tool
		tool.ilpSolver = this.ilpSolver;
		tool.initiateIntegrationDialogue();

		// Initialise all helpers
		initHelpers();
	}

	@After
	public void terminate() {
		tool.terminateIntegrationDialogue();
	}

	protected abstract void initHelpers();

	protected abstract String getProjectName();

	@SuppressWarnings("unchecked")
	protected void assertCondition(String folderPathToExpectedModels) {
		try {
			Resource rSrc = tool.getOptions().resourceHandler()
					.loadResource(resourcePath + folderPathToExpectedModels + "src.xmi");
			Resource rTrg = tool.getOptions().resourceHandler()
					.loadResource(resourcePath + folderPathToExpectedModels + "trg.xmi");
			Resource rCorr = tool.getOptions().resourceHandler()
					.loadResource(resourcePath + folderPathToExpectedModels + "corr.xmi");
			EcoreUtil.resolveAll(tool.getResourceSet());

			tool.assertPostcondition((S) rSrc.getContents().get(0), (T) rTrg.getContents().get(0));
			tool.corrComp.assertEquals(rCorr.getContents(), tool.getCorrs());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
