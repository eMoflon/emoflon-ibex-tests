package testsuite.ibex.ProcessCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFolderComparator;
import org.benchmarx.processDefinition.core.ProcessDefinitionComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.processcodeadapter.SYNC_App;
import org.emoflon.ibex.tgg.run.processcodeadapter.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.processcodeadapter.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;

import MocaTree.Folder;
import MocaTree.MocaTreeFactory;
import ProcessDefinition.SystemModule;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

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
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, SupportedILPSolver.Gurobi);
			
			Folder folder = MocaTreeFactory.eINSTANCE.createFolder();
			folder.setName("Example");
			folder.setIndex(0);
			
			synchroniser.getResourceHandler().getSourceResource().getContents().add(folder);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
