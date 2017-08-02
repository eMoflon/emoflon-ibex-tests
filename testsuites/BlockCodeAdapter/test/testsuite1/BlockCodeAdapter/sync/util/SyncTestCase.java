package testsuite1.BlockCodeAdapter.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.blockLanguage.core.BlockLanguageHelper;
import org.benchmarx.util.BenchmarxUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import BlockLanguage.BlockLanguagePackage;
import BlockLanguage.Specification;
import MocaTree.File;
import MocaTree.MocaTreePackage;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected BXTool<File, Specification, Decisions> tool;
	protected BlockLanguageHelper helperBlock;
	protected MocaTreeHelper helperMT;
	protected BenchmarxUtil<File, Specification, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		BlockLanguagePackage.eINSTANCE.getName();
		MocaTreePackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperBlock = new BlockLanguageHelper();
		helperMT = new MocaTreeHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters
	public static Collection<BXTool<File, Specification, Decisions>> tools() throws IOException {
		return Arrays.asList(
				new IbexBlockCodeAdapter(true)
//				new IbexBlockCodeAdapter(false) //TODO [fstolte]: not working with FiterNACs
			);
	}
	
	protected SyncTestCase(BXTool<File, Specification, Decisions> tool) {
		this.tool = tool; 
	}
}
