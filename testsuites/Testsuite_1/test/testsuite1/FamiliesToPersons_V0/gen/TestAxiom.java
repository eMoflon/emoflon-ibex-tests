package testsuite1.FamiliesToPersons_V0.gen;

import java.io.IOException;

import org.junit.Test;

public class TestAxiom extends FamiliesToPersonsModelGenTestCase {
	
	public TestAxiom(boolean flatten) {
		super(flatten);
	}
	
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
		assertPostcondition("multipleFamilyReg", "multiplePersonReg");
	}
}
