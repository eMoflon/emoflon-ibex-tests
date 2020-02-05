package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;
import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.run.companytoit.config._DefaultRegistrationHelper;

public class INTEGRATE_App extends INTEGRATE {

	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INTEGRATE_App(String projectName, String workspacePath, String initPath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().project.name(projectName).project.workspacePath(workspacePath).debug.ibexDebug(debug)
				.resourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = loadResource(options.project.path() + initPath + "/src.xmi");
						target = loadResource(options.project.path() + initPath + "/trg.xmi");
						corr = loadResource(options.project.path() + initPath + "/corr.xmi");
						protocol = loadResource(options.project.path() + initPath + "/protocol.xmi");

						changeURI(source, "/instances/src.xmi");
						changeURI(target, "/instances/trg.xmi");
						changeURI(corr, "/instances/corr.xmi");
						changeURI(protocol, "/instances/protocol.xmi");

						precedence = createResource(options.project.path() + "/instances/epg.xmi");

						EcoreUtil.resolveAll(rs);
					}

					private void changeURI(Resource r, String path) {
						URI uri = URI.createURI(options.project.path() + path);
						r.setURI(uri.resolve(base));
					}
				}));
	}

}
