package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class CC_App extends CC {
	private String srcPath;
	private String trgPath;

	public CC_App(String projectName, String workspacePath, boolean flatten, boolean debug,
			String srcPath, String trgPath) throws IOException {
		super(projectName, workspacePath, flatten, debug);
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	@Override
	protected void registerUserMetamodels() throws IOException {		
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/resources/"+srcPath+".xmi");
		t = loadResource(projectPath + "/resources/"+trgPath+".xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
}
