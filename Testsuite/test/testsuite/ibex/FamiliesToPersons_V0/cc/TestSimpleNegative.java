package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestSimpleNegative extends FamiliesToPersonsCCTestCase {
	@Test
	public void testOneFatherToFemale() throws IOException {
		createGenerator("singleFatherFamily", "singleFemalePersonReg");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testSingleRegToMultipleRegs() throws IOException {
		createGenerator("singleFamilyReg", "multiplePersonReg");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Ignore("Takes a bit too long for normal testing")
	@Test
	public void testSixteenChildrenToSixtyPersons() throws IOException {
		createGenerator("sixteenChildFamily", "thirtyFemaleThirtyMalePersons");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testDifferentNames() throws IOException {
		createGenerator("singleFatherFamily", "singleMalePersonCalledSteve");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
}