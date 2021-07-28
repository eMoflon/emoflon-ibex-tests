package testsuite.ibex.Java2Doc.sync;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.Test;

import simpleDoc.Doc;
import simpleDoc.Folder;
import simpleDoc.SimpleDocFactory;
import simpleJava.Package;
import simpleJava.SimpleJavaFactory;
import testsuite.ibex.Java2Doc.sync.util.IbexJava2Doc;
import testsuite.ibex.testUtil.SyncTestCase;

public class RepairTestShortcut extends SyncTestCase<Package, Folder>{
	
	private SimpleJavaHelper helperJava;
	private SimpleDocHelper helperDoc;
	
	public RepairTestShortcut() {
		super(new IbexJava2Doc(projectName));
	}

	private static final String projectName = "Java2Doc";

	@Override
	protected void initHelpers() {
		helperJava = new SimpleJavaHelper();
		helperDoc = new SimpleDocHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void testInit()
	{
		//------------
		assertPostcondition("in/init", "expected/init");
	}
	
	@Test
	public void testMoflon_FWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		assertPostcondition("in/moflon_FWD", "expected/moflon_FWD");
	}
	
	@Test
	public void testMoflon_BWD()
	{
		assertPrecondition("in/init", "expected/init");
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		assertPostcondition("expected/moflon_BWD", "in/moflon_BWD");
	}
	
	@Test
	public void testMoflon_insertSub_FWD()
	{
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package es = helperJava.getPackage(p, "es");
			Package cmoflon = helperJava.getPackage(p, "cmoflon");
			Package emoflon = helperJava.getPackage(p, "emoflon");
			Package moflon = helperJava.createPackage(es, "moflon");
			
			moflon.getSubPackages().add(cmoflon);
			moflon.getSubPackages().add(emoflon);
		});
		assertPostcondition("in/moflon_insertSub_FWD", "expected/moflon_insertSub_FWD");
	}
	
	@Test
	public void testMoflon_insertSub_BWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder es = helperDoc.getFolder(f, "es");
			Folder cmoflon = helperDoc.getFolder(f, "cmoflon");
			Folder emoflon = helperDoc.getFolder(f, "emoflon");
			Folder moflon = helperDoc.createFolder(es, "moflon");
			helperDoc.createDoc(moflon, "moflon_doc", "moflonDoc");
			
			moflon.getSubFolders().add(cmoflon);
			moflon.getSubFolders().add(emoflon);
		});
		assertPostcondition("expected/moflon_insertSub_BWD", "in/moflon_insertSub_BWD");
	}
	
	@Test
	public void testMoflon_deleteMidSub_FWD() {
		tool.performAndPropagateTargetEdit(helperDoc::createMoflon);
		tool.performAndPropagateSourceEdit(helperJava::fillBodies);
		//------------
		tool.performIdleSourceEdit(p -> {
			Package es = helperJava.getPackage(p, "es");
			Package emoflon = helperJava.getPackage(p, "emoflon");
			Package ibex = helperJava.getPackage(p, "ibex");
			
			es.getSubPackages().add(ibex);
			EMFManipulationUtils.delete(emoflon, true);
		});
		assertPostcondition("in/moflon_deleteMidSub_FWD", "expected/moflon_deleteMidSub_FWD");
	}
	
	@Test
	public void testMoflon_deleteMidSub_BWD() {
		tool.performAndPropagateTargetEdit(helperDoc::createMoflon);
		tool.performAndPropagateSourceEdit(helperJava::fillBodies);
		//------------
		tool.performAndPropagateTargetEdit(f -> {
			Folder es = helperDoc.getFolder(f, "es");
			Folder emoflon = helperDoc.getFolder(f, "emoflon");
			Folder ibex = helperDoc.getFolder(f, "ibex");
			
			es.getSubFolders().add(ibex);
			EMFManipulationUtils.delete(emoflon, true);
		});
		assertPostcondition("expected/moflon_deleteMidSub_BWD", "in/moflon_deleteMidSub_BWD");
	}
	
	@Test
	public void testMoflon_deleteAndMoveSubs_FWD()
	{
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package cmoflon = helperJava.getPackage(p, "cmoflon");
			Package emoflon = helperJava.getPackage(p, "emoflon");
			
			EMFManipulationUtils.delete(emoflon, true);
			p.getSubPackages().add(cmoflon);
		});
		assertPostcondition("in/moflon_deleteAndMoveSubs_FWD", "expected/moflon_deleteAndMoveSubs_FWD");
	}
	
	@Test
	public void testMoflon_deleteAndMoveSubs_BWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder cmoflon = helperDoc.getFolder(f, "cmoflon");
			Folder emoflon = helperDoc.getFolder(f, "emoflon");
			
			EMFManipulationUtils.delete(emoflon, true);
			f.getSubFolders().add(cmoflon);
		});
		assertPostcondition("expected/moflon_deleteAndMoveSubs_BWD", "in/moflon_deleteAndMoveSubs_BWD");
	}
	
	@Test
	public void testMoflon_deleteSubEdge_FWD()
	{
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package cmoflon = helperJava.getPackage(p, "cmoflon");
			Package emoflon = helperJava.getPackage(p, "emoflon");
			
			p.getSubPackages().add(cmoflon);
			p.getSubPackages().add(emoflon);
		});
		assertPostcondition("in/moflon_deleteSubEdge_FWD", "expected/moflon_deleteSubEdge_FWD");
	}
	
	@Test
	public void testMoflon_deleteSubEdge_BWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder cmoflon = helperDoc.getFolder(f, "cmoflon");
			Folder emoflon = helperDoc.getFolder(f, "emoflon");
			
			f.getSubFolders().add(cmoflon);
			f.getSubFolders().add(emoflon);
		});
		assertPostcondition("expected/moflon_deleteSubEdge_BWD", "in/moflon_deleteSubEdge_BWD");
	}
	
	@Test
	public void testMoflon_insertDoubleSub_FWD()
	{
		tool.performAndPropagateTargetEdit(p -> helperDoc.createMoflon(p));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package es = helperJava.getPackage(p, "es");
			Package cmoflon = helperJava.getPackage(p, "cmoflon");
			Package emoflon = helperJava.getPackage(p, "emoflon");
			Package mde = helperJava.createPackage(es, "mde");
			Package moflon = helperJava.createPackage(mde, "moflon");
			
			moflon.getSubPackages().add(cmoflon);
			moflon.getSubPackages().add(emoflon);
		});
		assertPostcondition("in/moflon_insertDoubleSub_FWD", "expected/moflon_insertDoubleSub_FWD");
	}
	
	@Test
	public void testMoflon_insertDoubleSub_BWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder es = helperDoc.getFolder(f, "es");
			Folder cmoflon = helperDoc.getFolder(f, "cmoflon");
			Folder emoflon = helperDoc.getFolder(f, "emoflon");
			Folder mde = helperDoc.createFolder(es, "mde");
			helperDoc.createDoc(mde, "mde_doc", "mdeDoc");
			Folder moflon = helperDoc.createFolder(mde, "moflon");
			helperDoc.createDoc(moflon, "moflon_doc", "moflonDoc");
			
			moflon.getSubFolders().add(cmoflon);
			moflon.getSubFolders().add(emoflon);
		});
		assertPostcondition("expected/moflon_insertDoubleSub_BWD", "in/moflon_insertDoubleSub_BWD");
	}

	@Test
	public void testMoflon_newRoot_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package newRoot = SimpleJavaFactory.eINSTANCE.createPackage();
			newRoot.setName("edu");
			Resource res = p.eResource();
			res.getContents().add(newRoot);
			newRoot.getSubPackages().add(p);
		});
		assertPostcondition("in/moflon_newRoot_FWD", "expected/moflon_newRoot_FWD");
	}
	
	@Test
	public void testMoflon_newRoot_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder newRoot = SimpleDocFactory.eINSTANCE.createFolder();
			newRoot.setName("edu");
			Resource res = f.eResource();
			res.getContents().add(newRoot);
			newRoot.getSubFolders().add(f);
			Doc fDoc = SimpleDocFactory.eINSTANCE.createDoc();
			fDoc.setName(f.getName() + "_" + "doc");
			fDoc.setContent(f.getName() + "Doc");
			f.getDocs().add(fDoc);
		});
		assertPostcondition("expected/moflon_newRoot_BWD", "in/moflon_newRoot_BWD");
	}
	
	@Test
	public void testMoflon_deleteRoot_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package newRoot = p.getSubPackages().get(0);
			Resource res = p.eResource();
			res.getContents().add(newRoot);
		});
		tool.performIdleSourceEdit(p -> {
			EMFManipulationUtils.delete(p);
		});
		assertPostcondition("in/moflon_deleteRoot_FWD", "expected/moflon_deleteRoot_FWD");
	}
	
	@Test
	public void testMoflon_deleteRoot_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		
		tool.getResourceSet().eAdapters().add(new EContentAdapter() {
			@Override
			public void notifyChanged(Notification notification) {
				System.out.println(" ---- " + notification);
				super.notifyChanged(notification);
			}
		});
		
		System.out.println("_____FIRST EDIT");
		tool.performIdleTargetEdit(f -> {
			Folder newRoot = f.getSubFolders().get(0);
			for(Doc d : newRoot.getDocs()) {
				if(d.getName().equals(newRoot.getName() + "_doc")) {
					System.out.println("_____DELETE " + d);
					EMFManipulationUtils.delete(d);
					break;
				}
			}
			System.out.println("_____NEW ROOT " + newRoot);
			f.eResource().getContents().add(newRoot);
		});
		System.out.println("_____AFTER PROPAGATE");

		tool.performIdleTargetEdit(f -> {
			System.out.println("_____DELETE OLD ROOT " + f);
			EMFManipulationUtils.delete(f);
		});
		assertPostcondition("expected/moflon_deleteRoot_BWD", "in/moflon_deleteRoot_BWD");
	}
	
	@Test
	public void testMoflon_deleteRootOneStep_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleSourceEdit(p -> {
			Package newRoot = p.getSubPackages().get(0);
			Resource res = p.eResource();
			res.getContents().add(newRoot);
			
			EMFManipulationUtils.delete(p);
		});
		assertPostcondition("in/moflon_deleteRoot_FWD", "expected/moflon_deleteRoot_FWD");
	}
	
	@Test
	public void testMoflon_deleteRootOneStep_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleTargetEdit(f -> {
			Folder newRoot = f.getSubFolders().get(0);
			for(Doc d : newRoot.getDocs()) {
				if(d.getName().equals(newRoot.getName() + "_doc")) {
					EMFManipulationUtils.delete(d);
					break;
				}
			}
			f.eResource().getContents().add(newRoot);
			
			EMFManipulationUtils.delete(f);
		});
		assertPostcondition("expected/moflon_deleteRoot_BWD", "in/moflon_deleteRoot_BWD");
	}
	
	@Test
	public void testMoflon_moveIbex_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleSourceEdit(p -> {
			helperJava.movePackage(p, "es", "ibex");
		});
		assertPostcondition("in/moflon_moveIbex_FWD", "expected/moflon_moveIbex_FWD");
	}
	
	@Test
	public void testMoflon_moveIbex_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleTargetEdit(f -> {
			helperDoc.moveFolder(f, "es", "ibex");
		});
		assertPostcondition("expected/moflon_moveIbex_BWD", "in/moflon_moveIbex_BWD");
	}
	
	@Test
	public void testMoflon_moveUtils_FWD()
	{
		tool.performAndPropagateSourceEdit(p -> helperJava.createMoflon(p));
		tool.performAndPropagateTargetEdit(f -> helperDoc.fillContents(f));
		//------------
		tool.performIdleSourceEdit(p -> {
			helperJava.moveClass(p, "emoflon", "EcoreUtil");
		});
		assertPostcondition("in/moflon_moveUtils_FWD", "expected/moflon_moveUtils_FWD");
	}
	
	@Test
	public void testMoflon_moveUtils_BWD()
	{
		tool.performAndPropagateTargetEdit(f -> helperDoc.createMoflon(f));
		tool.performAndPropagateSourceEdit(p -> helperJava.fillBodies(p));
		//------------
		tool.performIdleTargetEdit(f -> {
			helperDoc.moveDoc(f, "emoflon", "EcoreUtil_doc");
		});
		assertPostcondition("expected/moflon_moveUtils_BWD", "in/moflon_moveUtils_BWD");
	}
}
