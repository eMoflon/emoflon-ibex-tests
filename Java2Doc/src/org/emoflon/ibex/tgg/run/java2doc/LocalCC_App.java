package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.opt.LocalCC;
import org.emoflon.ibex.tgg.run.java2doc.config._DefaultRegistrationHelper;


public class LocalCC_App extends LocalCC {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public LocalCC_App() throws IOException {
		super(registrationHelper.createIbexOptions());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		LocalCC_App cc = new LocalCC_App();
		
		logger.info("Starting CC");
		long tic = System.currentTimeMillis();
		cc.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CC in: " + (toc - tic) + " ms");
		
		cc.saveModels();
		cc.terminate();
		logger.info(cc.generateConsistencyReport());			
	}
}
