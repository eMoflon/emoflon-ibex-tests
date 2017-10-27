package org.emoflon.ibex.tgg.run.familiestopersons_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.util.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.util.UpdatePolicy;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		MODELGEN_App generator = new MODELGEN_App("FamiliesToPersons_MA", "./../", true);
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		//stop.setTimeOutInMS(1000);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 1, true);
		newUP.setBoundForComplementRule("Mother2Female", 1, true);
		newUP.setBoundForComplementRule("Son2Male", 4, false);
		newUP.setBoundForComplementRule("Daughter2Female", 3, false);
		generator.setUpdatePolicy(newUP);
		
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 10);
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
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", FamiliesPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", PersonsPackageImpl.init());
		
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
