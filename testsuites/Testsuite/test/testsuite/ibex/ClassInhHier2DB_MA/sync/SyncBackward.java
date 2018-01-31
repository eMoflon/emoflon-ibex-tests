package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.SyncTestCaseCD2DB;


public class SyncBackward extends SyncTestCaseCD2DB{
	
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		//------------
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}

	@Test
	public void testSubClassToTable_BWD()
	{
		createTables();
	}
	
	@Test
	public void testSubClassToTable_BWD2()
	{
		createTablesWithColumns();

	}
	
	@Test
	public void testAttributeToColumn_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1"))
				.andThen( db -> helperDB.createColumnInSingleTable(db, "a1"))
				.andThen( db -> helperDB.createColumnInSingleTable(db, "a2")));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	//-----------TESTING_DELETION----------------
	
	@Ignore("Works only when assertions are switched off")
	@Test
	public void testDeleteTableThatIsSubClass_BWD() {
		createTables();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "SC1"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Ignore("Works only when assertions are switched off")
	@Test
	public void testDeleteTableThatIsSuperClass_BWD() {
		createTables();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "C1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, "SC1"));
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	
	@Ignore("Works only when assertions are switched off")
	@Test
	public void testDeleteColumn_BWD() {
		createTablesWithColumns();
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteColumnFromTable(db, "a2", "SC1"));
		assertPostcondition("in/SubClassToTableColDeletion_BWD", "expected/SubClassToTableColDeletion_BWD");
		
	}
	
	//-----------TESTING_RENAMING----------------
	
	@Ignore("Works only when assertions are switched off")
	@Test
	public void testRenameTable_BWD() {
		createTables();
		tool.performAndPropagateTargetEdit(db -> helperDB.renameTable(db, "SC1", "NEW"));
		assertPostcondition("in/SubClassToTable_Rename_BWD", "expected/SubClassToTable_Rename_BWD");
	}
	
	@Ignore("Works only when assertions are switched off")
	@Test
	public void testRenameColumn_BWD() {
		createTablesWithColumns();
		tool.performAndPropagateTargetEdit(db -> helperDB.renameColumnFromTable(db, "a2", "new", "SC1"));
		assertPostcondition("in/SubClassToTableAttDeletion_BWD", "expected/SubClassToTableAttDeletion_BWD");
		
	}
	
		
}
