package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Declaration;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.junit.Test;

import Express2UML.operationaldelta.preferSource.PreferSourceConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class PreferSourceOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public PreferSourceOperationalDelta() {
		super(new IntegIbexSchemaContainer2Package(PROJECT_NAME, "/resources/operationaldelta/in"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void preferSourceCreate() {
		tool.getOptions().integration.conflictSolver(new PreferSourceConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EcoreUtil.delete(schema);
			//Entity entity = (Entity) schema.getDeclarations().get(0);
			//entity.getAttributes().get(0).setName("othername");
			//ExpressHelper.createIntegerAttribute(entity, "intAttr");
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			Clazz clazz = UMLHelper.createClazz(pkg, "SomeFunction");
			UMLHelper.createMethod(clazz, "apply", true);
			//EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "operationaldelta/expected/prefer_source_create/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void preferSourceDelete() {
		tool.getOptions().integration.conflictSolver(new PreferSourceConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			EcoreUtil.delete(entity);
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "intAttr");
		});

		final String path = "operationaldelta/expected/prefer_source_delete/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
