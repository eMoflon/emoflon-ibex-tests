package org.emoflon.ibex.tgg.run.exttype2doc_scderived;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.exttype2doc_scderived.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class SYNC_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, SupportedILPSolver ilpSolver, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions()
				.project.name(projectName).project
				.workspacePath(workspacePath)
				.debug.ibexDebug(debug)
				.ilpSolver(SupportedILPSolver.Sat4J) // Gurobi gets no satisfying result
				.propagate.usePrecedenceGraph(true)
				.repair.useShortcutRules(true)
				.repair.repairAttributes(true)
				.repair.relaxedSCPatternMatching(true)
				.repair.omitUnnecessaryContext(true)
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
