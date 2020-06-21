package testsuite.ibex.Java2Doc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
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
		EcoreUtil.delete(helperJava.getPackage(p, "cmoflon"), true);
		// trg:
		helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "criticalClazz_doc", "criticalbody");
	};

	@Test
	public void dcc_simple1() {
		final String path = testpath + "dcc_simple1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple2() {
		final String path = testpath + "dcc_simple2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_simple_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_simple3() {
		final String path = testpath + "dcc_simple3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_mergeAndPreserve()));
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
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain2() {
		final String path = testpath + "dcc_chain2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_chain_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chain3() {
		final String path = testpath + "dcc_chain3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_mergeAndPreserve()));
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
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeAddition()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void dcc_chainMultiDel1a() {
		final String path = testpath + "dcc_chainMultiDel1/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_preferSource()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel2() {
		final String path = testpath + "dcc_chainMultiDel2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_revokeDeletion()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}
	
	@Test
	public void dcc_chainMultiDel2a() {
		final String path = testpath + "dcc_chainMultiDel2/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_preferTarget()));
		tool.applyAndIntegrateDelta(dcc_chainMultiDel_delta);

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void dcc_chainMultiDel3() {
		final String path = testpath + "dcc_chainMultiDel3/";

		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, (s) -> s.crs_mergeAndPreserve()));
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
					CRSHelper.forEachResolve(cc, DeletePreserveConflict.class, (s) -> s.crs_preferTarget());
					
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

}
