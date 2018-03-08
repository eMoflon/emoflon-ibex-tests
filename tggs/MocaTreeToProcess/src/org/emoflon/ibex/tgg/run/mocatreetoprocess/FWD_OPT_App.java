package org.emoflon.ibex.tgg.run.mocatreetoprocess;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import MocaTree.impl.MocaTreePackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		
		FWD_OPT_App sync = new FWD_OPT_App("MocaTreeToProcess", "./../", true, "/instances/src", "/instances/trg", 
				"/instances/corr", "/instances/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.saveModels();
		sync.terminate();
	}

	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath +srcPath+".xmi");
		t = createResource(projectPath +trgPath+".xmi");
		c = createResource(projectPath +corrPath+".xmi");
		p = createResource(projectPath +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		//rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
		//loadAndRegisterMetamodel("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore");
		
		Resource res = loadResource("platform:/resource/../metamodels/ProcessDefinition/model/ProcessDefinition.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore");
		//rs.getResources().remove(res);
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", pack);
		
		rs.getPackageRegistry().put("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore", pack);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("MocaTreeToProcess");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
