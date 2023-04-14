package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v0.CC_App;
import org.emoflon.ibex.tgg.run.familiestopersons_v0.config.HiPERegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;

import testsuite.ibex.testUtil.CCTestCase;
import testsuite.ibex.testUtil.UsedPatternMatcher;

public abstract class FamiliesToPersonsCCTestCase extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		CC_App.registrationHelper = UsedPatternMatcher.choose(new IRegistrationHelper[]{ new HiPERegistrationHelper()});
		checker = new CC_App("FamiliesToPersons_V0", testsuite.ibex.performance.util.PerformanceConstants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
}
