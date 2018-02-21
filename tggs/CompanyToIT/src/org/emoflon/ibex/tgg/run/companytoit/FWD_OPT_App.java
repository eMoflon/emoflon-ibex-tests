package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.*;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;

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
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		FWD_OPT_App sync = new FWD_OPT_App("CompanyToIT", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
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
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
		
		// Load and register source and target metamodels
		//rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
		Resource res = loadResource("platform:/resource/../metamodels/ITLanguage/model/ITLanguage.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/ITLanguage/model/ITLanguage.ecore");
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", pack);
		
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
		options.projectPath("CompanyToIT");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
