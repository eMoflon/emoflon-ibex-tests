package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

public class TestSimplePositive extends FamiliesToPersons_MA_CCTestCase {
	
	@Test
	public void testRegisters() throws IOException {
		createGenerator("01_RootElementFamilies", "01_RootElementPersons");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		createGenerator("01_OneFamily", "01_RootElementPersons");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneMother() throws IOException {
		createGenerator("02_Family_OneMother", "02_Person_OneFemale");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testOneMotherOneFather() throws IOException {
		createGenerator("02_Family_OneMotherOneFather", "02_Person_OneFemaleOneMale");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	public void testAllFamilyRoles() throws IOException {
		createGenerator("02_Family_AllRoles", "02_Person_AllRoles");
		runCC();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	

}