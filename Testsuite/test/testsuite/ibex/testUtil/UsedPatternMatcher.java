package testsuite.ibex.testUtil;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

public class UsedPatternMatcher {
	
	public static final PatternMatcher usedPatternMatcher = PatternMatcher.DEMOCLES;
	
	enum PatternMatcher{
		DEMOCLES, HIPE;
	}
	
	public static IRegistrationHelper choose(IRegistrationHelper[] regHelpers) {
		for(IRegistrationHelper rHelper : regHelpers) {
			if(rHelper.getClass().getSimpleName().equals("DemoclesRegistrationHelper")) {
				if(usedPatternMatcher == PatternMatcher.DEMOCLES)
					return rHelper;
			}
			if(rHelper.getClass().getSimpleName().equals("HiPERegistrationHelper")) {
				if(usedPatternMatcher == PatternMatcher.HIPE)
					return rHelper;
			}
		}
		throw new RuntimeException("No valid registration helpers found!");
	}
}
