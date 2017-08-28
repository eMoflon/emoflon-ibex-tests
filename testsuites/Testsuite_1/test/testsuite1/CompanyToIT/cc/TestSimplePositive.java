package testsuite1.CompanyToIT.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.junit.Test;

import testsuite1.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		generator = new CC_App("CompanyToIT", testsuite1.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testCompany() throws IOException {
		createGenerator("expected/Company_BWD", "in/Company_BWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testAdmin() throws IOException {
		createGenerator("expected/Admin_BWD", "in/Admin_BWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testEmployeeLaptop() throws IOException {
		createGenerator("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testEmployeePC() throws IOException {
		createGenerator("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testEmployeePCLaptop() throws IOException {
		createGenerator("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
}