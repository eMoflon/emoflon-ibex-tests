package testsuite.ibex.IBeXTGGGanttToCPM.sync;

import java.io.IOException;

import org.benchmarx.cpm.core.CPMComparator;
import org.benchmarx.gantt.core.GanttComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.ibextgggantt2cpm.SYNC_App;
import org.emoflon.ibex.tgg.run.ibextgggantt2cpm.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.ibextgggantt2cpm.config.HiPERegistrationHelper;

import cpm.CPMNetwork;
import gantt.GanttDiagram;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;;

public class IBeXTGGGantt2CPM extends IbexAdapter<GanttDiagram, CPMNetwork> {

	public IBeXTGGGantt2CPM(String projectName) {
		super(new GanttComparator(), new CPMComparator(), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);
			GanttDiagram gd = gantt.GanttFactory.eINSTANCE.createGanttDiagram();
			gd.setName("");
			synchroniser.getResourceHandler().getSourceResource().getContents().add(gd);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
