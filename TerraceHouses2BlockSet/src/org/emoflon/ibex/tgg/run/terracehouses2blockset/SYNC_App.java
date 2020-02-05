package org.emoflon.ibex.tgg.run.terracehouses2blockset;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.terracehouses2blockset.config._DefaultRegistrationHelper;

public class SYNC_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug)
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
