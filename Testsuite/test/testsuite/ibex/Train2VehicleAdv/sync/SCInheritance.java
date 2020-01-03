package testsuite.ibex.Train2VehicleAdv.sync;

import org.junit.Test;

import AdvancedTrain.Train;
import AdvancedVehicle.Vehicle;
import testsuite.ibex.Train2VehicleAdv.sync.util.IbexTrain2VehicleAdv;
import testsuite.ibex.testUtil.SyncTestCase;

public class SCInheritance extends SyncTestCase<Train, Vehicle> {
	
	private static final String projectName = "Train2VehicleAdvanced";

	public SCInheritance() {
		super(new IbexTrain2VehicleAdv(projectName));
	}

	@Override
	protected void initHelpers() {
		
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void initialTest() {
		assertPostcondition("in/init", "expected/init");
	}

}
