package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class TestSimpleNegative extends FamiliesToPersons_MA_CCTestCase {
	
	@Ignore("Fails due to maximality.")
	@Test
	public void testWholeSimpsonFamily() throws IOException {
		createGenerator("OneFamilyWithFatherMotherSonTwoDaughters", "PersonThreeMaleTwoFemale");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}

}
