package org.emoflon.ibex.tgg.run.exttype2doc_lookahead;

import java.io.IOException;
import java.util.function.Function;

import org.emoflon.ibex.tgg.run.exttype2doc_lookahead.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.options.IbexOptions;
import org.emoflon.ibex.tgg.runtime.strategies.opt.CC;

public class CC_App extends CC {

	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public CC_App(Function<IbexOptions, IbexOptions> options) throws IOException {
		super(options.apply(registrationHelper.createIbexOptions()));
	}

}
