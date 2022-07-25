package testsuite.ibex.TerraceHouses2BlockSet.sync;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.junit.jupiter.api.Test;

import TerraceHouses.Building;
import TerraceHouses.District;
import TerraceHouses.House;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.sync.util.IbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.SyncTestCase;

public class BatchTests extends SyncTestCase<District, Playroom> {

	private static final String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	public BatchTests() {
		super(new IbexTerraceHouses2BlockSet(projectName));
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

	@Test
	public void skyway() {
		tool.performAndPropagateSourceEdit(d -> {
			helperTerrace.createFirstBuilding(d, "Colorado Apartments", null);
			helperTerrace.createFirstBuilding(d, "Hotel im Kornspeicher", null);
		});
		tool.performAndPropagateTargetEdit(p -> {
			helperBlockSet.getConstruction(p, "Colorado Apartments").setConstructor("Henry");
			helperBlockSet.getConstruction(p, "Hotel im Kornspeicher").setConstructor("Gerlinde");
		});
		tool.performAndPropagateSourceEdit(d -> {
			Building colorado = helperTerrace.getBuilding(d, "Colorado Apartments");
			House apartment = helperTerrace.createHouse(colorado, "Apartment House", "5338 Colorado Ave NW", false, true);
			Building hotel = helperTerrace.getBuilding(d, "Hotel im Kornspeicher");
			House studio = helperTerrace.createHouse(hotel, "Fitnessstudio", "Universitätsstraße 8, Marburg", false, false);
			helperTerrace.createSkyway(apartment, studio, "Fancy Bridge");
		});
		tool.performAndPropagateTargetEdit(p -> {
			helperBlockSet.getPrinted3dShape(p, "Fancy Bridge").setColor("Rainbow");
		});

		assertPostcondition("source/skyway", "target/skyway");
	}

}
