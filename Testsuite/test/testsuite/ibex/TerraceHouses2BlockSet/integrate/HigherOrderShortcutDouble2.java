package testsuite.ibex.TerraceHouses2BlockSet.integrate;

import java.util.List;

import org.benchmarx.terracehouses.core.TerraceHousesHelper;
import org.benchmarx.woodenblockset.core.WoodenBlockSetHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.junit.jupiter.api.Test;

import TerraceHouses.District;
import TerraceHouses.House;
import WoodenBlockSet.Playroom;
import testsuite.ibex.TerraceHouses2BlockSet.integrate.util.IntegIbexTerraceHouses2BlockSet;
import testsuite.ibex.testUtil.IntegrateTestCase;

public class HigherOrderShortcutDouble2 extends IntegrateTestCase<District, Playroom> {

	public final static String projectName = "TerraceHouses2BlockSet";

	private TerraceHousesHelper helperTerrace;
	private WoodenBlockSetHelper helperBlockSet;

	public HigherOrderShortcutDouble2() {
		super(new IntegIbexTerraceHouses2BlockSet(projectName, "double_shortcut2"));
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

	private final IntegrationPattern pattern = new IntegrationPattern(List.of( //
			FragmentProvider.REPAIR, //
			FragmentProvider.RESOLVE_BROKEN_MATCHES, //
			FragmentProvider.TRANSLATE, //
			FragmentProvider.CLEAN_UP //
	));

	private final String testpath = "integrate/expected/hoshortcut/";
	
	@Test
	public void changeBigRoofLong_FWD() {
		tool.getOptions().integration.pattern(pattern);
		tool.getOptions().repair.usePGbasedSCruleCreation(true);

		tool.applyAndIntegrateDelta((d, p) -> {
			House firstBigHouse = helperTerrace.getHouse(d, "Big House I");
			House secondBigHouse = helperTerrace.getHouse(d, "Big House II");
			House petesHouse = helperTerrace.getHouse(d, "Pete's House");

			firstBigHouse.setPitchedRoof(false);
			secondBigHouse.setPitchedRoof(false);
			petesHouse.setPitchedRoof(false);
		});

		assertCondition(testpath + "hoshortcut_changebigrooflong/");
	}

}
