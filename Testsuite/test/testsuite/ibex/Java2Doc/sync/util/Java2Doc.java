package testsuite.ibex.Java2Doc.sync.util;

import java.io.IOException;

import org.benchmarx.simpledoc.core.SimpleDocComparator;
import org.benchmarx.simpledoc.core.SimpleJavaComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.java2doc.SYNC_App;
import org.emoflon.ibex.tgg.run.java2doc.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.java2doc.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.java2doc.config.ViatraRegistrationHelper;

import simpleDoc.Folder;
import simpleJava.Package;
import simpleJava.SimpleJavaFactory;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author lars fritsche
 */
public class Java2Doc extends IbexAdapter<Package, Folder>{
	public Java2Doc(String projectName) {
		super(new SimpleJavaComparator(true), new SimpleDocComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Package p = SimpleJavaFactory.eINSTANCE.createPackage();
			p.setName("org");
			
			synchroniser.getResourceHandler().getSourceResource().getContents().add(p);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}