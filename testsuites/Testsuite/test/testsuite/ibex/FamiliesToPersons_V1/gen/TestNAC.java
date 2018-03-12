package testsuite.ibex.FamiliesToPersons_V1.gen;

import java.io.IOException;

import org.junit.Test;

public class TestNAC extends FamiliesToPersonsModelGenTestCase {
	
	@Test
	public void testOneFamily() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("CreateFatherInNewFamily", 200);
		runGenerator(stop);
		assertPostcondition("singleFamilyWithFather", "singlePersonRegisterWithMalePerson");
	}
}
