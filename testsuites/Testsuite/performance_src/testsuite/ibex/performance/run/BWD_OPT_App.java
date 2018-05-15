package testsuite.ibex.performance.run;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;

import testsuite.ibex.performance.util.PerformanceTestUtil;

public class BWD_OPT_App extends BWD_OPT {

	private String modelPath;

	public BWD_OPT_App(String projectName, String workspacePath, boolean debug, String modelPath) throws IOException {
		super(createIbexOptions()
				.projectName(projectName)
				.projectPath(projectName)
				.workspacePath(workspacePath)
				.debug(debug));
		this.modelPath = modelPath;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		new PerformanceTestUtil().registerUserMetamodelsBWD_OPT(options.projectPath(), rs, this);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(options.projectPath() + "/model/" + options.projectPath() + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(options.projectPath() + "/instances/"+modelPath+"/src.xmi");
		t = loadResource(options.projectPath() + "/instances/"+modelPath+"/trg.xmi");
		c = createResource(options.projectPath() + "/instances/"+modelPath+"/corr.xmi");
		p = createResource(options.projectPath() + "/instances/"+modelPath+"/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	@Override
	public void saveModels() {
		// Models needn't be saved for all Operationalizations except MODELGEN
	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		return options;
	}
}
