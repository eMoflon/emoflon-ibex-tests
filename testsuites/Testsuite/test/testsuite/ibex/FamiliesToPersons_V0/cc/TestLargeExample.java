package testsuite.ibex.FamiliesToPersons_V0.cc;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class TestLargeExample extends FamiliesToPersonsCCTestCase {
	
	public TestLargeExample(boolean flatten) {
		super(flatten);
	}
	
	public static void main(String[] args) throws IOException {
		init();
		TestLargeExample test = new TestLargeExample(true);
		test.test600Children();
	}
	
	@Test
	public void test60Children() throws IOException {
		createGenerator("sixtyChildFamily", "thirtyFemaleThirtyMalePersons");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	@Ignore("Takes too long.")
	public void test120Children() throws IOException {
		createGenerator("120ChildrenFamily", "60Male60FemalePersons");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
	
	@Test
	@Ignore("Takes too long.")
	public void test600Children() throws IOException {
		createGenerator("sixhundredChildFamily", "sixhundredMaleAndFemalePersons");
		runGenerator();
		assert checker.modelsAreConsistent();
	}
}