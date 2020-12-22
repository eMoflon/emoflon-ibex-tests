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

public class INTEGRATE_App extends INTEGRATE {

	// eMoflon supports other pattern matching engines. Replace
	// _DefaultRegistrationHelper with one of the other registrationHelpers from the
	// *.config-package to choose between them. Default: Democles
	public static IRegistrationHelper registrationHelper = new HiPERegistrationHelper();

	public INTEGRATE_App(String projectName, String workspacePath, String initPath, SupportedILPSolver ilpSolver,
			boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions()
				.project.name(projectName)
				.project.workspacePath(workspacePath)
				.ilpSolver(SupportedILPSolver.Sat4J)
				.debug.ibexDebug(debug)
				.propagate.usePrecedenceGraph(true)
				.repair.useShortcutRules(true)
				.repair.advancedOverlapStrategies(true)
				.repair.relaxedSCPatternMatching(true)
				.resourceHandler(
					new TGGResourceHandler() {
						@Override
						public void loadModels() throws IOException {
							source = loadResource(options.project.path() + initPath+"/src.xmi");
							target = loadResource(options.project.path() + initPath+"/trg.xmi");
							corr = loadResource(options.project.path() + initPath+"/corr.xmi");
							protocol = loadResource(options.project.path() + initPath+"/protocol.xmi");
							
							changeURI(source, options.project.path() + "/resources/integ/actual/delete_preserve_conflict/src.xmi");
							changeURI(target, options.project.path() + "/resources/integ/actual/delete_preserve_conflict/trg.xmi");
							changeURI(corr, options.project.path() + "/resources/integ/actual/delete_preserve_conflict/corr.xmi");
							changeURI(protocol, options.project.path() + "/resources/integ/actual/delete_preserve_conflict/protocol.xmi");
						
							EcoreUtil.resolveAll(rs);
						}
						
						@Override
						public void saveModels() throws IOException {
							source.save(null);
							target.save(null);
							corr.save(null);
							protocol.save(null);
						}
						
						private void changeURI(Resource r, String path) {
							URI uri = URI.createURI(options.project.path() + path);
							r.setURI(uri.resolve(base));
						}
				}));
	}
	
	public INTEGRATE_App(String folder, String name) throws IOException {
		super(registrationHelper.createIbexOptions()
				.ilpSolver(SupportedILPSolver.Sat4J)
				.propagate.usePrecedenceGraph(true)
				.repair.useShortcutRules(true)
				.repair.advancedOverlapStrategies(true)
				.repair.relaxedSCPatternMatching(true)
				.resourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = createResource(options.project.path() + "/" + folder +"/" + name + "_src.xmi");
						target = createResource(options.project.path() + "/" + folder +"/" + name + "_trg.xmi");
						corr = createResource(options.project.path() + "/" + folder +"/" + name + "_corr.xmi");
						protocol = createResource(options.project.path() + "/" + folder +"/" + name + "_protocol.xmi");

						changeURI(source, "/instances/src.xmi");
						changeURI(target, "/instances/trg.xmi");
						changeURI(corr, "/instances/corr.xmi");
						changeURI(protocol, "/instances/protocol.xmi");

						precedence = createResource(options.project.path() + "/instances/epg.xmi");

						EcoreUtil.resolveAll(rs);
					}

					private void changeURI(Resource r, String path) {
						URI uri = URI.createURI(options.project.path() + path);
						r.setURI(uri.resolve(base));
					}
				}));
	}
	
	public INTEGRATE_App() throws IOException {
		super(registrationHelper.createIbexOptions()
				.project.name("")
				.project.workspacePath("")
				.ilpSolver(SupportedILPSolver.Sat4J)
				.debug.ibexDebug(false)
				.propagate.usePrecedenceGraph(true)
				.repair.useShortcutRules(true)
				.repair.advancedOverlapStrategies(true)
				.repair.relaxedSCPatternMatching(true)
				.resourceHandler(
					new TGGResourceHandler() {
						@Override
						public void loadModels() throws IOException {
							source = loadResource(options.project.path() + "/resources/integ/in/src.xmi");
							target = loadResource(options.project.path() + "/resources/integ/in/trg.xmi");
							corr = loadResource(options.project.path() + "/resources/integ/in/corr.xmi");
							protocol = loadResource(options.project.path() + "/resources/integ/in/protocol.xmi");
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
