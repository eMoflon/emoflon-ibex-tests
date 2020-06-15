package testsuite.ibex.BlockCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.blockLanguage.core.BlockLanguageComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.blockcodeadapter.SYNC_App;
import org.emoflon.ibex.tgg.run.blockcodeadapter.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.blockcodeadapter.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.blockcodeadapter.config.ViatraRegistrationHelper;

import BlockLanguage.BlockLanguageFactory;
import BlockLanguage.Specification;
import MocaTree.File;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

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
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);
			
			Specification s = BlockLanguageFactory.eINSTANCE.createSpecification();
			s.setName("specification");
			
			synchroniser.getResourceHandler().getTargetResource().getContents().add(s);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
