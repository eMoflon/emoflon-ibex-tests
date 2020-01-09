package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config._DefaultRegistrationHelper;


public class INITIAL_FWD_App extends SYNC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INITIAL_FWD_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		Logger.getRootLogger().setLevel(Level.INFO);

		INITIAL_FWD_App init_fwd = new INITIAL_FWD_App();
		
		logger.info("Starting INITIAL FWD");
		long tic = System.currentTimeMillis();
		init_fwd.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed INITIAL FWD in: " + (toc - tic) + " ms");
		
		init_fwd.saveModels();
		init_fwd.terminate();
	}
}
