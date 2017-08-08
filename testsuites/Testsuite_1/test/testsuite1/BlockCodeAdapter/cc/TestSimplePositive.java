package testsuite1.BlockCodeAdapter.cc;

import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.emoflon.ibex.tgg.run.blockcodeadapter.CC_App;
import org.junit.Test;
import org.junit.runners.Parameterized.Parameters;

import testsuite1.testUtil.CCTestCase;

public class TestSimplePositive extends CCTestCase {
	
	public TestSimplePositive(boolean flatten) {
		super(flatten);
	}
	
	public void createGenerator(String srcInstance, String trgInstance) throws IOException {
		generator = new CC_App("BlockCodeAdapter", testsuite1.testUtil.Constants.workpacePath, flatten, false, srcInstance, trgInstance);
	}
	
	// IndexOutOfBoundsException mentioned in issue #15
	@Parameters(name="eMoflon::IBeX, Flattened: true")
	public static Collection<Boolean> flattening() throws IOException {
		return Arrays.asList(true);
	}
	
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testSpec() throws IOException {
		createGenerator("in/Spec_FWD", "expected/Spec_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testBlock() throws IOException {
		createGenerator("in/Block_FWD", "expected/Block_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testPort() throws IOException {
		createGenerator("in/Port_FWD", "expected/Port_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testWire() throws IOException {
		createGenerator("in/Wire_FWD", "expected/Wire_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
	@Test
	// IndexOutOfBoundsException mentioned in issue #15
	public void testWireCloseLoop() throws IOException {
		createGenerator("in/WireCloseLoop_FWD", "expected/WireCloseLoop_FWD");
		runGenerator();
		assert generator.modelsAreConsistent();
	}
	
}