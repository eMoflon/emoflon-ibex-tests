package testsuite.ibex.CompanyToIT.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.emoflon.ibex.tgg.run.companytoit.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.ViatraRegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new CC_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testCompany() throws IOException {
		createGenerator("expected/Company_BWD", "in/Company_BWD");
		runCC();
		checker.saveModels();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAdmin() throws IOException {
		createGenerator("expected/Admin_BWD", "in/Admin_BWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeeLaptop() throws IOException {
		createGenerator("expected/Employee_Laptop_BWD", "in/Employee_Laptop_BWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeePC() throws IOException {
		createGenerator("expected/Employee_PC_BWD", "in/Employee_PC_BWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmployeePCLaptop() throws IOException {
		createGenerator("in/Employee_PC_Laptop_FWD", "expected/Employee_PC_Laptop_FWD");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
}