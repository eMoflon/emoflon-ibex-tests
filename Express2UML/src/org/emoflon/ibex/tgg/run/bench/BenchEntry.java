package org.emoflon.ibex.tgg.run.bench;

public class BenchEntry {

	public int n;
	public int c;
	public int elts;
	public double init;
	public double resolve;
	public double integrate;
	public int ram;

	public BenchEntry(int n, int c, int elts, double init, double resolve, double integrate,
			int ram) {
		this.n = n;
		this.c = c;
		this.elts = elts;
		this.init = init;
		this.resolve = resolve;
		this.integrate = integrate;
		this.ram = ram;
	}

	@Override
	public String toString() {
		return n + ";" + c + ";" + elts + ";" + init + ";" + resolve + ";" + integrate + ";" + ram;
	}
}
