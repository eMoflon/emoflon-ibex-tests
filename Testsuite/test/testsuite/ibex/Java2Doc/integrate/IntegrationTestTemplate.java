package testsuite.ibex.Java2Doc.integrate;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

/**
 * @author AdrianM
 */
public class IntegrationTestTemplate extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public IntegrationTestTemplate() {
		// second constructor parameter is the input model folder located in '/integ/in/'
		// for different input models use different test classes
		super(new IntegIbexJava2Doc(projectName, "myInputModelFolder"));
	}

	@Override
	protected void initHelpers() {
		helperJava = new SimpleJavaHelper();
		helperDoc = new SimpleDocHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Test
	public void myFirstTestCase() {
		// group your expected models in a folder, e.g. 'myTestClass'
		// for each test case put your model files in a folder, e.g. 'myFirstTestCase'
		final String pathToExpectedModel = "integ/expected/myTestClass/myFirstTestCase/";

		tool.getOptions().integration.conflictSolver(conflictContainer -> {
			// my CRS stuff
		});
		tool.applyAndIntegrateDelta((p, f) -> {
			// my source & target model changes
			// to get & create elements use helpers above
			// for deletion use EcoreUtil.delete(myEObjectToBeDeleted, true)
		});

		assertCondition(pathToExpectedModel + "src", pathToExpectedModel + "trg", pathToExpectedModel + "corr");
	}

}
