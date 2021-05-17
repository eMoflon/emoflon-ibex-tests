package org.emoflon.ibex.tgg.run.exttype2doc_lookahead;

import java.io.IOException;
import java.util.function.Function;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.run.exttype2doc_lookahead.config.HiPERegistrationHelper;

public class CC_App extends CC {

	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public CC_App(Function<IbexOptions, IbexOptions> options) throws IOException {
		super(options.apply(registrationHelper.createIbexOptions()));
	}

}
