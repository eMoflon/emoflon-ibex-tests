package testsuite.ibex.performance.run;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.modules.TGGResourceHandler;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;

public class BWD_OPT_App extends BWD_OPT {

	static String modelPath;

	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String modelPath) throws IOException {
		super(createIbexOptions()
				.projectName(projectName)
				.projectPath(projectName)
				.workspacePath(workspacePath)
				.debug(debug));
		this.modelPath = modelPath;
	}
}

class BWD_OPT_TGGResourceHandler extends TGGResourceHandler {
	
	@Override
	public void loadModels() throws IOException {
		source = createResource(options.projectPath() + "/instances/"+modelPath+"/src.xmi");
		target = loadResource(options.projectPath() + "/instances/"+modelPath+"/trg.xmi");
		corr = createResource(options.projectPath() + "/instances/"+modelPath+"/corr.xmi");
		protocol = createResource(options.projectPath() + "/instances/"+modelPath+"/protocol.xmi");
	}
	
	@Override
	public void saveModels() {
		// Models needn't be saved for all Operationalizations except MODELGEN
	}
}
