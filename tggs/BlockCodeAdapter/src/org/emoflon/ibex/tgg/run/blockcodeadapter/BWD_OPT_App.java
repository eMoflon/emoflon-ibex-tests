package org.emoflon.ibex.tgg.run.blockcodeadapter;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import BlockLanguage.impl.BlockLanguagePackageImpl;

public class BWD_OPT_App extends BWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
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

		BWD_OPT_App bwd_opt = new BWD_OPT_App("BlockCodeAdapter", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting BWD_OPT");
		long tic = System.currentTimeMillis();
		bwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed BWD_OPT in: " + (toc - tic) + " ms");
		
		bwd_opt.saveModels();
		bwd_opt.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/BlockLanguage/model/BlockLanguage.ecore", BlockLanguagePackageImpl.init());
		
		Resource res = loadResource("platform:/resource/../metamodels/MocaTree/model/MocaTree.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/BlockLanguage/model/BlockLanguage.ecore");
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
			
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() +srcPath+".xmi");
		t = loadResource(options.projectPath() +trgPath+".xmi");
		c = createResource(options.projectPath() +corrPath+".xmi");
		p = createResource(options.projectPath() +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectPath("BlockCodeAdapter");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
