package testsuite.ibex.ProcessCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFolderComparator;
import org.benchmarx.processDefinition.core.ProcessDefinitionComparator;
import org.emoflon.ibex.tgg.run.processcodeadapter.SYNC_App;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import MocaTree.Folder;
import MocaTree.MocaTreeFactory;
import ProcessDefinition.SystemModule;
import testsuite.ibex.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexProcessCodeAdapter extends IbexAdapter<Folder, SystemModule>   {
	
	public IbexProcessCodeAdapter(String projectName) {
		super(new MocaTreeFolderComparator(true), new ProcessDefinitionComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.testUtil.Constants.workspacePath, false, SupportedILPSolver.Gurobi);
			
			Folder folder = MocaTreeFactory.eINSTANCE.createFolder();
			folder.setName("Example");
			folder.setIndex(0);
			
			synchroniser.getSourceResource().getContents().add(folder);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
