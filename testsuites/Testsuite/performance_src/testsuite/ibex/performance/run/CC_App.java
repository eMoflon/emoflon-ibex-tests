package testsuite.ibex.performance.run;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.cc.CC;

import testsuite.ibex.performance.util.PerformanceTestUtil;

public class CC_App extends CC {
	private String modelPath;

	public CC_App(String projectName, String workspacePath, boolean debug,
			String modelPath) throws IOException {
		super(projectName, workspacePath, debug);
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
		t = loadResource(projectPath + "/instances/"+modelPath+"/trg.xmi");
		c = createResource(projectPath + "/instances/"+modelPath+"/corr.xmi");
		p = createResource(projectPath + "/instances/"+modelPath+"/protocol.xmi");
	
		EcoreUtil.resolveAll(rs);
	}
}
