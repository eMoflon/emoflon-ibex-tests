package testsuite.ibex.Java2Doc.integrate.util;

import java.io.IOException;

import org.benchmarx.simpledoc.core.SimpleDocComparator;
import org.benchmarx.simpledoc.core.SimpleJavaComparator;
import org.emoflon.ibex.tgg.run.java2doc.INTEGRATE_App;
import org.emoflon.ibex.tgg.run.java2doc.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.java2doc.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IntegIbexJava2Doc extends IntegIbexAdapter<Package, Folder> {

	private final String inputFolder;

	public IntegIbexJava2Doc(String projectName, String inputFolder) {
		super(new SimpleJavaComparator(true), new SimpleDocComparator(true), new Java2DocCorrComp(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			INTEGRATE_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] {
					new HiPERegistrationHelper() });
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/integ/in/" + inputFolder, ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
