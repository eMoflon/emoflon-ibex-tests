package testsuite1.CompanyToIT.sync.util;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.benchmarx.companyLanguage.core.CompanyLanguageHelper;
import org.benchmarx.itLanguage.core.ITLanguageHelper;
import org.benchmarx.util.BenchmarxUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import CompanyLanguage.Company;
import CompanyLanguage.CompanyLanguagePackage;
import ITLanguage.IT;
import ITLanguage.ITLanguagePackage;

@RunWith(Parameterized.class)
public abstract class SyncTestCase {

	protected IbexCompanyToIT tool;
	protected CompanyLanguageHelper helperCompany;
	protected ITLanguageHelper helperIT;
	protected BenchmarxUtil<Company, IT, Decisions> util;
	
	@BeforeClass
	public static void setup(){		
		BasicConfigurator.configure();
	}
	
	@Before
	public void initialise() {
		// Make sure packages are registered
		CompanyLanguagePackage.eINSTANCE.getName();
		ITLanguagePackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperCompany = new CompanyLanguageHelper();
		helperIT = new ITLanguageHelper();
		
		// Initialise the bx tool
		tool.initiateSynchronisationDialogue();
	}

	@After
	public void terminate(){
		tool.terminateSynchronisationDialogue();
	}
	
	@Parameters
	public static Collection<IbexCompanyToIT> tools() throws IOException {
		return Arrays.asList(
				new IbexCompanyToIT(true),
				new IbexCompanyToIT(false)
			);
	}
	
	protected SyncTestCase(IbexCompanyToIT tool) {
		this.tool = tool; 
	}
}
