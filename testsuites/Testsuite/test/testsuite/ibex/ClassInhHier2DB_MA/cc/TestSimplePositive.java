package testsuite.ibex.ClassInhHier2DB_MA.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.classinhhier2db.CC_App;
import org.junit.Ignore;
import org.junit.Test;

public class TestSimplePositive extends testsuite.ibex.ClassInhHier2DB.cc.TestSimplePositive {
	
	@Override
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("ClassInhHier2DB_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Override
	public void testSubClassToTable() throws IOException {
		createGenerator("in/SubClassToTable_FWD", "expected/SubClassToTable_FWD");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Override
	@Ignore
	public void testLargeExample() throws IOException {
		// TODO Auto-generated method stub
		super.testLargeExample();
	}
	
}