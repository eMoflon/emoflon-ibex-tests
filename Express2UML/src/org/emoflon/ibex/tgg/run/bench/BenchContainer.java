package org.emoflon.ibex.tgg.run.bench;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class BenchContainer {

	Map<Integer, Map<Integer, List<BenchEntry>>> n2c2entries = new HashMap<>();

	public void addBench(BenchEntry entry) {
		if (!n2c2entries.containsKey(entry.n)) {
			n2c2entries.put(entry.n, new HashMap<>());
		}
		Map<Integer, List<BenchEntry>> c2entries = n2c2entries.get(entry.n);
		if (!c2entries.containsKey(entry.c)) {
			c2entries.put(entry.c, new LinkedList<>());
		}
		c2entries.get(entry.c).add(entry);
	}

	public void print() {
		System.out.println();
		System.out.println("n;c;elts;avg_init;median_init;avg_resolve;median_resolve;avg_integrate;median_integrate");
		for (Integer n : n2c2entries.keySet()) {
			Map<Integer, List<BenchEntry>> c2entries = n2c2entries.get(n);
			for (Integer c : c2entries.keySet()) {
				System.out.println(average(c2entries.get(c)));
			}
		}
	}

	private String average(List<BenchEntry> entries) {
		double sum_init = 0;
		double sum_resolve = 0;
		double sum_integrate = 0;
		int n = -1;
		int c = -1;
		int elts = -1;
		List<Double> inits = new LinkedList<>();
		List<Double> resolves = new LinkedList<>();
		List<Double> integrate = new LinkedList<Double>();
		for (BenchEntry entry : entries) {
			n = entry.n;
			c = entry.c;
			elts = entry.elts;
			
			sum_init += entry.init;
			sum_resolve += entry.resolve;
			sum_integrate += entry.integrate;
			
			inits.add(entry.init);
			resolves.add(entry.resolve);
			integrate.add(entry.integrate);
		}
		Collections.sort(inits);
		Collections.sort(resolves);
		Collections.sort(integrate);
		String separator = ";";
		
		return new StringBuilder()
			.append(n).append(separator)
			.append(c).append(separator)
			.append(elts).append(separator)
			
			.append(getAverage(sum_init, inits)).append(separator)
			.append(getMedian(inits)).append(separator)
			
			.append(getAverage(sum_resolve, resolves)).append(separator)
			.append(getMedian(resolves)).append(separator)
			
			.append(getAverage(sum_integrate, integrate)).append(separator)
			.append(getMedian(integrate)).toString();
	}
	
	private static double getMedian(List<Double> list) {
		return list.get((int) (list.size() / 2));
	}
	
	private static double getAverage(double sum, List<Double> list) {
		return sum / list.size();
	}
}





















