package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.integrate.deletePreserveSingleAttr.DeletePreserveSingleAttrConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeletePreserveConflictSingleAttr extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictSingleAttr() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "/resources/integ/in/single_attr"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void createdIntegerTypeAttributeDeletedClazz() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveSingleAttrConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "integ/expected/delete_preserve_conflict/single_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void deletedEntityCreatedIntegerAttribute() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveSingleAttrConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			EcoreUtil.delete(schema.getDeclarations().get(0));
			// trg:
			UMLHelper.createInteger(pkg.getClazzes().get(0), "integerAttr");
		});

		final String path = "integ/expected/delete_preserve_conflict/single_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
