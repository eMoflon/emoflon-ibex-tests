package testsuite.ibex.performance.run;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;

import gurobi.GRBException;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.TestDataPoint;

public class PerformanceTestBWD_OPT extends PerformanceTest<BWD_OPT> {

	public TestDataPoint repeatedTimedExecutionAndInit(Supplier<BWD_OPT> checker, int size, int repetitions) throws IOException, GRBException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		List<TestDataPoint> data = new ArrayList<>();
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		
		for (int i = 0; i < repetitions; i++) {
			System.out.println("BWD_OPT: size="+size+": "+(i+1)+"-th execution started.");
			
			data.add(timedExecutionAndInit(checker, size));
			initTimes[i] = data.get(i).initTimes[0];
			executionTimes[i] = data.get(i).executionTimes[0];
			
			System.out.println((i+1)+"-th execution finished. ");
		}

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.testCase = data.get(0).testCase;
		return result;
	}

	@Override
	protected Operationalization getOpType() {
		return Operationalization.BWD_OPT;
	}
}
