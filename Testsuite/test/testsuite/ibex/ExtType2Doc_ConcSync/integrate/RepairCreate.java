package testsuite.ibex.ExtType2Doc_ConcSync.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;

import org.benchmarx.extDocModel.core.ExtDocHelper;
import org.benchmarx.extTypeModel.core.ExtTypeHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePreserveConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.junit.Test;

import ExtDocModel.Doc;
import ExtDocModel.DocContainer;
import ExtDocModel.EntryType;
import ExtTypeModel.Project;
import ExtTypeModel.Type;
import testsuite.ibex.ExtType2Doc_ConcSync.integrate.util.IntegIbexExtType2Doc_ConcSync;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class RepairCreate extends IntegrateTestCase<Project, DocContainer> {

	public final static String projectName = "ExtType2Doc_ConcSync";

	private ExtTypeHelper helperType;
	private ExtDocHelper helperDoc;

	public RepairCreate() {
		super(new IntegIbexExtType2Doc_ConcSync(projectName, "repair_create"));
	}

	@Override
	protected void initHelpers() {
		helperType = new ExtTypeHelper(tool.getSourceModel());
		helperDoc = new ExtDocHelper(tool.getTargetModel());
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	private final String testpath = "integ/expected/repair_create/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			REPAIR //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	private void noConflict(Consumer<DeletePreserveConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);

		AtomicBoolean foundConflict = new AtomicBoolean(false);
		tool.getOptions().integration.conflictSolver(cc -> {
			CRSHelper.forEachConflict(cc, c -> foundConflict.set(true));
		});

		tool.applyAndIntegrateDelta((p, dc) -> {
			// src:
			Type t2 = helperType.getType("T2");
			t2.getExtendedBy().clear();
			t2.setPackage(null);
			// trg:
			Doc d3 = helperDoc.getDoc("T3");
			helperDoc.createEntry(d3, "new_method", EntryType.METHOD);
		});

		assertFalse(foundConflict.get());
		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void noConflict() {
		noConflict(s -> s.crs_revokeDeletion(), testpath + "no_conflict/");
	}

}
