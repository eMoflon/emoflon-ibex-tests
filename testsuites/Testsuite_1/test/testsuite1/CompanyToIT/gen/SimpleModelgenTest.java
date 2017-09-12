package testsuite1.CompanyToIT.gen;

import java.io.IOException;

import org.benchmarx.companyLanguage.core.CompanyLanguageComparator;
import org.benchmarx.itLanguage.core.ITLanguageComparator;
import org.emoflon.ibex.tgg.operational.strategies.gen.MODELGENStopCriterion;
import org.emoflon.ibex.tgg.run.companytoit.MODELGEN_App;
import org.junit.Before;
import org.junit.Test;

import CompanyLanguage.Company;
import ITLanguage.IT;
import language.TGGRule;
import testsuite1.testUtil.ModelGenTestCase;

public class SimpleModelgenTest extends ModelGenTestCase<Company, IT> {

	public SimpleModelgenTest(Boolean flatten) {
		super(flatten);
	}

	@Override
	protected String getProjectName() {
		return "CompanyToIT";
	}
	
	@Before
	public void createGenerator() throws IOException {
		generator = new MODELGEN_App(getProjectName(), testsuite1.testUtil.Constants.workspacePath, flatten, false);
		stop = new MODELGENStopCriterion(generator.getTGG());
		
		for (TGGRule rule : generator.getTGG().getRules()) {
			stop.setMaxRuleCount(rule.getName(), 0);
		}
		
		sourceComp = new CompanyLanguageComparator(false);
		targetComp = new ITLanguageComparator(false);
	}
	
	@Test
	public void testCompany() throws IOException {
		stop.setMaxRuleCount("CompanyToITRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Company_FWD", "expected/Company_FWD");
	}
	
	@Test
	public void testAdmin() throws IOException {
		stop.setMaxRuleCount("CompanyToITRule", 1);
		stop.setMaxRuleCount("AdminToRouterRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Admin_FWD", "expected/Admin_FWD");
	}
	
	@Test
	public void testEmployeeLaptop() throws IOException {
		stop.setMaxRuleCount("CompanyToITRule", 1);
		stop.setMaxRuleCount("AdminToRouterRule", 1);
		stop.setMaxRuleCount("EmployeeToLaptopRule", 2);
		runGenerator(stop);
		assertPostcondition("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
	}
	
	@Test
	public void testEmployeePC() throws IOException {
		stop.setMaxRuleCount("CompanyToITRule", 1);
		stop.setMaxRuleCount("AdminToRouterRule", 1);
		stop.setMaxRuleCount("EmployeeToPCRule", 2);
		runGenerator(stop);
		assertPostcondition("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
	}
	
	@Test
	public void testEmployeePCLaptop() throws IOException {
		stop.setMaxRuleCount("CompanyToITRule", 1);
		stop.setMaxRuleCount("AdminToRouterRule", 1);
		stop.setMaxRuleCount("EmployeeToPCRule", 1);
		stop.setMaxRuleCount("EmployeeToPCRule", 1);
		runGenerator(stop);
		assertPostcondition("in/Employee_PC_FWD", "expected/Employee_PC_FWD");
	}
}
