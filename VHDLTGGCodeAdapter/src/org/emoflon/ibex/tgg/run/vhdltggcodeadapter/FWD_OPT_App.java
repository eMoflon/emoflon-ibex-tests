package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class FWD_OPT_App extends FWD_OPT {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug).ilpSolver(ilpSolver).resourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.project.path() +srcPath+".xmi");
				target = createResource(options.project.path() +trgPath+".xmi");
				corr = createResource(options.project.path() +corrPath+".xmi");
				protocol = createResource(options.project.path() +protPath+".xmi");
			}
		}));
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
}
