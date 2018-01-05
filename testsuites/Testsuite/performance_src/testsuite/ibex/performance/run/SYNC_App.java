package testsuite.ibex.performance.run;

import java.io.IOException;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;
import org.emoflon.ibex.tgg.operational.util.IbexOptions;

import testsuite.ibex.performance.util.PerformanceTestUtil;

public class SYNC_App extends SYNC {
	private String instancePath;
	private boolean isFwd;
	private boolean isIncr;

	public SYNC_App(String projectName, String workspacePath, boolean debug, String instancePath, boolean isFwd, boolean isIncr) throws IOException {
		super(createIbexOptions()
				.projectName(projectName)
				.workspacePath(workspacePath)
				.debug(debug));
		this.instancePath = instancePath;
		this.isFwd = isFwd;
		this.isIncr = isIncr;
	}

	@Override
	protected void registerUserMetamodels() throws IOException {
		new PerformanceTestUtil().registerUserMetamodels(projectPath, rs);
		
		// Register correspondence metamodel last
		loadAndRegisterMetamodel(projectPath + "/model/" + projectPath + ".ecore");
	}
	
	/** 
	 * Load the models for the operationalization. For incremental synchronization,
	 * all models must be loaded. For batch translation, the protocol, corr
	 * and either src or trg model have to be created, depending on the direction.
	 *  */
	@Override
	public void loadModels() throws IOException {
		if (isIncr) {
			s = loadResource(instancePath + "/src.xmi");
			t = loadResource(instancePath + "/trg.xmi");
			c = loadResource(instancePath + "/corr.xmi");
			p = loadResource(instancePath + "/protocol.xmi");
		} else {
			if (isFwd) {
				s = loadResource(instancePath + "/src.xmi");
				t = createResource(instancePath + "/trg.xmi");
			} else {
				s = createResource(instancePath + "/src.xmi");
				t = loadResource(instancePath + "/trg.xmi");
			}
			c = createResource(instancePath + "/corr.xmi");
			p = createResource(instancePath + "/protocol.xmi");
		}
		
		EcoreUtil.resolveAll(rs);
	}

	protected static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		return options;
	}
}
