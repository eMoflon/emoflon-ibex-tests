package testsuite.ibex.BlockCodeAdapter.cc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CC_App;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import testsuite.ibex.testUtil.CCTestCase;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		checker = new CC_App("BlockCodeAdapter", testsuite.ibex.testUtil.Constants.workspacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Parameters(name="eMoflon::IBeX, Flattened: true")
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(false, true);
	}
	
	@Test
	public void testSpecBlock() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Block_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testBlockPort() throws IOException {
		createGenerator("in/Block_FWD", "expected/Port_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testPortWire() throws IOException {
		createGenerator("in/Port_FWD", "expected/Wire_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testWireClosedNotClosed() throws IOException {
		createGenerator("in/Wire_FWD", "expected/WireCloseLoop_FWD");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
}