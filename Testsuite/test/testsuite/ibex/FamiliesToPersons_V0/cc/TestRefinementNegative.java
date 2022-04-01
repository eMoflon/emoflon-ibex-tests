package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRefinementNegative extends FamiliesToPersonsCCTestCase {
	@Test
	public void testPersonsToDifferentRegisters() throws IOException {
		createGenerator("oneSonRegOneDaughterReg", "twoPersonRegZeroPersonReg");
		runCC();
		Assertions.assertTrue(!checker.modelsAreConsistent());
	}

}
