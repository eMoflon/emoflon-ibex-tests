package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/ProcessDefinition/"), URI.createURI("platform:/resource/ProcessDefinition/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/MocaTree/"), URI.createURI("platform:/resource/MocaTree/"));
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
