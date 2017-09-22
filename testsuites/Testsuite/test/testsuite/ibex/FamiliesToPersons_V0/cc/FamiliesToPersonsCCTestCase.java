package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v0.CC_App;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import testsuite.ibex.testUtil.CCTestCase;

@RunWith(Parameterized.class)
public abstract class FamiliesToPersonsCCTestCase extends CCTestCase {
	
	protected FamiliesToPersonsCCTestCase(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FamiliesToPersons_V0", testsuite.ibex.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
}