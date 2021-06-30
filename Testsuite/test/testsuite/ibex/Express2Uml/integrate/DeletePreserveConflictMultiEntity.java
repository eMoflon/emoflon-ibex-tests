package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.junit.Test;

import Express2UML.integrate.deletePreserveMultiEntity.DeletePreserveMultiEntityConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Package;
import uml.UMLContainer;

public class DeletePreserveConflictMultiEntity extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictMultiEntity() {
		super(new IntegIbexSchemaContainer2Package(PROJECT_NAME, "/resources/integ/in/multi_entity"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void multipleDeletePreserveConflicts() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveMultiEntityConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity1 = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity1, "integerAttr");
			Entity entity2 = (Entity) schema.getDeclarations().get(1);
			ExpressHelper.createStringAttribute(entity2, "stringAttr");
			// trg:
			Package pkg = container.getPackages().get(0);
			EcoreUtil.delete(pkg.getClazzes().get(1));
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		assertCondition("integ/expected/delete_preserve_conflict/multi_entity/");
	}
}
