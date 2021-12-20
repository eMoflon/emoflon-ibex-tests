package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;

import java.util.Arrays;
import java.util.function.Consumer;

import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.CorrPreservationConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePreserveConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import simpleClassInheritance.Clazz;
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

	private final String testpath = "integ/expected/basic/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			REPAIR //
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

		assertCondition(path);
	}

	@Test
	public void attributeConflict_preferSource() {
		attributeConflict(s -> s.crs_preferSource(), testpath + "attr_src/");
	}

	@Test
	public void attributeConflict_preferTarget() {
		attributeConflict(s -> s.crs_preferTarget(), testpath + "attr_trg/");
	}

	//// DELETE-PRESERVE CONFLICT ////

	private void deletePreserveConflict(Consumer<DeletePreserveConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePreserveConflict.class, s));
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Method m8 = helperClazz.getMethod("M8");
			Method m6 = helperClazz.getMethod("M6");
			Parameter p10 = helperClazz.getParameter(m6, "P10");
			m8.getParameters().add(p10);
			EMFManipulationUtils.delete(m6);
			// trg:
			helperDoc.createGlossarEntryLink(helperDoc.getEntry("M6"), helperDoc.getGlossarEntry("GE12"));
		});

		assertCondition(path);
	}

	@Test
	public void deletePreserveConflict_preserveDeletion() {
		deletePreserveConflict(s -> s.crs_revokeAddition(), testpath + "delprop_predel/");
	}

	@Test
	public void deletePreserveConflict_revokeDeletion() {
		deletePreserveConflict(s -> s.crs_revokeDeletion(), testpath + "delprop_revdel/");
	}

	@Test
	public void deletePreserveConflict_mergeAndPreserve() {
		deletePreserveConflict(s -> s.crs_mergeAndPreserve(), testpath + "delprop_mrgpre/");
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

		assertCondition(path);
	}

	@Test
	public void shortcutCC() {
		shortcutCC(testpath + "shortcutcc/");
	}

	//// CORRESPONDENCE PRESERVATION ////

	private void contradictoryMove(Consumer<CorrPreservationConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, CorrPreservationConflict.class, s));
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Clazz c2 = helperClazz.getClazz("C2");
			Clazz c3 = helperClazz.createSubClazz(c2, "C3");
			Field f7 = helperClazz.getField("F7");
			c3.getFields().add(f7);
			// trg:
			Document d1 = helperDoc.getDocumentation("C1");
			Entry e7 = helperDoc.getEntry("F7");
			d1.getEntries().add(e7);
		});

		assertCondition(path);
	}

	@Test
	public void contradictoryMove_preferSource() {
		contradictoryMove(s -> s.crs_preferSource(), testpath + "contramove_src/");
	}

	@Test
	public void contradictoryMove_preferTarget() {
		contradictoryMove(s -> s.crs_preferTarget(), testpath + "contramove_trg/");
	}

	@Test
	public void contradictoryMove_deleteCorrs() {
		contradictoryMove(s -> s.crs_deleteCorrs(), testpath + "contramove_delCorrs/");
	}

}
