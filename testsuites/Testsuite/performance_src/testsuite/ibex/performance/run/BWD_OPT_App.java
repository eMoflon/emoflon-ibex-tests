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
				.workspacePath(workspacePath)
				.debug(debug));
		this.modelPath = modelPath;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		new PerformanceTestUtil().registerUserMetamodels(projectPath, rs);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = loadResource(projectPath + "/instances/"+modelPath+"/src.xmi");
		t = createResource(projectPath + "/instances/"+modelPath+"/trg.xmi");
		c = createResource(projectPath + "/instances/"+modelPath+"/corr.xmi");
		p = createResource(projectPath + "/instances/"+modelPath+"/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
	
	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		return options;
	}
}
