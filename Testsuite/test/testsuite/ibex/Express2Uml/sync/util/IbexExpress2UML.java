package testsuite.ibex.Express2Uml.sync.util;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.SYNC_App;
import org.emoflon.ibex.tgg.run.express2uml.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;

import ExpressModel.SchemaContainer;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.comparison.SchemaContainerComparator;
import testsuite.ibex.Express2Uml.comparison.UMLContainerComparator;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import uml.UMLContainer;

public class IbexExpress2UML extends IbexAdapter<SchemaContainer, UMLContainer> {

	public IbexExpress2UML(String projectName) {
		super(new SchemaContainerComparator(), new UMLContainerComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(
					new IRegistrationHelper[] { new DemoclesRegistrationHelper(), new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					false);
			
			/*UMLContainer container = UMLHelper.createUMLContainer();
			Package parentPackage = UMLHelper.createPackage(container, "parent");
			Package subpackage = UMLHelper.createSubpackage(parentPackage, "sub");
			Clazz clazz = UMLHelper.createClazz(subpackage, "clazz1");
			UMLHelper.createInteger(clazz, "integerAttr");
			UMLHelper.createString(clazz, "stringAttr");
			synchroniser.getResourceHandler().getTargetResource().getContents().add(container);
			synchroniser.backward();*/
			
			SchemaContainer container = ExpressHelper.createSchemaContainer();
			//Schema schema = ExpressHelper.createSchema(container, "schema");
			//ExpressHelper.createEnumerationType(schema, "enumerationType");
			//ExpressHelper.createFunction(schema, "function");
			//Entity entity = ExpressHelper.createEntity(schema, "entity");
			//ExpressHelper.createSubEntity(schema, entity, "subEntity");
			//Entity entity2 = ExpressHelper.createEntity(schema, "entity2");
			//ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			//ExpressHelper.createStringAttribute(entity, "stringAttr");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(container);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
