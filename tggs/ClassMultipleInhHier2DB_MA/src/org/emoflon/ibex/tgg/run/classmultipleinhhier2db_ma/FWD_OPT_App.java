package org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Database.impl.DatabasePackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	public FWD_OPT_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App fwd_opt = new FWD_OPT_App("ClassMultipleInhHier2DB_MA", "./../", false);
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		fwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		fwd_opt.saveModels();
		fwd_opt.terminate();
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassMultipleInheritanceHierarchyPackageImpl.init());
		
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
		s = loadResource(projectPath + "/resources/co/src.xmi");
		t = createResource(projectPath + "/resources/co/trg.xmi");
		c = createResource(projectPath + "/resources/co/corr.xmi");
		p = createResource(projectPath + "/resources/co/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);

	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("ClassMultipleInhHier2DB_MA");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
