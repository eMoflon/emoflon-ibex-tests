package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class CO_App extends CO {

	String srcPath;
	String trgPath;
	String corrPath;
	
	public CO_App(String projectName, String workspacePath, boolean debug, String srcPath, String trgPath, String corrPath) throws IOException {
		super(projectName, workspacePath, debug);
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		this.corrPath = corrPath;
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("CompanyToIT", "./../", true, "src", "trg", "corr");
		
		logger.info("Starting CO");
		long tic = System.currentTimeMillis();
		co.run();
		long toc = System.currentTimeMillis();
		logger.info("Completed CO in: " + (toc - tic) + " ms");
		
		co.saveModels();
		co.terminate();
	}

	protected void registerUserMetamodels() throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/co/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/co/"+trgPath+".xmi");
		c = loadResource(projectPath + "/resources/co/"+corrPath+".xmi");
		p = createResource(projectPath + "/resources/co/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() throws IOException {
		p.save(null);
	}
}
