package org.emoflon.ibex.tgg.run.bench;

public class VerticalIntegrationBench {

	public static void main(String[] args) {
		BenchEntry result;
		if (args.length == 2) {
			result = new IntegrationBench().bench("Express2UML", Integer.valueOf(args[0]), -1,
					false);
			System.out.print(result);
		} /*else {
			new IntegrationBench().generate("Express2UML", 1000, -1, false);
		}*/
	}
}
