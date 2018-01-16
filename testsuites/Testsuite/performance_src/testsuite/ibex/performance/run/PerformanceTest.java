package testsuite.ibex.performance.run;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import testsuite.ibex.performance.util.Operationalization;
import testsuite.ibex.performance.util.PerformanceConstants;
import testsuite.ibex.performance.util.TestCaseParameters;
import testsuite.ibex.performance.util.TestDataPoint;

public abstract class PerformanceTest<O extends OperationalStrategy> {
	protected O op;
	
	protected boolean initialized = false;
	protected boolean useTimeouts = true;

	protected long timedInit(O op) throws IOException {
		this.op = op;
		
		long tic = System.nanoTime();
		op.registerBlackInterpreter(new DemoclesEngine());
		long toc = System.nanoTime();
		
		initialized = true;
		return toc - tic;
	}
	
	protected long timedExecution() throws IOException {
		if (!initialized)
			throw new NullPointerException("Initialization has not been performed yet. Call timedInit() before this method.");
		
		long tic = System.nanoTime();
		op.run();
		long toc = System.nanoTime();
		
		System.out.println((toc - tic) + "");
		return toc - tic;
	}
	
	public void terminate() throws IOException {
		op.terminate();
	}

	public void setUseTimeouts(boolean useTimeouts) {
		this.useTimeouts = useTimeouts;
	}
	
	protected abstract Operationalization getOpType();
	
	public TestDataPoint timedExecutionAndInit(Supplier<O> ops, int size) throws IOException {
		long[] initTime = new long[1];
		long[] execTime = new long[1];
		initTime[0] = -1;
		execTime[0] = -1;
		
		ExecutorService es = Executors.newSingleThreadExecutor();

	    try {
	    	O op = ops.get();
	    	
		    Future<Long> initResult = es.submit(() -> timedInit(op));
		    initTime[0] = initResult.get(useTimeouts ? PerformanceConstants.timeout : Long.MAX_VALUE, TimeUnit.SECONDS);

		    Future<Long> executionResult = es.submit(() -> timedExecution());
		    execTime[0] = executionResult.get(useTimeouts ? PerformanceConstants.timeout : Long.MAX_VALUE, TimeUnit.SECONDS);
	    } catch (TimeoutException e) {
	    	System.out.println("Timeout!");
	    	System.exit(0);
	    } catch (Exception e) {
        	e.printStackTrace();
	    	System.exit(0);
	    }
	    
    	es.shutdownNow();
    	terminate();

		TestDataPoint result = new TestDataPoint(initTime, execTime);
		result.testCase = new TestCaseParameters(op.getTGG().getName(), getOpType(), size);
		return result;
	}
}
