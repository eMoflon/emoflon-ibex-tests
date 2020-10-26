package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.integrate.deletePreserveMultiEntity.DeletePreserveMultiEntityConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeletePreserveConflictMultiEntity extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictMultiEntity() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "/resources/integ/in/multi_entity"));
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

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity1 = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity1, "integerAttr");
			Entity entity2 = (Entity) schema.getDeclarations().get(1);
			ExpressHelper.createStringAttribute(entity2, "stringAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(1));
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "integ/expected/delete_preserve_conflict/multi_entity/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
