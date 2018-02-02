package testsuite.ibex.testUtil;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;

public abstract class TestCase {
	@BeforeClass
	public static void init() {
		BasicConfigurator.configure();
	}
}
