package testsuite1.familiestopersons_V0.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_v0.CC_App;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import testsuite1.testUtil.CCTestCase;

@RunWith(Parameterized.class)
public abstract class FamiliesToPersonsCCTestCase extends CCTestCase {
	
	protected FamiliesToPersonsCCTestCase(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		generator = new CC_App("FamiliesToPersons_V0", "./../", flatten, false, srcInstance, trgInstance);
	}
}
