package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class TestSimplePositive extends FamiliesToPersons_MA_CCTestCase {
	
	@Test
	public void testRegisters() throws IOException {
		createGenerator("RootElementFamilies", "RootElementPersons");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		createGenerator("OneFamily", "RootElementPersons");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Ignore("Fails due to maximality.")
	@Test
	public void testWholeSimpsonFamily() throws IOException {
		createGenerator("OneFamilyWithFatherMotherSonTwoDaughters", "PersonTwoMaleThreeFemale");
		runGenerator();
		assert checker.modelsAreConsistent();
	}

}
