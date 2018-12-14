package testsuite.ibex.IBeXTGGGanttToCPM.sync;

import org.benchmarx.cpm.core.CPMBuilder;
import org.benchmarx.cpm.core.CPMHelper;
import org.benchmarx.gantt.core.GanttHelper;
import org.benchmarx.util.BenchmarxUtil;

import cpm.CPMNetwork;
import cpm.CpmPackage;
import gantt.GanttDiagram;
import gantt.GanttPackage;
import testsuite.ibex.testUtil.SyncTestCase;

public abstract class GanttToCPMTestCase extends SyncTestCase<GanttDiagram, CPMNetwork> {
	public GanttToCPMTestCase() {
		super(new IBeXTGGGantt2CPM(projectName));
	}
	
	protected GanttHelper helperGantt;
	protected CPMHelper helperCPM;
	protected final static String projectName = "IBeXTGGGantt2CPM";

	@Override
	protected void initHelpers() {
		// Make sure packages are registered
		GanttPackage.eINSTANCE.getName();
		CpmPackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperGantt = new GanttHelper();
		helperCPM = new CPMHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Override
	public void terminate() {
		super.terminate();
		CPMBuilder.reset();
	}
}
