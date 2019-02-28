package testsuite.ibex.util;

import java.io.IOException;

import org.emoflon.ibex.tgg.operational.strategies.opt.cc.CC;

public abstract class CCTestCase extends TestCase {
	protected CC checker;
	
	public void createChecker(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App_ForTesting(srcInstance, trgInstance);
	}

	protected void runCC() throws IOException {
		checker.run();
		checker.terminate();
	}
}
