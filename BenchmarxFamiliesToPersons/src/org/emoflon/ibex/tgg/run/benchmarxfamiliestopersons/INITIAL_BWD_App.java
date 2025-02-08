package org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.sync.INITIAL_BWD;

public class INITIAL_BWD_App extends INITIAL_BWD {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();
	
	public INITIAL_BWD_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		Logger.getRootLogger().setLevel(Level.INFO);

		INITIAL_BWD_App init_bwd = new INITIAL_BWD_App();
		
		logger.info("Starting INITIAL BWD");
		long tic = System.currentTimeMillis();
		init_bwd.backward();
		long toc = System.currentTimeMillis();
		logger.info("Completed INITIAL BWD in: " + (toc - tic) + " ms");
		
		init_bwd.saveModels();
		init_bwd.terminate();
	}
}
