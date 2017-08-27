package testsuite1.VHDLTGGCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.benchmarx.vhdlModel.core.VHDLModelComparator;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

import MocaTree.File;
import VHDLModel.VHDLModelFactory;
import VHDLModel.VHDLSpecification;
import testsuite1.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexVHDLTGGCodeAdapter extends IbexAdapter<File, VHDLSpecification>   {

	public static SYNC normalSynchroniser;
	public static SYNC flattenedSynchroniser;
	
	public IbexVHDLTGGCodeAdapter(boolean flatten, String projectName) {
		super(new MocaTreeFileComparator(true), new VHDLModelComparator(true), flatten, projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {			
			synchroniser = flatten? flattenedSynchroniser : normalSynchroniser;
			synchroniser.resetPatternMatchingEngine();
			
			VHDLSpecification spec = VHDLModelFactory.eINSTANCE.createVHDLSpecification();
			spec.setName("Example");
			
			synchroniser.getTargetResource().getContents().add(spec);
			synchroniser.backward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
