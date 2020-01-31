package testsuite.ibex.TerraceHouses2BlockSet.sync.util;

import static testsuite.ibex.performance.util.PerformanceConstants.workspacePath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.benchmarx.terracehouses.core.TerraceHousesComparator;
import org.benchmarx.woodenblockset.core.BlockSetComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.repair.shortcut.rule.OperationalShortcutRule;
import org.emoflon.ibex.tgg.operational.repair.shortcut.updatepolicy.IShortcutRuleUpdatePolicy;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.SYNC_App;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.HiPERegistrationHelper;

import TerraceHouses.Building;
import TerraceHouses.TerraceHousesFactory;
import WoodenBlockSet.BlockSet;
import language.TGGRule;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexTerraceHouses2BlockSet extends IbexAdapter<Building, BlockSet> {

	private static final List<String> notPreferred = Arrays.asList("Building2Construction");
	
	private IShortcutRuleUpdatePolicy updatepolicy = (shortcutRules, brokenMatch, target) -> {
		List<OperationalShortcutRule> notPreferredSCRs = new ArrayList<>();
		for (OperationalShortcutRule scr : shortcutRules) {
			TGGRule trgRule = scr.getScRule().getTargetRule();
			if (notPreferred.contains(trgRule.getName()))
				notPreferredSCRs.add(scr);
			else
				return scr;
		}
		return notPreferredSCRs.stream().findFirst().orElse(null);
	};

	public IbexTerraceHouses2BlockSet(String projectName) {
		super(new TerraceHousesComparator(), new BlockSetComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(
					new IRegistrationHelper[] { new DemoclesRegistrationHelper(), new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, workspacePath, false);
			synchroniser.getOptions().setShortcutRuleUpdatePolicy(updatepolicy);

			Building root = TerraceHousesFactory.eINSTANCE.createBuilding();
			root.setName("Colorado Apartments");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(root);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}