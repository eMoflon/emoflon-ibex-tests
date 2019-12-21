package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class CC_App extends CC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	static String srcPath;
	static String trgPath;

	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver).setResourceHandler(new CC_TGGResourceHandler()));
		CC_App.srcPath = srcPath;
		CC_App.trgPath = trgPath;
	}
	
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CC_App cc = new CC_App("FamiliesToPersons_V1", "./../", true, "../instances/src", "../instances/trg", SupportedILPSolver.Gurobi);
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		System.out.println(cc.generateConsistencyReport());
		
		cc.saveModels();
		cc.terminate();
	}
}

class CC_TGGResourceHandler extends TGGResourceHandler {
	
	public CC_TGGResourceHandler() throws IOException {
		super();
	}

	@Override
	public void loadModels() throws IOException {
		source = loadResource(options.projectPath() + "/resources/"+CC_App.srcPath+".xmi");
		target = loadResource(options.projectPath() + "/resources/"+CC_App.trgPath+".xmi");
		corr = createResource(options.projectPath() + "/instances/corr.xmi");
		protocol = createResource(options.projectPath() + "/instances/protocol.xmi");
	}
}
