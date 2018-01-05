package testsuite.ibex.BlockCodeAdapter.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CO_App;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestBlockCodeAdapter extends COTestCase{

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("BlockCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("src", "trg", "corr");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testMissingLink() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
}