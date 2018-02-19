package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesTGGEngine());
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

	protected void registerUserMetamodels() throws IOException {
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/ClassInheritanceHierarchy/"), URI.createURI("platform:/resource/ClassInheritanceHierarchy/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/Database/"), URI.createURI("platform:/resource/Database/"));
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassInheritanceHierarchyPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());
		
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("ClassInhHier2DB");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
