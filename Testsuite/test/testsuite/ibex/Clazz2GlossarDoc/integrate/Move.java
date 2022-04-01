package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;

import java.util.Arrays;
import java.util.function.Consumer;

import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.CorrPreservationConflict;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.CRSHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.jupiter.api.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import testsuite.ibex.Clazz2GlossarDoc.integrate.util.IntegIbexClazz2GlossarDoc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Move extends IntegrateTestCase<ClazzContainer, DocumentationContainer> {
	
	public final static String projectName = "Clazz2GlossarDoc";
	
	private SimpleClassInheritanceHelper helperClazz;
	private GlossarDocumentationHelper helperDoc;

	public Move() {
		super(new IntegIbexClazz2GlossarDoc(projectName, "move"));
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
	
	private final String testpath = "integ/expected/move/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			REPAIR //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	////CONTRADICTORY MOVE ////

	private void contradictoryMove(Consumer<CorrPreservationConflict> s, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver( //
				c -> CRSHelper.forEachResolve(c, CorrPreservationConflict.class, s));
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Clazz c1 = helperClazz.getClazz("C1");
			Clazz c2 = helperClazz.getClazz("C2");
			c2.getSubClazzes().add(c1);
			// trg:
			Document d0 = helperDoc.getDocumentation("C0");
			Document d1 = helperDoc.getDocumentation("C1");
			Document d3 = helperDoc.getDocumentation("C3");
			d0.getHyperRefs().remove(d1);
			d3.getHyperRefs().add(d1);
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
