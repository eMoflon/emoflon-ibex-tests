package testsuite1.BlockCodeAdapter.cc;

import java.io.IOException;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CC_App;
import org.junit.Test;

import testsuite1.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		generator = new CC_App("BlockCodeAdapter", testsuite1.testUtil.Constants.workpacePath, flatten, false, srcInstance, trgInstance);
	}
	
	@Test
	public void testSpec() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Spec_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testBlock() throws IOException {
		createGenerator("in/Block_FWD", "expected/Block_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testPort() throws IOException {
		createGenerator("in/Port_FWD", "expected/Port_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testWire() throws IOException {
		createGenerator("in/Wire_FWD", "expected/Wire_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	public void testWireCloseLoop() throws IOException {
		createGenerator("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
}