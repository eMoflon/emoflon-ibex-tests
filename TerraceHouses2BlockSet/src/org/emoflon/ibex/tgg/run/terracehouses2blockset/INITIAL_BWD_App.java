package org.emoflon.ibex.tgg.run.terracehouses2blockset;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.sync.INITIAL_BWD;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config._DefaultRegistrationHelper;

public class INITIAL_BWD_App extends INITIAL_BWD {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INITIAL_BWD_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL BWD");
		long tic = System.currentTimeMillis();
		INITIAL_BWD_App init_bwd = new INITIAL_BWD_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for BWD in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		init_bwd.backward();
		toc = System.currentTimeMillis();
		logger.info("Completed INITIAL_BWD in: " + (toc - tic) + " ms");
		
		init_bwd.saveModels();
		init_bwd.terminate();
	}
	
}
