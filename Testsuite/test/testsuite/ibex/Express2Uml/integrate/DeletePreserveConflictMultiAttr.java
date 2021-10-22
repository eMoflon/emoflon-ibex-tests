package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;

import Express2UML.integrate.deletePreserveMultiAttr.DeletePreserveMultiAttrConflictResolver;
import ExpressModel.Entity;
import ExpressModel.Schema;
import ExpressModel.SchemaContainer;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Package;
import uml.UMLContainer;

public class DeletePreserveConflictMultiAttr extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictMultiAttr() {
		super(new IntegIbexSchemaContainer2Package(PROJECT_NAME, "/resources/integ/in/multi_attr"));
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

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			ExpressHelper.createStringAttribute(entity, "stringAttr");
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			EMFManipulationUtils.delete(pkg.getClazzes().get(0));
		});

		final String path = "integ/expected/delete_preserve_conflict/multi_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
