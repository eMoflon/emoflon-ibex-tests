package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.IbexCD2DB_MA;
import testsuite.ibex.testUtil.SyncTestCase;

public class AlignmentBased extends SyncTestCase<ClassPackage, DB>{
		
	public final static String projectName = "ClassInhHier2DB_MA";
		
	ClassInheritanceHierarchyHelper helperClass;
	DatabaseHelper helperDB;
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	public AlignmentBased() {
		super(new IbexCD2DB_MA(projectName));	
	}

	@Override
	protected void initHelpers() {
		helperClass = new ClassInheritanceHierarchyHelper();
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
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C"));
		//------------
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		//------------
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubClassToTable_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createSubClass(p, "SC1", 0));
			
		//------------
		assertPostcondition("in/04_SubClassToTable_FWD", "expected/04_SubClassToTable_FWD");
	}

	@Ignore ("In BWD inheritance relation cannot be recovered for this scenario.")
	@Test
	public void testSubClassToTable_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "SC1"));
		//------------
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createAttributeInSingleClass(p, "a1", null));
		tool.performAndPropagateSourceEdit(p -> helperClass.createAttributeInSingleClass(p, "a2", null));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	@Test
	public void testAttributeToColumn_BWD()
	{
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInSingleTable(db, "a1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInSingleTable(db, "a2"));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit (p -> helperClass.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC1", 0));
		//------------
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperAttToSubTable_BWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit (p -> helperClass.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC1", 0));
		tool.performAndPropagateTargetEdit( db -> helperDB.createColumnInTable(db, "a1", 0));
		//------------
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSubAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit( p -> helperClass.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC1", 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a2", null, 1));
		//------------
		assertPostcondition("in/06_OneSuperAtt_OneSubAtt_FWD", "expected/06_OneSuperAtt_OneSubAtt_FWD");
	}
	
	@Ignore ("Fails due to not implemented logic for complement rules.")
	@Test
	public void testSuperSuperAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit( p -> helperClass.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC1", 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC2", 1));
		//------------
		assertPostcondition("in/09_OneSuperSuperAtt_FWD", "expected/09_OneSuperSuperAtt_FWD");
	}
		
}
