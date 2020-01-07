package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.CC;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config._DefaultRegistrationHelper;
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
}
