package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;

import Express2UML.integrate.deletePreserveSingleAttr.DeletePreserveSingleAttrConflictResolver;
import ExpressModel.Entity;
import ExpressModel.Schema;
import ExpressModel.SchemaContainer;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Package;
import uml.UMLContainer;

public class DeletePreserveConflictSingleAttr extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeletePreserveConflictSingleAttr() {
		super(new IntegIbexSchemaContainer2Package(PROJECT_NAME, "/resources/integ/in/single_attr"));
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
		
		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			Entity entity = (Entity) schema.getDeclarations().get(0);
			ExpressHelper.createIntegerAttribute(entity, "integerAttr");
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			EMFManipulationUtils.delete(pkg.getClazzes().get(0));
		});

		final String path = "integ/expected/delete_preserve_conflict/single_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void deletedEntityCreatedIntegerAttribute() {
		tool.getOptions().integration.conflictSolver(new DeletePreserveSingleAttrConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, umlContainer) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EMFManipulationUtils.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = umlContainer.getPackages().get(0);
			UMLHelper.createInteger(pkg.getClazzes().get(0), "integerAttr");
		});

		final String path = "integ/expected/delete_preserve_conflict/single_attr/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
