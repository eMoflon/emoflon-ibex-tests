package testsuite.ibex.VHDLTGGCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.vhdlModel.core.VHDLModelComparator;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.SYNC_App;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;

import MocaTree.File;
import VHDLModel.VHDLModelFactory;
import VHDLModel.VHDLSpecification;
import testsuite.ibex.testUtil.IbexAdapter;
import testsuite.ibex.testUtil.UsedPatternMatcher;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexVHDLTGGCodeAdapter extends IbexAdapter<File, VHDLSpecification>   {

	public IbexVHDLTGGCodeAdapter(String projectName) {
		super(new MocaTreeFileComparator(true), new VHDLModelComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			SYNC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
			synchroniser = new SYNC_App(projectName, testsuite.ibex.performance.util.PerformanceConstants.workspacePath, ilpSolver, false);
			
			VHDLSpecification spec = VHDLModelFactory.eINSTANCE.createVHDLSpecification();
			spec.setName("Example");
			
			synchroniser.getResourceHandler().getTargetResource().getContents().add(spec);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
