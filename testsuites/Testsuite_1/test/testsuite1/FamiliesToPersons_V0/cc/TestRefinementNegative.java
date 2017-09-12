package testsuite1.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Test;

public class TestRefinementNegative extends FamiliesToPersonsCCTestCase {
	
	public TestRefinementNegative(boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testPersonsToDifferentRegisters() throws IOException {
		createGenerator("oneSonRegOneDaughterReg", "twoPersonRegZeroPersonReg");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}

}
