package org.emoflon.ibex.tgg.run.express2uml;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.run.express2uml.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import Express2UML.integrate.solve.SolveConflictResolver;

public class INTEGRATE_App extends INTEGRATE {

	// eMoflon supports other pattern matching engines. Replace
	// _DefaultRegistrationHelper with one of the other registrationHelpers from the
	// *.config-package to choose between them. Default: Democles
	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public INTEGRATE_App(String projectName, String workspacePath, String initPath, SupportedILPSolver ilpSolver,
			boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath)
				.integration.conflictSolver(new SolveConflictResolver())
				.ilpSolver(SupportedILPSolver.Sat4J).debug.ibexDebug(debug).propagate.usePrecedenceGraph(true).repair
						.useShortcutRules(true).repair.advancedOverlapStrategies(true).repair
								.relaxedSCPatternMatching(true).resourceHandler(new TGGResourceHandler() {
									@Override
									public void loadModels() throws IOException {
										/*source = loadResource(options.project.path() + initPath + "/src.xmi");
										target = loadResource(options.project.path() + initPath + "/trg.xmi");
										corr = loadResource(options.project.path() + initPath + "/corr.xmi");
										protocol = loadResource(options.project.path() + initPath + "/protocol.xmi");

										changeURI(source, "/instances/src.xmi");
										changeURI(target, "/instances/trg.xmi");
										changeURI(corr, "/instances/corr.xmi");
										changeURI(protocol, "/instances/protocol.xmi");

										precedence = createResource(options.project.path() + "/instances/epg.xmi");

										EcoreUtil.resolveAll(rs);*/
									}

									private void changeURI(Resource r, String path) {
										URI uri = URI.createURI(options.project.path() + path);
										r.setURI(uri.resolve(base));
									}
								}));
	}

	public INTEGRATE_App() throws IOException {
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

		logger.info("Starting INTEGRATE");
		long tic = System.currentTimeMillis();
		INTEGRATE_App integrate = new INTEGRATE_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for INTEGRATE in: " + (toc - tic) + " ms");

		tic = System.currentTimeMillis();
		integrate.integrate();
		toc = System.currentTimeMillis();
		logger.info("Completed INTEGRATE in: " + (toc - tic) + " ms");

		integrate.saveModels();
		integrate.terminate();
	}
}
