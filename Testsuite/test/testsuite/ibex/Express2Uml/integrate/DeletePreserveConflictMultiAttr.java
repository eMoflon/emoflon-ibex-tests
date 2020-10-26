package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import Express2UML.integrate.deletePreserveMultiAttr.DeletePreserveMultiAttrConflictResolver;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeletePreserveConflictMultiAttr extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictMultiAttr() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "/resources/integ/in/multi_attr"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void createdIntegerTypeAttributeAndStringTypeAttributeDeletedClazz() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveMultiAttrConflictResolver());

		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			ExpressHelper.createStringAttribute(entity, "stringAttr");
			// trg:
			EcoreUtil.delete(pkg.getClazzes().get(0));
		});

		final String path = "integ/expected/delete_preserve_conflict/multi_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
