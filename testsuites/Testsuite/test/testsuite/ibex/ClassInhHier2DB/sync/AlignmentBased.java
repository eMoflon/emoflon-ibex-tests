package testsuite.ibex.ClassInhHier2DB.sync;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassInheritanceHierarchyFactory;
import ClassInheritanceHierarchy.ClassPackage;
import ClassInheritanceHierarchy.Clazz;
import Database.DB;
import testsuite.ibex.ClassInhHier2DB.sync.util.IbexClassInhHier2DB;
import testsuite.ibex.testUtil.SyncTestCase;

public class AlignmentBased extends SyncTestCase<ClassPackage, DB> {
	public final static String projectName = "ClassInhHier2DB";
	
	ClassInheritanceHierarchyHelper helperClassInh;
	DatabaseHelper helperDB;

	public AlignmentBased(boolean flatten) {
		super(new IbexClassInhHier2DB(flatten, projectName), flatten);
	}
	
	@Override
	protected void initHelpers() {
		helperClassInh = new ClassInheritanceHierarchyHelper();
		helperDB = new DatabaseHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testPackageToDatabase_FWD()
	{
		// No precondition!
		//------------
		//------------
		assertPostcondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testClassToTable_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C"));
		//------------
		assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testClassToTable_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		//------------
		assertPostcondition("expected/ClassToTable_BWD", "in/ClassToTable_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testSubClassToTable_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C1"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createSubClass(p, "C2", 0));
			
		//------------
		assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testSubClassToTable_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		//------------
		assertPostcondition("expected/SubClassToTable_BWD", "in/SubClassToTable_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInSingleClass(p, "A1", null));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInSingleClass(p, "A2", null));
		//------------
		assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAttributeToColumn_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInSingleTable(db, "A1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInSingleTable(db, "A2"));
		//------------
		assertPostcondition("expected/AttributeToColumn_BWD", "in/AttributeToColumn_BWD");
	}
	
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testAttributeToColumn2_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "entity1"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "entity2"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "first", null, 0));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "second", null, 0));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "third", null, 0));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "fourth", null, 1));	
		//------------
		assertPostcondition("in/AttributeToColumn2_FWD", "expected/AttributeToColumn2_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAttributeToColumn2_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "entity1"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "entity2"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "first", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "second", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "third", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "fourth", 1));			
		//------------
		assertPostcondition("expected/AttributeToColumn2_BWD", "in/AttributeToColumn2_BWD");
	}
	
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testLargeExample_FWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "SuperClass"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createSubClass(p, "SubClass", 0));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "Another Super Class"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createSubClass(p, "Another Subclass", 2));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createSubClass(p, "Yet another SubClass", 2));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "attr of super class", "int", 0));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "attr of subclass", "string", 1));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "yet another attr of subclass", "int", 1));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInClass(p, "attr", null, 4));			
		//------------
		assertPostcondition("in/LargeExample_FWD", "expected/LargeExample_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testLargeExample_BWD()
	{
		assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "SuperClass"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "Another Super Class"));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "attr of super class", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "attr of subclass", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "yet another attr of subclass", 0));
		tool.performAndPropagateTargetEdit(db -> helperDB.createColumnInTable(db, "attr", 1));
		//------------
		assertPostcondition("expected/LargeExample_BWD", "in/LargeExample_BWD");
	}
	
	@Test
	public void changeContainer() {
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C"));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInSingleClass(p, "A1", null));
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createAttributeInSingleClass(p, "A2", null));
		//------------
		assertPrecondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
		
		tool.performAndPropagateSourceEdit(p -> {
			Clazz old = p.getClasses().get(0);
			Clazz c = ClassInheritanceHierarchyFactory.eINSTANCE.createClazz();
			c.setName("Foo");
			p.getClasses().add(c);
			c.getAttributes().addAll(old.getAttributes());
		});
		
		assertPostcondition("expected/MovedAttributes", "expected/MovedCols");
	}
}
