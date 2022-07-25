package testsuite.ibex.TerraceHouses2BlockSet.integrate;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.junit.jupiter.api.Test;

import TerraceHouses.Building;
import TerraceHouses.District;
import TerraceHouses.House;
import TerraceHouses.Skyway;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.integrate.util.IntegIbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class HigherOrderShortcutDiamand extends IntegrateTestCase<District, Playroom> {

	public final static String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	public HigherOrderShortcutDiamand() {
		super(new IntegIbexTerraceHouses2BlockSet(projectName, "diamand_shortcut"));
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
	public void switchAttributes_FWD() {
		tool.getOptions().repair.usePGbasedSCruleCreation(true);
		
		tool.applyAndIntegrateDelta((d, p) -> {
			House prefab = helperTerrace.getHouse(d, "Apartment House");
			House noPrefab = helperTerrace.getHouse(d, "Fitnessstudio");
			Skyway skyway = prefab.getSkywayEntry();
			
			prefab.setPrefab(false);
			noPrefab.setPrefab(true);
			noPrefab.setSkywayEntry(skyway);
			skyway.setExit(prefab);
		});

//		assertCondition(testpath + "hoshortcut_switchattr/");
	}

}
