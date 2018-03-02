package testsuite.ibex.performance.run;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGEN;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;

import testsuite.ibex.performance.util.PerformanceTestUtil;

public class MODELGEN_App extends MODELGEN {
	private String instancePath;

	public MODELGEN_App(String projectName, String workspacePath, boolean debug, String instancePath) throws IOException {
		super(createIbexOptions()
				.projectName(projectName)
				.projectPath(projectName)
				.workspacePath(workspacePath)
				.debug(debug));
		this.instancePath = instancePath;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		new PerformanceTestUtil().registerUserMetamodels(projectPath, rs);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	@Override
	public void loadModels() throws IOException {
		s = createResource(instancePath + "/src.xmi");
		t = createResource(instancePath + "/trg.xmi");
		c = createResource(instancePath + "/corr.xmi");
		p = createResource(instancePath + "/protocol.xmi");
		
		EcoreUtil.resolveAll(rs);
	}

	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		return options;
	}
}
