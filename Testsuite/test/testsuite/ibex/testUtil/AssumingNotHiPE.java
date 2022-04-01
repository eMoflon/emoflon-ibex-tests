package testsuite.ibex.testUtil;

import org.junit.AssumptionViolatedException;
import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

import testsuite.ibex.testUtil.UsedPatternMatcher.PatternMatcher;

public class AssumingNotHiPE implements BeforeEachCallback {

	@Override
	public void beforeEach(ExtensionContext context) throws Exception {
		if(PatternMatcher.HiPE.equals(UsedPatternMatcher.usedPatternMatcher)) {
			throw new AssumptionViolatedException("Warning: HiPE is currently not able to execute CO");
		} 
	}

}
