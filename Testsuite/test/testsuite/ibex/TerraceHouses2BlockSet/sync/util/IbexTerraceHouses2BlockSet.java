package testsuite.ibex.TerraceHouses2BlockSet.sync.util;

import static testsuite.ibex.performance.util.PerformanceConstants.workspacePath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.benchmarx.terracehouses.core.TerraceHousesComparator;
import org.benchmarx.woodenblockset.core.BlockSetComparator;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.SYNC_App;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.repair.shortcut.rule.OperationalShortcutRule;
import org.emoflon.ibex.tgg.runtime.repair.shortcut.updatepolicy.IShortcutRuleUpdatePolicy;
import org.emoflon.ibex.tgg.tggmodel.IBeXTGGModel.TGGRule;

import TerraceHouses.District;
import TerraceHouses.TerraceHousesFactory;
import WoodenBlockSet.Playroom;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class IbexTerraceHouses2BlockSet extends IbexAdapter<District, Playroom> {

	private static final List<String> notPreferred = Arrays.asList("Building2Construction");
	
	private IShortcutRuleUpdatePolicy updatepolicy = (shortcutRules, brokenMatch) -> {
		List<OperationalShortcutRule> notPreferredSCRs = new ArrayList<>();
		for (OperationalShortcutRule scr : shortcutRules) {
			TGGRule replacingRule = scr.getOperationalizedSCR().getReplacingRule();
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
					new IRegistrationHelper[] {  new HiPERegistrationHelper() });
			synchroniser = new SYNC_App(projectName, workspacePath, ilpSolver, false);
			synchroniser.getOptions().repair.shortcutRuleUpdatePolicy(updatepolicy);

			District root = TerraceHousesFactory.eINSTANCE.createDistrict();
			synchroniser.getResourceHandler().getSourceResource().getContents().add(root);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
