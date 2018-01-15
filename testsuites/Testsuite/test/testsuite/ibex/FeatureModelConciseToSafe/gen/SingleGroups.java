package testsuite.ibex.FeatureModelConciseToSafe.gen;

import java.io.IOException;
import java.util.ArrayList;

import org.benchmarx.featuremodelconcise.core.FeatureModelConciseComparator;
import org.benchmarx.featuremodelsafe.core.FeatureModelSafeComparator;
import org.eclipse.emf.ecore.EObject;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.matches.IMatch;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import FeatureModelConcise.Model;
import language.TGGRule;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SingleGroups extends ModelGenTestCase<FeatureModelConcise.Model, FeatureModelSafe.Model>{

	@Override
	protected String getProjectName() {
		return "FeatureModelConciseToSafe";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.testUtil.Constants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new FeatureModelConciseComparator(false);
		targetComp = new FeatureModelSafeComparator(false);
	}
	
	@Test
	public void testORGroup() throws IOException {
		stop.setMaxRuleCount("RootAxiomRule", 1);
		stop.setMaxRuleCount("XOrRule", 2);
		stop.setMaxRuleCount("CreateXOrRule", 1);
		stop.setMaxRuleCount("SolitaryFeatureRule", 1);
		
		generator.setUpdatePolicy(matches -> {
			ArrayList<IMatch> filteredMatches = new ArrayList<>();
			filteredMatches.addAll(matches.getMatches());
			
			filteredMatches.removeIf(m -> matches.getRuleName(m).equals("CreateXOrRule") && !(((EObject) m.get("conciseParent")).eContainer() instanceof Model));
			filteredMatches.removeIf(m -> matches.getRuleName(m).equals("SolitaryFeatureRule") && !(((EObject) m.get("conciseParent")).eContainer() instanceof Model));
			
			if(filteredMatches.isEmpty())
				return matches.getNextRandom();
			else 
				return filteredMatches.get(0);
		});
		
		runGenerator(stop);
		assertPostcondition("XORGroup3FeaturesConcise", "XORGroup3FeaturesSafe");
	}
	
}
