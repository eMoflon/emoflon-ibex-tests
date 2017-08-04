package org.emoflon.ibex.tgg.run;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean flatten, boolean debug) throws IOException {
		super(projectName, workspacePath, flatten, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/CompanyLanguage/"), URI.createURI("platform:/resource/CompanyLanguage/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/ITLanguage/"), URI.createURI("platform:/resource/ITLanguage/"));
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", CompanyLanguagePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", ITLanguagePackageImpl.init());
		
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
