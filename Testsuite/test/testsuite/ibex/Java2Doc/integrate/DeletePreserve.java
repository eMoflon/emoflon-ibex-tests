package testsuite.ibex.Java2Doc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePreserveConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Clazz;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class DeletePreserve extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public DeletePreserve() {
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
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	private final String testpath = "integ/expected/dcc/";

	private final BiConsumer<Package, Folder> dcc_simple_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_simple1() {
		final String path = testpath + "dcc_simple1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple2() {
		final String path = testpath + "dcc_simple2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple3() {
		final String path = testpath + "dcc_simple3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_mergeAndPreserve()));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_chain_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "emoflon"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_chain1() {
		final String path = testpath + "dcc_chain1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain2() {
		final String path = testpath + "dcc_chain2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain3() {
		final String path = testpath + "dcc_chain3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_mergeAndPreserve()));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_chainMultiDel_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "ibex"));
		EcoreUtil.delete(helperJava.getClazz(p, "TGG"));
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
		EcoreUtil.delete(helperJava.getPackage(p, "es"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_chainMultiDel1() {
		final String path = testpath + "dcc_chainMultiDel1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel1a() {
		final String path = testpath + "dcc_chainMultiDel1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_preferSource()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel2() {
		final String path = testpath + "dcc_chainMultiDel2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel2a() {
		final String path = testpath + "dcc_chainMultiDel2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_preferTarget()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel3() {
		final String path = testpath + "dcc_chainMultiDel3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_mergeAndPreserve()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_conflHierarchy() {
		final String path = testpath + "dcc_conflHierarchy/";

		AtomicInteger ccCount = new AtomicInteger(0);
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				cc -> {
					CRSHelper.forEachResolve(cc, DeletePreserveConflict.class, s -> s.crs_preferTarget());

					ccCount.incrementAndGet();
					assertEquals(1, cc.getSubContainers().size());
				});
		tool.applyAndIntegrateDelta((p, f) -> {
			dcc_chainMultiDel_delta.accept(p, f);
			helperDoc.createDoc(helperDoc.getFolder(f, "es"), "conflictingClazz_doc", "conflictingbody");
		});

		assertEquals(1, ccCount.get());
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private final BiConsumer<Package, Folder> dcc_simple_ext_delta = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
		EcoreUtil.delete(helperDoc.getDoc(f, "GT_doc"));
	};

	@Test
	public void dcc_delBesidesCre() {
		final String path = testpath + "dcc_delBesidesCre/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_simple_ext_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	private void explicitDeletePackage(Package p) {
		List<Package> packages = new LinkedList<>(p.getSubPackages());
		packages.forEach(this::explicitDeletePackage);
		List<Clazz> clazzes = new LinkedList<>(p.getClazzes());
		clazzes.forEach(EcoreUtil::delete);
		EcoreUtil.delete(p);
	}

	private final BiConsumer<Package, Folder> dcc_simple_ext_delta_explicit_del = (p, f) -> {
		// src:
		explicitDeletePackage(helperJava.getPackage(p, "emoflon"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "emoflon"), "criticalClazz_doc", "criticalbody");
		EcoreUtil.delete(helperDoc.getDoc(f, "TGG_doc"));
	};

	@Test
	public void dcc_explicitDel() {
		final String path = testpath + "dcc_explicitDel/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_simple_ext_delta_explicit_del);

//		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	private final BiConsumer<Package, Folder> dcc_simple_ext_delta_implicit_del = (p, f) -> {
		// src:
		EcoreUtil.delete(helperJava.getPackage(p, "emoflon"));
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "emoflon"), "criticalClazz_doc", "criticalbody");
		EcoreUtil.delete(helperDoc.getDoc(f, "TGG_doc"));
	};

	@Test
	public void dcc_implicitDel() {
		final String path = testpath + "dcc_delBesidesCre/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_simple_ext_delta_implicit_del);

//		assertCondition(path + "src", path + "trg", path + "corr");
	}

}
