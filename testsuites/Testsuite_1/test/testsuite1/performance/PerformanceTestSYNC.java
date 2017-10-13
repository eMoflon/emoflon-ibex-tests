package testsuite1.performance;

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
import testsuite1.performance.util.PerformanceConstants;
import testsuite1.performance.util.TestCaseParameters;
import testsuite1.performance.util.TestDataPoint;
import testsuite1.testUtil.Operationalization;

public class PerformanceTestSYNC extends PerformanceTest<SYNC> {
	
	private long timedFwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		op.forward();
		long toc = System.nanoTime();

		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	private long timedBwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		op.backward();
		long toc = System.nanoTime();
		
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	@Override
	protected long timedExecution() {
		throw new UnsupportedOperationException("SYNC must only be used with timedFwd() or timedBwd()!");
	}
	
	public TestDataPoint timedSyncAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean isFwd) throws IOException {
		return this.timedSyncAndInit(transformator, size, repetitions, isFwd, (o)->{}, false).get(0);
	}
	
	public List<TestDataPoint> timedSyncAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean isFwd, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] batchExecutionTimes = new long[repetitions];
		long[] incrementalExecutionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			ExecutorService es = Executors.newSingleThreadExecutor();
			System.out.println((isFwd ? Operationalization.FWD : Operationalization.BWD)+": size="+size+": "+(i+1)+"-th execution started.");

			if (useTimeouts)
				try {
					Future<Long> initResult = es.submit(() -> timedInit(sync));
				    initTimes[i] = initResult.get(PerformanceConstants.timeout, TimeUnit.SECONDS);
					tgg = sync.getTGG();
					
					// batch
				    Future<Long> batchExecutionResult = es.submit(() -> isFwd ? timedFwd() : timedBwd());
				    batchExecutionTimes[i] = batchExecutionResult.get(PerformanceConstants.timeout, TimeUnit.SECONDS);
					
					// incremental
					if (incr) {
						Resource model = isFwd ? sync.getSourceResource() : sync.getTargetResource();
						edit.accept(model.getContents().get(0));
		
					    Future<Long> incrExecutionResult = es.submit(() -> isFwd ? timedFwd() : timedBwd());
					    incrementalExecutionTimes[i] = incrExecutionResult.get(PerformanceConstants.timeout, TimeUnit.SECONDS);
					}
				} catch (TimeoutException e) {
			    	System.out.println("Timeout!");
			    	System.exit(0);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					terminate();
				    es.shutdownNow();
				    try {
						es.awaitTermination(1, TimeUnit.DAYS);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				    System.gc();
					System.out.println((i+1)+"-th execution finished. ");
				}
			else {
				initTimes[i] = timedInit(sync);
	
				tgg = sync.getTGG();
	
		    	batchExecutionTimes[i] = isFwd ? timedFwd() : timedBwd();
		    	
		    	if (incr) {
					Resource model = isFwd ? sync.getSourceResource() : sync.getTargetResource();
					edit.accept(model.getContents().get(0));

			    	incrementalExecutionTimes[i] = isFwd ? timedFwd() : timedBwd();
		    	}
		    		

		    	terminate();
			}		
		}
		
		List<TestDataPoint> result;

		TestDataPoint batchData = new TestDataPoint(initTimes, batchExecutionTimes);
		batchData.testCase = new TestCaseParameters(tgg.getName(), isFwd ? Operationalization.FWD : Operationalization.BWD, size);
		
		if (incr) {
			TestDataPoint incData = new TestDataPoint(initTimes, incrementalExecutionTimes);
			incData.testCase = new TestCaseParameters(tgg.getName(), isFwd ? Operationalization.INCREMENTAL_FWD : Operationalization.INCREMENTAL_BWD, size);
			
			result = Arrays.asList(batchData, incData);
		} else {
			result = Arrays.asList(batchData);
		}

		return result;
	}

	@Override
	protected Operationalization getOpType() {
		//TODO not finished
		return null;
	}
}
