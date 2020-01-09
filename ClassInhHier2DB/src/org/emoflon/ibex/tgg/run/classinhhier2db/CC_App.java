package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.run.classinhhier2db.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class CC_App extends CC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver).setResourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.projectPath() + "/resources/"+srcPath+".xmi");
				target = loadResource(options.projectPath() + "/resources/"+trgPath+".xmi");
				corr = createResource(options.projectPath() + "/instances/corr.xmi");
				protocol = createResource(options.projectPath() + "/instances/protocol.xmi");
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("ClassInhHier2DB", "./../", true, args[0], args[1], SupportedILPSolver.Gurobi);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");

		cc.saveModels();
		cc.terminate();
	}
}
