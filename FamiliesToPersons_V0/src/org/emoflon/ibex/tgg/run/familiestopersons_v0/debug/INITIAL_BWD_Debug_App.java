package org.emoflon.ibex.tgg.run.familiestopersons_v0.debug;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdpater.IBeXOperation;
import org.emoflon.ibex.tgg.ui.debug.adapter.TGGAdpater.VictoryIBeXAdapter;

import org.emoflon.ibex.tgg.run.familiestopersons_v0.INITIAL_BWD_App;

public class INITIAL_BWD_Debug_App extends INITIAL_BWD_App {

	public INITIAL_BWD_Debug_App() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		boolean restart = true;
		while (restart) {
		    restart = false;
		
		    logger.info("Starting INITIAL_BWD_Debug");
		    long tic = System.currentTimeMillis();
		    INITIAL_BWD_Debug_App init_bwd = new INITIAL_BWD_Debug_App();
		    long toc = System.currentTimeMillis();
		    logger.info("Completed init for INITIAL_BWD_Debug in: " + (toc - tic) + " ms");
		
		    VictoryIBeXAdapter adapter = VictoryIBeXAdapter.create(init_bwd, IBeXOperation.FWD);
		    restart = adapter.run(() -> {
		        adapter.register(init_bwd);
		        try {
				    logger.info("Starting INITIAL_BWD_Debug");
				    long runTic = System.currentTimeMillis();
				    init_bwd.backward();
				    long runToc = System.currentTimeMillis();
				    logger.info("Completed INITIAL_BWD_Debug in: " + (runToc - runTic) + " ms");
		
				    init_bwd.saveModels();
				    init_bwd.terminate();
			    } catch (IOException pIOE) {
				    logger.error("INITIAL_BWD_Debug threw an IOException", pIOE);
		        }
		    });
		}
	}
	
}
