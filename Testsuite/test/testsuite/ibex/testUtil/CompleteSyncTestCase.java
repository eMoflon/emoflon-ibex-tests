package testsuite.ibex.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.opt.CO;
import org.emoflon.ibex.tgg.operational.strategies.sync.SYNC;

/**
 * Test case for transforming a src/trg model from scratch by the FWD and BWD operationalizations
 * @author NilsWeidmann
 *
 */
public class CompleteSyncTestCase extends TestCase {
	protected CO checker;
	protected SYNC fwd;
	protected SYNC bwd;
	
	/**
	 * Runs a CO check to verify the result
	 * @throws IOException
	 */
	protected void runGenerator() throws IOException {
		checker.run();
		checker.terminate();
		checker.saveModels();
	}
	
	/**
	 * Forward transformation
	 * @throws IOException
	 */
	protected void runForward() throws IOException {
		fwd.forward();
		fwd.terminate();
		fwd.saveModels();
	}
	
	/**
	 * Backward transformation
	 * @throws IOException
	 */
	protected void runBackward() throws IOException {
		bwd.backward();
		bwd.terminate();
		bwd.saveModels();
	}
}
