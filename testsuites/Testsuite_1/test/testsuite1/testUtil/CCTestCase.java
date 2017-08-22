package testsuite1.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public abstract class CCTestCase extends TestCase {
	protected CC generator;
	
	protected CCTestCase(boolean flatten) {
		super(flatten);
	}

	protected void runGenerator() throws IOException {
		generator.run();
		generator.terminate();
		generator.saveModels();
	}
}
