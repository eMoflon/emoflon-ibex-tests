package testsuite1.performance.util;

import java.io.Serializable;
import java.util.Arrays;

/**
 * This class holds the initialization and execution results of all repetitions
 * of a single test case and allows to calculate the average and median times.
 * */
public class TestDataPoint implements Serializable {
	private static final long serialVersionUID = 166244628964245136L;

	public long[] initTimes;
	public long[] executionTimes;
	
	/** The test case parameters that produced this result. */
	public TestCaseParameters testCase;
	
	public TestDataPoint(long[] initTimes, long[] executionTimes) {
		this.executionTimes = executionTimes;
		this.initTimes = initTimes;
	}

	public double averageExecutionTime() {
		return average(executionTimes);
	}
	
	public double averageInitTime() {
		return average(initTimes);
	}
	
	public double medianExecutionTime() {
		return median(executionTimes);
	}
	
	public double medianInitTime() {
		return median(initTimes);
	}
	
	public String toString() {
		return "\n"+testCase.tgg()+":"+testCase.operationalization()
				   +", elements:"+testCase.modelSize()
				   +", executionTime:"+this.medianExecutionTime()
				   +", initTime:"+this.medianInitTime();
	}
	
	
	
	private double average(long[] values) {
		long sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum+0.0 / (executionTimes.length);
	}
	
	private double median(long[] values) {
		Arrays.sort(values);
		if (values.length % 2 == 1)
			return values[(values.length-1)/2];
		else
			return (values[values.length/2-1] + values[values.length/2])/2.0;
	}

}
