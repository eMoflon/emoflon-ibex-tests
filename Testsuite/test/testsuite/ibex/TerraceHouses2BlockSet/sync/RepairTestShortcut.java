package testsuite.ibex.TerraceHouses2BlockSet.sync;

import static org.junit.Assume.assumeFalse;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.junit.Test;

import TerraceHouses.Building;
import TerraceHouses.District;
import TerraceHouses.House;
import TerraceHouses.Structure;
import WoodenBlockSet.Construction;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.sync.util.IbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.SyncTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import testsuite.ibex.testUtil.UsedPatternMatcher.PatternMatcher;

public class RepairTestShortcut extends SyncTestCase<District, Playroom> {

	private static final String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	private static final String DONT_USE_DEMOCLES = "Warning: to successfully execute this test do not use Democles";

	public RepairTestShortcut() {
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

	private void buildTerrace() {
		tool.performAndPropagateSourceEdit(d -> helperTerrace.createFirstBuilding(d, "Colorado Apartments", null));
		tool.performAndPropagateTargetEdit(p -> helperBlockSet.getConstruction(p, "Colorado Apartments").setConstructor("Henry"));
		tool.performAndPropagateSourceEdit(d -> helperTerrace.buildTerrace(helperTerrace.getBuilding(d, "Colorado Apartments")));
		tool.performAndPropagateTargetEdit(helperBlockSet::setColors);
	}

	private void buildSecond() {
		tool.performAndPropagateSourceEdit(d -> helperTerrace.createFirstBuilding(d, "Kaufmann Industries", "Am Waldfeld 19"));
		tool.performAndPropagateTargetEdit(p -> helperBlockSet.getConstruction(p, "Kaufmann Industries").setConstructor("Pete"));
		tool.performAndPropagateTargetEdit(helperBlockSet::setColors);
	}

	// TESTS //

	@Test
	public void testInit() {
		assertPostcondition("source/init", "target/init");
	}

	@Test
	public void terrace() {
		assertPrecondition("source/init", "target/init");
		buildTerrace();
		assertPostcondition("source/terrace", "target/terrace");
	}

	@Test
	public void changeRoof_FWD() {
		buildTerrace();
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateSourceEdit(root -> {
			House flatRoof = helperTerrace.getHouse(root, "Smith's House");
			flatRoof.setPitchedRoof(true);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}

	@Test
	public void changeRoof_BWD() {
		buildTerrace();
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateTargetEdit(root -> {
			Construction flatRoof = helperBlockSet.getConstruction(root, "Smith's House");
			helperBlockSet.createTriangularPrism(flatRoof, null);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}

	@Test
	public void insertHouse_FWD() {
		assumeFalse(DONT_USE_DEMOCLES, PatternMatcher.Democles.equals(UsedPatternMatcher.usedPatternMatcher));

		buildTerrace();
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateSourceEdit(root -> {
			House before = helperTerrace.getHouse(root, "Apartment House");
			Structure after = before.getNext();
			House newHouse = helperTerrace.createHouse(before, "The New House", "45267 Oldtown", true);
			newHouse.setNext(after);
		});
		assertPostcondition("source/insertHouse", "target/insertHouse");
	}

	@Test
	public void removeMiddleHouse_FWD() {
		assumeFalse(DONT_USE_DEMOCLES, PatternMatcher.Democles.equals(UsedPatternMatcher.usedPatternMatcher));

		buildTerrace();
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateSourceEdit(root -> {
			House before = helperTerrace.getHouse(root, "Apartment House");
			Structure middle = before.getNext();
			Structure after = middle.getNext();
			before.setNext(after);
			middle.setNext(null);
		});
		assertPostcondition("source/removeMiddleHouse", "target/removeMiddleHouse");
	}

	@Test
	public void moveMiddleHouseToTheTopOfAnotherOne() {
		buildTerrace();
		buildSecond();
		assertPrecondition("source/two", "target/two");

		tool.performAndPropagateSourceEdit(root -> {
			House houseBefore = helperTerrace.getHouse(root, "Apartment House");
			House house = (House) houseBefore.getNext();
			Building building = helperTerrace.getBuilding(root, "Kaufmann Industries");

			houseBefore.setNext(null);
			building.setNext(house);
		});

		assertPostcondition("source/move", "target/move");
	}

	@Test
	public void moveRootToTheTopOfAnotherOne() {
		buildTerrace();
		buildSecond();
		assertPrecondition("source/two", "target/two");

		tool.performAndPropagateSourceEdit(root -> {
			Building buildingC = helperTerrace.getBuilding(root, "Colorado Apartments");
			Building buildingK = helperTerrace.getBuilding(root, "Kaufmann Industries");

			buildingK.setNext(buildingC);
		});

		assertPostcondition("source/moveRoot", "target/moveRoot");
	}

}
