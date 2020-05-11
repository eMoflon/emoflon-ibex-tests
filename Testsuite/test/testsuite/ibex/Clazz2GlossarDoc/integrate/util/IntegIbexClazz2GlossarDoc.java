package testsuite.ibex.Clazz2GlossarDoc.integrate.util;

import java.io.IOException;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.INTEGRATE_App;
import org.glossarDoc.core.GlossarDocumentationComparator;
import org.simpleClass.core.ClazzInheritanceComparator;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
import testsuite.ibex.testUtil.IntegIbexAdapter;

public class IntegIbexClazz2GlossarDoc extends IntegIbexAdapter<ClazzContainer, DocumentationContainer> {

	private final String inputFolder;

	public IntegIbexClazz2GlossarDoc(String projectName, String inputFolder) {
		super(new ClazzInheritanceComparator(true), new GlossarDocumentationComparator(true), null, projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/in/" + inputFolder, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
