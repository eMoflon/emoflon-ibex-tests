package testsuite.ibex.BlockCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.blockLanguage.core.BlockLanguageComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.run.blockcodeadapter.SYNC_App;

import BlockLanguage.BlockLanguageFactory;
import BlockLanguage.Specification;
import MocaTree.File;
import testsuite.ibex.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexBlockCodeAdapter extends IbexAdapter<File, Specification>   {
	
	public IbexBlockCodeAdapter(String projectName) {
		super(new MocaTreeFileComparator(true), new BlockLanguageComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			Specification s = BlockLanguageFactory.eINSTANCE.createSpecification();
			s.setName("specification");
			
			synchroniser.getTargetResource().getContents().add(s);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
