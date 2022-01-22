package testsuite.ibex.Express2Uml.sync;

import org.junit.Test;

import ExpressModel.Entity;
import ExpressModel.Schema;
import ExpressModel.SchemaContainer;
import testsuite.ibex.Express2Uml.common.ExpressHelper;
import testsuite.ibex.Express2Uml.common.UMLHelper;
import testsuite.ibex.Express2Uml.sync.util.IbexExpress2UML;
import testsuite.ibex.testUtil.SyncTestCase;
import uml.Clazz;
import uml.Package;
import uml.UMLContainer;

public class Basic extends SyncTestCase<SchemaContainer, UMLContainer> {

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
	public void generate() {
		
	}
	
	@Test
	public void Schema2Package_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(container -> {
			ExpressHelper.createSchema(container, "schema");
		});

		assertPostcondition("sync/expected/schema2package/src", "sync/expected/schema2package/trg");
	}
	
	@Test
	public void Schema2Package_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(container -> {
			UMLHelper.createPackage(container, "schema");
		});

		assertPostcondition("sync/expected/schema2package/src", "sync/expected/schema2package/trg");
	}

	@Test
	public void Entity2Clazz_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(container -> {
			Schema schema = ExpressHelper.createSchema(container, "schema");
			ExpressHelper.createEntity(schema, "entity");
		});

		assertPostcondition("sync/expected/entity2class/src", "sync/expected/entity2class/trg");
	}

	@Test
	public void Entity2Clazz_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(container -> {
			Package pkg = UMLHelper.createPackage(container, "schema");
			UMLHelper.createClazz(pkg, "entity");
		});

		assertPostcondition("sync/expected/entity2class/src", "sync/expected/entity2class/trg");
	}

	@Test
	public void Function2SingleMethodClazz_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(container -> {
			Schema schema = ExpressHelper.createSchema(container, "schema");
			ExpressHelper.createFunction(schema, "function");
		});

		assertPostcondition("sync/expected/function2singlemethodclazz/src", "sync/expected/function2singlemethodclazz/trg");
	}
	
	@Test
	public void Function2SingleMethodClazz_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(container -> {
			Package pkg = UMLHelper.createPackage(container, "schema");
			Clazz clazz = UMLHelper.createClazz(pkg, "function");
			UMLHelper.createMethod(clazz, "apply", true);
		});

		assertPostcondition("sync/expected/function2singlemethodclazz/src", "sync/expected/function2singlemethodclazz/trg");
	}
	
	@Test
	public void EnumerationType2Enumeration_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(container -> {
			Schema schema = ExpressHelper.createSchema(container, "schema");
			ExpressHelper.createEnumerationType(schema, "enumerationType");
		});

		assertPostcondition("sync/expected/enumerationtype2enumeration/src", "sync/expected/enumerationtype2enumeration/trg");
	}
	
	@Test
	public void EnumerationType2Enumeration_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(container -> {
			Package pkg = UMLHelper.createPackage(container, "schema");
			UMLHelper.createEnumeration(pkg, "enumeration");
		});

		assertPostcondition("sync/expected/enumerationtype2enumeration/src", "sync/expected/enumerationtype2enumeration/trg");
	}
	
	@Test
	public void IntegerAttribute2Integer_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateSourceEdit(container -> {
			Schema schema = ExpressHelper.createSchema(container, "schema");
			Entity entity = ExpressHelper.createEntity(schema, "entity");
			ExpressHelper.createIntegerAttribute(entity, "integer");
		});
		
		assertPostcondition("sync/expected/integerattribute2integer/src", "sync/expected/integerattribute2integer/trg");
	}
	
	@Test
	public void IntegerAttribute2Integer_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");

		tool.performAndPropagateTargetEdit(container -> {
			Package pkg = UMLHelper.createPackage(container, "schema");
			Clazz clazz = UMLHelper.createClazz(pkg, "entity");
			UMLHelper.createInteger(clazz, "integer");
		});
		
		assertPostcondition("sync/expected/integerattribute2integer/src", "sync/expected/integerattribute2integer/trg");
	}

	
	@Test
	public void SubEntity2SubClazz_FWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");
		
		tool.performAndPropagateSourceEdit(container -> {
			Schema schema = ExpressHelper.createSchema(container, "schema");
			Entity entity = ExpressHelper.createEntity(schema, "entity");
			ExpressHelper.createSubEntity(schema, entity, "subEntity");
		});
		
		assertPostcondition("sync/expected/subentity2subclazz/src", "sync/expected/subentity2subclazz/trg");
	}
	
	@Test
	public void SubEntity2SubClazz_BWD() {
		assertPrecondition("sync/in/src", "sync/in/trg");
		
		tool.performAndPropagateTargetEdit(container -> {
			Package pkg = UMLHelper.createPackage(container, "schema");
			Clazz clazz = UMLHelper.createClazz(pkg, "entity");
			UMLHelper.createSubClazz(pkg, clazz, "subEntity");
		});
		
		assertPostcondition("sync/expected/subentity2subclazz/src", "sync/expected/subentity2subclazz/trg");
	}
}
