package org.emoflon.ibex.tgg.bench;

import java.io.IOException;

import org.emoflon.ibex.tgg.bench.util.BenchEntry;
import org.emoflon.ibex.tgg.bench.util.BenchParameters;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;

public abstract class IntegrationBench<BP extends BenchParameters> extends AbstractBench<INTEGRATE, BP> {

	@Override
	protected BenchEntry applyDeltaAndRun(INTEGRATE opStrat) throws IOException {
		long tic = System.currentTimeMillis();
		opStrat.run();
		long toc = System.currentTimeMillis();
		double init = (double) (toc - tic) / 1000;
		
		// TODO apply delta!

		tic = System.currentTimeMillis();
		opStrat.integrate();
		toc = System.currentTimeMillis();
		double resolve = (double) (toc - tic) / 1000;

		if (parameters.saveModels)
			opStrat.saveModels();
		opStrat.terminate();

		return new BenchEntry(parameters.modelScale, parameters.numOfChanges, numOfElements, init, resolve);
	}

}
