package testsuite.ibex.testUtil;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.TestName;

public abstract class TestCase {
	
	protected SupportedILPSolver ilpSolver;
	
	@Rule
	public TestName name = new TestName();
	
	@Before
	public void initIbexOptions() {
		System.err.println("Executing test: "+this.getClass().getCanonicalName() +"."+name.getMethodName());
		try {
			ilpSolver = SupportedILPSolver.valueOf(System.getenv("ilpSolver"));
		}
		catch (Exception e) {
			System.err.println("ILP solver is not specified. Defaulting to SAT4J");
			ilpSolver = SupportedILPSolver.Sat4J;
		}
	}
	
	@BeforeClass
	public static void init() {
		BasicConfigurator.configure();
		Logger.getRootLogger().setLevel(Level.WARN);
	}
}
