package testsuite1.ClassInhHier2DB.sync;

import org.benchmarx.BXTool;
import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import testsuite1.ClassInhHier2DB.sync.util.Decisions;
import Database.DB;
import testsuite1.ClassInhHier2DB.sync.util.SyncTestCase;


public class Batch extends SyncTestCase {

	public Batch(BXTool<ClassPackage, DB, Decisions> tool) {
		super(tool);
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
		util.assertPostcondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testClassToTable_FWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClassInh.createClass(p, "C"));
		//------------
		util.assertPostcondition("in/ClassToTable_FWD", "expected/ClassToTable_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testClassToTable_BWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C"));
		//------------
		util.assertPostcondition("expected/ClassToTable_BWD", "in/ClassToTable_BWD");
	}

	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testSubClassToTable_FWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClassInh.createClass(p, "C1"))
				   .andThen(p -> helperClassInh.createSubClass(p, "C2", 0))
			);
		//------------
		util.assertPostcondition("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testSubClassToTable_BWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(db -> helperDB.createTable(db, "C1"));
		//------------
		util.assertPostcondition("expected/SubClassToTable_BWD", "in/SubClassToTable_BWD");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClassInh.createClass(p, "C"))
				   .andThen(p -> helperClassInh.createAttributeInSingleClass(p, "A1", null))
				   .andThen(p -> helperClassInh.createAttributeInSingleClass(p, "A2", null))
			);
		//------------
		util.assertPostcondition("in/AttributeToColumn_FWD", "expected/AttributeToColumn_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAttributeToColumn_BWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "C"))
				   .andThen(db -> helperDB.createColumnInSingleTable(db, "A1"))
				   .andThen(db -> helperDB.createColumnInSingleTable(db, "A2"))
			);
		//------------
		util.assertPostcondition("expected/AttributeToColumn_BWD", "in/AttributeToColumn_BWD");
	}
	
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testAttributeToColumn2_FWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClassInh.createClass(p, "entity1"))
				   .andThen(p -> helperClassInh.createClass(p, "entity2"))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "first", null, 0))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "second", null, 0))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "third", null, 0))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "fourth", null, 1))
			);
		//------------
		util.assertPostcondition("in/AttributeToColumn2_FWD", "expected/AttributeToColumn2_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testAttributeToColumn2_BWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "entity1"))
				   .andThen(db -> helperDB.createTable(db, "entity2"))
				   .andThen(db -> helperDB.createColumnInTable(db, "first", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "second", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "third", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "fourth", 1))
			);
		//------------
		util.assertPostcondition("expected/AttributeToColumn2_BWD", "in/AttributeToColumn2_BWD");
	}
	
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testLargeExample_FWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClassInh.createClass(p, "SuperClass"))
				   .andThen(p -> helperClassInh.createSubClass(p, "SubClass", 0))
				   .andThen(p -> helperClassInh.createClass(p, "Another Super Class"))
				   .andThen(p -> helperClassInh.createSubClass(p, "Another Subclass", 2))
				   .andThen(p -> helperClassInh.createSubClass(p, "Yet another SubClass", 2))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "attr of super class", "int", 0))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "attr of subclass", "string", 1))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "yet another attr of subclass", "int", 1))
				   .andThen(p -> helperClassInh.createAttributeInClass(p, "attr", null, 4))
			);
		//------------
		util.assertPostcondition("in/LargeExample_FWD", "expected/LargeExample_FWD");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testLargeExample_BWD()
	{
		util.assertPrecondition("in/PackageToDatabase_FWD", "expected/PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateTargetEdit(util.execute( (DB db) -> helperDB.createTable(db, "SuperClass"))
				   .andThen(db -> helperDB.createTable(db, "Another Super Class"))
				   .andThen(db -> helperDB.createColumnInTable(db, "attr of super class", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "attr of subclass", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "yet another attr of subclass", 0))
				   .andThen(db -> helperDB.createColumnInTable(db, "attr", 1))
			);
		//------------
		util.assertPostcondition("expected/LargeExample_BWD", "in/LargeExample_BWD");
	}
}
