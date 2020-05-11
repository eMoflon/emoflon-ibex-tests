package testsuite.ibex.Java2Doc.integrate.util;

import java.io.IOException;

import org.benchmarx.simpledoc.core.SimpleDocComparator;
import org.benchmarx.simpledoc.core.SimpleJavaComparator;
import org.emoflon.ibex.tgg.run.java2doc.INTEGRATE_App;

import simpleDoc.Folder;
import simpleJava.Package;
import testsuite.ibex.testUtil.IntegIbexAdapter;

public class IntegIbexJava2Doc extends IntegIbexAdapter<Package, Folder> {

	private final String inFolder;

	public IntegIbexJava2Doc(String projectName, String inFolder) {
		super(new SimpleJavaComparator(true), new SimpleDocComparator(true), new Java2DocCorrComp(), projectName);
		this.inFolder = inFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			integrator = new INTEGRATE_App(projectName,
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath,
					"/resources/integ/in/" + inFolder, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
