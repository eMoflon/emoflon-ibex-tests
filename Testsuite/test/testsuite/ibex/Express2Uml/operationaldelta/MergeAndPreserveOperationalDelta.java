package testsuite.ibex.Express2Uml.operationaldelta;

import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Express2UML.operationaldelta.mergeAndPreserve.MergeAndPreserveConflictResolver;
import Express2UML.operationaldelta.mergeAndPreserveMulti.MergeAndPreserveMultiConflictResolver;
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

@Disabled
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
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			EMFManipulationUtils.delete(clazz);
		});

		assertCondition("operationaldelta/expected/merge_and_preserve/");
	}

	@Test
	public void mergeAndPreserveSourceDeletedTargetCreated() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EMFManipulationUtils.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		assertCondition("operationaldelta/expected/merge_and_preserve/");
	}

	@Test
	public void mergeAndPreserveWithMultipleDeletionsToBeRevoked() {
		tool.getOptions().integration.conflictSolver(new MergeAndPreserveMultiConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = container.getPackages().get(0);
			EMFManipulationUtils.delete(pkg);
		});

		assertCondition("operationaldelta/expected/merge_and_preserve/multi/");
	}

}
