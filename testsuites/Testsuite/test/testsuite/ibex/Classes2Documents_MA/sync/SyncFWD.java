package testsuite.ibex.Classes2Documents_MA.sync;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleInheritanceHierarchyHelper;
import org.benchmarx.documents.core.DocumentsHelper;
import org.junit.Ignore;
import org.junit.Test;

import Documents.Container;
import classMultipleInheritanceHierarchy.ClassPackage;
import testsuite.ibex.Classes2Documents_MA.sync.util.IbexClass2Doc_MA;
import testsuite.ibex.testUtil.SyncTestCase;

@Ignore("Until sync is finilized")
public class SyncFWD extends SyncTestCase<ClassPackage, Container> {
	
	public final static String projectName = "Class2Doc_MA";
	
	public SyncFWD() {
		super(new IbexClass2Doc_MA(projectName));
	}
	
	ClassMultipleInheritanceHierarchyHelper helperClass;
	DocumentsHelper helperDoc;
	
	@Override
	protected String getProjectName() {
		return projectName;
	}

	@Override
	protected void initHelpers() {
		helperClass = new ClassMultipleInheritanceHierarchyHelper();
		helperDoc = new DocumentsHelper();
	}
	
	/* -----------------CREATE---------------------------- */
	
	@Test
	public void test_PackageToContainer()
	{
		assertPostcondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
	}

	@Test
	public void testClassToDoc()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		//------------
		assertPostcondition("in/02_ClassToDoc", "expected/02_ClassToDoc");
	}
	
	@Test
	public void testSubClassToSubDoc()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 1));
		//------------
		assertPostcondition("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
	}
	
	@Test
	public void testSubSubClassToSubDoc()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 1));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		//------------
		assertPostcondition("in/04_SubSubClassToDoc", "expected/04_SubSubClassToDoc");
	}
	
	//First create super inheritance, then sub
	@Test
	public void testTwoSuperTwoSubToDoc_V1()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c4"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c5"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 3));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 4));
		//------------
		assertPostcondition("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDoc");
	}
	
	//First create sub inheritance, then super
	@Test
	public void testTwoSuperTwoSubToDoc_V2()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c4"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c5"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 3));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 4));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		//------------
		assertPostcondition("in/06_TwoDifSuperTwoDifSubClassToDoc", "expected/06_TwoDifSuperTwoDifSubClassToDoc");
	}

	
	/* -----------------DELETE---------------------------- */
	
	@Test
	public void testdeleteClass()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "c1"));
		//------------
		assertPostcondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
	}
	
	@Test
	public void testDeleteLastSubClass()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 1));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "c3"));
		//------------
		assertPostcondition("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
	}
	
	// TODO:[Milica] Check with Tony what should happen with c3: automatically or manually deleted?
	@Test
	public void testDeleteSuperClass()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 1));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "c2"));
		//------------
		assertPostcondition("in/02_ClassToDoc", "expected/02_ClassToDoc");
	}
	
	//Check what outcome should be?
	@Test
	public void testdeleteHighestSuperClass()
	{
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c1"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c2"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c3"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 0, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 1, 2));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c4"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createClass(p, "c5"));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 3));
		tool.performAndPropagateSourceEdit(p -> helperClass.createInheritance(p, 2, 4));
		tool.performAndPropagateSourceEdit(p -> helperClass.deleteClass(p, "c1"));
		//------------
		assertPostcondition("", "");
	}
	
	
}