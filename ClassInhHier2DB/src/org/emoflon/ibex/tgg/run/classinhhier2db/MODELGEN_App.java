package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.classinhhier2db.config._DefaultRegistrationHelper;

public class MODELGEN_App extends MODELGEN {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		MODELGEN_App generator = new MODELGEN_App("ClassInhHier2DB", "./../", false);

		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(200);
		generator.setStopCriterion(stop);

		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		generator.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");

		generator.saveModels();
		generator.terminate();
	}
}
