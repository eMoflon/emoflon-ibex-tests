package org.emoflon.ibex.tgg.run.blockcodeadapter;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockcodeadapter.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.runtime.strategies.opt.CC;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class CC_App extends CC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();
	
	static String srcPath;
	static String trgPath;

	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug).ilpSolver(ilpSolver).resourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.project.path() + "/resources/"+srcPath+".xmi");
				target = loadResource(options.project.path() + "/resources/"+trgPath+".xmi");
				corr = createResource(options.project.path() + "/instances/corr.xmi");
				protocol = createResource(options.project.path() + "/instances/protocol.xmi");
			}
		}));
	}
}

class CC_TGGResourceHandler extends TGGResourceHandler {
	
	public CC_TGGResourceHandler() throws IOException {
		super();
	}

	@Override
	public void loadModels() throws IOException {
		source = loadResource(options.project.path() + "/resources/"+CC_App.srcPath+".xmi");
		target = loadResource(options.project.path() + "/resources/"+CC_App.trgPath+".xmi");
		corr = createResource(options.project.path() + "/instances/corr.xmi");
		protocol = createResource(options.project.path() + "/instances/protocol.xmi");
	}
}