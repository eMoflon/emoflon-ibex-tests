package testsuite.ibex.Java2Doc.integrate;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Del extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public Del() {
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
	public void del_simple() {
		final String path = "integ/expected/del/del_single/";
		
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getClass(p, "GT"), true);
			// trg:
			EcoreUtil.delete(helperDoc.getDoc(f, "GT_doc"), true);
		});
		
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void del_multiple() {
		final String path = "integ/expected/del/del_multiple/";
		
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "es"), true);
			// trg:
			EcoreUtil.delete(helperDoc.getFolder(f, "es"), true);
		});

		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void del_propagation() {
		tool.applyAndIntegrateDelta((p, f) -> {
			// trg:
			EcoreUtil.delete(helperDoc.getDoc(f, "es_doc"), true);
		});
		
		// TODO adrianm: add assertion
	}

}
