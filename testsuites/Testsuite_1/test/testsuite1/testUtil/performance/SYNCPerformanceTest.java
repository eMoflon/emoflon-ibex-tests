package testsuite1.testUtil.performance;

import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;

public class SYNCPerformanceTest {
	public SYNC sync;
	
	protected boolean initialized = false;
	
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
	
	public TestDataPoint timedSyncAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, boolean isFwd) throws IOException {
		return this.timedSyncAndInit(transformator, size, repetitions, flattened, isFwd, (o)->{}, false).get(0);
	}
	
	public List<TestDataPoint> timedSyncAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, boolean isFwd, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] batchExecutionTimes = new long[repetitions];
		long[] incrementalExecutionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":"+(isFwd ? Operationalization.FWD : Operationalization.BWD)+", size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(sync);
			
			// batch
			batchExecutionTimes[i] = isFwd ? timedFwd() : timedBwd();
			
			// incremental
			if (incr) {
				Resource model = isFwd ? sync.getSourceResource() : sync.getTargetResource();
				edit.accept(model.getContents().get(0));
				incrementalExecutionTimes[i] = isFwd ? timedFwd() : timedBwd();
			}
			
			terminate();
			
			// debug code to check whether the incremental sync works properly
//			if (i==0)
//				sync.saveModels();
			
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");
		
		List<TestDataPoint> result;

		TestDataPoint batchData = new TestDataPoint(initTimes, batchExecutionTimes);
		batchData.operationalization = (isFwd ? Operationalization.FWD : Operationalization.BWD);
		batchData.setTGG(tgg);
		batchData.modelSize = size;
		batchData.flattenedNetwork = flattened;
		
		if (incr) {
			TestDataPoint incData = new TestDataPoint(initTimes, incrementalExecutionTimes);
			incData.operationalization = (isFwd ? Operationalization.INCREMENTAL_FWD : Operationalization.INCREMENTAL_BWD);
			incData.setTGG(tgg);
			incData.modelSize = size;
			incData.flattenedNetwork = flattened;
			
			result = Arrays.asList(batchData, incData);
		} else {
			result = Arrays.asList(batchData);
		}

		return result;
	}
	
	@Deprecated
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
		return this.timedFwdAndInit(transformator, size, repetitions, flattened, (o)->{}, false);
	}

	@Deprecated
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":"+(incr ? Operationalization.INCREMENTAL_FWD : Operationalization.FWD)+", size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
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
		result.flattenedNetwork = flattened;
		return result;
	}
	
	@Deprecated
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
		return this.timedBwdAndInit(transformator, size, repetitions, flattened, (o)->{}, false);
	}

	@Deprecated
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, Consumer<EObject> edit, boolean incr) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":"+(incr ? Operationalization.INCREMENTAL_BWD : Operationalization.BWD)+", size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
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
		result.flattenedNetwork = flattened;
		return result;
	}
}
