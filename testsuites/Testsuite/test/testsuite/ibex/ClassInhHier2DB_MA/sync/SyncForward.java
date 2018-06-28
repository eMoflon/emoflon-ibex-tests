package testsuite.ibex.ClassInhHier2DB_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import ClassInheritanceHierarchy.ClassPackage;
import testsuite.ibex.ClassInhHier2DB_MA.sync.util.SyncTestCaseCD2DB;

public class SyncForward extends SyncTestCaseCD2DB{
	
	@Test
	public void testPackageToDatabase_FWD()
	{
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}

	@Test
	public void testClassToTable_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "C1"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testSubClassToTable_FWD()
	{
		createInheritance();
	}
	
	@Test
	public void testAttributeToColumn_FWD()
	{
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a1", null))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a2", null)));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
	}
	
	//Test when first super attribute is created
	@Test
	public void testSuperAttToSubTable_FWD() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0)));
		//------------
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	//Test when first subclass is created
	@Test
	public void testSuperAttToSubTable_FWD2() {
		assertPrecondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
		//------------
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0)));
		//------------
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	@Test
	public void testTwoSubAttToSubTable_FWD() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit(p -> helperClass.createAttributeInClass(p, "a3", null, 1));
		//------------
		assertPostcondition("in/07_OneSuperAtt_TwoSubAtt_FWD", "expected/07_OneSuperAtt_TwoSubAtt_FWD");
	}
	
	@Test
	public void testThreeSuperAttToSubTable_FWD() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a3", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a4", null, 0));
		//------------
		assertPostcondition("in/08_ThreeSuperAtt_OneSubAtt_FWD", "expected/08_ThreeSuperAtt_OneSubAtt_FWD");
	}
	
	@Test
	public void testSuperSuperAttToSubTable_FWD() {
		createInheritance();
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC2", 1));
		//------------
		assertPostcondition("in/09_OneSuperSuperAtt_FWD", "expected/09_OneSuperSuperAtt_FWD");
	}
	
	@Test
	public void testSuperSuperAttToSubTable_FWD2() {
		createInheritance();
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a1", null, 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC2", 1));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a2", null, 1));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a3", null, 2));
		//------------
		assertPostcondition("in/10_OneSuperSuperAtt_OneSuperAtt_OneSubAtt_FWD", "expected/10_OneSuperSuperAtt_OneSuperAtt_OneSubAtt_FWD");
	}
	
	@Test
	public void testSuperSuperAttToSubTable_FWD3() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC2", 0));
		tool.performAndPropagateSourceEdit( p -> helperClass.createAttributeInClass(p, "a3", null, 2));
		//------------
		assertPostcondition("in/12_OneSuperAtt_OneSubAtt_OneSubAtt_FWD", "expected/12_OneSuperAtt_OneSubAtt_OneSubAtt_FWD");
	}
	
	@Test
	public void testLargeModel() {
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInClass(p, "a1", null, 0))
				.andThen( p -> helperClass.createSubClass(p, "SC1", 0))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", null, 1))
				.andThen( p -> helperClass.createAttributeInClass(p, "a2", null, 1))
				.andThen( p -> helperClass.createSubClass(p, "SC2", 0))
				.andThen( p -> helperClass.createAttributeInClass(p, "a3", null, 2))
				.andThen( p -> helperClass.createAttributeInClass(p, "a3", null, 2))
				.andThen( p -> helperClass.createSubClass(p, "SC3_SC2", 2))
				.andThen( p -> helperClass.createAttributeInClass(p, "a4", null, 3))
				.andThen( p -> helperClass.createAttributeInClass(p, "a4", null, 3))
				.andThen( p -> helperClass.createSubClass(p, "SC4_SC1", 1))
				.andThen( p -> helperClass.createAttributeInClass(p, "a5", null, 4))
				.andThen( p -> helperClass.createSubClass(p, "SC5_SC3", 3))
				.andThen( p -> helperClass.createAttributeInClass(p, "a6", null, 5))
				.andThen( p -> helperClass.createSubClass(p, "SC6_SC5", 5))
				.andThen( p -> helperClass.createAttributeInClass(p, "a7", null, 6))
				.andThen( p -> helperClass.createSubClass(p, "SC7_SC6", 6))
				.andThen( p -> helperClass.createAttributeInClass(p, "a7", null, 7))

			);
		//------------
		assertPostcondition("in/13_LargeModel_FWD", "expected/13_LargeModel_FWD");
	}
	
	//-----------TESTING_DELETION----------------
	
	@Test
	public void testDeleteInheritance_FWD()
	{
		createInheritance();
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteInheritance(p, "SC1"));
		assertPostcondition("in/SubClassToTable_BWD", "expected/SubClassToTable_BWD");
	}
	
	@Test
	public void testDeleteClass_FWD()
	{
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1")));
		//------------
		assertPrecondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "C1"));
		//------------
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	@Test
	public void testDeleteSubClass_FWD() {
		createInheritance();
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "SC1"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}

	@Test
	public void testDeleteIntermediateSuperClass_FWD() {
		createInheritance();
		tool.performAndPropagateSourceEdit( p -> helperClass.createSubClass(p, "SC2", 1));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "SC1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "SC2"));
		assertPostcondition("in/02_ClassToTable_FWD", "expected/02_ClassToTable_FWD");
	}
	
	@Test
	public void testDeleteSuperClass_FWD() {
		createInheritance();
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "C1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "SC1"));
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	@Test
	public void testDeleteSubAttribute_FWD() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteAttribute(p, "SC1", "a2"));
		assertPostcondition("in/05_OneSuperAtt_FWD", "expected/05_OneSuperAtt_FWD");
	}
	
	@Test
	public void testDeleteSuperAttribute_FWD() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteAttribute(p, "C1", "a1"));
		assertPostcondition("in/04_SubClassToTable_SuperAttDeletionFWD", "expected/04_SubClassToTable_SuperAttDeletionFWD");
	}
	
	@Ignore("//FIXME[Greg] Passes only if assertions are switched off")
	@Test
	public void testDeleteClassThatHadAttributes_FWD()
	{
		tool.performAndPropagateSourceEdit(util.execute( (ClassPackage p) -> helperClass.createClass(p, "C1"))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a1", null))
				.andThen( p -> helperClass.createAttributeInSingleClass(p, "a2", null)));
		//------------
		assertPostcondition("in/03_AttributeToColumn_FWD", "expected/03_AttributeToColumn_FWD");
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "C1"));
		//------------
		assertPostcondition("in/01_PackageToDatabase_FWD", "expected/01_PackageToDatabase_FWD");
	}
	
	//-----------TESTING_RENAMING----------------
	
	@Test
	public void testRenameSubClass_FWD() {
		createInheritance();
		tool.performAndPropagateSourceEdit(p -> helperClass.renameClass(p, "SC1", "NEW"));
		assertPostcondition("in/04_SubClassToTableRename_FWD", "expected/04_SubClassToTableRename_FWD");
	}
	
	@Ignore("Non-deterministic behavior: https://github.com/eMoflon/emoflon-ibex-tests/issues/86")
	@Test
	public void testRenameAttribute_FWD() {
		createInheritanceWithAttributes();
		tool.performAndPropagateSourceEdit(p -> helperClass.renameAttribute(p, "a1", "new", "C1"));
		assertPostcondition("in/06_OneSuperAtt_OneSubAtt_Rename_FWD", "expected/06_OneSuperAtt_OneSubAtt_Rename_FWD");
	}	
}
