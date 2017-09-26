package testsuite.ibex.ClassInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;

public class TestSimpleNegative extends testsuite.ibex.ClassInhHier2DB.cc.TestSimpleNegative {
	
	@Override
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
}