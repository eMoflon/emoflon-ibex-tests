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
	public void test01_PackageToDatabase_FWD()
	{
		// No precondition!
		//------------
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}

	@Test
	public void testClassToTable_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C1"));
		//------------
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		//------------
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubClassToTable_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				   .andThen(p -> helperClass.createClass(p, "C2"))
				   .andThen(p -> helperClass.createInheritance(p, 0, 1))
			);
		//------------
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a1", ""))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a2", "")));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				);
		//------------
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", "", 1))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				);
		//------------
		assertPostcondition("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperSuperAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", "", 0))
				.andThen( p -> helperClass.createClass(p, "C2"))
				.andThen( p -> helperClass.createClass(p, "C3"))
				.andThen( p -> helperClass.createInheritance(p, 0, 1))
				.andThen( p -> helperClass.createInheritance(p, 1, 2))
		);
		//------------
		assertPostcondition("in/07_OneSuperSuperAtt_FWD", "expected/07_OneSuperSuperAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testTwoDiffSuprtAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
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
		assertPostcondition("in/10_TwoSuperClassesToSubTable_FWD", "expected/10_TwoSuperClassesToSubTable_FWD");
	}
	
	
}
