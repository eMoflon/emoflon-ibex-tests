package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.integrate.deletePreserve.DeletePreserveConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeletePreserveConflict extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflict() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "moflon"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void deletePreserveConflict() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveConflictResolver());
		
		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});
		
		final String path = "integ/expected/delete_preserve_conflict/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
