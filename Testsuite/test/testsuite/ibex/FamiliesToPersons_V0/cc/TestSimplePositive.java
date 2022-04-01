package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestSimplePositive extends FamiliesToPersonsCCTestCase {
	@Test
	public void testOneFatherToMale() throws IOException {
		createGenerator("singleFatherFamily", "singleMalePersonReg");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testMultipleRegToReg() throws IOException {
		createGenerator("multipleFamilyReg", "multiplePersonReg");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Disabled("Takes too long for normal testing")
	@Test
	public void testSixteenChildrenToPersons() throws IOException {
		createGenerator("sixteenChildFamily", "eightFemaleEightMalePersons");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
}