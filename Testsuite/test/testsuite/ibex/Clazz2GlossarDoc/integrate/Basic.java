package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.TRANSLATE;

import java.util.Arrays;

import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.AttributeConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.ConflictResolutionStrategy;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreferSourceCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.PreferTargetCRS;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
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
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

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
	public void attributeConflictPreferSource() {
		attributeConflict(PreferSourceCRS.class, testpath + "attr_src/");
	}

	@Test
	public void attributeConflictPreferTarget() {
		attributeConflict(PreferTargetCRS.class, testpath + "attr_trg/");
	}

}
