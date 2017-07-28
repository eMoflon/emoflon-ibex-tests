package testsuite1.CompanyToIT.modelgen;

import java.io.IOException;

import org.junit.Test;

public class SyncResourcesTest extends ModelGenTestCase {

	public SyncResourcesTest(Boolean flatten) {
		super(flatten);
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
