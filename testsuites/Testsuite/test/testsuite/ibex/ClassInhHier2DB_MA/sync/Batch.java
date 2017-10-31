package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.IbexCD2DB_MA;
import testsuite.ibex.testUtil.SyncTestCase;

public class Batch extends SyncTestCase<ClassPackage, DB>{
	
	public final static String projectName = "ClassInhHier2DB_MA";
	
	public Batch() {
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
	public void testPackageToDatabase_FWD()
	{
		// No precondition!
		//------------
		assertPostcondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
	}

	@Test
	public void testClassToTable_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C"));
		//------------
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		//------------
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubClassToTable_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				   .andThen(p -> helperClass.createSubClass(p, "SC1", 0))
			);
		//------------
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}

	// In BWD inheritance relation cannot be recovered for this scenario
	@Test
	public void testSubClassToTable_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C1"))
				.andThen( db -> helperDB.createTable(db, "SC1")));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C"))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a1", null))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a2", null)));
		//------------
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	@Test
	public void testAttributeToColumn_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C"))
				.andThen( db -> helperDB.createColumnInSingleTable(db, "a1"))
				.andThen( db -> helperDB.createColumnInSingleTable(db, "a2")));
		//------------
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0)));
		//------------
		assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_BWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0)));
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createColumnInTable(db, "a1", 0)));
		//------------
		assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", null, 1)));
		//------------
		assertPostcondition("in/SubAttToSubTable_FWD", "expected/SubAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperSuperAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0))
				.andThen( p -> helperClass.createSubClass(p, "SCSC1", 1)));
		//------------
		assertPostcondition("in/SuperSuperClassToSubTable_FWD", "expected/SuperSuperClassToSubTable_FWD");
	}
		
}
