package testsuite1.performance.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
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
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;
import testsuite1.testUtil.Constants;

public class SYNCPerformanceTest {
	public SYNC sync;
	
	protected boolean initialized = false;
	protected boolean useTimeouts = true;
	
	protected List<String> executionResults = new LinkedList<String>();
	protected List<String> initResults = new LinkedList<String>();

	private long timedInit(SYNC sync) throws IOException {
		this.sync = sync;
		
		long tic = System.nanoTime();
		sync.registerPatternMatchingEngine(new DemoclesEngine());
		long toc = System.nanoTime();
		
		initialized = true;
		initResults.add((toc - tic)+"");
		return toc - tic;
	}
	
	private long timedFwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		sync.forward();
		long toc = System.nanoTime();

		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	private long timedBwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		sync.backward();
		long toc = System.nanoTime();
		
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	private void terminate() throws IOException {
		sync.terminate();
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
				    initTimes[i] = initResult.get(Constants.timeout, TimeUnit.SECONDS);
					tgg = sync.getTGG();
					
					// batch
				    Future<Long> batchExecutionResult = es.submit(() -> isFwd ? timedFwd() : timedBwd());
				    batchExecutionTimes[i] = batchExecutionResult.get(Constants.timeout, TimeUnit.SECONDS);
					
					// incremental
					if (incr) {
						Resource model = isFwd ? sync.getSourceResource() : sync.getTargetResource();
						edit.accept(model.getContents().get(0));
		
					    Future<Long> incrExecutionResult = es.submit(() -> isFwd ? timedFwd() : timedBwd());
					    incrementalExecutionTimes[i] = incrExecutionResult.get(Constants.timeout, TimeUnit.SECONDS);
					}
				} catch (TimeoutException e) {
			    	System.out.println("Timeout!");
					return new ArrayList<TestDataPoint>();
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
		batchData.operationalization = (isFwd ? Operationalization.FWD : Operationalization.BWD);
		batchData.setTGG(tgg);
		batchData.modelSize = size;
		
		if (incr) {
			TestDataPoint incData = new TestDataPoint(initTimes, incrementalExecutionTimes);
			incData.operationalization = (isFwd ? Operationalization.INCREMENTAL_FWD : Operationalization.INCREMENTAL_BWD);
			incData.setTGG(tgg);
			incData.modelSize = size;
			
			result = Arrays.asList(batchData, incData);
		} else {
			result = Arrays.asList(batchData);
		}

		return result;
	}
	
	public void setUseTimeouts(boolean useTimeouts) {
		this.useTimeouts = useTimeouts;
	}
	
	@Deprecated
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions) throws IOException {
		return this.timedFwdAndInit(transformator, size, repetitions, (o)->{}, false);
	}

	@Deprecated
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":"+(incr ? Operationalization.INCREMENTAL_FWD : Operationalization.FWD)+", size="+size+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(sync);
			if (incr)
				sync.forward();
			edit.accept(sync.getSourceResource().getContents().get(0));
			executionTimes[i] = timedFwd();
			terminate();
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = incr ? Operationalization.INCREMENTAL_FWD : Operationalization.FWD;
		result.setTGG(tgg);
		result.modelSize = size;
		return result;
	}
	
	@Deprecated
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions) throws IOException {
		return this.timedBwdAndInit(transformator, size, repetitions, (o)->{}, false);
	}

	@Deprecated
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":"+(incr ? Operationalization.INCREMENTAL_BWD : Operationalization.BWD)+", size="+size+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(sync);
			if (incr)
				sync.backward();
			edit.accept(sync.getTargetResource().getContents().get(0));
			executionTimes[i] = timedBwd();
			terminate();
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = incr ? Operationalization.INCREMENTAL_BWD : Operationalization.BWD;
		result.setTGG(tgg);
		result.modelSize = size;
		return result;
	}
}
