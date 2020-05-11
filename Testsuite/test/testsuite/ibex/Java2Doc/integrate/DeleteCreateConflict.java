package testsuite.ibex.Java2Doc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CHECK_LOCAL_CONSISTENCY;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.TRANSLATE;

import java.util.Arrays;
import java.util.function.BiConsumer;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePropConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.MergeAndPreserveCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreserveDeletionCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.RevokeDeletionCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
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

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			APPLY_USER_DELTA //
//			, CHECK_LOCAL_CONSISTENCY //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
//			, CHECK_LOCAL_CONSISTENCY //
			, CLEAN_UP //
	));

	private final String testpath = "integ/expected/dcc/";

	private final BiConsumer<Package, Folder> dcc_simple_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_simple1() {
		final String path = testpath + "dcc_simple1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, PreserveDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple2() {
		final String path = testpath + "dcc_simple2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, RevokeDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple3() {
		final String path = testpath + "dcc_simple3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, MergeAndPreserveCRS.class));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_chain_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "emoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_chain1() {
		final String path = testpath + "dcc_chain1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, PreserveDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain2() {
		final String path = testpath + "dcc_chain2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, RevokeDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain3() {
		final String path = testpath + "dcc_chain3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, MergeAndPreserveCRS.class));
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
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_chainMultiDel1() {
		final String path = testpath + "dcc_chainMultiDel1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, PreserveDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel2() {
		final String path = testpath + "dcc_chainMultiDel2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, RevokeDeletionCRS.class));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel3() {
		final String path = testpath + "dcc_chainMultiDel3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, MergeAndPreserveCRS.class));
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
