package testsuite.ibex.FeatureModelConciseToSafe.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.CO_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.FWD_OPT_App;
import testsuite.ibex.testUtil.COTestCase;

public class TestFeatureModelConciseToSafe extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("FeatureModelConciseToSafe", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	public void createTransformation() throws IOException {
		forward = new FWD_OPT_App("FeatureModelConciseToSafe", testsuite.ibex.testUtil.Constants.workspacePath, false);
	}
	
	@Test
	public void testFWD_OPT() throws IOException {
		createTransformation();
		runForward();
		testSimplePositive();
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("src", "trg", "corr");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	//FIXME[Nils]?
	@Ignore
	@Test
	public void testMissingLink() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
}