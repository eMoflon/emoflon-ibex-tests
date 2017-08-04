package testsuite1.VHDLTGGCodeAdapter.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.util.BenchmarxUtil;
import org.benchmarx.vhdlModel.core.VHDLModelHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import MocaTree.File;
import MocaTree.MocaTreePackage;
import VHDLModel.VHDLModelPackage;
import VHDLModel.VHDLSpecification;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected BXTool<File, VHDLSpecification, Decisions> tool;
	protected MocaTreeHelper helperMT;
	protected VHDLModelHelper helperVHDL;
	protected BenchmarxUtil<File, VHDLSpecification, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		MocaTreePackage.eINSTANCE.getName();
		VHDLModelPackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperMT = new MocaTreeHelper();
		helperVHDL = new VHDLModelHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters(name = "{0}")
	public static Collection<BXTool<File, VHDLSpecification, Decisions>> tools() throws IOException {
		return Arrays.asList(
				new IbexVHDLTGGCodeAdapter(true)
//				new IbexVHDLTGGCodeAdapter(false) TODO [fstolte]: refinement network not working due to democles issue #15
			);
	}
	
	protected SyncTestCase(BXTool<File, VHDLSpecification, Decisions> tool) {
		this.tool = tool; 
	}
}
