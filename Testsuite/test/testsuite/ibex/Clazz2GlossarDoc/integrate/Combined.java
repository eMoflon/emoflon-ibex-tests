package testsuite.ibex.Clazz2GlossarDoc.integrate;

import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.APPLY_USER_DELTA;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.CLEAN_UP;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_BROKEN_MATCHES;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.RESOLVE_CONFLICTS;
import static org.emoflon.ibex.tgg.operational.strategies.integrate.provider.IntegrationFragmentProvider.TRANSLATE;

import java.util.Arrays;

import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.glossarDoc.core.GlossarDocumentationHelper;
import org.simpleClass.core.SimpleClassInheritanceHelper;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
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
	
	private final String testpath = "expected/combined/";

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			APPLY_USER_DELTA //
			, RESOLVE_CONFLICTS //
			, RESOLVE_BROKEN_MATCHES //
			, TRANSLATE //
			, CLEAN_UP //
	));

}
