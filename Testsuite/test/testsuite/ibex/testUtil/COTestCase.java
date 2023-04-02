package testsuite.ibex.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.runtime.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.strategies.opt.CO;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(AssumingNotHiPE.class)
public class COTestCase extends TestCase {
	
	protected CO checker;
	protected FWD_OPT forward;
	protected BWD_OPT backward;
	
	protected void runCO() throws IOException {
		checker.run();
		checker.terminate();
		checker.saveModels();
	}
	
	protected void runFWD_OPT() throws IOException {
		forward.forward();
		forward.terminate();
		forward.saveModels();
	}
	
	protected void runBWD_OPT() throws IOException {
		backward.backward();
		backward.terminate();
		backward.saveModels();
	}
	
}
