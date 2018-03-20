package testsuite.ibex.CompanyToIT.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testCompany() throws IOException {
		createGenerator("expected/Company_BWD", "in/Company_BWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAdmin() throws IOException {
		createGenerator("expected/Admin_BWD", "in/Admin_BWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeeLaptop() throws IOException {
		createGenerator("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeePC() throws IOException {
		createGenerator("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeePCLaptop() throws IOException {
		createGenerator("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}