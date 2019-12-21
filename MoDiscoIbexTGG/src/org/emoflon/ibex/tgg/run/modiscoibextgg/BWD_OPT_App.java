package org.emoflon.ibex.tgg.run.modiscoibextgg;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.run.modiscoibextgg.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class BWD_OPT_App extends BWD_OPT {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	static String srcPath;
	static String trgPath;
	static String corrPath;
	static String protPath;
	
	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver).setResourceHandler(new BWD_OPT_TGGResourceHandler()));
		BWD_OPT_App.srcPath = srcPath;
		BWD_OPT_App.trgPath = trgPath;
		BWD_OPT_App.corrPath = corrPath;
		BWD_OPT_App.protPath = protPath;
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		BWD_OPT_App bwd_opt = new BWD_OPT_App("MoDiscoIbexTGG", "./../", true, "/instances/src", "/instances/trg", 
				"/instances/corr", "/instances/protocol", SupportedILPSolver.Gurobi);
		
		logger.info("Starting BWD_OPT");
		long tic = System.currentTimeMillis();
		bwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed BWD_OPT in: " + (toc - tic) + " ms");
		
		bwd_opt.saveModels();
		bwd_opt.terminate();
	}
}


class BWD_OPT_TGGResourceHandler extends TGGResourceHandler {
	
	public BWD_OPT_TGGResourceHandler() throws IOException {
		super();
	}

	@Override
	public void loadModels() throws IOException {
		source = createResource(options.projectPath() +BWD_OPT_App.srcPath+".xmi");
		target = loadResource(options.projectPath() +BWD_OPT_App.trgPath+".xmi");
		corr = createResource(options.projectPath() +BWD_OPT_App.corrPath+".xmi");
		protocol = createResource(options.projectPath() +BWD_OPT_App.protPath+".xmi");
	}
}