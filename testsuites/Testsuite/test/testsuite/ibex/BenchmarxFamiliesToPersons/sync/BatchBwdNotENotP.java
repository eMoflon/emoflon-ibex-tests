package testsuite.ibex.BenchmarxFamiliesToPersons.sync;

import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.FamiliesToPersonsTestCase;
import testsuite.ibex.testUtil.Decisions;

public class BatchBwdNotENotP extends FamiliesToPersonsTestCase {

	/**
	 * <b>Test</b> for creation of a single male person (Flanders, Rod).<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of Children is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 */
	@Test
	public void testCreateMalePersonAsSon() {
		// No precondition!
		// ---------------------------------
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createRod);
		// ---------------------------------
		assertPostcondition("OneFamilyWithOneFamilyMemberSon", "PersonOneMaleMember"); 
	}
	
	/**
	 * <b>Test</b> for creation of family members in existing families.<br/>
	 * <b>Expect</b> the creation of a family member in the families model with
	 * the given first name, in a suitable family.  Creation of children is preferred.<br/>
	 * <b>Features</b>: bwd, runtime
	 */
	@Test
	public void testCreateFamilyMembersInNewFamilyAsChildren() {
		// No precondition!
		// ---------------------------------
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createRod)
				.andThen(helperPerson::createHomer)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createMarge)
				.andThen(helperPerson::createLisa)
				.andThen(helperPerson::createMaggie));
		// ---------------------------------
		assertPostcondition("MultiFamiliesChildren", "PersonsMulti"); 
	}
	
	@Test
	public void testCreateDuplicateFamilyMembersInNewFamilyAsChildren() {
		// No precondition!
		// ---------------------------------
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createRod)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createHomer)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createMarge)
				.andThen(helperPerson::createLisa)
				.andThen(helperPerson::createMaggie));
		// ---------------------------------
		assertPostcondition("MultiFamiliesWithDuplicateNamesChildren", "PersonsDuplicateMulti"); 
	}
}
