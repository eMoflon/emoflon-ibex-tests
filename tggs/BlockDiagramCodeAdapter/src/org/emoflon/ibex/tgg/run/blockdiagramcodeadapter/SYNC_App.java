package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

public class SYNC_App extends SYNC {

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(new DemoclesTGGEngine());
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(projectPath + "/instances/src.xmi");
		t = createResource(projectPath + "/instances/trg.xmi");
		c = createResource(projectPath + "/instances/corr.xmi");
		p = createResource(projectPath + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		rs.getPackageRegistry().put("platform:/resource/BlockDiagram/model/BlockDiagram.ecore", BlockDiagramPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("BlockDiagramCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
