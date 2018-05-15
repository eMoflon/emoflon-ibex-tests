package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class CC_App extends CC {
	private String srcPath;
	private String trgPath;

	public CC_App(String projectName, String workspacePath, boolean debug,
			String srcPath, String trgPath, SupportedILPSolver ilpSolver) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug).setIlpSolver(ilpSolver));
		this.srcPath = srcPath;
		this.trgPath = trgPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	@Override
	protected void registerUserMetamodels() throws IOException {		
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() + "/resources/"+srcPath+".xmi");
		t = loadResource(options.projectPath() + "/resources/"+trgPath+".xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	private static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectPath("ProcessCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
