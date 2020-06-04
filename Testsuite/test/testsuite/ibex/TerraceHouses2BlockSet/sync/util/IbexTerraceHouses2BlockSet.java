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
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.ViatraRegistrationHelper;

import TerraceHouses.Building;
import TerraceHouses.Structure;
import TerraceHouses.TerraceHousesFactory;
import WoodenBlockSet.BlockSet;
import language.TGGRule;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexTerraceHouses2BlockSet extends IbexAdapter<Structure, BlockSet> {

	private static final List<String> notPreferred = Arrays.asList("Building2Construction");
	
	private IShortcutRuleUpdatePolicy updatepolicy = (shortcutRules, brokenMatch, target) -> {
		List<OperationalShortcutRule> notPreferredSCRs = new ArrayList<>();
		for (OperationalShortcutRule scr : shortcutRules) {
			TGGRule replacingRule = scr.getScRule().getReplacingRule();
			if (notPreferred.contains(replacingRule.getName()))
				notPreferredSCRs.add(scr);
			else
				return scr;
		}
		return notPreferredSCRs.stream().findFirst().orElse(null);
	};

	public IbexTerraceHouses2BlockSet(String projectName) {
		super(new TerraceHousesComparator(true), new BlockSetComparator(true), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(
					new IRegistrationHelper[] { new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
			synchroniser = new SYNC_App(projectName, workspacePath, false);
			synchroniser.getOptions().repair.shortcutRuleUpdatePolicy(updatepolicy);

			Building root = TerraceHousesFactory.eINSTANCE.createBuilding();
			root.setName("Colorado Apartments");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(root);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
