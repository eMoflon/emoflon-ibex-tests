package org.emoflon.ibex.gt.performance;

import org.emoflon.ibex.gt.disjointperformance.FastEconomicsModelTest;
import org.emoflon.ibex.gt.disjointperformance.SlowEconomicsModelTest;

public class GTPerformanceTests {

	public static void main(String[] args) {
		int testsPerSize = 10;
		int[] modelSizes = { 5000, //
				20000, 40000, 60000, 80000, 100000, //
				120000, 140000, 160000, 180000, 200000, //
				220000, 240000, 260000, 280000, 300000, //
				320000 };

		new SheRememberedCaterpillarsPerformanceTest1().run(testsPerSize, modelSizes);
		new SheRememberedCaterpillarsPerformanceTest2().run(testsPerSize, modelSizes);
		new SimpleFamiliesPerformanceTest().run(testsPerSize, modelSizes);
		
		//for checking the performance of the disjoint pattern module
		int[] economicsModelSizes = {1,2,3,4,5};
		
//		new FastEconomicsModelTest().run(testsPerSize, economicsModelSizes);
//		new SlowEconomicsModelTest().run(testsPerSize, economicsModelSizes);
	}
}
