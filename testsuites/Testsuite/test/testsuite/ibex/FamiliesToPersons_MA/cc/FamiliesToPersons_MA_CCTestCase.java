package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_ma.CC_App;

import testsuite.ibex.testUtil.CCTestCase;

public abstract class FamiliesToPersons_MA_CCTestCase extends CCTestCase{

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("FamiliesToPersons_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
}
