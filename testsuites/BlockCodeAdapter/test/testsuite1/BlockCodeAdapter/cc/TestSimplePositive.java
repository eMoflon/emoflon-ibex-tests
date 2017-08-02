package testsuite1.BlockCodeAdapter.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
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