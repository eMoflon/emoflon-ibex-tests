package testsuite.ibex.Express2Uml.integrate;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import testsuite.ibex.Express2Uml.common.GenericHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.integrate.util.IntegIbexSchema2Package;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Delete extends IntegrateTestCase<Schema, uml.Package> {

	private static final String PROJECT_NAME = "Express2Uml";

	public Delete() {
		super(new IntegIbexSchema2Package(PROJECT_NAME, "moflon"));
	}

	@Override
	protected void initHelpers() {
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}
	
	@Test
	public void del_simple(){
		final String path = "integ/expected/del/del_single/";
		
		tool.applyAndIntegrateDelta((schema, pkg) -> {
			// src:
			Entity entity = GenericHelper.getElement(() -> schema.getDeclarations(), decl -> decl instanceof Entity, e -> e.getName().equals("MOFLON_ENTITY"));
			EcoreUtil.delete(entity, true);
			// trg:
			UMLHelper.createClazz(pkg, "MoflonClass");
		});
		
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
