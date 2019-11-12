package testsuite.ibex.Java2Doc.integrate;

import java.util.function.BiConsumer;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeleteCreateConflict extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public DeleteCreateConflict() {
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

	private BiConsumer<Package, Folder> dcc_simple_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "newfolder", "new");
	};

	@Test
	public void dcc_simple1() {
		final String path = "integ/expected/dcc/dcc_simple1/";

		tool.getOptions().setConflictSolver(c -> c.preserveDeletion());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple2() {
		final String path = "integ/expected/dcc/dcc_simple2/";

		tool.getOptions().setConflictSolver(c -> c.revokeDeletion());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple3() {
		final String path = "integ/expected/dcc/dcc_simple3/";

		tool.getOptions().setConflictSolver(c -> c.preserveConstructiveChanges());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void chainDeleteCreate() {
		tool.getOptions().setConflictSolver(c -> c.preserveConstructiveChanges());
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "emoflon"), true);
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalfolder", "criticalbody");
		});
	}

	@Test
	public void chainMultiDeleteCreate() {
		tool.getOptions().setConflictSolver(c -> c.preserveConstructiveChanges());
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "ibex"), true);
			EcoreUtil.delete(helperJava.getPackage(p, "es"), true);
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalfolder", "criticalbody");
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
