package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.companytoit.config._DefaultRegistrationHelper;


public class SYNC_App extends SYNC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setResourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = createResource(options.projectPath() + "/instances/src.xmi");
				target = createResource(options.projectPath() + "/instances/trg.xmi");
				corr = createResource(options.projectPath() + "/instances/corr.xmi");
				protocol = createResource(options.projectPath() + "/instances/protocol.xmi");
			}
			
			@Override
			public void saveModels() throws IOException {
				// TODO Auto-generated method stub
			}
		}));
	}
}

