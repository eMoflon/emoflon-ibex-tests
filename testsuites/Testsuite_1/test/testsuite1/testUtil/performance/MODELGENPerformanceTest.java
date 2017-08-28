package testsuite1.testUtil.performance;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.util.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import language.TGG;

public class MODELGENPerformanceTest {
	public MODELGEN generator;
	
	protected boolean initialized = false;
	
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
		
		generator.terminate();
		executionResults.add((toc - tic)+"");
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public TestDataPoint timedExecutionAndInit(Supplier<MODELGEN> generator, Function<TGG, MODELGENStopCriterion> stops, int size, int repetitions, boolean flattened) throws IOException {
		if (repetitions < 1)
			throw new IllegalArgumentException("Number of repetitions must be positive.");
		
		long[] times = new long[repetitions];
		TGG tgg = null;
		
		for (int i = 0; i < repetitions; i++) {
			MODELGEN gen = generator.get();
			tgg = gen.getTGG();
			System.out.println(gen.getTGG().getName()+", flattened = "+flattened+": "+(i+1)+"-th execution started.");
			timedInit(gen);
			MODELGENStopCriterion stop = stops.apply(gen.getTGG());
			times[i] = timedExecution(stop);
			System.out.print((i+1)+"-th execution finished. ");
		}
		System.out.println("");
		
		TestDataPoint result = new TestDataPoint(times);
		result.operationalization = Operationalization.MODELGEN;
		result.tgg = tgg;
		result.modelSize = size;
		result.flattenedNetwork = flattened;
		return result;
	}
	
	public void saveResults() throws IOException {
		Path file = Paths.get("performance/MODELGENExecutionResults.txt");
		Files.deleteIfExists(file);
		Files.write(file, executionResults, StandardOpenOption.CREATE_NEW);
		file = Paths.get("performance/MODELGENInitResults.txt");
		Files.write(file, initResults, StandardOpenOption.CREATE);
	}
}
