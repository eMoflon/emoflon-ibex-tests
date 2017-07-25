package testsuite1.CompanyToIT.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testCompanyToRouter() throws IOException {
		createGenerator("in/Company_FWD", "expected/Admin_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testAdminToLaptop() throws IOException {
		createGenerator("in/Admin_FWD", "expected/Employee_Laptop_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
}