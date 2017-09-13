package testsuite1.FamiliesToPersons_V0.gen;

import java.io.IOException;

import org.junit.Test;

public class TestComplexFamilies extends FamiliesToPersonsModelGenTestCase {
	
	public TestComplexFamilies(boolean flatten) {
		super(flatten);
	}
	
	@Test
	public void testFamilyWithSixChildren() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 1);
		stop.setMaxRuleCount("FatherToMale", 1);
		stop.setMaxRuleCount("MotherToFemale", 1);
		stop.setMaxRuleCount("DaughterToFemale", 3);
		stop.setMaxRuleCount("SonToMale", 3);
		runGenerator(stop);
		assertPostcondition("sixChildFamily", "fourFemaleFourMalePersons");
	}

	@Test
	public void testFamilyWithSixteenChildren() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 1);
		stop.setMaxRuleCount("FatherToMale", 1);
		stop.setMaxRuleCount("MotherToFemale", 1);
		stop.setMaxRuleCount("DaughterToFemale", 8);
		stop.setMaxRuleCount("SonToMale", 8);
		runGenerator(stop);
		assertPostcondition("sixteenChildFamily", "eightFemaleEightMalePersons");
	}

	@Test
	public void testFamilyWithSixtyChildren() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 1);
		stop.setMaxRuleCount("FatherToMale", 1);
		stop.setMaxRuleCount("MotherToFemale", 1);
		stop.setMaxRuleCount("DaughterToFemale", 30);
		stop.setMaxRuleCount("SonToMale", 30);
		runGenerator(stop);
		assertPostcondition("sixtyChildFamily", "thirtyFemaleThirtyMalePersons");
	}

	@Test
	public void testFamilyWithSixHundredChildren() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 1);
		stop.setMaxRuleCount("FatherToMale", 10);
		stop.setMaxRuleCount("MotherToFemale", 10);
		stop.setMaxRuleCount("DaughterToFemale", 300);
		stop.setMaxRuleCount("SonToMale", 300);
		runGenerator(stop);
		assertPostcondition("sixhundredChildFamily", "sixhundredMaleAndFemalePersons");
	}

}