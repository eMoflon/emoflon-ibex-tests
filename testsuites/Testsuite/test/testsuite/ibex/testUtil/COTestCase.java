package testsuite.ibex.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.co.CO;

public class COTestCase extends TestCase {
	protected CO checker;
	
	protected void runGenerator() throws IOException {
		checker.run();
		checker.terminate();
		checker.saveModels();
	}
}
