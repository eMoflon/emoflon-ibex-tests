package testsuite.ibex.Express2Uml.integrate.util;

import java.io.IOException;

import org.emoflon.express.comparator.SchemaComparator;
import org.emoflon.express.express.Schema;
import org.emoflon.ibex.tgg.run.express2uml.INTEGRATE_App;
import testsuite.ibex.Express2Uml.comparison.PackageComparator;
import testsuite.ibex.Express2Uml.comparison.Schema2PackageComparator;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import uml.Package;

public class IntegIbexSchema2Package extends IntegIbexAdapter<Schema, Package> {

	private final String inputFolder;
	
	public IntegIbexSchema2Package(
			String projectName, String inputFolder) {
		
		super(new SchemaComparator(), new PackageComparator(), new Schema2PackageComparator(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/integ/in/" + inputFolder, ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

}
