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

	private final String testpath = "integ/expected/dcc/";

	private final BiConsumer<Package, Folder> dcc_simple_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "newfolder", "new");
	};

	@Test
	public void dcc_simple1() {
		final String path = testpath + "dcc_simple1/";

		tool.getOptions().setConflictSolver(c -> c.preserveDeletion());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple2() {
		final String path = testpath + "dcc_simple2/";

		tool.getOptions().setConflictSolver(c -> c.revokeDeletion());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple3() {
		final String path = testpath + "dcc_simple3/";

		tool.getOptions().setConflictSolver(c -> c.makeCompromise());
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_chain_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "emoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalfolder", "criticalbody");
	};

	@Test
	public void dcc_chain1() {
		final String path = testpath + "dcc_chain1/";

		tool.getOptions().setConflictSolver(c -> c.preserveDeletion());
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain2() {
		final String path = testpath + "dcc_chain2/";

		tool.getOptions().setConflictSolver(c -> c.revokeDeletion());
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain3() {
		final String path = testpath + "dcc_chain3/";

		tool.getOptions().setConflictSolver(c -> c.makeCompromise());
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_chainMultiDel_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "ibex"), true);
		EcoreUtil.delete(helperJava.getClazz(p, "TGG"), true);
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
		EcoreUtil.delete(helperJava.getPackage(p, "es"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalfolder", "criticalbody");
	};

	@Test
	public void dcc_chainMultiDel1() {
		final String path = testpath + "dcc_chainMultiDel1/";
		
		tool.getOptions().setConflictSolver(c -> c.preserveDeletion());
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);
		
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void dcc_chainMultiDel2() {
		final String path = testpath + "dcc_chainMultiDel2/";
		
		tool.getOptions().setConflictSolver(c -> c.revokeDeletion());
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);
		
		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void dcc_chainMultiDel3() {
		final String path = testpath + "dcc_chainMultiDel3/";
		
		tool.getOptions().setConflictSolver(c -> c.makeCompromise());
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);
		
		assertCondition(path + "src", path + "trg", path + "corr");
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
