package testsuite.ibex.Java2Doc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CHECK_LOCAL_CONSISTENCY;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;

import java.util.Arrays;

import org.benchmarx.simpledoc.core.SimpleDocHelper;
import org.benchmarx.simpledoc.core.SimpleJavaHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.junit.Test;

import simpleDoc.Folder;
import simpleJava.Clazz;
import simpleJava.Package;
import testsuite.ibex.Java2Doc.integrate.util.IntegIbexJava2Doc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class LocalCCTest extends IntegrateTestCase<Package, Folder> {

	public final static String projectName = "Java2Doc";

	SimpleJavaHelper helperJava;
	SimpleDocHelper helperDoc;

	public LocalCCTest() {
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
			, CHECK_LOCAL_CONSISTENCY //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	private final String testpath = "integ/expected/lcc/";

	@Test
	public void lcc_createSrcTrg() {
		final String fullPath = testpath + "lcc_createSrcTrg/";
		tool.getOptions().integration.pattern(pattern);
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			helperJava.createClass(helperJava.getPackage(p, "cmoflon"), "ccClazz", "ccContent");
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "cmoflon"), "ccClazz_doc", "ccBody");
		});

		assertCondition(fullPath);
	}

	@Test
	public void lcc_crossover() {
		final String fullPathPre = testpath + "lcc_crossover_pre/";
		final String fullPath = testpath + "lcc_crossover/";
		tool.getOptions().integration.pattern(pattern);
		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			helperJava.createClass(helperJava.getPackage(p, "es"), "EMFUtil", "EMFUtilImpl");
			// trg:
			helperDoc.createDoc(helperDoc.getFolder(f, "es"), "EMFUtil_doc", "EMFUtilBody");
		});

		assertCondition(fullPathPre);

		tool.applyAndIntegrateDelta((p, f) -> {
			// src:
			Clazz ecoreUtil = helperJava.getClazz(p, "EcoreUtil");
			Clazz emfUtil = helperJava.getClazz(p, "EMFUtil");
			ecoreUtil.setName("EMFUtil");
			emfUtil.setName("CommonUtil");
		});

		assertCondition(fullPath);
	}

}
