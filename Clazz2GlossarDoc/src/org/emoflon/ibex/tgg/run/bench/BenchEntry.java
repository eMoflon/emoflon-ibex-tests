package org.emoflon.ibex.tgg.run.bench;

public class BenchEntry {
	
	public int n;
	public int c;
	public int elts;
	public double init;
	public double resolve;
	public long ram;

	public BenchEntry(int n, int c, int elts, double init, double resolve, long ram) {
		this.n = n;
		this.c = c;
		this.elts = elts;
		this.init = init;
		this.resolve = resolve;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return n + ";" + c + ";" + elts + ";" + init + ";" + resolve + ";" + ram;
	}
}
