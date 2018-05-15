package org.emoflon.ibex.tgg.run.algorithmtostrategy_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import Algorithms.impl.AlgorithmsPackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App fwd_opt = new FWD_OPT_App("AlgorithmToStrategy_MA", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		fwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		fwd_opt.saveModels();
		fwd_opt.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/Algorithm/model/Algorithms.ecore", AlgorithmsPackageImpl.init());
		
		// Load and register source and target metamodels
		//rs.getPackageRegistry().put("platform:/resource/Strategy/model/Strategies.ecore", StrategiesPackageImpl.init());
		Resource res = loadResource("platform:/resource/../metamodels/Strategy/model/Strategies.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/Strategy/model/Strategies.ecore");
		rs.getPackageRegistry().put("platform:/resource/Strategy/model/Strategies.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/Strategy/model/Strategies.ecore", pack);
			
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() +srcPath+".xmi");
		t = loadResource(options.projectPath() +trgPath+".xmi");
		c = loadResource(options.projectPath() +corrPath+".xmi");
		p = createResource(options.projectPath() +protPath+".xmi");
	
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
