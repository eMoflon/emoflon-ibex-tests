package org.emoflon.ibex.tgg.run.ibextgggantt2cpm;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.patterns.PatternSuffixes;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class INITIAL_BWD_App extends SYNC {

	public INITIAL_BWD_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.INFO);

		logger.info("Starting INITIAL BWD");
		long tic = System.currentTimeMillis();
		INITIAL_BWD_App init_bwd = new INITIAL_BWD_App();
		long toc = System.currentTimeMillis();
		logger.info("Completed init for BWD in: " + (toc - tic) + " ms");
		
		tic = System.currentTimeMillis();
		init_bwd.backward();
		toc = System.currentTimeMillis();
		logger.info("Completed INITIAL_BWD in: " + (toc - tic) + " ms");
		
		init_bwd.saveModels();
		init_bwd.terminate();
	}
	
	@Override
	public boolean isPatternRelevantForCompiler(String patternName) {
		return patternName.endsWith(PatternSuffixes.BWD);
	}
	
	@Override
	public void loadModels() throws IOException {
		t = loadResource(options.projectPath() + "/instances/trg.xmi");
		s = createResource(options.projectPath() + "/instances/src.xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() throws IOException {
		s.save(null);
		c.save(null);
		p.save(null);
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
}
