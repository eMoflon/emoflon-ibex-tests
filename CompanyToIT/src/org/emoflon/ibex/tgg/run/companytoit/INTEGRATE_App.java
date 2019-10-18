package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.runtime.engine.DemoclesTGGEngine;

public class INTEGRATE_App extends INTEGRATE {

	private String initPath;

	public INTEGRATE_App(String projectName, String workspacePath, String initPath, boolean debug) throws IOException {
		super(createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug));
		this.initPath = initPath;
		registerBlackInterpreter(new DemoclesTGGEngine());
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		_RegistrationHelper.registerMetamodels(rs, this);

		// Register correspondence metamodel last
		loadAndRegisterCorrMetamodel(options.projectPath() + "/model/" + options.projectName() + ".ecore");
	}

	@Override
	public void loadModels() throws IOException {
		s = loadResource(options.projectPath() + initPath + "/src.xmi");
		t = loadResource(options.projectPath() + initPath + "/trg.xmi");
		c = loadResource(options.projectPath() + initPath + "/corr.xmi");
		p = loadResource(options.projectPath() + initPath + "/protocol.xmi");
		
		changeURI(s, "/instances/src.xmi");
		changeURI(t, "/instances/trg.xmi");
		changeURI(c, "/instances/corr.xmi");
		changeURI(p, "/instances/protocol.xmi");
		
		epg = createResource(options.projectPath() + "/instances/epg.xmi");
		
		EcoreUtil.resolveAll(rs);
	}

	private static IbexOptions createIbexOptions() {
		return _RegistrationHelper.createIbexOptions();
	}
	
	private void changeURI(Resource r, String path) {
		URI uri = URI.createURI(options.projectPath() + path);
		r.setURI(uri.resolve(base));
	}
}
