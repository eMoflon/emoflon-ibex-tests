package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.junit.Test;

import Express2UML.operationaldelta.revokeAddition.RevokeAdditionConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class RevokeAdditionOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public RevokeAdditionOperationalDelta() {
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
	public void revokeAdditionOnSource() {
		tool.getOptions().integration.conflictSolver(new RevokeAdditionConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			EcoreUtil.delete(entity.getAttributes().get(0));
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = container.getPackages().get(0);
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		assertCondition("operationaldelta/expected/revoke_addition_target/");
	}

	@Test
	public void revokeAdditionOnTarget() {
		tool.getOptions().integration.conflictSolver(new RevokeAdditionConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EcoreUtil.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		assertCondition("operationaldelta/expected/revoke_addition_source/");
	}

}
