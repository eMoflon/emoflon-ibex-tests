package org.emoflon.ibex.tgg.run.blockcodeadapter.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdpater.IBeXOperation;
import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdpater.VictoryIBeXAdapter;

import org.emoflon.ibex.tgg.run.blockcodeadapter.INITIAL_FWD_App;

public class INITIAL_FWD_Debug_App extends INITIAL_FWD_App {

	public INITIAL_FWD_Debug_App() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		boolean restart = true;
		while (restart) {
		    restart = false;
		
		    logger.info("Starting INITIAL_FWD_Debug");
		    long tic = System.currentTimeMillis();
		    INITIAL_FWD_Debug_App init_fwd = new INITIAL_FWD_Debug_App();
		    long toc = System.currentTimeMillis();
		    logger.info("Completed init for INITIAL_FWD_Debug in: " + (toc - tic) + " ms");
		
		    VictoryIBeXAdapter adapter = VictoryIBeXAdapter.create(init_fwd, IBeXOperation.FWD);
		    restart = adapter.run(() -> {
		        adapter.register(init_fwd);
		        try {
				    logger.info("Starting INITIAL_FWD_Debug");
				    long runTic = System.currentTimeMillis();
				    init_fwd.forward();
				    long runToc = System.currentTimeMillis();
				    logger.info("Completed INITIAL_FWD_Debug in: " + (runToc - runTic) + " ms");
		
				    init_fwd.saveModels();
				    init_fwd.terminate();
			    } catch (IOException pIOE) {
				    logger.error("INITIAL_FWD_Debug threw an IOException", pIOE);
		        }
		    });
		}
	}
	
}
