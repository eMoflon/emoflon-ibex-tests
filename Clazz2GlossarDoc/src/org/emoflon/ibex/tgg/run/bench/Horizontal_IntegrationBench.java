package org.emoflon.ibex.tgg.run.bench;

public class Horizontal_IntegrationBench {

	public static void main(String[] args) {
		if(args.length == 2) {
			System.out.println(new IntegrationBench().bench("test", Integer.valueOf(args[0]), Integer.valueOf(args[1])));
		}
		else {
			String[] booleansStr = args[2].split(":");
			boolean[] when_to_generate_conflict = new boolean[booleansStr.length];
			for(int i=0; i < when_to_generate_conflict.length; i++) {
				when_to_generate_conflict[i] = booleansStr[i].equals("t") ? true : false;
			}
			System.out.println(new IntegrationBench().bench("test", Integer.valueOf(args[0]), Integer.valueOf(args[1]), when_to_generate_conflict));
		}
		
	}
}
