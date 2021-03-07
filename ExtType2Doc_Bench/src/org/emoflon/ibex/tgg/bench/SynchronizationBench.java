package org.emoflon.ibex.tgg.bench;

import java.io.IOException;

import org.emoflon.ibex.tgg.bench.util.BenchEntry;
import org.emoflon.ibex.tgg.bench.util.BenchParameters;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

public abstract class SynchronizationBench<BP extends BenchParameters> extends AbstractBench<SYNC, BP> {

	public SynchronizationBench(String projectName) {
		super(projectName);
	}

	@Override
	protected BenchEntry applyDeltaAndRun(SYNC opStrat, BP parameters, boolean saveTransformedModels) throws IOException {
		long tic = System.currentTimeMillis();
		opStrat.run();
		long toc = System.currentTimeMillis();
		double init = (double) (toc - tic) / 1000;
		
		// TODO apply delta!
		
		tic = System.currentTimeMillis();
		opStrat.run();
		toc = System.currentTimeMillis();
		double resolve = (double) (toc - tic) / 1000;
		
		if (saveTransformedModels)
			opStrat.saveModels();
		opStrat.terminate();

		return new BenchEntry(parameters.modelScale, parameters.numOfChanges, numOfElements, init, resolve);
	}

}
