package testsuite.ibex.CompanyToIT.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.emoflon.ibex.tgg.run.companytoit.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.ViatraRegistrationHelper;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestSimpleNegative extends CCTestCase {
		
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper(), new ViatraRegistrationHelper()});
		checker = new CC_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testCompanyToRouter() throws IOException {
		createGenerator("in/Company_FWD", "expected/Admin_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testAdminToLaptop() throws IOException {
		createGenerator("in/Admin_FWD", "expected/Employee_Laptop_FWD");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}