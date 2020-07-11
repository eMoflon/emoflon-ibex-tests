package org.emoflon.ibex.tgg.run.bench;

public class Horizontal_IntegrationBench {

	public static void main(String[] args) {
		System.out.println(new IntegrationBench().bench("test", Integer.valueOf(args[0]), Integer.valueOf(args[1])));
	}
}
