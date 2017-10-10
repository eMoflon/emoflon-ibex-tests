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
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.util.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;
import testsuite1.testUtil.Constants;

public class MODELGENPerformanceTest {
	public MODELGEN generator;
	
	protected boolean initialized = false;
	protected boolean useTimeouts = true;
	
	protected List<String> executionResults = new LinkedList<String>();
	protected List<String> initResults = new LinkedList<String>();

	public long timedInit(MODELGEN generator) throws IOException {
		this.generator = generator;
		
		generator.setUpdatePolicy(new RandomMatchUpdatePolicy());
		
		long tic = System.nanoTime();
		generator.registerPatternMatchingEngine(new DemoclesEngine());
		long toc = System.nanoTime();
		
		initialized = true;
		initResults.add((toc - tic)+"");
		return toc - tic;
	}
	
	public long timedExecution(MODELGENStopCriterion stop) throws IOException {
		if (!initialized)
			throw new NullPointerException("Generator has not been initialized yet. Call timedInit() before this method.");
		
		generator.setStopCriterion(stop);
		
		long tic = System.nanoTime();
		generator.run();
		long toc = System.nanoTime();
		
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public void terminate() throws IOException {
		generator.terminate();
	}
	
	public TestDataPoint timedExecutionAndInit(Supplier<MODELGEN> generator, Function<TGG, MODELGENStopCriterion> stops, int size, int repetitions) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			MODELGEN gen = generator.get();
			ExecutorService es = Executors.newSingleThreadExecutor();
			System.out.println("MODELGEN: size="+size+": "+(i+1)+"-th execution started.");

			if (useTimeouts)
			    try {
				    Future<Long> initResult = es.submit(() -> timedInit(gen));
			    	initTimes[i] = initResult.get(Constants.timeout, TimeUnit.SECONDS);
		
					tgg = gen.getTGG();
					MODELGENStopCriterion stop = stops.apply(tgg);
		
				    Future<Long> executionResult = es.submit(() -> timedExecution(stop));
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
				initTimes[i] = timedInit(gen);
	
				tgg = gen.getTGG();
				MODELGENStopCriterion stop = stops.apply(tgg);
	
		    	executionTimes[i] = timedExecution(stop);

		    	terminate();
			}
			
			if (i==0) { // one generated model should be saved
				gen.saveModels();
			}
		}
		
		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = Operationalization.MODELGEN;
		result.setTGG(tgg);
		result.modelSize = size;
		return result;
	}
	
	public void setUseTimeouts(boolean useTimeouts) {
		this.useTimeouts = useTimeouts;
	}
	
	public void saveResults() throws IOException {
		Path file = Paths.get("performance/MODELGENExecutionResults.txt");
		Files.deleteIfExists(file);
		Files.write(file, executionResults, StandardOpenOption.CREATE_NEW);
		file = Paths.get("performance/MODELGENInitResults.txt");
		Files.write(file, initResults, StandardOpenOption.CREATE);
	}
}
