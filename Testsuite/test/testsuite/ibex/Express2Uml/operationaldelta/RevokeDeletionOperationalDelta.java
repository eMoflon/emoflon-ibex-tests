package testsuite.ibex.Express2Uml.operationaldelta;

import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;

import Express2UML.operationaldelta.revokeDeletion.RevokeDeletionConflictResolver;
import ExpressModel.Entity;
import ExpressModel.Schema;
import ExpressModel.SchemaContainer;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class RevokeDeletionOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public RevokeDeletionOperationalDelta() {
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
	public void revokeDeletionOnTarget() {
		tool.getOptions().integration.conflictSolver(new RevokeDeletionConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = container.getPackages().get(0);
			EMFManipulationUtils.delete(pkg.getClazzes().get(0));
		});

		final String path = "operationaldelta/expected/revoke_deletion_target/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void revokeDeletionOnSource() {
		tool.getOptions().integration.conflictSolver(new RevokeDeletionConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EMFManipulationUtils.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		}); 

		final String path = "operationaldelta/expected/revoke_deletion_source/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
