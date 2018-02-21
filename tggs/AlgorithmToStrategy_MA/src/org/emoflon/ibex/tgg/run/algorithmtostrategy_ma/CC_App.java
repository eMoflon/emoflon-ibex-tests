package org.emoflon.ibex.tgg.run.algorithmtostrategy_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import Algorithms.impl.AlgorithmsPackageImpl;
import Strategies.impl.StrategiesPackageImpl;

public class CC_App extends CC {
	
	private String srcPath;
	private String trgPath;

	public CC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesTGGEngine());
	}
	
	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("AlgorithmToStrategy_MA", "./../", true);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		cc.saveModels();
		cc.terminate();
		logger.info(cc.generateConsistencyReport());			
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/Algorithm/model/Algorithms.ecore", AlgorithmsPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Strategies/model/Strategies.ecore", StrategiesPackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	/*
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/"+trgPath+".xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	*/
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/"+trgPath+".xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("AlgorithmToStrategy_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
}
}
