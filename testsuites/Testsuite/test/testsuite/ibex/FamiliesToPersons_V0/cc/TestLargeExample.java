package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class TestLargeExample extends FamiliesToPersonsCCTestCase {
	public static void main(String[] args) throws IOException {
		init();
		TestLargeExample test = new TestLargeExample();
		test.test600Children();
	}
	
	@Test
	@Ignore("Takes too long.")
	public void test60Children() throws IOException {
		createGenerator("sixtyChildFamily", "thirtyFemaleThirtyMalePersons");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore("Takes too long.")
	public void test120Children() throws IOException {
		createGenerator("120ChildrenFamily", "60Male60FemalePersons");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
	
	@Test
	@Ignore("Takes too long.")
	public void test600Children() throws IOException {
		createGenerator("sixhundredChildFamily", "sixhundredMaleAndFemalePersons");
		runGenerator();
		Assert.assertTrue(checker.modelsAreConsistent());
	}
}