package testsuite.ibex.Classes2Documents_MA.sync;

import org.benchmarx.classMultipleInheritanceHierarchy.core.ClassMultipleInheritanceHierarchyHelper;
import org.benchmarx.documents.core.DocumentsHelper;
import org.junit.Ignore;
import org.junit.Test;

import Documents.Container;
import classMultipleInheritanceHierarchy.ClassPackage;
import testsuite.ibex.Classes2Documents_MA.sync.util.IbexClass2Doc_MA;
import testsuite.ibex.testUtil.SyncTestCase;


public class SyncBWD extends SyncTestCase<ClassPackage, Container> {
	
	public final static String projectName = "Class2Doc_MA";
	
	public SyncBWD() {
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
	public void testDocToTable()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c1"));
		//------------
		assertPostcondition("in/02_ClassToDoc", "expected/02_ClassToDoc");
	}
	
	@Test
	public void testSubDocToTable()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c2", "c1"));
		//------------
		assertPostcondition("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
	}
	
	@Ignore("Non-deterministing. Update policy needed.")
	@Test
	public void testSubSubDocToTable()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c3"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c2", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c2"));
		
		//------------
		assertPostcondition("in/04_SubSubClassToDoc", "expected/04_SubSubClassToDoc");
	}
	
	/* -----------------DELETE---------------------------- */
	
	// FIXME [Greg]
	@Ignore("Join failed error. Fails even with assertions switched off")
	@Test
	public void testDeleteLastSubDoc()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c3"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c2", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c1"));
		
		tool.performAndPropagateTargetEdit(c -> helperDoc.deleteReference(c, "c3", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.deleteReference(c, "c3", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.deleteDocument(c, "c3"));
		
		//------------
		assertPostcondition("in/03_SubClassToDoc", "expected/03_SubClassToDoc");
	}
	
	public void testDeleteSuperDoc()
	{
		assertPrecondition("in/01_PackageToContainer", "expected/01_PackageToContainer");
		//------------
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createDocument(c, "c3"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c2", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c2"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.createReference(c, "c3", "c1"));
		tool.performAndPropagateTargetEdit(c -> helperDoc.deleteDocument(c, "c2"));
		//delete references to d1???
		//------------
		assertPostcondition("in/02_ClassToDoc", "expected/02_ClassToDoc");
	}

}
