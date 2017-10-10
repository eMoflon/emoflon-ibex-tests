package testsuite1.performance.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import gurobi.GRBException;
import language.TGG;
import testsuite1.testUtil.Constants;

public class CCPerformanceTest {
	public CC checker;
	
	protected boolean initialized = false;
	protected boolean useTimeouts = true;
	
	protected List<String> executionResults = new LinkedList<String>();
	protected List<String> initResults = new LinkedList<String>();

	public long timedInit(CC checker) throws IOException {
		this.checker = checker;
		
		long tic = System.nanoTime();
		checker.registerPatternMatchingEngine(new DemoclesEngine());
		long toc = System.nanoTime();
		
		initialized = true;
		initResults.add((toc - tic)+"");
		return toc - tic;
	}
	
	public long timedExecution() throws IOException {
		if (!initialized)
			throw new NullPointerException("Checker has not been initialized yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		checker.run();
		long toc = System.nanoTime();
		
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public void terminate() throws IOException {
		checker.terminate();
	}
	
	public TestDataPoint timedExecutionAndInit(Supplier<CC> checker, int size, int repetitions) throws IOException, GRBException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			CC cc = checker.get();
			ExecutorService es = Executors.newSingleThreadExecutor();
			System.out.println("CC: size="+size+": "+(i+1)+"-th execution started.");
			
			if (useTimeouts)
			    try {
					Future<Long> initResult = es.submit(() -> timedInit(cc));
			    	initTimes[i] = initResult.get(Constants.timeout, TimeUnit.SECONDS);
			    	
					tgg = cc.getTGG();
	
					Future<Long> executionResult = es.submit(() -> timedExecution());
			    	executionTimes[i] = executionResult.get(Constants.timeout, TimeUnit.SECONDS);
			    } catch (TimeoutException e) {
			    	System.out.println("Timeout!");
			    	return null;
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
				initTimes[i] = timedInit(cc);
	
				tgg = cc.getTGG();
	
		    	executionTimes[i] = timedExecution();

		    	terminate();
			}
		}

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = Operationalization.CC;
		result.setTGG(tgg);
		result.modelSize = size;
		return result;
	}

	public void setUseTimeouts(boolean useTimeouts) {
		this.useTimeouts = useTimeouts;
	}
	
	public void saveResults() throws IOException {
		Path file = Paths.get("performance/CCExecutionResults.txt");
		Files.deleteIfExists(file);
		Files.write(file, executionResults, StandardOpenOption.CREATE_NEW);
		file = Paths.get("performance/CCInitResults.txt");
		Files.write(file, initResults, StandardOpenOption.CREATE);
	}
}
