package testsuite1.ProcessCodeAdapter.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.mocaTree.core.MocaTreeHelper;
import org.benchmarx.processDefinition.core.ProcessDefinitionHelper;
import org.benchmarx.util.BenchmarxUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import MocaTree.Folder;
import MocaTree.MocaTreePackage;
import ProcessDefinition.ProcessDefinitionPackage;
import ProcessDefinition.SystemModule;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected BXTool<Folder, SystemModule, Decisions> tool;
	protected MocaTreeHelper helperMoca;
	protected ProcessDefinitionHelper helperProcess;
	protected BenchmarxUtil<Folder, SystemModule, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		MocaTreePackage.eINSTANCE.getName();
		ProcessDefinitionPackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperMoca = new MocaTreeHelper();
		helperProcess = new ProcessDefinitionHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters
	public static Collection<BXTool<Folder, SystemModule, Decisions>> tools() throws IOException {
		return Arrays.asList(
				new IbexProcessCodeAdapter(true),
				new IbexProcessCodeAdapter(false)
			);
	}
	
	protected SyncTestCase(BXTool<Folder, SystemModule, Decisions> tool) {
		this.tool = tool; 
	}
}
