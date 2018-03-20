package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v0.CC_App;

import testsuite.ibex.testUtil.CCTestCase;

public abstract class FamiliesToPersonsCCTestCase extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FamiliesToPersons_V0", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
}
