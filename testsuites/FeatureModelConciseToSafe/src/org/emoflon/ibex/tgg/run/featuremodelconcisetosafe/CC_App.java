package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;

import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class CC_App extends CC {
	private String srcPath;
	private String trgPath;
	
	public CC_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("FeatureModelConciseToSafe", "./../", false, "src", "trg", SupportedILPSolver.Gurobi);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		cc.saveModels();
		cc.terminate();
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() + "/resources/"+srcPath+".xmi");
		t = loadResource(options.projectPath() + "/resources/"+trgPath+".xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}