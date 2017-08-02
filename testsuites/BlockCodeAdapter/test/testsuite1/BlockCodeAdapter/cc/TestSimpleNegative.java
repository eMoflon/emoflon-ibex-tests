package testsuite1.BlockCodeAdapter.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimpleNegative extends CCTestCase {
	
	public TestSimpleNegative(boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testSpecBlock() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Block_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testBlockPort() throws IOException {
		createGenerator("in/Block_FWD", "expected/Port_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testPortWire() throws IOException {
		createGenerator("in/Port_FWD", "expected/Wire_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
	@Test
	public void testWireClosedNotClosed() throws IOException {
		createGenerator("in/Wire_FWD", "expected/WireCloseLoop_FWD");
		runGenerator();
		assert !generator.modelsAreConsistent();
	}
	
}