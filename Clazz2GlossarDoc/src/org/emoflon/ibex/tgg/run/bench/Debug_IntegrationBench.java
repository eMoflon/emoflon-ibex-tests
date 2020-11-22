package org.emoflon.ibex.tgg.run.bench;

import org.emoflon.ibex.tgg.operational.benchmark.*;

import hipe.generic.actor.junction.util.HiPEConfig;

public class Debug_IntegrationBench {

	public static void main(String[] args) {
		int n = 2000;
		int c = 0;
		HiPEConfig.logWorkloadActivated = true;
		System.out.println(new IntegrationBench().bench("test", Integer.valueOf(n), Integer.valueOf(c), true));
		TimeRegistry.logTimes();
	}
}
