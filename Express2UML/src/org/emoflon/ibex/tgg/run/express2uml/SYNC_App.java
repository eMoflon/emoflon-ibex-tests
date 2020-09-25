package org.emoflon.ibex.tgg.run.express2uml;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.express2uml.config._DefaultRegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

public class SYNC_App extends SYNC {

	// eMoflon supports other pattern matching engines. Replace
	// _DefaultRegistrationHelper with one of the other registrationHelpers from the
	// *.config-package to choose between them. Default: Democles
	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, boolean debug)
			throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project
				.workspacePath(workspacePath).debug.ibexDebug(debug).ilpSolver(SupportedILPSolver.Sat4J).propagate
						.usePrecedenceGraph(true).repair.useShortcutRules(false).repair
								.relaxedSCPatternMatching(false).repair.advancedOverlapStrategies(false)
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
		super(registrationHelper.createIbexOptions().resourceHandler(new TGGResourceHandler() {
			@Override
			public void saveModels() throws IOException {
				// Use the commented code below to implement saveModels individually.
				// source.save(null);
				// target.save(null);
				// corr.save(null);
				// protocol.save(null);

				super.saveModels();
			}

			@Override
			public void loadModels() throws IOException {
				// Use the commented code below to implement loadModels individually.
				// loadResource loads from a file while createResource creates a new resource
				// without content
				// source = loadResource(options.project.path() + "/instances/src.xmi");
				// target = createResource(options.project.path() + "/instances/trg.xmi");
				// corr = createResource(options.project.path() + "/instances/corr.xmi");
				// protocol = createResource(options.project.path() +
				// "/instances/protocol.xmi");

				super.loadModels();
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		SYNC_App sync = new SYNC_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for SYNC in: " + (toc - tic) + " ms");

		tic = System.currentTimeMillis();
		sync.forward();
		toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");

		sync.saveModels();
		sync.terminate();
	}
}
