package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.CO;
import org.emoflon.ibex.tgg.run.familiestopersons_v1.config._DefaultRegistrationHelper;


public class CO_App extends CO {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public CO_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setResourceHandler(new TGGResourceHandler() {
			@Override
			public void loadModels() throws IOException {
				source = loadResource(options.projectPath() +srcPath+".xmi");
				target = loadResource(options.projectPath() +trgPath+".xmi");
				corr = loadResource(options.projectPath() +corrPath+".xmi");
				protocol = createResource(options.projectPath() +protPath+".xmi");
			}
		}));
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("FamiliesToPersons_V1", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
		logger.info("Starting CO");
		long tic = System.currentTimeMillis();
		co.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CO in: " + (toc - tic) + " ms");
		
		co.saveModels();
		co.terminate();
		logger.info(co.generateConsistencyReport());
	}
}
