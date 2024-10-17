package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.run.java2doc.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.runtime.strategies.sync.SYNC;
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
				}));
	}

	public SYNC_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		SYNC_App sync = new SYNC_App();

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");

		sync.saveModels();
		sync.terminate();
	}
}
