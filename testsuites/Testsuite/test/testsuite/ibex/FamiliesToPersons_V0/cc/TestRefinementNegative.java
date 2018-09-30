package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TestRefinementNegative extends FamiliesToPersonsCCTestCase {
	@Test
	public void testPersonsToDifferentRegisters() throws IOException {
		createGenerator("oneSonRegOneDaughterReg", "twoPersonRegZeroPersonReg");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}

}
