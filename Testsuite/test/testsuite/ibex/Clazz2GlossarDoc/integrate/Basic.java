package testsuite.ibex.Clazz2GlossarDoc.integrate;

import org.glossarDoc.core.GlossarDocumentationHelper;
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
		super(new IntegIbexClazz2GlossarDoc(projectName, "standard"));
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

}
