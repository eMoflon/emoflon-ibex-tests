package org.emoflon.ibex.tgg.run.familiestopersons_v0;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.run.familiestopersons_v0.config._DefaultRegistrationHelper;

public class BWD_OPT_App extends BWD_OPT {

	public BWD_OPT_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(options.getBlackInterpreter());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		BWD_OPT_App bwd_opt = new BWD_OPT_App();
		
		logger.info("Starting BWD_OPT");
		long tic = System.currentTimeMillis();
		bwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed BWD_OPT in: " + (toc - tic) + " ms");
		
		bwd_opt.saveModels();
		bwd_opt.terminate();
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_DefaultRegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _DefaultRegistrationHelper.createIbexOptions();
	}
}
