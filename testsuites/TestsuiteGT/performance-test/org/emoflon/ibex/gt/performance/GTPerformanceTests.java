package org.emoflon.ibex.gt.performance;

public class GTPerformanceTests {

	public static void main(String[] args) {
		int testsPerSize = 20;
		int[] modelSizes = { 1000, 5000, 10000, 25000, 50000, 75000 };

		new SheRememberedCaterpillarsPerformanceTest1().run(testsPerSize, modelSizes);
		new SimpleFamiliesPerformanceTest().run(testsPerSize, modelSizes);
	}
}
