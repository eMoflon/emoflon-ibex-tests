package testsuite.ibex.testUtil;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

import testsuite.ibex.testUtil.UsedPatternMatcher.PatternMatcher;

public abstract class TestCase {
	
	protected SupportedILPSolver ilpSolver;
	protected PatternMatcher patternMatcher;

    protected String displayName;

    @BeforeEach
  	public void setUp(TestInfo testInfo) {
    	displayName = testInfo.getDisplayName();
  	}
	
	@BeforeEach
	public void initIbexOptions() {
		System.err.println("Executing test: "+this.getClass().getCanonicalName() +"."+displayName);
		try {
			ilpSolver = SupportedILPSolver.valueOf(System.getenv("ilpSolver"));
		}
		catch (Exception e) {
			System.err.println("ILP solver is not specified. Defaulting to SAT4J");
			ilpSolver = SupportedILPSolver.Sat4J;
		}
		
		try {
			patternMatcher = PatternMatcher.valueOf(System.getenv("patternMatcher"));
			UsedPatternMatcher.usedPatternMatcher = patternMatcher;
		}
		catch (Exception e) {
			System.err.println("Pattern Matcher is not specified. Defaulting to " + UsedPatternMatcher.usedPatternMatcher.name());
		}
	}
	
	@BeforeAll
	public static void init() {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.WARN);
	}
}
