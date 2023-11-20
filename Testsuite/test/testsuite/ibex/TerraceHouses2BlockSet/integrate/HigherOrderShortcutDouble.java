package testsuite.ibex.TerraceHouses2BlockSet.integrate;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.junit.jupiter.api.Test;

import TerraceHouses.District;
import TerraceHouses.House;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.integrate.util.IntegIbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class HigherOrderShortcutDouble extends IntegrateTestCase<District, Playroom> {
	
	public final static String projectName = "TerraceHouses2BlockSet";
	
	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	public HigherOrderShortcutDouble() {
		super(new IntegIbexTerraceHouses2BlockSet(projectName, "double_shortcut"));
	}
	
	@Override
	protected void initHelpers() {
		helperTerrace = new TerraceHousesHelper();
		helperBlockSet = new WoodenBlockSetHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	private final String testpath = "integrate/expected/hoshortcut/";
	
	@Test
	public void changeBigRoof_FWD() {
		tool.getOptions().repair.usePGbasedSCruleCreation(true);
		
		tool.applyAndIntegrateDelta((d, p) -> {
			House firstBigHouse = helperTerrace.getHouse(d, "Big House I");
			House secondBigHouse = helperTerrace.getHouse(d, "Big House II");
			
			firstBigHouse.setPitchedRoof(false);
			secondBigHouse.setPitchedRoof(false);
		});
		
		// TODO assert condition
	}

}
