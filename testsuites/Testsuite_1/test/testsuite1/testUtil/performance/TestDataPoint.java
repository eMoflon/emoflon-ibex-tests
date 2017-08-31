package testsuite1.testUtil.performance;

import java.io.Serializable;
import java.util.Arrays;

import language.TGG;

public class TestDataPoint implements Serializable {
	private static final long serialVersionUID = 166244628964245136L;

	public long[] initTimes;
	public long[] executionTimes;
	
	public boolean flattenedNetwork;
	public int modelSize;
	public Operationalization operationalization;
	public String tggName;
	public int tggSize;
	public double tggAverageRuleSize;
	
	public TestDataPoint(long[] executionTimes, long[] initTimes) {
		this.executionTimes = executionTimes;
		this.initTimes = initTimes;
	}
	
	public double averageExecutionTime() {
		return average(executionTimes);
	}
	
	public double averageInitTime() {
		return average(initTimes);
	}
	
	private double average(long[] values) {
		long sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum+0.0 / (executionTimes.length);
	}
	
	public double medianExecutionTime() {
		return median(executionTimes);
	}
	
	public double medianInitTime() {
		return median(initTimes);
	}
	
	private double median(long[] values) {
		Arrays.sort(values);
		if (values.length % 2 == 1)
			return values[(values.length-1)/2];
		else
			return (values[values.length/2-1] + values[values.length/2])/2.0;
	}

	public void setTGG(TGG tgg) {
		this.tggName = tgg.getName();
		this.tggSize = tgg.getRules().size();
		this.tggAverageRuleSize = (tgg.getRules().stream().flatMap(r -> r.getNodes().stream()).count()
								+ tgg.getRules().stream().flatMap(r -> r.getEdges().stream()).count())
								/ (tggSize+0.0);
	}

}
