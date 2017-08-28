package testsuite1.testUtil.performance;

import java.util.Arrays;

import language.TGG;

public class TestDataPoint {
	
	public long[] values;
	
	public boolean flattenedNetwork;
	public int modelSize;
	public Operationalization operationalization;
	public TGG tgg;
	
	public TestDataPoint(long[] values) {
		this.values = values;
	}
	
	public double average() {
		long sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		
		return sum+0.0 / (values.length);
	}
	
	public double median() {
		Arrays.sort(values);
		if (values.length % 2 == 1)
			return values[(values.length-1)/2];
		else
			return (values[values.length/2-1] + values[values.length/2])/2.0;
	}

}
