package testsuite.ibex.Class2TestClass_MA.sync;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.Class2TestClass_MA.sync.util.IbexC2TC_MA;
import testsuite.ibex.testUtil.SyncTestCase;


public class SimpleSync extends SyncTestCase<ClassPackage, DB>{
	
	public final static String projectName = "Class2TestClass_MA";
	
	public SimpleSync() {
		super(new IbexC2TC_MA(projectName));
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
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		//------------
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testThreeClassToTestClass_FWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		//------------
		assertPostcondition("in/03_ThreeClasses", "expected/05_ThreeTestClasses");
	}
	
	@Test
	public void testTestClassToClass_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		//------------
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testAddTestClassWithSameName_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------ 
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		
		//------------
		assertPostcondition("in/02_OneClass", "expected/03_TwoTestClassesWithSameName");
	}
	
	@Test
	public void testAddTestClassWithDifferentName_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c2"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c2"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c3"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c3"));
		//------------
		assertPostcondition("in/03_ThreeClasses", "expected/04_SixTestClasses");
	}
	
	/* ----------------------- DELETION ----------------------------------------- */

	@Test
	public void testDeleteFirstTestClass_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, 0));
		//------------
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testDeleteSecondTestClass_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------ 
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, 1));
		assertPostcondition("in/02_OneClass", "expected/02_OneTestClass");
	}
	
	@Test
	public void testDeleteBothTestClasses_BWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, 1));
		tool.performAndPropagateTargetEdit(db -> helperDB.deleteTable(db, 0));
		//------------
		assertPostcondition("in/02_OneClass", "expected/01_PackageToTestSuite_FWD");
	}
	
	@Test
	public void testDeleteClass_FWD()
	{
		assertPrecondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "c1"));
		//------------
		assertPostcondition("in/01_PackageToTestSuite_FWD", "expected/01_PackageToTestSuite_FWD");
	}
	
}
