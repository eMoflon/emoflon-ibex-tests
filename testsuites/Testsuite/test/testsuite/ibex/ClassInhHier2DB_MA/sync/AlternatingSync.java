package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.SyncTestCaseCD2DB;


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
	
	@Ignore("TODO:  Robrecht? Problems with deletion!")
	@Test
	public void testCreateSubClassDeleteSubTable() {
		createInheritance();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "SC1"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Ignore("TODO:  Robrecht? Problems with deletion!")
	@Test
	public void testCreateSuperClassDeleteSuperTable() {
		createInheritance();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "SC1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "C1"));
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	
}
