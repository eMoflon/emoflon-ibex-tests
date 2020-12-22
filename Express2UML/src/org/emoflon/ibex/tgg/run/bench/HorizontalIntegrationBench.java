package org.emoflon.ibex.tgg.run.bench;

public class HorizontalIntegrationBench {

	public static void main(String[] args) {
		BenchEntry result;
		if (args.length == 2) {
			result = new IntegrationBench().bench("Express2UML",Integer.valueOf(args[0]), Integer.valueOf(args[1]), true);	
			System.out.print(result);
		} else {
			new IntegrationBench().generate("Express2UML", 1000, 1000, true);
		}
	}
}
