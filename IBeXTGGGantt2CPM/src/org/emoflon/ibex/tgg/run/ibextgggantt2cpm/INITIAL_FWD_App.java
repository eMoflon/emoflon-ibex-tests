package org.emoflon.ibex.tgg.run.ibextgggantt2cpm;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.ibextgggantt2cpm.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.sync.SYNC;

public class INITIAL_FWD_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INITIAL_FWD_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL FWD");
		long tic = System.currentTimeMillis();
		INITIAL_FWD_App init_fwd = new INITIAL_FWD_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for FWD in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		init_fwd.forward();
		toc = System.currentTimeMillis();
		logger.info("Completed INITIAL_FWD in: " + (toc - tic) + " ms");
		
		init_fwd.saveModels();
		init_fwd.terminate();
	}
}
