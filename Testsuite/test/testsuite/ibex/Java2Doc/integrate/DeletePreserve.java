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
import java.util.function.Consumer;

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

	//// SIMPLE ////

	private void dcc_simple(Consumer<DeletePreserveConflict> s, String path) {
		final String fullPath = testpath + path;
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
		});

		assertCondition(fullPath);
	}

	@Test
	public void dcc_simple1() {
		dcc_simple(s -> s.crs_revokeAddition(), "dcc_simple1/");
	}

	@Test
	public void dcc_simple2() {
		dcc_simple(s -> s.crs_revokeDeletion(), "dcc_simple2/");
	}

	@Test
	public void dcc_simple3() {
		dcc_simple(s -> s.crs_mergeAndPreserve(), "dcc_simple3/");
	}

	//// CHAIN ////

	private void dcc_chain(Consumer<DeletePreserveConflict> s, String path) {
		final String fullPath = testpath + path;

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getClazz(p, "IPM"));
			EcoreUtil.delete(helperJava.getPackage(p, "emoflon"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
		});

		assertCondition(fullPath);
	}

	@Test
	public void dcc_chain1() {
		dcc_chain(s -> s.crs_revokeAddition(), "dcc_chain1/");
	}

	@Test
	public void dcc_chain2() {
		dcc_chain(s -> s.crs_revokeDeletion(), "dcc_chain2/");
	}

	@Test
	public void dcc_chain3() {
		dcc_chain(s -> s.crs_mergeAndPreserve(), "dcc_chain3/");
	}

	//// CHAIN MULTI-DEL ////

	private void dcc_chainMultiDel(Consumer<DeletePreserveConflict> s, String path) {
		final String fullPath = testpath + path;

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "ibex"));
			EcoreUtil.delete(helperJava.getClazz(p, "TGG"));
			EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
			EcoreUtil.delete(helperJava.getPackage(p, "es"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
		});

		assertCondition(fullPath);
	}

	@Test
	public void dcc_chainMultiDel1() {
		dcc_chainMultiDel(s -> s.crs_revokeAddition(), "dcc_chainMultiDel1/");
	}

	@Test
	public void dcc_chainMultiDel1a() {
		dcc_chainMultiDel(s -> s.crs_preferSource(), "dcc_chainMultiDel1/");
	}

	@Test
	public void dcc_chainMultiDel2() {
		dcc_chainMultiDel(s -> s.crs_revokeDeletion(), "dcc_chainMultiDel2/");
	}

	@Test
	public void dcc_chainMultiDel2a() {
		dcc_chainMultiDel(s -> s.crs_preferTarget(), "dcc_chainMultiDel2/");
	}

	@Test
	public void dcc_chainMultiDel3() {
		dcc_chainMultiDel(s -> s.crs_mergeAndPreserve(), "dcc_chainMultiDel3/");
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
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "ibex"));
			EcoreUtil.delete(helperJava.getClazz(p, "TGG"));
			EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
			EcoreUtil.delete(helperJava.getPackage(p, "es"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "ibex"), "criticalClazz_doc", "criticalbody");
			helperDoc.createDoc(helperDoc.getFolder(f, "es"), "conflictingClazz_doc", "conflictingbody");
		});

		assertEquals(1, ccCount.get());
		assertCondition(path);
	}

	//// OTHER ////

	@Test
	public void dcc_delBesidesCre() {
		final String path = testpath + "dcc_delBesidesCre/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
			EcoreUtil.delete(helperDoc.getDoc(f, "GT_doc"));
		});

		assertCondition(path);
	}

	private void explicitDeletePackage(Package p) {
		List<Package> packages = new LinkedList<>(p.getSubPackages());
		packages.forEach(this::explicitDeletePackage);
		List<Clazz> clazzes = new LinkedList<>(p.getClazzes());
		clazzes.forEach(EcoreUtil::delete);
		EcoreUtil.delete(p);
	}

	@Test
	public void dcc_explicitDel() {
		final String path = testpath + "dcc_explicitDel/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			explicitDeletePackage(helperJava.getPackage(p, "emoflon"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "emoflon"), "criticalClazz_doc", "criticalbody");
			EcoreUtil.delete(helperDoc.getDoc(f, "TGG_doc"));
		});

		assertCondition(path);
	}

	@Test
	public void dcc_implicitDel() {
		final String path = testpath + "dcc_implicitDel/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			EcoreUtil.delete(helperJava.getPackage(p, "emoflon"));
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "emoflon"), "criticalClazz_doc", "criticalbody");
			EcoreUtil.delete(helperDoc.getDoc(f, "TGG_doc"));
		});

		assertCondition(path);
	}

}
