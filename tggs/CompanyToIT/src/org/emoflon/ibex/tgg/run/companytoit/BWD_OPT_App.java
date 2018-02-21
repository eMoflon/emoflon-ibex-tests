package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import ITLanguage.impl.ITLanguagePackageImpl;

public class BWD_OPT_App extends BWD_OPT {

	String srcPath;
	String trgPath;
	String corrPath;
	String protPath;
	
	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, 
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

		BWD_OPT_App bwd_opt = new BWD_OPT_App("CompanyToIT", "./../", true, "/resources/co/src", "/resources/co/trg", 
				"/resources/co/corr", "/resources/co/protocol");
		
		logger.info("Starting BWD_OPT");
		long tic = System.currentTimeMillis();
		bwd_opt.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed BWD_OPT in: " + (toc - tic) + " ms");
		
		bwd_opt.saveModels();
		bwd_opt.terminate();
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
		
		// Load and register source and target metamodels
		//rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
		Resource res = loadResource("platform:/resource/../metamodels/CompanyLanguage/model/CompanyLanguage.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		//pack.setNsURI("platform:/plugin/ITLanguage/model/ITLanguage.ecore");
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", pack);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(projectPath +srcPath+".xmi");
		t = loadResource(projectPath +trgPath+".xmi");
		c = createResource(projectPath +corrPath+".xmi");
		p = createResource(projectPath +protPath+".xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
			IbexOptions options = new IbexOptions();
			options.projectName("CompanyToIT");
			options.debug(false);
			options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
			return options;
	}
}
