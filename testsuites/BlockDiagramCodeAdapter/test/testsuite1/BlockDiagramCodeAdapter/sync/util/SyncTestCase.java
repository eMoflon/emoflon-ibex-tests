package testsuite1.BlockDiagramCodeAdapter.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.blockDiagram.core.BlockDiagramHelper;
import org.benchmarx.mocaTree.core.MocaTreeNodeHelper;
import org.benchmarx.util.BenchmarxUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BlockDiagram.BlockDiagramPackage;
import BlockDiagram.BlockSystem;
import MocaTree.File;
import MocaTree.MocaTreePackage;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected BXTool<BlockSystem, File, Decisions> tool;
	protected BlockDiagramHelper helperBlock;
	protected MocaTreeNodeHelper helperMT;
	protected BenchmarxUtil<BlockSystem, File, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		BlockDiagramPackage.eINSTANCE.getName();
		MocaTreePackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperBlock = new BlockDiagramHelper();
		helperMT = new MocaTreeNodeHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters
	public static Collection<BXTool<BlockSystem, File, Decisions>> tools() throws IOException {
		return Arrays.asList(
				new IbexBlockDiagramCodeAdapter(true),
				new IbexBlockDiagramCodeAdapter(false)
			);
	}
	
	protected SyncTestCase(BXTool<BlockSystem, File, Decisions> tool) {
		this.tool = tool; 
	}
}
