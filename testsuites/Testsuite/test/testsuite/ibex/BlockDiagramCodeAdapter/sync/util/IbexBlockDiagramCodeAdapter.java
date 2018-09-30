package testsuite.ibex.BlockDiagramCodeAdapter.sync.util;

import java.io.IOException;

import org.benchmarx.blockDiagram.core.BlockDiagramComparator;
import org.benchmarx.mocaTree.core.MocaTreeFileComparator;
import org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.SYNC_App;

import BlockDiagram.BlockDiagramFactory;
import BlockDiagram.BlockSystem;
import MocaTree.File;
import testsuite.ibex.testUtil.IbexAdapter;

/**
 * This class implements the bx tool interface for eMoflon::Ibex, which is
 * structural-delta-based and corr-based.
 * 
 * 
 * @author anthony anjorin
 */
public class IbexBlockDiagramCodeAdapter extends IbexAdapter<BlockSystem, File>   {
	
	public IbexBlockDiagramCodeAdapter(String projectName) {
		super(new BlockDiagramComparator(true), new MocaTreeFileComparator(true), projectName);
	}
	
	@Override
	public void initiateSynchronisationDialogue() {
		try {
			synchroniser = new SYNC_App("BlockDiagramCodeAdapter", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false);
			
			BlockSystem bs = BlockDiagramFactory.eINSTANCE.createBlockSystem();
			bs.setName("aBlockSystem");
			
			synchroniser.getSourceResource().getContents().add(bs);
			synchroniser.forward();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
