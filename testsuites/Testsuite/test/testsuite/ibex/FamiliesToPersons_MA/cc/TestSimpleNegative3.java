package testsuite.ibex.FamiliesToPersons_MA.cc;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class TestSimpleNegative3 extends FamiliesToPersons_MA_CCTestCase {
	
	@Ignore("This tests is ok if 0..* cardinatlity for Family is supported.")
	@Test
	public void testRegisters() throws IOException {
		createGenerator("01_OneFamily", "01_RootElementPersons");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testEmptyFamily() throws IOException {
		createGenerator("01_OneFamily", "02_Person_OneFemale");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testOneMother() throws IOException {
		createGenerator("01_RootElementPersons", "02_Person_OneFemale");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testOneMotherOneFather() throws IOException {
		createGenerator("02_Family_OneMotherOneFather", "02_Person_AllRoles");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}
	
	@Test
	public void testAllFamilyRoles() throws IOException {
		createGenerator("02_Person_OneFemaleOneMale", "02_Person_AllRoles");
		runGenerator();
		assert !checker.modelsAreConsistent();
	}

}
