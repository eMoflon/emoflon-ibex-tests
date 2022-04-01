package testsuite.ibex.BenchmarxFamiliesToPersons.sync;

import org.junit.jupiter.api.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.FamiliesToPersonsTestCase;
import testsuite.ibex.testUtil.Decisions;

/**
 * Test cases for backward transformations with parameters E and P set to true
 * Please note, that in general this leads to a non-deterministic behavior, 
 * which is hard to test. Thus, we restricted ourselves to a PersonRegister
 * configuration, which allows to deterministically execute the backward
 * transformation. (c.f., Test Case 2d on GitHub).
 */
public class BatchBwdEAndP extends FamiliesToPersonsTestCase {
	
	/**
	 * <b>Test</b> for creation of a single male person (Flanders, Rod).<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of parents is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 */
	@Test
	public void testCreateMalePersonAsSon() {
		// No precondition!
		// ---------------------------------
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createRod);
		// ---------------------------------
		assertPostcondition("OneFamilyWithOneFamilyMember", "PersonOneMaleMember"); 
	}
	
	/**
	 * <b>Test</b> for creation of family members in existing families.<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of Children is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 */
	@Test
	public void testCreateFamilyMembersInExistingFamilyAsParents() {
		// No precondition!
		// ---------------------------------
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createRod)
				.andThen(helperPerson::createHomer)				
				.andThen(helperPerson::createMarge));
		// ---------------------------------
		assertPostcondition("FamilyWithParentsOnly", "PersonsMultiDeterministic"); 
	}
}
