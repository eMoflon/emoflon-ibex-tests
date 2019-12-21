package org.emoflon.ibex.tgg.run.mocatreetoprocess;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.run.mocatreetoprocess.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class FWD_OPT_App extends FWD_OPT {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver).setResourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.projectPath() +srcPath+".xmi");
				target = createResource(options.projectPath() +trgPath+".xmi");
				corr = createResource(options.projectPath() +corrPath+".xmi");
				protocol = createResource(options.projectPath() +protPath+".xmi");
			}
			
			@Override
			public void saveModels() throws IOException {
				
			}
		}));
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
}
