package testsuite.ibex.Express2Uml.operationaldelta;

import org.emoflon.express.express.SchemaContainer;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.jupiter.api.Test;

import Express2UML.operationaldelta.preferTarget.PreferTargetConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class PreferTargetOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public PreferTargetOperationalDelta() {
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
	public void preferTargetCreate() {
		tool.getOptions().integration.conflictSolver(new PreferTargetConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EMFManipulationUtils.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		assertCondition("operationaldelta/expected/prefer_target_create/");
	}

	@Test
	public void preferTargetDelete() {
		tool.getOptions().integration.conflictSolver(new PreferTargetConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			EMFManipulationUtils.delete(clazz);
		});

		assertCondition("operationaldelta/expected/prefer_target_delete/");
	}

}
