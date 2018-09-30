package testsuite.ibex.BlockCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CC_App;
import org.junit.Assert;
import org.junit.Test;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("BlockCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, false, srcInstance, trgInstance, this.ilpSolver);
	}
	
	@Test
	public void testSpecBlock() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Block_FWD");
		runCC();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
	@Test
	public void testBlockPort() throws IOException {
		createGenerator("in/Block_FWD", "expected/Port_FWD");
		runCC();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
	@Test
	public void testPortWire() throws IOException {
		createGenerator("in/Port_FWD", "expected/Wire_FWD");
		runCC();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
	@Test
	public void testWireClosedNotClosed() throws IOException {
		createGenerator("in/Wire_FWD", "expected/WireCloseLoop_FWD");
		runCC();
		Assert.assertFalse(checker.modelsAreConsistent());
	}
	
}