package org.emoflon.ibex.tgg.run.clazz2glossardoc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.clazz2glossardoc.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class SYNC_App extends SYNC {

	// eMoflon supports other pattern matching engines. Replace _DefaultRegistrationHelper with one of the other registrationHelpers from the *.config-package to choose between them. Default: Democles 
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, SupportedILPSolver ilpSolver, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions()
				.project.name(projectName).project
				.workspacePath(workspacePath)
				.debug.ibexDebug(debug)
				.ilpSolver(ilpSolver)
				.propagate.usePrecedenceGraph(true)
				.repair.repairAttributes(false)
				.repair.useShortcutRules(true)
				.repair.relaxedSCPatternMatching(true)
				.repair.advancedOverlapStrategies(true)
				.resourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = createResource(options.project.path() + "/instances/src.xmi");
						target = createResource(options.project.path() + "/instances/trg.xmi");
						corr = createResource(options.project.path() + "/instances/corr.xmi");
						protocol = createResource(options.project.path() + "/instances/protocol.xmi");
					}
				})
			);
	}

}
