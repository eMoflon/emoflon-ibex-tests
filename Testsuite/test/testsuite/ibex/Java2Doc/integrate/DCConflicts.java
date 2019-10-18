package testsuite.ibex.Java2Doc.integrate;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DCConflicts extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public DCConflicts() {
		super(new IntegIbexJava2Doc(projectName));
	}

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
	public void simpleDeleteCreate() {
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "newfolder", "new");
		});
	}
	
	@Test
	public void move() {
		tool.applyAndIntegrateDelta((p, f) -> {
			// trg:
			Folder es = helperDoc.getFolder(f, "es");
			f.getSubFolders().addAll(es.getSubFolders());
		});
	}

}
