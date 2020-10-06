package testsuite.ibex.Express2Uml.sync;

import org.emoflon.express.express.Entity;
import org.emoflon.express.express.Schema;
import org.junit.Test;

import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.sync.util.IbexExpress2UML;
import testsuite.ibex.testUtil.SyncTestCase;
import uml.Clazz;
import uml.Package;

public class Basic extends SyncTestCase<Schema, Package> {

	private static final String PROJECT_NAME = "Express2UML";

	public Basic() {
		super(new IbexExpress2UML(PROJECT_NAME));
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Override
	protected void initHelpers() {

	}

	@Test
	public void Entity2Clazz_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(schema -> {
			ExpressHelper.createEntity(schema, "entity");
		});

		assertPostcondition("sync/expected/entity2class/src_fwd", "sync/expected/entity2class/trg_fwd");
	}

	@Test
	public void Entity2Clazz_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(pkg -> {
			UMLHelper.createClazz(pkg, "clazz");
		});

		assertPostcondition("sync/expected/entity2class/src_bwd", "sync/expected/entity2class/trg_bwd");
	}

	@Test
	public void Function2SingleMethodClazz_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(schema -> {
			ExpressHelper.createFunction(schema, "function");
		});

		assertPostcondition("sync/expected/function2singlemethodclazz/src_fwd", "sync/expected/function2singlemethodclazz/trg_fwd");
	}
	
	@Test
	public void Function2SingleMethodClazz_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(pkg -> {
			Clazz clazz = UMLHelper.createClazz(pkg, "singleMethodClazz");
			UMLHelper.createMethod(clazz, "apply", true);
		});

		assertPostcondition("sync/expected/function2singlemethodclazz/src_bwd", "sync/expected/function2singlemethodclazz/trg_bwd");
	}
	
	@Test
	public void EnumerationType2Enumeration_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(schema -> {
			ExpressHelper.createEnumerationType(schema, "enumerationType");
		});

		assertPostcondition("sync/expected/enumerationtype2enumeration/src_bwd", "sync/expected/enumerationtype2enumeration/trg_bwd");
	}
	
	@Test
	public void EnumerationType2Enumeration_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(pkg -> {
			UMLHelper.createEnumeration(pkg, "enumeration");
		});

		assertPostcondition("sync/expected/enumerationtype2enumeration/src_bwd", "sync/expected/enumerationtype2enumeration/trg_bwd");
	}
	
	@Test
	public void IntegerAttribute2Integer_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(schema -> {
			Entity entity = ExpressHelper.createEntity(schema, "entity");
			ExpressHelper.createIntegerAttribute(entity, "integer");
		});
		
		assertPostcondition("sync/expected/integerattribute2integer/src", "sync/expected/integerattribute2integer/trg");
	}
	
	@Test
	public void IntegerAttribute2Integer_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(pkg -> {
			Clazz clazz = UMLHelper.createClazz(pkg, "entity");
			UMLHelper.createInteger(clazz, "integer");
		});
		
		assertPostcondition("sync/expected/integerattribute2integer/src", "sync/expected/integerattribute2integer/trg");
	}

}
