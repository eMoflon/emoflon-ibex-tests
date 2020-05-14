package testsuite.ibex.TerraceHouses2BlockSet.sync;

import static org.junit.Assume.assumeFalse;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.junit.Test;

import TerraceHouses.House;
import TerraceHouses.Structure;
import WoodenBlockSet.BlockSet;
import WoodenBlockSet.Construction;
import testsuite.ibex.TerraceHouses2BlockSet.sync.util.IbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.SyncTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;
import testsuite.ibex.testUtil.UsedPatternMatcher.PatternMatcher;

public class RepairTestShortcut extends SyncTestCase<Structure, BlockSet> {

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

	private void buildTerrace(IbexAdapter<Structure, BlockSet> adapter) {
		tool.performAndPropagateTargetEdit(s -> s.getConstructions().get(0).setConstructor("Henry"));
		tool.performAndPropagateSourceEdit(helperTerrace::buildTerrace);
		tool.performAndPropagateTargetEdit(helperBlockSet::setColors);
	}

	@Test
	public void testInit() {
		assertPostcondition("source/init", "target/init");
	}

	@Test
	public void terrace() {
		assertPrecondition("source/init", "target/init");
		buildTerrace(tool);
		assertPostcondition("source/terrace", "target/terrace");
	}

	@Test
	public void changeRoof_FWD() {
		buildTerrace(tool);
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateSourceEdit(root -> {
			House flatRoof = helperTerrace.getHouse(root, "Smith's House");
			flatRoof.setPitchedRoof(true);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}

	@Test
	public void changeRoof_BWD() {
		buildTerrace(tool);
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateTargetEdit(set -> {
			Construction flatRoof = helperBlockSet.getConstruction(set, "Smith's House");
			helperBlockSet.createTriangularPrism(flatRoof, null);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}

	@Test
	public void insertHouse_FWD() {
		assumeFalse(DONT_USE_DEMOCLES, PatternMatcher.Democles.equals(UsedPatternMatcher.usedPatternMatcher));

		buildTerrace(tool);
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

		buildTerrace(tool);
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

}
