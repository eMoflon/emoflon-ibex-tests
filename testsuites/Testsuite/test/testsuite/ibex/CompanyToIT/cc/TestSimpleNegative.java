package testsuite.ibex.CompanyToIT.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testCompanyToRouter() throws IOException {
		createGenerator("in/Company_FWD", "expected/Admin_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testAdminToLaptop() throws IOException {
		createGenerator("in/Admin_FWD", "expected/Employee_Laptop_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
}