package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.TRANSLATE;

import java.util.Arrays;
import java.util.function.Consumer;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePropConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Field;
import simpleClassInheritance.Method;
import simpleClassInheritance.Parameter;
import testsuite.ibex.Clazz2GlossarDoc.integrate.util.IntegIbexClazz2GlossarDoc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Basic extends IntegrateTestCase<ClazzContainer, DocumentationContainer> {

	public final static String projectName = "Clazz2GlossarDoc";

	private SimpleClassInheritanceHelper helperClazz;
	private GlossarDocumentationHelper helperDoc;

	public Basic() {
		super(new IntegIbexClazz2GlossarDoc(projectName, "basic"));
	}

	@Override
	protected void initHelpers() {
		helperClazz = new SimpleClassInheritanceHelper(tool.getSourceModel());
		helperDoc = new GlossarDocumentationHelper(tool.getTargetModel());
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}

	private final String testpath = "expected/basic/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			APPLY_USER_DELTA //
			, REPAIR //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	//// ATTRIBUTE CONFLICT ////

	private void attributeConflict(Consumer<AttributeConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, AttributeConflict.class, s));
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			helperClazz.getMethod("M8").setName("M8_a");
			// trg:
			helperDoc.getEntry("M8").setName("M8_b");
		});

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void attributeConflict_preferSource() {
		attributeConflict((s) -> s.crs_preferSource(), testpath + "attr_src/");
	}

	@Test
	public void attributeConflict_preferTarget() {
		attributeConflict((s) -> s.crs_preferTarget(), testpath + "attr_trg/");
	}

	//// DELETE-PROPAGATE CONFLICT ////

	private void deletePropagateConflict(Consumer<DeletePropConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, s));
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Method m8 = helperClazz.getMethod("M8");
			Method m6 = helperClazz.getMethod("M6");
			Parameter p10 = helperClazz.getParameter(m6, "P10");
			m8.getParameters().add(p10);
			EcoreUtil.delete(m6, true);
			// trg:
			helperDoc.createGlossarEntryLink(helperDoc.getEntry("M6"), helperDoc.getGlossarEntry("GE12"));
		});

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void deletePropConflict_preserveDeletion() {
		deletePropagateConflict((s) -> s.crs_revokeAddition(), testpath + "delprop_predel/");
	}

	@Test
	public void deletePropConflict_revokeDeletion() {
		deletePropagateConflict((s) -> s.crs_revokeDeletion(), testpath + "delprop_revdel/");
	}

	@Test
	public void deletePropConflict_mergeAndPreserve() {
		deletePropagateConflict((s) -> s.crs_mergeAndPreserve(), testpath + "delprop_mrgpre/");
	}

	//// SHORTCUT-CC ////

	private void shortcutCC(String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Field f7 = helperClazz.getField("F7");
			helperClazz.getClazz("C1").getFields().add(f7);
			// trg:
			Entry e7 = helperDoc.getEntry("F7");
			helperDoc.getDocumentation("C1").getEntries().add(e7);
		});

		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void shortcutCC() {
		shortcutCC(testpath + "shortcutcc/");
	}

}
