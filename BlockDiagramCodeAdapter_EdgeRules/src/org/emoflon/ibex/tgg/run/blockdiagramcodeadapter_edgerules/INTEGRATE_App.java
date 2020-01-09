package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules.config._DefaultRegistrationHelper;

public class INTEGRATE_App extends INTEGRATE {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INTEGRATE_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INTEGRATE");
		long tic = System.currentTimeMillis();
		INTEGRATE_App integrate = new INTEGRATE_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for INTEGRATE in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		integrate.integrate();
		toc = System.currentTimeMillis();
		logger.info("Completed INTEGRATE in: " + (toc - tic) + " ms");
		
		integrate.saveModels();
		integrate.terminate();
	}
	
}
