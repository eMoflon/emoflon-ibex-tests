package org.emoflon.ibex.tgg.run.algorithmtostrategy_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Algorithms.impl.AlgorithmsPackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App fwd_opt = new FWD_OPT_App("AlgorithmToStrategy_MA", "./../", true);
		
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
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/co/src.xmi");
		t = createResource(projectPath + "/resources/co/trg.xmi");
		c = createResource(projectPath + "/resources/co/corr.xmi");
		p = createResource(projectPath + "/resources/co/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);

	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("AlgorithmToStrategy_MA");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
