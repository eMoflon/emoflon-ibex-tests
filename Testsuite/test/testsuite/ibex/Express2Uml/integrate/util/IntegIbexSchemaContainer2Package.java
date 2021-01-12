package testsuite.ibex.Express2Uml.integrate.util;

import java.io.IOException;

import org.emoflon.express.express.SchemaContainer;
import org.emoflon.ibex.tgg.run.express2uml.INTEGRATE_App;

import testsuite.ibex.Express2Uml.comparison.Express2UMLCorrespondenceComparator;
import testsuite.ibex.Express2Uml.comparison.SchemaContainerComparator;
import testsuite.ibex.Express2Uml.comparison.UMLContainerComparator;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import uml.UMLContainer;

public class IntegIbexSchemaContainer2Package extends IntegIbexAdapter<SchemaContainer, UMLContainer> {

	private final String inputFolder;

	public IntegIbexSchemaContainer2Package(String projectName, String inputFolder) {

		super(new SchemaContainerComparator(), new UMLContainerComparator(), new Express2UMLCorrespondenceComparator(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					inputFolder, ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
