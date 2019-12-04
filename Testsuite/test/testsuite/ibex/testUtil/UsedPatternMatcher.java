package testsuite.ibex.testUtil;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

public class UsedPatternMatcher {
	
	public static PatternMatcher usedPatternMatcher = PatternMatcher.Democles;
	
	public enum PatternMatcher{
		Democles, HiPE;
	}
	
	public static IRegistrationHelper choose(IRegistrationHelper[] regHelpers) {
		for(IRegistrationHelper rHelper : regHelpers) {
			if(rHelper.getClass().getSimpleName().equals("DemoclesRegistrationHelper")) {
				if(usedPatternMatcher == PatternMatcher.Democles)
					return rHelper;
			}
			if(rHelper.getClass().getSimpleName().equals("HiPERegistrationHelper")) {
				if(usedPatternMatcher == PatternMatcher.HiPE)
					return rHelper;
			}
		}
		throw new RuntimeException("No valid registration helpers found!");
	}
}
