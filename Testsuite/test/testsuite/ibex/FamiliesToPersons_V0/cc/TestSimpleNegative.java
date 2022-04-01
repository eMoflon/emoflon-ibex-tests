package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestSimpleNegative extends FamiliesToPersonsCCTestCase {
	@Test
	public void testOneFatherToFemale() throws IOException {
		createGenerator("singleFatherFamily", "singleFemalePersonReg");
		runCC();
		Assertions.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testSingleRegToMultipleRegs() throws IOException {
		createGenerator("singleFamilyReg", "multiplePersonReg");
		runCC();
		Assertions.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Disabled("Takes a bit too long for normal testing")
	@Test
	public void testSixteenChildrenToSixtyPersons() throws IOException {
		createGenerator("sixteenChildFamily", "thirtyFemaleThirtyMalePersons");
		runCC();
		Assertions.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testDifferentNames() throws IOException {
		createGenerator("singleFatherFamily", "singleMalePersonCalledSteve");
		runCC();
		Assertions.assertTrue(!checker.modelsAreConsistent());
	}
	
}