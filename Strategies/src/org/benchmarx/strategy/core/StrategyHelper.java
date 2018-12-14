package org.benchmarx.strategy.core;

import Strategies.StrategiesFactory;
import Strategies.Strategy;
import Strategies.StrategyContainer;

public class StrategyHelper {
	
	public void createStrategy(StrategyContainer sc, String name) {
		
		Strategy strat = StrategiesFactory.eINSTANCE.createStrategy();
		strat.setName(name);
		sc.getStrategies().add(strat);
	}

}
