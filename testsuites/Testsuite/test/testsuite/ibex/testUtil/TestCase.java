package testsuite.ibex.testUtil;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.apache.log4j.BasicConfigurator;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public abstract class TestCase {
	protected boolean flatten;
	
	protected TestCase(boolean flatten) {
		this.flatten = flatten;
	}
	
	@BeforeClass
	public static void init() {
		BasicConfigurator.configure();
	}

	@Parameters(name="eMoflon::IBeX, Flattened: {0}")
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(false, true);
	}
}
