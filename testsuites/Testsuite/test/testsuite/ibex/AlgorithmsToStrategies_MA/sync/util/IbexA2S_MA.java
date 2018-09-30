package testsuite.ibex.AlgorithmsToStrategies_MA.sync.util;

import java.io.IOException;

import org.benchmarx.strategy.core.StrategyComparator;
import org.emoflon.ibex.tgg.run.algorithmtostrategy_ma.SYNC_App;

import Algorithms.AlgorithmContainer;
import Algorithms.AlgorithmsFactory;
import Strategies.StrategyContainer;
import benchmarx.algorithm.core.AlgorithmComparator;
import testsuite.ibex.testUtil.IbexAdapter;

public class IbexA2S_MA extends IbexAdapter<AlgorithmContainer, StrategyContainer>{

	public IbexA2S_MA(String projectName) {
		super(new AlgorithmComparator(), new StrategyComparator(), projectName);
	}

	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			AlgorithmContainer ac = AlgorithmsFactory.eINSTANCE.createAlgorithmContainer();
			ac.setName("AC");	
			synchroniser.getSourceResource().getContents().add(ac);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
