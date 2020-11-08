package testsuite.ibex.Express2Uml.operationaldelta.subpackages;

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

public class MergeAndPreserveOperationalDelta extends IntegrateTestCase<SchemaContainer, uml.Package> {
	private static final String PROJECT_NAME = "Express2UML";

	public MergeAndPreserveOperationalDelta() {
		super(new IntegIbexSchemaContainer2Package(PROJECT_NAME, "/resources/operationaldelta/in/subpackages"));
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

		tool.applyAndIntegrateDelta((schemaContainer, pkg) -> {
			// src:
			//Schema schema = schemaContainer.getSchemas().get(1);
			//Entity entity = (Entity) schema.getDeclarations().get(0);
			//ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			//EcoreUtil.delete(pkg.getSubpackages().get(0).getClazzes().get(0));
		});

		final String path = "operationaldelta/expected/merge_and_preserve/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
}
