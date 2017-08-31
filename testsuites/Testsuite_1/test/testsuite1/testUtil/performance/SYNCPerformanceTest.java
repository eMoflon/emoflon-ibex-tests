package testsuite1.testUtil.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;

public class SYNCPerformanceTest {
	public SYNC transformator;
	
	protected boolean initialized = false;
	
	protected List<String> executionResults = new LinkedList<String>();
	protected List<String> initResults = new LinkedList<String>();

	public long timedInit(SYNC transformator) throws IOException {
		this.transformator = transformator;
		
		long tic = System.nanoTime();
		transformator.registerPatternMatchingEngine(new DemoclesEngine());
		long toc = System.nanoTime();
		
		initialized = true;
		initResults.add((toc - tic)+"");
		return toc - tic;
	}
	
	public long timedFwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		transformator.forward();
		long toc = System.nanoTime();
		
		transformator.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedFwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
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
	
	public long timedBwd() throws IOException {
		if (!initialized)
			throw new NullPointerException("Sync has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		transformator.backward();
		long toc = System.nanoTime();
		
		transformator.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedBwdAndInit(Supplier<SYNC> transformator, int size, int repetitions, boolean flattened) throws IOException {
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
	
	public void saveResults() throws IOException {
		Path file = Paths.get("performance/SYNCExecutionResults.txt");
		Files.deleteIfExists(file);
		Files.write(file, executionResults, StandardOpenOption.CREATE_NEW);
		file = Paths.get("performance/SYNCInitResults.txt");
		Files.write(file, initResults, StandardOpenOption.CREATE);
	}
}
