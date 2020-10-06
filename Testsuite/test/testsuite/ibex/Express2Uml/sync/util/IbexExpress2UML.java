package testsuite.ibex.Express2Uml.sync.util;

import java.io.IOException;

import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.SYNC_App;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;

import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.comparison.PackageComparator;
import testsuite.ibex.Express2Uml.comparison.SchemaComparator;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import uml.Package;

public class IbexExpress2UML extends IbexAdapter<Schema, Package> {

	public IbexExpress2UML(String projectName) {
		super(new SchemaComparator(), new PackageComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(
					new IRegistrationHelper[] { new DemoclesRegistrationHelper(), new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					false);
			
			Schema schema = ExpressHelper.createSchema("schema");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(schema);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
