package testsuite.ibex.BlockCodeAdapter.cc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CC_App;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("BlockCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance);
	}
	
	@Parameters(name="eMoflon::IBeX, Flattened: true")
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(false, true);
	}
	
	@Test
	public void testSpec() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Spec_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testBlock() throws IOException {
		createGenerator("in/Block_FWD", "expected/Block_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testPort() throws IOException {
		createGenerator("in/Port_FWD", "expected/Port_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testWire() throws IOException {
		createGenerator("in/Wire_FWD", "expected/Wire_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testWireCloseLoop() throws IOException {
		createGenerator("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}