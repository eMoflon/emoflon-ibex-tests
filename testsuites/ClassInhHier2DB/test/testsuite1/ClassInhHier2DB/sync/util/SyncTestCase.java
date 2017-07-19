package testsuite1.ClassInhHier2DB.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.BXTool;
import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.benchmarx.util.BenchmarxUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import ClassInheritanceHierarchy.ClassInheritanceHierarchyPackage;
import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import Database.impl.DatabasePackageImpl;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected BXTool<ClassPackage, DB, Decisions> tool;
	protected ClassInheritanceHierarchyHelper helperClassInh;
	protected DatabaseHelper helperDB;
	protected BenchmarxUtil<ClassPackage, DB, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		ClassInheritanceHierarchyPackage.eINSTANCE.getName();
		DatabasePackageImpl.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperClassInh = new ClassInheritanceHierarchyHelper();
		helperDB = new DatabaseHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters
	public static Collection<BXTool<ClassPackage, DB, Decisions>> tools() throws IOException {
		return Arrays.asList(
				new IbexClassInhHier2DB(true),
				new IbexClassInhHier2DB(false)
			);
	}
	
	protected SyncTestCase(BXTool<ClassPackage, DB, Decisions> tool) {
		this.tool = tool; 
	}
}
