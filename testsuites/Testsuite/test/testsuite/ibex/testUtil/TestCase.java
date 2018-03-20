package testsuite.ibex.testUtil;

import org.apache.log4j.BasicConfigurator;
import org.emoflon.ibex.tgg.util.ilp.ILPFactory.SupportedILPSolver;
import org.junit.Before;
import org.junit.BeforeClass;

public abstract class TestCase {
	
	protected SupportedILPSolver ilpSolver;
	
	@Before
	public void initIbexOptions() {
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
	}
}
