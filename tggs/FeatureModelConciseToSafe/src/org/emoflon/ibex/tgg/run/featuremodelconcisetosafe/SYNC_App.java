package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import FeatureModelConcise.impl.FeatureModelConcisePackageImpl;
import FeatureModelSafe.impl.FeatureModelSafePackageImpl;

public class SYNC_App extends SYNC {

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		SYNC_App sync = new SYNC_App("FeatureModelConciseToSafe", "./../", false);
		
		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.saveModels();
		sync.terminate();
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() + "/instances/src.xmi");
		t = createResource(options.projectPath() + "/instances/trg.xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/FeatureModelConcise/"), URI.createURI("platform:/resource/FeatureModelConcise/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/FeatureModelSafe/"), URI.createURI("platform:/resource/FeatureModelSafe/"));
		rs.getPackageRegistry().put("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore", FeatureModelConcisePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore", FeatureModelSafePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("FeatureModelConciseToSafe");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
