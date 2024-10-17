package testsuite.ibex.testUtil;

import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;

public class UsedPatternMatcher {

	public static PatternMatcher usedPatternMatcher = PatternMatcher.HiPE;

	public enum PatternMatcher {
		HiPE;
	}

	public static IRegistrationHelper choose(IRegistrationHelper[] regHelpers) {
		for (IRegistrationHelper rHelper : regHelpers) {
			if (rHelper.getClass().getSimpleName().equals("HiPERegistrationHelper")) {
				if (usedPatternMatcher == PatternMatcher.HiPE)
					return rHelper;
			}
		}
		throw new RuntimeException("No valid registration helpers found!");
	}
}
