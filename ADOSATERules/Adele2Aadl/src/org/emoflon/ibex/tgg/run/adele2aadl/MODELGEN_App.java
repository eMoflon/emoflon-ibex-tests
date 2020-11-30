package org.emoflon.ibex.tgg.run.adele2aadl;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
// import org.emoflon.ibex.tgg.operational.monitoring.VictoryDataProvider;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
//import org.emoflon.ibex.tgg.ui.debug.core.IbexDebugUI;

import language.TGGRule;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}
	
	

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting MODELGEN");
		long tic = System.currentTimeMillis();
		MODELGEN_App generator = new MODELGEN_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for MODELGEN in: " + (toc - tic) + " ms");
		
		MODELGENStopCriterion stop = new MODELGENStopCriterion(generator.getTGG());
		stop.setTimeOutInMS(2000);

//		String[] rules = new String[]{"rulePackage2AadlPackage", "ruleComponent2ComponentTypeSystem", "ruleAccess2AccessSystem"};
//		for (TGGRule r : generator.getTGG().getRules()) {
//			String p=r.getName();
//			for(int i=0;i<rules.length;i++) {
//				if (rules[i]==p) {
//					stop.setMaxRuleCount(rules[i], 1);	
//					break;
//				}
//				
//			}
//			
//		}
		for (TGGRule r : generator.getTGG().getRules()) {
			
			String p=r.getName();
			//logger.info(r.getName());
			if (!(r.isAbstract())) {
				
				stop.setMaxRuleCount(p, 0);	
			}
			
		
		}
		//set the rules with maxCount !0 here
		stop.setMaxRuleCount("rulePackage2AadlPackage", 1);
        
        stop.setMaxRuleCount("ruleComponent2ComponentTypeSystem", 1);
        stop.setMaxRuleCount("ruleAccess2AccessSystem", 2);
        stop.setMaxRuleCount("ruleSystem2AbsractFeature", 1);
       stop.setMaxRuleCount("ruleComponent2ComponentTypeWithExtendsSystem", 1);
       stop.setMaxRuleCount("ruleAccess2AccessSystem", 1);
        stop.setMaxRuleCount("ruleAccess2AccessRefinedSytemsAbsfeature", 1); 
        stop.setMaxRuleCount("ruletest2test", 2);
        
        
        //stop.setMaxRuleCount("ruleAccess2AccessSystem", 1);
        
        
        
		generator.setStopCriterion(stop);
//		VictoryDataProvider dataProvider = new VictoryDataProvider(generator);
//		IbexDebugUI.create(dataProvider, true).getIbexController().register(generator);
		tic = System.currentTimeMillis();
		generator.run();
		toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");		
		
		generator.saveModels();
		generator.terminate();
	}
	
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		//_RegistrationHelper.registerMetamodels(rs, this);
		_SchemaBasedAutoRegistration.register(this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}