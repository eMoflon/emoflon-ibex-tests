package testsuite.ibex.performance.run;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

import language.TGG;
import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.TestCaseParameters;
import testsuite.ibex.performance.util.TestDataPoint;

public class PerformanceTestSYNC extends PerformanceTest<SYNC> {
	
	private Operationalization opType;
	private boolean isForward;
	
	@Override
	protected long timedExecution() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		if (isForward)
			op.forward();
		else
			op.backward();
		
		long toc = System.nanoTime();
		
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	@Override
	public TestDataPoint timedExecutionAndInit(Supplier<SYNC> transformator, int size) throws IOException {
		throw new UnsupportedOperationException("The SYNC operation requires additional parameters.");
	}

	public List<TestDataPoint> timedExecutionAndInit(Supplier<SYNC_App> transformator, int size, int repetitions, Operationalization opType, Consumer<EObject> edit) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		this.opType = opType;
		isForward = opType == Operationalization.FWD || opType == Operationalization.INITIAL_FWD;
		
		long[] initTimes = new long[repetitions];
		long[] batchExecutionTimes = new long[repetitions];
		long[] incrementalExecutionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC_App sync = transformator.get();
			ExecutorService es = Executors.newSingleThreadExecutor();
			System.out.println(opType +": size="+size+": "+(i+1)+"-th execution started.");
			
			if (useTimeouts)
				try {
					Future<Long> initResult = es.submit(() -> timedInit(sync));
				    initTimes[i] = initResult.get(PerformanceConstants.timeout, TimeUnit.SECONDS);
					tgg = sync.getTGG();
					
					// batch
				    Future<Long> batchExecutionResult = es.submit(() -> timedExecution());
				    batchExecutionTimes[i] = batchExecutionResult.get(useTimeouts ? PerformanceConstants.timeout : Long.MAX_VALUE, TimeUnit.SECONDS);
					
					// incremental
				    Resource model = isForward ? sync.getSourceResource() : sync.getTargetResource();
					edit.accept(model.getContents().get(0));
	
				    Future<Long> incrExecutionResult = es.submit(() -> timedExecution());
				    incrementalExecutionTimes[i] = incrExecutionResult.get(useTimeouts ? PerformanceConstants.timeout : Long.MAX_VALUE, TimeUnit.SECONDS);
				} catch (TimeoutException e) {
			    	System.out.println("Timeout!");
			    	System.exit(0);
				} catch (Exception e) {
					e.printStackTrace();
				} 
			
				System.out.println((i+1)+"-th execution finished. ");
		    	es.shutdownNow();
				terminate();	
		}

		TestDataPoint batchData = new TestDataPoint(initTimes, batchExecutionTimes);
		batchData.testCase = new TestCaseParameters(tgg.getName(), opType, size);
		
		TestDataPoint incData = new TestDataPoint(initTimes, incrementalExecutionTimes);
		incData.testCase = new TestCaseParameters(tgg.getName(), isForward ? Operationalization.INCREMENTAL_FWD : Operationalization.INCREMENTAL_BWD, size);
		
		return Arrays.asList(batchData, incData);
	}

	@Override
	protected Operationalization getOpType() {
		return opType;
	}
}
