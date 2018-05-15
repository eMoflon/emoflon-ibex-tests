package org.emoflon.ibex.tgg.run.familywithsiblingstopersons_ma;

import java.io.IOException;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

<<<<<<< Updated upstream
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
=======
>>>>>>> Stashed changes
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class INITIAL_FWD_App extends SYNC {

	public INITIAL_FWD_App() throws IOException {
		super(createIbexOptions());
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		Logger.getRootLogger().setLevel(Level.INFO);

		INITIAL_FWD_App init_fwd = new INITIAL_FWD_App();
		
		logger.info("Starting INITIAL FWD");
		long tic = System.currentTimeMillis();
		init_fwd.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed INITIAL FWD in: " + (toc - tic) + " ms");
		
		init_fwd.saveModels();
		init_fwd.terminate();
	}
	
	@Override
	public void loadModels() throws IOException {
<<<<<<< Updated upstream
		s = loadResource(projectPath + "/instances/src.xmi");
		t = createResource(projectPath + "/instances/trg.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
=======
		s = loadResource(options.projectPath() + "/instances/src.xmi");
		t = createResource(options.projectPath() + "/instances/trg.xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
>>>>>>> Stashed changes
		
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() throws IOException {
		t.save(null);
		c.save(null);
		p.save(null);
	}
	
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
<<<<<<< Updated upstream
		IbexOptions options = new IbexOptions();
		options.projectName("FamilyWithSiblingsToPersons_MA");
		options.projectPath("FamilyWithSiblingsToPersons_MA");
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
=======
		return _RegistrationHelper.createIbexOptions();
>>>>>>> Stashed changes
	}
}
