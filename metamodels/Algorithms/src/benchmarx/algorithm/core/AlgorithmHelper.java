package benchmarx.algorithm.core;

import Algorithms.Algorithm;
import Algorithms.AlgorithmContainer;
import Algorithms.AlgorithmsFactory;

public class AlgorithmHelper {
	
	public void createAlgorithm(AlgorithmContainer ac, String name) {
		
		Algorithm algo = AlgorithmsFactory.eINSTANCE.createAlgorithm();
		algo.setName(name);
		ac.getAlgorithms().add(algo);
	}

}
