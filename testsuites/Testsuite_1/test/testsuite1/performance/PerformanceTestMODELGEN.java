package testsuite1.performance;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;

import language.TGG;
import testsuite1.performance.util.TestCaseParameters;
import testsuite1.performance.util.TestDataPoint;
import testsuite1.testUtil.Operationalization;

public class PerformanceTestMODELGEN extends PerformanceTest<MODELGEN> {
	
	private Function<TGG, MODELGENStopCriterion> stops;
	
	@Override
	public long timedExecution() throws IOException {
		if (!initialized)
			throw new NullPointerException("Generator has not been initialized yet. Call timedInit() before this method.");
		op.setStopCriterion(stops.apply(op.getTGG()));
		
		return timedExecution();
	}
	
	public TestDataPoint repeatedTimedExecutionAndInit(Supplier<MODELGEN> generator, Function<TGG, MODELGENStopCriterion> stops, int size, int repetitions) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");

		this.stops = stops;
		
		List<TestDataPoint> data = new ArrayList<>();
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		
		for (int i = 0; i < repetitions; i++) {
			System.out.println("MODELGEN: size="+size+": "+(i+1)+"-th execution started.");

			data.add(timedExecutionAndInit(generator, size));
			initTimes[i] = data.get(i).initTimes[0];
			executionTimes[i] = data.get(i).executionTimes[0];
			
			System.out.println((i+1)+"-th execution finished. ");
		}
		
		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.testCase = new TestCaseParameters(generator.get().getTGG().getName(), Operationalization.MODELGEN, size);
		return result;
	}

	@Override
	public TestDataPoint timedExecutionAndInit(Supplier<MODELGEN> generator, int size) throws IOException {
		
		TestDataPoint result = super.timedExecutionAndInit(generator, size);
		op.saveModels();
		
		return result;
	}

	@Override
	protected Operationalization getOpType() {
		return Operationalization.MODELGEN;
	}
}
