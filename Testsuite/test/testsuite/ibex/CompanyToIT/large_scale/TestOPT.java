package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.BWD_OPT_App;
import org.emoflon.ibex.tgg.run.companytoit.CO_App;
import org.emoflon.ibex.tgg.run.companytoit.FWD_OPT_App;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.COTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestOPT extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		CO_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
		checker = new CO_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
	}
	
	public void createTransformation(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		FWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
		forward = new FWD_OPT_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
	}
	
	public void createBackward(String srcInstance, String trgInstance, String corrInstance, String protInstance) throws IOException {
		BWD_OPT_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
		backward = new BWD_OPT_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, corrInstance, protInstance, ilpSolver);
	}
	
	@Test
	@Disabled
	public void testFWD_OPT() throws IOException {
		createTransformation("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runFWD_OPT();
		createGenerator("/resources/large_scale/src", "/resources/large_scale/trg-tmp", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Disabled
	public void testBWD_OPT() throws IOException {
		createBackward("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runBWD_OPT();
		createGenerator("/resources/large_scale/src-tmp", "/resources/large_scale/trg", "/resources/large_scale/corr-tmp", "/resources/large_scale/prot-tmp");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Disabled
	public void testCO() throws IOException {
		createGenerator("/resources/large_scale/src", "/resources/large_scale/trg", "/resources/large_scale/corr", "/resources/large_scale/protocol");
		runCO();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
}
