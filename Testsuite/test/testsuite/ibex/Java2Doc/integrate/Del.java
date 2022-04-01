package testsuite.ibex.Java2Doc.integrate;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.jupiter.api.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Del extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public Del() {
		super(new IntegIbexJava2Doc(projectName, "moflon"));
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
			EMFManipulationUtils.delete(helperJava.getClazz(p, "GT"), true);
			// trg:
			EMFManipulationUtils.delete(helperDoc.getDoc(f, "GT_doc"), true);
		});

		assertCondition(path);
	}

	@Test
	public void del_multiple() {
		final String path = "integ/expected/del/del_multiple/";

		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EMFManipulationUtils.delete(helperJava.getPackage(p, "es"), true);
			// trg:
			EMFManipulationUtils.delete(helperDoc.getFolder(f, "es"), true);
		});

		assertCondition(path);
	}

	@Test
	public void del_incompl() {
		final String path = "integ/expected/del/del_incompl/";

		tool.applyAndIntegrateDelta((p, f) -> {
			// trg:
			EMFManipulationUtils.delete(helperDoc.getDoc(f, "es_doc"), true);
		});

		assertCondition(path);
	}

}
