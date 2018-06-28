package testsuite.ibex.Java2Doc.sync.util;

import java.io.IOException;

import org.benchmarx.simpledoc.core.SimpleDocComparator;
import org.benchmarx.simpledoc.core.SimpleJavaComparator;
import org.emoflon.ibex.tgg.run.java2doc.SYNC_App;

import simpleDoc.Folder;
import simpleJava.Package;
import simpleJava.SimpleJavaFactory;
import testsuite.ibex.testUtil.IbexAdapter;

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
			synchroniser = new SYNC_App(projectName, testsuite.ibex.testUtil.Constants.workspacePath, false);
			
			Package p = SimpleJavaFactory.eINSTANCE.createPackage();
			p.setName("org");
			
			synchroniser.getSourceResource().getContents().add(p);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}