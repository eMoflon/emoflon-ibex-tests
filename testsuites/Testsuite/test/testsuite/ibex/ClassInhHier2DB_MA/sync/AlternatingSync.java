package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.SyncTestCaseCD2DB;


@Ignore("Waiting for sync to be finished")
public class AlternatingSync extends SyncTestCaseCD2DB{
		
	@Test
	public void testCreateTableThenSubClass() {
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1")));
		tool.performAndPropagateSourceEdit(p -> helperClass.createSubClass(p, "SC1", 0));
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	
	@Test
	public void testAddSubAttributeDeleteColumn() {
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1")));
		tool.performAndPropagateSourceEdit(p -> helperClass.createSubClass(p, "SC1", 0));
		//add attribute
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a2", null, 1));
		//delete column
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteColumnFromTable(db, "a2", "SC1"));
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	@Ignore("Fails. Column a1 still remains in SC1 Table.")
	@Test
	public void testAddSuperAttributeDeleteColumn() {
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1")));
		tool.performAndPropagateSourceEdit(p -> helperClass.createSubClass(p, "SC1", 0));
		//add attribute
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
		//delete column
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteColumnFromTable(db, "a1", "C1"));
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	@Test
	public void testCreateSubClassDeleteSubTable() {
		createInheritance();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "SC1"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Ignore("Fails. Creates some crazy empty corrs.")
	@Test
	public void testCreateSuperClassDeleteSuperTable() {
		createInheritance();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "C1"));
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	
}
