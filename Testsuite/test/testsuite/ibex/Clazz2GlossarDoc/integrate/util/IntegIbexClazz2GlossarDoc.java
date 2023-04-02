package testsuite.ibex.Clazz2GlossarDoc.integrate.util;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.clazz2glossardoc.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.glossarDoc.core.GlossarDocumentationComparator;
import org.simpleClass.core.ClazzInheritanceComparator;

import glossarDocumentation.DocumentationContainer;
import simpleClassInheritance.ClazzContainer;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IntegIbexClazz2GlossarDoc extends IntegIbexAdapter<ClazzContainer, DocumentationContainer> {

	private final String inputFolder;

	public IntegIbexClazz2GlossarDoc(String projectName, String inputFolder) {
		super(new ClazzInheritanceComparator(true), new GlossarDocumentationComparator(true),
				new Clazz2GlossarDocCorrComp(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			INTEGRATE_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] {
					new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath, "/resources/integ/in/" + inputFolder,
					ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
