package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v1.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.runtime.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class SYNC_App extends SYNC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, SupportedILPSolver ilpSolver, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions()
				.project.name(projectName)
				.project.workspacePath(workspacePath)
				.ilpSolver(ilpSolver)
				.debug.ibexDebug(debug)
				.resourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = createResource(options.project.path() + "/instances/src.xmi");
				target = createResource(options.project.path() + "/instances/trg.xmi");
				corr = createResource(options.project.path() + "/instances/corr.xmi");
				protocol = createResource(options.project.path() + "/instances/protocol.xmi");
			}
		}));
	}

}

