package testsuite.ibex.ClassMultiInhHier2DB_MA.sync;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Ignore;
import org.junit.Test;

import Database.DB;
import classMultipleInheritanceHierarchy.ClassPackage;
import testsuite.ibex.ClassMultiInhHier2DB_MA.sync.util.IbexMultiIhnCD2DB_MA;
import testsuite.ibex.testUtil.SyncTestCase;

public class Batch extends SyncTestCase<ClassPackage, DB>{
	
	public final static String projectName = "ClassMultipleInhHier2DB_MA";
	
	public Batch() {
		super(new IbexMultiIhnCD2DB_MA(projectName));
	}
	
	ClassMultipleInheritanceHierarchyHelper helperClass;
	DatabaseHelper helperDB;
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Override
	protected void initHelpers() {
		helperClass = new ClassMultipleInheritanceHierarchyHelper();
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
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C1"));
		//------------
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		//------------
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	@Ignore
	@Test
	public void testSubClassToTable_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				   .andThen(p -> helperClass.createClass(p, "C2"))
				   .andThen(p -> helperClass.createInheritance(p, 0, 1))
			);
		//------------
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a1", ""))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a2", "")));
		//------------
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				);
		//------------
		assertPostcondition("in/SuperAttToSubTable_FWD", "expected/SuperAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", "", 1))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				);
		//------------
		assertPostcondition("in/SubAttToSubTable_FWD", "expected/SubAttToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperSuperAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createClass(p, "C3"))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				.andThen( p -> helperClass.createInheritance(p, 1, 2))
		);
		//------------
		assertPostcondition("in/SuperSuperClassToSubTable_FWD", "expected/SuperSuperClassToSubTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTwoDiffSuprtAttToSubTable_FWD() {
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", "", 1))
				.andThen( p -> helperClass.createClass(p, "C3"))
				.andThen( p -> helperClass.createInheritance(p, 0, 2))
				.andThen( p -> helperClass.createInheritance(p, 1, 2))
		);
		//------------
		assertPostcondition("in/TwoSuperClassesToSubTable_FWD", "expected/TwoSuperClassesToSubTable_FWD");
	}
	
	
}
