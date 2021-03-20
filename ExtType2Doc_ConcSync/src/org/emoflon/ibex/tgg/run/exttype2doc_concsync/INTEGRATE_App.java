package org.emoflon.ibex.tgg.run.exttype2doc_concsync;

import java.io.IOException;
import java.util.function.Function;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.run.exttype2doc_concsync.config.HiPERegistrationHelper;

public class INTEGRATE_App extends INTEGRATE {

	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public INTEGRATE_App(Function<IbexOptions, IbexOptions> options) throws IOException {
		super(options.apply(registrationHelper.createIbexOptions()));
	}

}
