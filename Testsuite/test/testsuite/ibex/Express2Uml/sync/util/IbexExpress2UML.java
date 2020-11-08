package testsuite.ibex.Express2Uml.sync.util;

import java.io.IOException;

import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.SYNC_App;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;

import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.comparison.PackageComparator;
import testsuite.ibex.Express2Uml.comparison.SchemaContainerComparator;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import uml.Clazz;
import uml.Package;

public class IbexExpress2UML extends IbexAdapter<SchemaContainer, Package> {

	public IbexExpress2UML(String projectName) {
		super(new SchemaContainerComparator(), new PackageComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(
					new IRegistrationHelper[] { new DemoclesRegistrationHelper(), new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					false);
			
			Package parentPackage = UMLHelper.createPackage("parent");
			Package subpackage = UMLHelper.createSubpackage(parentPackage, "sub");
			Clazz clazz = UMLHelper.createClazz(subpackage, "clazz1");
			UMLHelper.createInteger(clazz, "integerAttr");
			UMLHelper.createString(clazz, "stringAttr");
			synchroniser.getResourceHandler().getTargetResource().getContents().add(parentPackage);
			synchroniser.backward();
			
			/*SchemaContainer container = ExpressHelper.createSchemaContainer();
			Schema schema = ExpressHelper.createSchema(container, "schema");
			Entity entity = ExpressHelper.createEntity(schema, "entity");
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(container);
			synchroniser.forward();*/
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
