package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.emoflon.ibex.tgg.run.companytoit.config.DemoclesRegistrationHelper;
import org.emoflon.ibex.tgg.run.companytoit.config.HiPERegistrationHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public class TestCC extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{new DemoclesRegistrationHelper(), new HiPERegistrationHelper()});
		checker = new CC_App("CompanyToIT", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, ilpSolver);
	}
	
	@Test
	@Disabled
	public void testSimplePositive() throws IOException {
		createGenerator("large_scale/src", "large_scale/trg");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
}
