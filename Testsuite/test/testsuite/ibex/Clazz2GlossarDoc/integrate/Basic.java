package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.TRANSLATE;

import java.util.Arrays;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.DeletePropConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.ConflictResolutionStrategy;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.MergeAndPreserveCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreferSourceCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreferTargetCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreserveDeletionCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.RevokeDeletionCRS;
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

	private void attributeConflict(Class<? extends ConflictResolutionStrategy<AttributeConflict>> crs, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, AttributeConflict.class, crs));
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
		attributeConflict(PreferSourceCRS.class, testpath + "attr_src/");
	}

	@Test
	public void attributeConflict_preferTarget() {
		attributeConflict(PreferTargetCRS.class, testpath + "attr_trg/");
	}

	//// DELETE-PROPAGATE CONFLICT ////

	private void deletePropagateConflict(Class<? extends ConflictResolutionStrategy<DeletePropConflict>> crs,
			String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, DeletePropConflict.class, crs));
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
		deletePropagateConflict(PreserveDeletionCRS.class, testpath + "delprop_predel/");
	}

	@Test
	public void deletePropConflict_revokeDeletion() {
		deletePropagateConflict(RevokeDeletionCRS.class, testpath + "delprop_revdel/");
	}

	@Test
	public void deletePropConflict_mergeAndPreserve() {
		deletePropagateConflict(MergeAndPreserveCRS.class, testpath + "delprop_mrgpre/");
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
