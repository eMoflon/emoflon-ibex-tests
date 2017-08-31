package testsuite1.testUtil.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;

public class CCPerformanceTest {
	public CC checker;
	
	protected boolean initialized = false;
	
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
		
		checker.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedExecutionAndInit(Supplier<CC> checker, int size, int repetitions, boolean flattened) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] initTimes = new long[repetitions];
		long[] executionTimes = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			CC cc = checker.get();
			tgg = cc.getTGG();
			System.out.println(cc.getTGG().getName()+":CC, size="+size+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
			initTimes[i] = timedInit(cc);
			executionTimes[i] = timedExecution();
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");

		TestDataPoint result = new TestDataPoint(initTimes, executionTimes);
		result.operationalization = Operationalization.CC;
		result.setTGG(tgg);
		result.modelSize = size;
		result.flattenedNetwork = flattened;
		return result;
	}
	
	public void saveResults() throws IOException {
		Path file = Paths.get("performance/CCExecutionResults.txt");
		Files.deleteIfExists(file);
		Files.write(file, executionResults, StandardOpenOption.CREATE_NEW);
		file = Paths.get("performance/CCInitResults.txt");
		Files.write(file, initResults, StandardOpenOption.CREATE);
	}
}
