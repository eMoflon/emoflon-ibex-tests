package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config._DefaultRegistrationHelper;

public class SYNC_App extends SYNC {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public SYNC_App(String projectName, String workspacePath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		registerBlackInterpreter(options.getBlackInterpreter());
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() + "/instances/src.xmi");
		t = createResource(options.projectPath() + "/instances/trg.xmi");
		c = createResource(options.projectPath() + "/instances/corr.xmi");
		p = createResource(options.projectPath() + "/instances/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	protected void registerUserMetamodels() throws IOException {
		registrationHelper.registerMetamodels(rs, this);
			
		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}
}
