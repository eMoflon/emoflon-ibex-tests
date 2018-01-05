package testsuite.ibex.Class2TestClass_MA.sync;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.IbexCD2DB_MA;
import testsuite.ibex.testUtil.SyncTestCase;

@Ignore("Fails due to not implemented logic for sync complement rules.")
public class SimpleSync extends SyncTestCase<ClassPackage, DB>{
	
	public final static String projectName = "Class2TestClass_MA";
	
	public SimpleSync() {
		super(new IbexCD2DB_MA(projectName));
	}
	
	ClassInheritanceHierarchyHelper helperClass;
	DatabaseHelper helperDB;
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Override
	protected void initHelpers() {
		helperClass = new ClassInheritanceHierarchyHelper();
		helperDB = new DatabaseHelper();
	}

	@Test
	public void test_PackageToTestSuiteFWD()
	{
		assertPostcondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
	}

	@Test
	public void testClassToTestClass_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		//------------
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testTestClassToClass_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//------------
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testAddAdditionalTestClass_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//------------
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}

	@Test
	public void testDeleteFirstTestClass_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//tool.performAndPropagateTargetEdit(db -> helperDB.delete(db, "c1", 0));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testDeleteSecondTestClass_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//tool.performAndPropagateTargetEdit(db -> helperDB.delete(db, "c1", 1));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testDeleteBothTestClasses_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//tool.performAndPropagateTargetEdit(db -> helperDB.delete(db, "c1", 1));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testDeleteClass_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass);
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
		
}
