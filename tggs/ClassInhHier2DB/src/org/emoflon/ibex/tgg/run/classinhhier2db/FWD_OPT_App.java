package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.*;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;

public class FWD_OPT_App extends FWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public FWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
			String corrPath, String protPath) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		this.protPath = protPath;
		registerBlackInterpreter(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App sync = new FWD_OPT_App("ClassInhHier2DB", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
		logger.info("Starting FWD_OPT");
		long tic = System.currentTimeMillis();
		sync.forward();
		long toc = System.currentTimeMillis();
		logger.info("Completed FWD_OPT in: " + (toc - tic) + " ms");
		
		sync.terminate();
		sync.saveModels();
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassInheritanceHierarchyPackageImpl.init());
		
		// Load and register source and target metamodels
		//rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());
		Resource res = loadResource("platform:/resource/../metamodels/Database/model/Database.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/Database/model/Database.ecore");
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", pack);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath +srcPath+".xmi");
		t = createResource(projectPath +trgPath+".xmi");
		c = createResource(projectPath +corrPath+".xmi");
		p = createResource(projectPath +protPath+".xmi");
	
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
