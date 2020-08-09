package testsuite.ibex.Express2Uml.sync.util;

import java.io.IOException;

import org.emoflon.express.comparator.SchemaComparator;
import org.emoflon.express.express.Schema;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.SYNC_App;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;

import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.comparison.PackageComparator;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import uml.Package;

public class IbexExpress2Uml extends IbexAdapter<Schema, Package> {

	public IbexExpress2Uml(String projectName) {
		super(new SchemaComparator(), new PackageComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Schema schema = ExpressHelper.createSchema("MOFLON_SCHEMA");
			ExpressHelper.createEntity(schema, "MOFLON_ENTITY");
			
			synchroniser.getResourceHandler().getSourceResource().getContents().add(schema);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
