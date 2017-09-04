package testsuite1.testUtil.performance;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

import org.eclipse.emf.ecore.EObject;
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
		
		sync.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
		return this.timedIncrFwdAndInit(transformator, size, repetitions, flattened, (o)->{});
	}
	
	public TestDataPoint timedIncrFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, Consumer<EObject> edit) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":FWD, size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(sync);
			edit.accept(sync.getSourceResource().getContents().get(0));
			executionTimes[i] = timedFwd();
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = Operationalization.FWD;
		result.setTGG(tgg);
		result.modelSize = size;
		result.flattenedNetwork = flattened;
		return result;
	}
	
	private long timedBwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		sync.backward();
		long toc = System.nanoTime();
		
		sync.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
		return this.timedIncrBwdAndInit(transformator, size, repetitions, flattened, (o)->{});
	}
	
	public TestDataPoint timedIncrBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened, Consumer<EObject> edit) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			SYNC sync = transformator.get();
			tgg = sync.getTGG();
			System.out.println(sync.getTGG().getName()+":BWD, size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(sync);
			edit.accept(sync.getTargetResource().getContents().get(0));
			executionTimes[i] = timedBwd();
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = Operationalization.BWD;
		result.setTGG(tgg);
		result.modelSize = size;
		result.flattenedNetwork = flattened;
		return result;
	}
}
