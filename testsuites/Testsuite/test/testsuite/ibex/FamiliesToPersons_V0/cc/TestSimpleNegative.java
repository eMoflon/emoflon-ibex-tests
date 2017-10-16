package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Test;

public class TestSimpleNegative extends FamiliesToPersonsCCTestCase {
	@Test
	public void testOneFatherToFemale() throws IOException {
		createGenerator("singleFatherFamily", "singleFemalePersonReg");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSingleRegToMultipleRegs() throws IOException {
		createGenerator("singleFamilyReg", "multiplePersonReg");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testSixteenChildrenToSixtyPersons() throws IOException {
		createGenerator("sixteenChildFamily", "thirtyFemaleThirtyMalePersons");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testDifferentNames() throws IOException {
		createGenerator("singleFatherFamily", "singleMalePersonCalledSteve");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
}