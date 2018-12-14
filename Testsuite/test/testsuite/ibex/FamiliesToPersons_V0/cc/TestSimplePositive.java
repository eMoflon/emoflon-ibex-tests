package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestSimplePositive extends FamiliesToPersonsCCTestCase {
	@Test
	public void testOneFatherToMale() throws IOException {
		createGenerator("singleFatherFamily", "singleMalePersonReg");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testMultipleRegToReg() throws IOException {
		createGenerator("multipleFamilyReg", "multiplePersonReg");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Ignore("Takes too long for normal testing")
	@Test
	public void testSixteenChildrenToPersons() throws IOException {
		createGenerator("sixteenChildFamily", "eightFemaleEightMalePersons");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
}