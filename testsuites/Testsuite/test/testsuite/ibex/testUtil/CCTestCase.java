package testsuite.ibex.testUtil;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.cc.CC;

public abstract class CCTestCase extends TestCase {
	protected CC checker;
	
	protected void runGenerator() throws IOException {
		checker.run();
		checker.terminate();
		checker.saveModels();
	}
}
