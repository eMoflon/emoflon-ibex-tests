package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(options.getBlackInterpreter());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		MODELGEN_App generator = new MODELGEN_App();
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(1000);
		stop.setMaxElementCount(20);
		stop.setMaxRuleCount("Root2RootRule", 1);
		generator.setStopCriterion(stop);
		
		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		generator.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
		
		generator.saveModels();
		generator.terminate();
	}
	
	
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}
