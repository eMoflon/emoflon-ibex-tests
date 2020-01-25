package testsuite.ibex.ArToQou.sync.util;

import java.io.IOException;

import org.benchmarx.ar.core.ArComparator;
import org.benchmarx.qou.core.QouComparator;
import org.emoflon.ibex.tgg.run.artoqou.SYNC_App;
import org.emoflon.ibex.tgg.run.artoqou.config.DemoclesRegistrationHelper;

import Ar.ArFactory;
import Ar.RClass;
import Qou.QClass;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexArToQou extends IbexAdapter<RClass, QClass> {

	public IbexArToQou(String projectName) {
		super(new ArComparator(), new QouComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
//			SYNC_App.registrationHelper = new HiPERegistrationHelper();
			SYNC_App.registrationHelper = new DemoclesRegistrationHelper();
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			RClass r = ArFactory.eINSTANCE.createRClass();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(r);
			
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
