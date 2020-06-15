package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.integrate.INTEGRATE;
import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.run.java2doc.config._DefaultRegistrationHelper;

public class INTEGRATE_App extends INTEGRATE {
	public static IRegistrationHelper registrationHelper = new _DefaultRegistrationHelper();

	public INTEGRATE_App(String projectName, String workspacePath, String initPath, boolean debug) throws IOException {
		super(registrationHelper.createIbexOptions().projectName(projectName).workspacePath(workspacePath).debug(debug)
				.setResourceHandler(new TGGResourceHandler() {
					@Override
					public void loadModels() throws IOException {
						source = loadResource(options.projectPath() + initPath + "/src.xmi");
						target = loadResource(options.projectPath() + initPath + "/trg.xmi");
						corr = loadResource(options.projectPath() + initPath + "/corr.xmi");
						protocol = loadResource(options.projectPath() + initPath + "/protocol.xmi");

						changeURI(source, "/instances/src.xmi");
						changeURI(target, "/instances/trg.xmi");
						changeURI(corr, "/instances/corr.xmi");
						changeURI(protocol, "/instances/protocol.xmi");

						precedence = createResource(options.projectPath() + "/instances/epg.xmi");

						EcoreUtil.resolveAll(rs);
					}

					private void changeURI(Resource r, String path) {
						URI uri = URI.createURI(options.projectPath() + path);
						r.setURI(uri.resolve(base));
					}
				}));
	}
	
}
