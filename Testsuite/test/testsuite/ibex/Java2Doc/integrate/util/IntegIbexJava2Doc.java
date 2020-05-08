package testsuite.ibex.Java2Doc.integrate.util;

import java.io.IOException;

import org.benchmarx.simpledoc.core.SimpleDocComparator;
import org.benchmarx.simpledoc.core.SimpleJavaComparator;
import org.emoflon.ibex.tgg.run.java2doc.INTEGRATE_App;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.testUtil.IntegIbexAdapter;

public class IntegIbexJava2Doc extends IntegIbexAdapter<Package, Folder> {

	private final String inputFolder;

	public IntegIbexJava2Doc(String projectName, String inputFolder) {
		super(new SimpleJavaComparator(true), new SimpleDocComparator(true), projectName);
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
