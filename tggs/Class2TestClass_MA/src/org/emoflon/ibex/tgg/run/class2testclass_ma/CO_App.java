package org.emoflon.ibex.tgg.run.class2testclass_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.commons.lang3.NotImplementedException;

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class CO_App extends CO {

	public CO_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("Class2TestClass_MA", "./../", false);
		
		logger.info("Starting CO");
		long tic = System.currentTimeMillis();
		co.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CO in: " + (toc - tic) + " ms");
		
		co.saveModels();
		co.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassInheritanceHierarchyPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("Class2TestClass_MA");
			options.debug(true);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
