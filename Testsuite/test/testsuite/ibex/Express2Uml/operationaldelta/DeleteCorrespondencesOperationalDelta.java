package testsuite.ibex.Express2Uml.operationaldelta;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Schema;
import org.emoflon.express.express.SchemaContainer;
import org.junit.Test;

import Express2UML.operationaldelta.deleteCorrespondences.DeleteCorrespondencesConflictResolver;
import Express2UML.operationaldelta.revokeDeletion.RevokeDeletionConflictResolver;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchemaContainer2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class DeleteCorrespondencesOperationalDelta extends IntegrateTestCase<SchemaContainer, UMLContainer> {

	private static final String PROJECT_NAME = "Express2UML";

	public DeleteCorrespondencesOperationalDelta() {
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
	public void deleteCorrespondencesDeleteOnSrc() {
		tool.getOptions().integration.conflictSolver(new DeleteCorrespondencesConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EcoreUtil.delete(schema);
			// trg:
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		});

		final String path = "operationaldelta/expected/revoke_deletion_target/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void revokeDeletionOnSource() {
		tool.getOptions().integration.conflictSolver(new RevokeDeletionConflictResolver());

		tool.applyAndIntegrateDelta((schemaContainer, container) -> {
			// src:
			Schema schema = schemaContainer.getSchemas().get(0);
			EcoreUtil.delete(schema.getDeclarations().get(0));
			// trg:
			Package pkg = container.getPackages().get(0);
			Clazz clazz = pkg.getClazzes().get(0);
			UMLHelper.createInteger(clazz, "integerAttr");
		}); 

		final String path = "operationaldelta/expected/revoke_deletion_source/";
		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
