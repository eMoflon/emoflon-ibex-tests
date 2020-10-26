package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.operationaldelta.mergeAndPreserve.MergeAndPreserveConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;

public class MergeAndPreserveOperationalDelta extends IntegrateTestCase<Schema, uml.Package> {
	private static final String PROJECT_NAME = "Express2UML";

	public MergeAndPreserveOperationalDelta() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "/resources/operationaldelta/in"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void mergeAndPreserveSourceCreatedTargetDeleted() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "operationaldelta/expected/merge_and_preserve/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void mergeAndPreserveSourceDeletedTargetCreated() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			EcoreUtil.delete(schema.getDeclarations().get(0));
			
			// trg:
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		final String path = "operationaldelta/expected/merge_and_preserve/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
