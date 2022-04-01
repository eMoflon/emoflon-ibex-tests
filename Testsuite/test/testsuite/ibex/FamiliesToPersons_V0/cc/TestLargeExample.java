package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestLargeExample extends FamiliesToPersonsCCTestCase {
	public static void main(String[] args) throws IOException {
		init();
		TestLargeExample test = new TestLargeExample();
		test.test600Children();
	}
	
	@Test
	@Disabled("Takes too long.")
	public void test60Children() throws IOException {
		createGenerator("sixtyChildFamily", "thirtyFemaleThirtyMalePersons");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Disabled("Takes too long.")
	public void test120Children() throws IOException {
		createGenerator("120ChildrenFamily", "60Male60FemalePersons");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Disabled("Takes too long.")
	public void test600Children() throws IOException {
		createGenerator("sixhundredChildFamily", "sixhundredMaleAndFemalePersons");
		runCC();
		Assertions.assertTrue(checker.modelsAreConsistent());
	}
}