package testsuite.ibex.testUtil;

import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

public class UsedPatternMatcher {
	
	public static PatternMatcher usedPatternMatcher = PatternMatcher.HiPE;
	
	public enum PatternMatcher{
		Democles, HiPE, Viatra;
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
			if(rHelper.getClass().getSimpleName().equals("ViatraRegistrationHelper")) {
				if(usedPatternMatcher == PatternMatcher.Viatra)
					return rHelper;
			}
		}
		throw new RuntimeException("No valid registration helpers found!");
	}
}
