package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.run.java2doc.config._DefaultRegistrationHelper;

public class FWD_OPT_App extends FWD_OPT {

	public FWD_OPT_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(options.getBlackInterpreter());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		FWD_OPT_App fwd_opt = new FWD_OPT_App();
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		fwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		fwd_opt.saveModels();
		fwd_opt.terminate();
	}
	
	
	protected void registerUserMetamodels() throws IOException {
		_DefaultRegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _DefaultRegistrationHelper.createIbexOptions();
	}
}
