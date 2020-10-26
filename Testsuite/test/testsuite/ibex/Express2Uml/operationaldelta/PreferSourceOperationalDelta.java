package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.operationaldelta.preferSource.PreferSourceConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;

public class PreferSourceOperationalDelta extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public PreferSourceOperationalDelta() {
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
	public void preferSourceCreate() {
		tool.getOptions().integration.conflictSolver(new PreferSourceConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "operationaldelta/expected/prefer_source_create/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void preferSourceDelete() {
		tool.getOptions().integration.conflictSolver(new PreferSourceConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			EcoreUtil.delete(schema.getDeclarations().get(0));
			// trg:
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "intAttr");
		});

		final String path = "operationaldelta/expected/prefer_source_delete/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
