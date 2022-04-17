package testsuite.ibex.TerraceHouses2BlockSet.integrate;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.emoflon.ibex.common.emf.EMFManipulationUtils;
import org.junit.jupiter.api.Test;

import TerraceHouses.Building;
import TerraceHouses.District;
import TerraceHouses.Structure;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.integrate.util.IntegIbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class HigherOrderShortcut extends IntegrateTestCase<District, Playroom> {

	public final static String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	public HigherOrderShortcut() {
		super(new IntegIbexTerraceHouses2BlockSet(projectName, "concat_shortcut"));
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
	public void insertRootBuilding_FWD() {
		tool.applyAndIntegrateDelta((d, p) -> {
			Building firstBuilding = helperTerrace.getBuilding(d, "Colorado Apartments");
			Building newFirstBuilding = helperTerrace.createFirstBuilding(d, "New Root Building", "45267 Oldtown");

			newFirstBuilding.setNext(firstBuilding);
			d.getStreetBeginnings().remove(firstBuilding);
		});

		assertCondition(testpath + "hoshortcut_insert/");
	}

	@Test
	public void removeRootBuilding_FWD() {
		tool.applyAndIntegrateDelta((d, p) -> {
			Building firstBuilding = helperTerrace.getBuilding(d, "Colorado Apartments");
			Structure secondBuilding = firstBuilding.getNext();

			d.getStreetBeginnings().add(secondBuilding);
			firstBuilding.setNext(null);
			EMFManipulationUtils.delete(firstBuilding);
		});

		assertCondition(testpath + "hoshortcut_remove/");
	}

}
