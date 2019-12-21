package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config._DefaultRegistrationHelper;



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

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		SYNC_App sync = new SYNC_App("FamiliesToPersons_V1", "./../", false);
		
		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");

		sync.saveModels();
		sync.terminate();
	}
}

