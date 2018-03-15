package testsuite.ibex.CompanyToIT.large_scale;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.companytoit.CC_App;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestCC extends CCTestCase {

	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("CompanyToIT", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Test
	@Ignore
	public void testSimplePositive() throws IOException {
		createGenerator("large_scale/src", "large_scale/trg");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}
