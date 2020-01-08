package org.emoflon.ibex.tgg.run.familiestopersons_v0;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.familiestopersons_v0.config._DefaultRegistrationHelper;


public class MODELGEN_App extends MODELGEN {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
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
}
