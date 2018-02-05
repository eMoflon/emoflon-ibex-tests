package testsuite.ibex.FamiliesToPersons_MA.co;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.familiestopersons_ma.CO_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.COTestCase;

public class TestFamiliesToPersons_MA extends COTestCase {

	public void createGenerator(String srcInstance, String trgInstance, String corrInstance) throws IOException {
		checker = new CO_App("FamiliesToPersons_MA", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, corrInstance);
	}
	
	@Test
	public void testSimplePositive() throws IOException {
		createGenerator("src", "trg", "corr");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAllPersonsMissing() throws IOException {
		createGenerator("src", "trg", "corr_inc");
		runGenerator();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
}