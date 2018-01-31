package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.*;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App sync = new FWD_OPT_App("ClassInhHier2DB", "./../", true);
		
		logger.info("Starting SYNC");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed SYNC in: " + (toc - tic) + " ms");
		
		sync.terminate();
		sync.saveModels();
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassInheritanceHierarchyPackageImpl.init());
		
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());
		Resource res = loadResource("platform:/resource/../../../git/emoflon-ibex-tests/metamodels/Database/model/Database.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		pack.setNsURI("platform:/plugin/Database/model/Database.ecore");
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", pack);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/instances/src.xmi");
		t = createResource(projectPath + "/instances/trg.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);

	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("ClassInhHier2DB");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
