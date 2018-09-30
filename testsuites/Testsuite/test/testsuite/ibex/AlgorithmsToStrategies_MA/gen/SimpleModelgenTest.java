package testsuite.ibex.AlgorithmsToStrategies_MA.gen;

import java.io.IOException;

import org.benchmarx.strategy.core.StrategyComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import Algorithms.AlgorithmContainer;
import benchmarx.algorithm.core.AlgorithmComparator;
import language.TGGRule;
import Strategies.StrategyContainer;
import testsuite.ibex.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<AlgorithmContainer, StrategyContainer>{
	
	@Override
	protected String getProjectName() {
		return "AlgorithmToStrategy_MA";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new AlgorithmComparator();
		targetComp = new StrategyComparator();
	}
	
	@Test
	public void testContainers() throws IOException {
		stop.setMaxRuleCount("AlgoContainerToStrategyContainer", 1);
		runGenerator(stop);
		assertPostcondition("in/01_ContainersOnly", "expected/01_ContainersOnly");
	}
	
	@Test
	public void testCreateOnlyStrategy() throws IOException {
		stop.setMaxRuleCount("AlgoContainerToStrategyContainer", 1);
		stop.setMaxRuleCount("CreateStrategy", 1);
		runGenerator(stop);
		assertPostcondition("in/01_ContainersOnly", "expected/02_OneStrategy");
	}
	
	@Test
	public void testCreateOnlyAlgorithm() throws IOException {
		stop.setMaxRuleCount("AlgoContainerToStrategyContainer", 1);
		stop.setMaxRuleCount("CreateAlgorithm", 1);
		runGenerator(stop);
		assertPostcondition("in/03_OneAlgo", "expected/01_ContainersOnly");
	}

	@Test
	public void testCreateOneAlgoOneStrategy() throws IOException {
		stop.setMaxRuleCount("AlgoContainerToStrategyContainer", 1);
		stop.setMaxRuleCount("CreateStrategy", 1);
		stop.setMaxRuleCount("CreateAlgorithm", 1);
		runGenerator(stop);
		assertPostcondition("in/03_OneAlgo", "expected/02_OneStrategy");
	}

	@Test
	public void testCreateThreeAlgosFourStrategy() throws IOException {
		stop.setMaxRuleCount("AlgoContainerToStrategyContainer", 1);
		stop.setMaxRuleCount("CreateStrategy", 4);
		stop.setMaxRuleCount("CreateAlgorithm", 3);
		runGenerator(stop);
		assertPostcondition("in/05_ThreeAlgosFourStrategy", "expected/05_ThreeAlgosFourStrategy");
	}
}







