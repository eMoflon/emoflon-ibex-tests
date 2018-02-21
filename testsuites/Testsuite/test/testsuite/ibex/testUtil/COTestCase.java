package testsuite.ibex.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.co.CO;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

public class COTestCase extends TestCase {
	protected CO checker;
	protected FWD_OPT forward;
	protected BWD_OPT backward;
	
	protected void runGenerator() throws IOException {
		checker.run();
		checker.terminate();
		checker.saveModels();
	}
	
	protected void runForward() throws IOException {
		forward.forward();
		forward.terminate();
		forward.saveModels();
	}
	
	protected void runBackward() throws IOException {
		backward.backward();
		backward.terminate();
		backward.saveModels();
	}
}
