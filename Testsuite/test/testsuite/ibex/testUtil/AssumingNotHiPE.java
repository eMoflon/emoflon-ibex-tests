package testsuite.ibex.testUtil;

import org.junit.AssumptionViolatedException;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

import testsuite.ibex.testUtil.UsedPatternMatcher.PatternMatcher;

public class AssumingNotHiPE implements TestRule {

	@Override
	public Statement apply(Statement base, Description description) {
		return new Statement() {
			@Override
			public void evaluate() throws Throwable {
				if(PatternMatcher.HiPE.equals(UsedPatternMatcher.usedPatternMatcher)) {
					throw new AssumptionViolatedException("Warning: HiPE is currently not able to execute CO");
				} else {
					base.evaluate();
				}
			}
		};
	}

}
