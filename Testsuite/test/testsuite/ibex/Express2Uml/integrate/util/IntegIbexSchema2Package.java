package testsuite.ibex.Express2Uml.integrate.util;

import java.io.IOException;

import org.emoflon.express.express.Schema;
import org.emoflon.ibex.tgg.run.express2uml.INTEGRATE_App;

import Express2UML.integrate.solve.SolveConflictResolver;
import testsuite.ibex.Express2Uml.comparison.PackageComparator;
import testsuite.ibex.Express2Uml.comparison.Express2UMLCorrespondenceComparator;
import testsuite.ibex.Express2Uml.comparison.SchemaComparator;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import uml.Package;

public class IntegIbexSchema2Package extends IntegIbexAdapter<Schema, Package> {

	private final String inputFolder;

	public IntegIbexSchema2Package(String projectName, String inputFolder) {

		super(new SchemaComparator(), new PackageComparator(), new Express2UMLCorrespondenceComparator(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/integ/in/" + inputFolder, ilpSolver, false,
					new SolveConflictResolver());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
