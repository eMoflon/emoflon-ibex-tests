package testsuite.ibex.FamiliesToPersons_V1.gen;

import java.io.IOException;

import org.junit.Test;

public class TestAxiom extends FamiliesToPersonsModelGenTestCase {
	
	@Test
	public void testOneRoot() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		runGenerator(stop);
		assertPostcondition("singleFamilyReg", "singlePersonReg");
	}
	
	@Test
	public void testMultipleRoots() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 3);
		runGenerator(stop);
		//assertPostcondition("multipleFamilyReg", "multiplePersonReg");
		assertPostcondition("singleFamilyReg", "singlePersonReg");
	}
}
