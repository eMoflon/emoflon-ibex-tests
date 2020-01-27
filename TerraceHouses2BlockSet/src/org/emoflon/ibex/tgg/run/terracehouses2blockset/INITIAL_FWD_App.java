package org.emoflon.ibex.tgg.run.terracehouses2blockset;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_FWD;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config._DefaultRegistrationHelper;

public class INITIAL_FWD_App extends INITIAL_FWD {

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
