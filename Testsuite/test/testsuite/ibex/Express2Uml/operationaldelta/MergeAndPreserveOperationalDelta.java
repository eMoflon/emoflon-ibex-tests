package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.junit.Test;

import Express2UML.operationaldelta.mergeAndPreserve.MergeAndPreserveConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class MergeAndPreserveOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {
	private static final String PROJECT_NAME = "Express2UML";

	public MergeAndPreserveOperationalDelta() {
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
	public void mergeAndPreserveSourceCreatedTargetDeleted() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = container.getPackage();
			Clazz clazz = pkg.getClazzes().get(0);
			EcoreUtil.delete(clazz);
		});

		final String path = "operationaldelta/expected/merge_and_preserve/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void mergeAndPreserveSourceDeletedTargetCreated() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EcoreUtil.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = container.getPackage();
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		final String path = "operationaldelta/expected/merge_and_preserve/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
}
