package org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import Database.impl.DatabasePackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;

public class SYNC_App extends SYNC {

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(projectName, workspacePath, debug);
		registerPatternMatchingEngine(new DemoclesEngine());
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(projectPath + "/instances/src.xmi");
		t = createResource(projectPath + "/instances/trg.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/ClassMultipleInheritanceHierarchy/model/classMultipleInheritanceHierarchy.ecore", ClassMultipleInheritanceHierarchyPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());

		//throw new NotImplementedException("Please check that your source and target metamodels are loaded and registered.");
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
}
