package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.run.processcodeadapter.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class FWD_OPT_App extends FWD_OPT {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	static String srcPath;
	static String trgPath;
	static String corrPath;
	static String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver).setResourceHandler(new FWD_OPT_TGGResourceHandler()));
		FWD_OPT_App.srcPath = srcPath;
		FWD_OPT_App.trgPath = trgPath;
		FWD_OPT_App.corrPath = corrPath;
		FWD_OPT_App.protPath = protPath;
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App fwd_opt = new FWD_OPT_App("ProcessCodeAdapter", "./../", true, "/resources/co/src", "/resources/co/trg", 
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

class FWD_OPT_TGGResourceHandler extends TGGResourceHandler {
	
	public FWD_OPT_TGGResourceHandler() throws IOException {
		super();
	}

	@Override
	public void loadModels() throws IOException {
		source = loadResource(options.projectPath() +FWD_OPT_App.srcPath+".xmi");
		target = createResource(options.projectPath() +FWD_OPT_App.trgPath+".xmi");
		corr = createResource(options.projectPath() +FWD_OPT_App.corrPath+".xmi");
		protocol = createResource(options.projectPath() +FWD_OPT_App.protPath+".xmi");
	}
}
