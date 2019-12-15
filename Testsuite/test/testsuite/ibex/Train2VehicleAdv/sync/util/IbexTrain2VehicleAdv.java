package testsuite.ibex.Train2VehicleAdv.sync.util;

import java.io.IOException;

import org.benchmarx.advancedtrain.core.AdvancedTrainComparator;
import org.benchmarx.advancedvehicle.core.AdvancedVehicleComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.train2vehicleadvanced.SYNC_App;
import org.emoflon.ibex.tgg.run.train2vehicleadvanced.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.train2vehicleadvanced.config.HiPERegistrationHelper;

import AdvancedTrain.AdvancedTrainFactory;
import AdvancedTrain.Train;
import AdvancedVehicle.Vehicle;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexTrain2VehicleAdv extends IbexAdapter<Train, Vehicle> {

	public IbexTrain2VehicleAdv(String projectName) {
		super(new AdvancedTrainComparator(), new AdvancedVehicleComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] {new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Train t = AdvancedTrainFactory.eINSTANCE.createTrain();
			
			synchroniser.getSourceResource().getContents().add(t);			
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
