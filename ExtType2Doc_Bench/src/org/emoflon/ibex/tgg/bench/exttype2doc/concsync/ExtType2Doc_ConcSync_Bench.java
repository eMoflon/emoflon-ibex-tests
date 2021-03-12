package org.emoflon.ibex.tgg.bench.exttype2doc.concsync;

import java.io.IOException;
import java.util.Arrays;
import java.util.function.Function;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.bench.IntegrationBench;
import org.emoflon.ibex.tgg.bench.ModelAndDeltaGenerator;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.INTEGRATE_App;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class ExtType2Doc_ConcSync_Bench extends IntegrationBench<ExtType2Doc_ConcSync_Params> {

	public ExtType2Doc_ConcSync_Bench(String projectName) {
		super(projectName);
	}

	private final IntegrationPattern pattern = new IntegrationPattern(Arrays.asList( //
			FragmentProvider.APPLY_USER_DELTA //
			, FragmentProvider.REPAIR //
			, FragmentProvider.RESOLVE_CONFLICTS //
			, FragmentProvider.REPAIR //
			, FragmentProvider.RESOLVE_BROKEN_MATCHES //
			, FragmentProvider.TRANSLATE //
			, FragmentProvider.CLEAN_UP //
	));

	@Override
	protected INTEGRATE initStub(TGGResourceHandler resourceHandler) throws IOException {
		Function<IbexOptions, IbexOptions> ibexOptions = options -> {
			options.resourceHandler(resourceHandler);
			options.ilpSolver(SupportedILPSolver.Sat4J);
			options.propagate.usePrecedenceGraph(true);
			options.repair.useShortcutRules(true);
			options.repair.advancedOverlapStrategies(false);
			options.repair.relaxedSCPatternMatching(true);
			options.repair.omitUnnecessaryContext(true);
			options.repair.disableInjectivity(true);
			options.integration.pattern(pattern);
			return options;
		};

		return new INTEGRATE_App(ibexOptions);
	}

	@Override
	protected ModelAndDeltaGenerator<?, ?, ?, ?, ?, ExtType2Doc_ConcSync_Params> initModelAndDeltaGenerator(Resource s, Resource t, Resource c, Resource p,
			Resource d) {
		return new ExtType2Doc_ConcSync_MDGenerator(s, t, c, p, d);
	}

}
