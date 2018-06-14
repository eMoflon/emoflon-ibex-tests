package org.emoflon.ibex.gt.performance;

public class GTPerformanceTests {

	public static void main(String[] args) {
		int testsPerSize = 10;
		int[] modelSizes1 = { 1000, 5000, 10000, 25000, 50000, 75000, 100000 };
		int[] modelSizes2 = { 1000, 5000, 10000, 25000, 50000 };

		new SheRememberedCaterpillarsCreationPerformanceTest().run(testsPerSize, modelSizes1);
		new SimpleFamiliesCreationPerformanceTest().run(testsPerSize, modelSizes2);
	}
}
