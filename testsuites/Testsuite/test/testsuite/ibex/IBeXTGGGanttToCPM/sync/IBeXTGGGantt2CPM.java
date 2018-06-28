package testsuite.ibex.IBeXTGGGanttToCPM.sync;

import java.io.IOException;

import org.benchmarx.cpm.core.CPMComparator;
import org.benchmarx.gantt.core.GanttComparator;
import org.emoflon.ibex.tgg.run.ibextgggantt2cpm.SYNC_App;

import cpm.CPMNetwork;
import gantt.GanttDiagram;
import testsuite.ibex.testUtil.IbexAdapter;;

public class IBeXTGGGantt2CPM extends IbexAdapter<GanttDiagram, CPMNetwork> {

	public IBeXTGGGantt2CPM(String projectName) {
		super(new GanttComparator(), new CPMComparator(), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.testUtil.Constants.workspacePath, false);
			GanttDiagram gd = gantt.GanttFactory.eINSTANCE.createGanttDiagram();
			gd.setName("");
			synchroniser.getSourceResource().getContents().add(gd);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
