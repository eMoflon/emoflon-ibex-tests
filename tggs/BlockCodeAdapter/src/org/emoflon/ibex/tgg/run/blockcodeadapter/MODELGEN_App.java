package org.emoflon.ibex.tgg.run.blockcodeadapter;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.util.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesEngine;

import BlockLanguage.impl.BlockLanguagePackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

public class MODELGEN_App extends MODELGEN {

	public MODELGEN_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerPatternMatchingEngine(new DemoclesEngine());
	}

	protected void registerUserMetamodels() throws IOException {
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/BlockLanguage/"), URI.createURI("platform:/resource/BlockLanguage/"));
		rs.getURIConverter().getURIMap().put(URI.createURI("platform:/plugin/MocaTree/"), URI.createURI("platform:/resource/MocaTree/"));
		rs.getPackageRegistry().put("platform:/resource/BlockLanguage/model/BlockLanguage.ecore", BlockLanguagePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("BlockCodeAdapter");
		options.debug(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
