package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TestSimpleNegative extends FamiliesToPersons_MA_CCTestCase {
	
	// This test assumes that 0..* cardinality for Family is expected
	@Test
	public void testRegisters() throws IOException {
		createGenerator("01_OneFamily", "01_RootElementPersons");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		createGenerator("01_OneFamily", "02_Person_OneFemale");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneMother() throws IOException {
		createGenerator("01_RootElementPersons", "02_Person_OneFemale");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneMotherOneFather() throws IOException {
		createGenerator("02_Family_OneMotherOneFather", "02_Person_AllRoles");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}
	
	@Test
	public void testAllFamilyRoles() throws IOException {
		createGenerator("02_Person_OneFemaleOneMale", "02_Person_AllRoles");
		runCC();
		Assert.assertTrue(!checker.modelsAreConsistent());
	}

}
