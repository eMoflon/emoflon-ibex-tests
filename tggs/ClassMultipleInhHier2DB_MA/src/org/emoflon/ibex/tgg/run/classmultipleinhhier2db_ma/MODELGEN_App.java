package org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Database.impl.DatabasePackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		MODELGEN_App generator = new MODELGEN_App("ClassMultipleInhHier2DB_MA", "./../", true);
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		//stop.setTimeOutInMS(100);
		stop.setMaxRuleCount("PackageToDatabase", 1);
		stop.setMaxRuleCount("ClassToTable", 4);
		stop.setMaxRuleCount("SubClassToTable", 2);
		stop.setMaxRuleCount("AttributeToColumn", 10);
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
		rs.getPackageRegistry().put("platform:/resource/ClassMultipleInheritanceHierarchy/model/classMultipleInheritanceHierarchy.ecore", ClassMultipleInheritanceHierarchyPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());

		//throw new NotImplementedException("Please check that your source and target metamodels are loaded and registered.");
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
