package testsuite.ibex.TerraceHouses2BlockSet.sync;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;

import TerraceHouses.Building;
import TerraceHouses.House;
import WoodenBlockSet.BlockSet;
import WoodenBlockSet.Construction;
import testsuite.ibex.TerraceHouses2BlockSet.sync.util.IbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.SyncTestCase;

public class RepairTestShortcut extends SyncTestCase<Building, BlockSet>{
	
	private static final String projectName = "TerraceHouses2BlockSet";
	
	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

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
	
	private void buildTerrace(IbexAdapter<Building, BlockSet> adapter) {
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
			House flatRoof = helperTerrace.getHouse(root, "Apartment House");
			flatRoof.setPitchedRoof(true);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}
	
	@Test
	public void changeRoof_BWD() {
		buildTerrace(tool);
		assertPrecondition("source/terrace", "target/terrace");
		
		tool.performAndPropagateTargetEdit(set -> {
			Construction flatRoof = helperBlockSet.getConstruction(set, "Apartment House");
			helperBlockSet.createTriangularPrism(flatRoof, null);
		});
		assertPostcondition("source/changeRoof", "target/changeRoof");
	}
	
	@Test
	public void generalizeHouse_BWD() {
		buildTerrace(tool);
		assertPrecondition("source/terrace", "target/terrace");

		tool.performAndPropagateTargetEdit(set -> {
			Construction house = helperBlockSet.getConstruction(set, "Apartment House");
			EcoreUtil.deleteAll(house.getComponents(), true);
			helperBlockSet.createCuboid(house, "green");
		});
		assertPostcondition("source/generalizeHouse", "target/generalizeHouse");
	}

}
