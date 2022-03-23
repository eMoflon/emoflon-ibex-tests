package testsuite.ibex.TerraceHouses2BlockSet.integrate.util;

import java.io.IOException;

import org.benchmarx.terracehouses.core.TerraceHousesComparator;
import org.benchmarx.woodenblockset.core.BlockSetComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.INTEGRATE_App;

import TerraceHouses.District;
import WoodenBlockSet.Playroom;
import testsuite.ibex.testUtil.IntegIbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IntegIbexTerraceHouses2BlockSet extends IntegIbexAdapter<District, Playroom> {

	private final String inputFolder;

	public IntegIbexTerraceHouses2BlockSet(String projectName, String inputFolder) {
		super(new TerraceHousesComparator(true), new BlockSetComparator(true), new TerraceHouses2BlockSetCorrComparator(), projectName);
		this.inputFolder = inputFolder;
	}

	@Override
	public void initiateIntegrationDialogue() {
		try {
			INTEGRATE_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[] { 
							new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			integrator = new INTEGRATE_App(projectName, 
					testsuite.ibex.performance.util.PerformanceConstants.workspacePath, "/resources/integrate/in/" + inputFolder,
					ilpSolver, false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
