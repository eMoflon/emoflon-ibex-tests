package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.*;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import VHDLModel.impl.VHDLModelPackageImpl;

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

		FWD_OPT_App fwd_opt = new FWD_OPT_App("VHDLTGGCodeAdapter", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		fwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		fwd_opt.saveModels();
		fwd_opt.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/VHDLModel/model/VHDLModel.ecore", VHDLModelPackageImpl.init());
		
		// Load and register source and target metamodels
		Resource res = loadResource("platform:/resource/../metamodels/MocaTree/model/MocaTree.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/MocaTree/model/MocaTree.ecore");
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
			
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() +srcPath+".xmi");
		t = createResource(options.projectPath() +trgPath+".xmi");
		c = createResource(options.projectPath() +corrPath+".xmi");
		p = createResource(options.projectPath() +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectPath("VHDLTGGCodeAdapter");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
