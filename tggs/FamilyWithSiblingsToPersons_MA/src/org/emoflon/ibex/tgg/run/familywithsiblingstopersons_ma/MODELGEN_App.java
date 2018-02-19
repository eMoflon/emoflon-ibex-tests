package org.emoflon.ibex.tgg.run.familywithsiblingstopersons_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.updatepolicy.RandomMatchUpdatePolicy;
import org.emoflon.ibex.tgg.operational.updatepolicy.UpdatePolicy;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		MODELGEN_App generator = new MODELGEN_App("FamilyWithSiblingsToPersons_MA", "./../", true);
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		//stop.setTimeOutInMS(1000);
		UpdatePolicy newUP = new RandomMatchUpdatePolicy();
		newUP.setBoundForComplementRule("Father2Male", 1, true);
		newUP.setBoundForComplementRule("Mother2Female", 1, true);
		//newUP.setBoundForComplementRule("Son2Male", 1, true);
		//newUP.setBoundForComplementRule("Daughter2Female", 1, true);
		generator.setUpdatePolicy(newUP);
		
		stop.setMaxRuleCount("Families2Persons", 1);
		stop.setMaxRuleCount("CreateFamily", 2);
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
		rs.getPackageRegistry().put("platform:/resource/FamiliesWithSiblings/model/FamiliesWithSiblings.ecore", FamiliesWithSiblingsPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", PersonsPackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamilyWithSiblingsToPersons_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
}
}
