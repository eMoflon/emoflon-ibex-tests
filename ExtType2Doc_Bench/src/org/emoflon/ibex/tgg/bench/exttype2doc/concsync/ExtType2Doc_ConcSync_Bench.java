package org.emoflon.ibex.tgg.bench.exttype2doc.concsync;

import java.io.IOException;
import java.util.Arrays;

import org.eclipse.emf.ecore.resource.Resource;
import org.emoflon.ibex.tgg.bench.IntegrationBench;
import org.emoflon.ibex.tgg.bench.ModelAndDeltaGenerator;
import org.emoflon.ibex.tgg.operational.strategies.integrate.FragmentProvider;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.integrate.pattern.IntegrationPattern;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.INTEGRATE_App;

public class ExtType2Doc_ConcSync_Bench extends IntegrationBench<ExtType2Doc_ConcSync_Params> {

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
	protected INTEGRATE initStub() throws IOException {
		INTEGRATE integrate = new INTEGRATE_App();
		integrate.getOptions().integration.pattern(pattern);
		return integrate;
	}

	@Override
	protected ModelAndDeltaGenerator<?, ?, ?, ExtType2Doc_ConcSync_Params> initModelAndDeltaGenerator(Resource s, Resource t, Resource c, Resource p,
			Resource d) {
		return new ExtType2Doc_ConcSync_MDGenerator(s, t, c, p, d);
	}

}
