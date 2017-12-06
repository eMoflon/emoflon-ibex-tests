package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;

import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class CO_App extends CO {

	public CO_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();

		CO_App co = new CO_App("CompanyToIT", "./../", true);
		
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
}
