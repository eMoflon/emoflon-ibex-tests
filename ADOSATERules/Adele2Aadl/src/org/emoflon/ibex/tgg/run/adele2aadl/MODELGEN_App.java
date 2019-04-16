package org.emoflon.ibex.tgg.run.adele2aadl;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

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

		
		
		stop.setMaxRuleCount("rulePackage2AadlPackage", 1);
		stop.setMaxRuleCount("ruleFeatureGroup2FeatureGroupTypeWithInverse59", 0);
		stop.setMaxRuleCount("ruleFeatureGroup2FeatureGroupTypeWithExtendsInverse58", 0);
		stop.setMaxRuleCount("ruleFeatureGroup2FeatureGroupTypeWithExtends57", 0);
		stop.setMaxRuleCount("ruleFeatureGroup2FeatureGroupType56", 0);
		stop.setMaxRuleCount("ruleComponent2Subcomponent21", 0);
		
		
		
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeatTypedRefinedabstract", 0);
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParentRefinedabstract", 0);
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeatTypedAsParent", 0);
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeatTyped", 0);
		
		
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeatRefined", 0);
		stop.setMaxRuleCount("ruleFeatGroupDirFeat2FeatGroupDirFeat", 0);
		stop.setMaxRuleCount("ruleFeatGroupAccess2FeatGroupAccessTypedRefined", 0);
		stop.setMaxRuleCount("ruleFeatGroupAccess2FeatGroupAccessTyped", 0);
		
		stop.setMaxRuleCount("BusAccess2BusAccessRule", 0);
		stop.setMaxRuleCount("ruleFeatGroupAccess2FeatGroupAccess46", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompoSamePort45", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcSubcompoDestSubcompo44", 0);
		
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcSubcompoDestParentSamePort", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverse", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcSubcompoDestParentFeatGroup", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcSubcompoDestParent", 0);
		
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcParentFeatGroupInverseDestSubcompo", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcParentFeatGroupDestSubcompo", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcParentDestSubcompoSamePort", 0);
		stop.setMaxRuleCount("ruleDirFeatConn2DirFeatConnSrcParentDestSubcompo", 0);
		
		stop.setMaxRuleCount("ruleDirectedFeat2DirectedFeatTypedRefined35", 0);
		stop.setMaxRuleCount("ruleDirectedFeat2DirectedFeatTyped34", 0);
		stop.setMaxRuleCount("ruleDirectedFeat2DirectedFeatRefined33", 0);
		stop.setMaxRuleCount("ruleDirectedFeat2DirectedFeatabstract", 0);
		
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedRefinedTypedAsParent31", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedRefinedTyped30", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedRefinedabstract", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedAsParentRefinedTyped28", 0);
		
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedAsParentRefinedabstract", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentTypedAsParentabstract", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentTyped", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentRefinedTypedAsParent", 0);
		
		stop.setMaxRuleCount("ruleComponent2SubcomponentRefinedTyped", 0);
		stop.setMaxRuleCount("ruleComponent2SubcomponentRefinedConcrete", 0);
<<<<<<< HEAD
//		stop.setMaxRuleCount("ruleComponent2ComponentType", 4);
=======
	//	stop.setMaxRuleCount("ruleComponent2ComponentType20", 1);
>>>>>>> 21cb8e1086cbeafe8dd0bb08cf6cf61db0ecb456
	stop.setMaxRuleCount("ruleComponent2ComponentTypeBus", 0);
		stop.setMaxRuleCount("ruleComponent2ComponentTypeSubprogram", 0);
		stop.setMaxRuleCount("ruleComponent2ComponentTypeProcessor", 0);
		stop.setMaxRuleCount("ruleComponent2ComponentTypeThread", 0 );
		stop.setMaxRuleCount("ruleComponent2ComponentTypeData", 0);
		stop.setMaxRuleCount("ruleComponent2ComponentTypeProcess", 0 );
		stop.setMaxRuleCount("ruleComponent2ComponentTypeSystem", 1);

		stop.setMaxRuleCount("ruleComponent2ComponentTypeThreadGroup", 0 );

		stop.setMaxRuleCount("ruleComponent2ComponentTypeVirtualBus", 0 );
		stop.setMaxRuleCount("ruleComponent2ComponentTypeDevice", 0 );
		stop.setMaxRuleCount("ruleComponent2ComponentTypeAbstract", 0 );

		
		stop.setMaxRuleCount("ruleComponent2ComponentImplementationWithExtendscomponent", 0);
		
		//stop.setMaxRuleCount("ruleComponent2ComponentImplementation", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoFeatAccess", 0);
		stop.setMaxRuleCount("RuleAccessConn2AccessConnSrcSubcompoFeatDestSubcompoBus", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoFeatDestSubcompo15", 0);
		
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoFeatDestParentSameAccess14", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoFeatDestParent13", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoDestSubcompoFeat12", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoDestSubcompo11", 0);
		
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcSubcompoDestParent", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcParentDestSubcompoFeatSameAccess", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcParentDestSubcompoFeat", 0);
		stop.setMaxRuleCount("ruleAccessConn2AccessConnSrcParentDestSubcompo", 0);
		
		// stop.setMaxRuleCount("ruleAccess2AccessTypedAsParentRefined", 0);
		stop.setMaxRuleCount("ruleAccess2AccessTypedAsParentRefined5", 0);
		stop.setMaxRuleCount("ruleAccess2AccessTypedAsParentabstract", 0);
		stop.setMaxRuleCount("ruleAccess2AccessTypedabstract", 0);
		stop.setMaxRuleCount("ruleAccess2AccessTypedRefined",0);
		stop.setMaxRuleCount("ruleAccess2AccessRefined2", 0);
<<<<<<< HEAD
		stop.setMaxRuleCount("ruleAccess2AccessSystem", 1);
=======
		//stop.setMaxRuleCount("ruleBusAccess2BusAccessConcrete", 0);
>>>>>>> 21cb8e1086cbeafe8dd0bb08cf6cf61db0ecb456
		
		stop.setMaxRuleCount("ruleComponent2ComponentTypeWithExtends", 0);
		
		
		generator.setStopCriterion(stop);
		
		tic = System.currentTimeMillis();
		generator.run();
		toc = System.currentTimeMillis();
		logger.info("Completed MODELGEN in: " + (toc - tic) + " ms");
		
////		generator.getOptions().flattenedTGG().getRules();
////		 generator.getTGG().getRules();
//		for (TGGRule r : generator.getOptions().flattenedTGG().getRules()) {
//			logger.info(r.getName());
////			stop.setMaxRuleCount(r.getName(), 0);
//			
//			
//			
//		}
//		for (TGGRule r : generator.getOptions().flattenedTGG().getRules()) {
//			logger.info(r.getName());
//			r.getName()
////			stop.setMaxRuleCount(r.getName(), 0);
//			
//			
//			
//		}
//		TGGrule r: getRules().stream().filter(r -> r.getName().contentEquals(ruleName))
//		.findAny();

		
		
		generator.saveModels();
		generator.terminate();
	}
	
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		_SchemaBasedAutoRegistration.register(this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}
