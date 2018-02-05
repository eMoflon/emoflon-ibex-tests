package testsuite.ibex.FamiliesToPersons_V0.gen;

import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class TestContainmentConstraints extends FamiliesToPersonsModelGenTestCase {
	
	/**
	 * Tests if the generated NAC for the containment of the FamilyMember
	 * correctly prevents the application of ReplaceFatherWithSon.
	 * If the rule is applied, a son is added to one family which makes the comparison fail.
	 * @throws IOException
	 */
	@Test
	public void testContainmentConstraintForSameContainmentReference() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 2);
		stop.setMaxRuleCount("FatherToMale", 1);
		stop.setMaxRuleCount("ReplaceFatherWithSon", 1);
		runGenerator(stop);
		assertPostcondition("singleFatherTwoFamilies", "singleMalePersonReg");
	}
	
	/**
	 * Tests if the generated NAC for the containment of the FamilyMember
	 * correctly prevents the application of ConnectFather on an already connected mother.
	 * @throws IOException
	 */
	@Ignore("Waiting for fix for issue #11 on emoflon-ibex-democles")
	@Test
	public void testContainmentConstraintForDifferentContainmentReference() throws IOException {
		stop.setMaxRuleCount("HandleRegisters", 1);
		stop.setMaxRuleCount("IgnoreFamily", 1);
		stop.setMaxRuleCount("MotherToFemale", 1);
		stop.setMaxRuleCount("ConnectFather", 1);
		runGenerator(stop);
		assertPostcondition("singleMotherFamily", "singleFemalePersonReg");
	}
}
