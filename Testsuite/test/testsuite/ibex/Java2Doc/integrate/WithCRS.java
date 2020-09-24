package testsuite.ibex.Java2Doc.integrate;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class WithCRS extends IntegrateTestCase<Package, Folder> {

	private final static String PROJECT_NAME = "Java2Doc";
	
	public WithCRS() {
		super(new IntegIbexJava2Doc(PROJECT_NAME, "moflon"));
	}

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	@Override
	protected void initHelpers() {
		helperJava = new SimpleJavaHelper();
		helperDoc = new SimpleDocHelper();
	}

	@Override
	protected String getProjectName() {
		return PROJECT_NAME;
	}

	@Test
	public void del_simple() {
		final String path = "integ/expected/del/del_single/";
		
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			//helperJava.createClass(p, "c2", "content");
			// trg:
			//EcoreUtil.delete(f, true);
		});
		
		assertCondition(path + "src", path + "trg", path + "corr");
	}
}
