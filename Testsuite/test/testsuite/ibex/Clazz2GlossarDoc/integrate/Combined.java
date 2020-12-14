package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.REPAIR;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider.TRANSLATE;

import java.util.Arrays;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.integrate.conflicts.resolution.util.ConflictResolver;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.junit.Test;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.Document;
import glossarDocumentation.DocumentationContainer;
import glossarDocumentation.Entry;
import glossarDocumentation.GlossarEntry;
import simpleClassInheritance.Clazz;
import simpleClassInheritance.ClazzContainer;
import simpleClassInheritance.Field;
import simpleClassInheritance.Method;
import testsuite.ibex.Clazz2GlossarDoc.integrate.util.IntegIbexClazz2GlossarDoc;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class Combined extends IntegrateTestCase<ClazzContainer, DocumentationContainer> {

	public final static String projectName = "Clazz2GlossarDoc";

	private SimpleClassInheritanceHelper helperClazz;
	private GlossarDocumentationHelper helperDoc;

	public Combined() {
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

	private final String testpath = "integ/expected/combined/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			APPLY_USER_DELTA //
			, REPAIR //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

	private void combinedConflicts(ConflictResolver cr, String path) {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().integration.conflictSolver(cr);
		tool.applyAndIntegrateDelta((c, d) -> {
			// src:
			Clazz c1 = helperClazz.getClazz("C1");
			Clazz c2 = helperClazz.getClazz("C2");
			Method m8 = helperClazz.getMethod("M8");
			Field f7 = helperClazz.getField("F7");
			Method m6 = helperClazz.getMethod("M6");

			c1.getSubClazzes().add(c2);
			c1.getMethods().add(m8);
			EcoreUtil.delete(f7, true);
			helperClazz.createParameter(m6, "P15");
			Clazz c3 = helperClazz.createClazz("C3");
			c3.getSubClazzes().add(c1);
			c3.getMethods().add(m6);

			// trg:
			Entry e6 = helperDoc.getEntry("M6");
			Document d2 = helperDoc.getDocumentation("C2");
			Document d1 = helperDoc.getDocumentation("C1");
			Entry e8 = helperDoc.getEntry("M8");
			Entry e7 = helperDoc.getEntry("F7");
			GlossarEntry ge12 = helperDoc.getGlossarEntry("GE12");

			d2.getEntries().add(e6);
			EcoreUtil.delete(d1, true);
			EcoreUtil.delete(e8, true);
			helperDoc.createGlossarEntryLink(e7, ge12);
			e7.setName("F7_changed");
		});

//		assertCondition(path + "src", path + "trg", path + "corr");
	}

	@Test
	public void combinedConflicts() {
		combinedConflicts(c -> {}, testpath + "combC/");
	}

}
