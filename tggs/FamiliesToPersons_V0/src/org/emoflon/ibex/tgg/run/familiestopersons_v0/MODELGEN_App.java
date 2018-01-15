package org.emoflon.ibex.tgg.run.familiestopersons_v0;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerPatternMatchingEngine(new DemoclesEngine());
	}
	
	public static void main(String[] args) throws IOException {
		MODELGEN_App refinedGenerator = new MODELGEN_App("FamiliesToPersons_V0", "./../", false);
		MODELGEN_App flatGenerator = new MODELGEN_App("FamiliesToPersons_V0", "./../", false);
		
		runPerformanceTest(refinedGenerator, "refinedGenerator");
		runPerformanceTest(flatGenerator, "flatGenerator");
	}
	
	private static void runPerformanceTest(MODELGEN_App generator, String generatorName) throws IOException {
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());

		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 4);
		stop.setMaxRuleCount("FamilyMemberToPerson", 0);
		stop.setMaxRuleCount("ExistingFamilyToPerson", 0);
		stop.setMaxRuleCount("FatherToMale", 5);
		stop.setMaxRuleCount("MotherToFemale", 5);
		stop.setMaxRuleCount("NewFamilyDaughterToFemale", 0);
		stop.setMaxRuleCount("DaughterToFemale", 30000);
		stop.setMaxRuleCount("SonToMale", 30000);
		stop.setMaxRuleCount("FatherToNothing", 0);
		stop.setMaxRuleCount("FatherAndMale", 0);
		stop.setMaxRuleCount("IgnoreTwoFamilies", 0);
		stop.setMaxRuleCount("CreateFourthFamily", 0);
		stop.setMaxRuleCount("CreateFourthAndFifthFamily", 0);
		stop.setMaxRuleCount("CreateFather", 0);
		stop.setMaxRuleCount("ConnectFather", 0);
		
		long startTime = System.nanoTime();
		generator.setStopCriterion(stop); 
		generator.run();
		generator.terminate();
		System.out.println((System.nanoTime() - startTime)/1000000000.0 + " s for "+ generatorName);
		
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamiliesToPersons_V0");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
	


	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore", SimpleFamiliesPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/SimplePersons/model/SimplePersons.ecore", SimplePersonsPackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
