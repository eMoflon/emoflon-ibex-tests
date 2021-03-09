package org.emoflon.ibex.tgg.run.exttype2doc_shortcut;

import java.io.IOException;
import java.util.function.Function;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.exttype2doc_shortcut.config.HiPERegistrationHelper;

public class SYNC_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public SYNC_App(Function<IbexOptions, IbexOptions> options) throws IOException {
		super(options.apply(registrationHelper.createIbexOptions()));
	}

}
