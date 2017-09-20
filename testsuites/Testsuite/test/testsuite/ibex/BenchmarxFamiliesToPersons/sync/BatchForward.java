package testsuite.ibex.BenchmarxFamiliesToPersons.sync;

import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.FamiliesToPersonsTestCase;


public class BatchForward extends FamiliesToPersonsTestCase {

	public BatchForward(boolean flatten) {
		super(flatten);
	}

	/**
	 * <b>Test</b> for agreed upon starting state.<br/>
	 * <b>Expect</b> root elements of both source and target models.<br/>
	 * <b>Features</b>: fwd, fixed
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		// No precondition!
		//------------
		assertPostcondition("RootElementFamilies", "RootElementPersons");
	}
	
	/**
	 * <b>Test</b> for name change of an empty family, i.e, a family without any family members.<br/>
	 * <b>Expect</b> no change in the persons model.<br/>
	 * <b>Features</b>: fwd, fixed
	 */
	@Test
	public void testFamilyNameChangeOfEmpty()
	{
		tool.performAndPropagateSourceEdit(helperFamily::createSimpsonFamily);

		assertPrecondition("Pre_NameChangeFamilyEmpty", "Pre_NameChangePersonEmpty");
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::renameEmptySimpsonToBouvier);
		//------------
		assertPostcondition("NameChangeFamilyEmpty", "NameChangePersonEmpty");
	}
	
	/**
	 * <b>Test</b> for creation of a single family (Skinner) in an empty root container.
	 * <br/>
	 * <b>Expect</b> nothing to be changed in the person model.
	 * <br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testCreateFamily()
	{
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::createSkinnerFamily);
		//------------
		assertPostcondition("OneFamily", "PersonsForOneFamily");
	}

	/**
	 * <b>Test</b> for creation of a single family member (a son - Rod) in a new family (Flanders). <br/>
	 * <b>Expect</b> the creation of a new male person in the persons model,
	 * with full name consisting of the first name and family name of the
	 * associated family member. <br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testCreateFamilyMember()
	{
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod));
		//------------
		assertPostcondition("OneFamilyWithOneFamilyMemberSon", "PersonOneMaleMember");
	}
	
	/**
	 * Analogous to @link {@link #testCreateFamilyMember()}, but now for
	 * multiple new family members (Simpsons Family).<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test 
	public void testNewFamilyWithMultiMembers(){
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createNewFamilySimpsonWithMembers));
		//------------
		assertPostcondition("NewFamilyWithMembers", "PersonsMulti");
	}
	
	/**
	 * <b>Test</b> for creation of another Family with the same name (Simpson).<br/>
	 * In the new Simpson family, Bart is the father. 
	 * <b>Expect</b> a new male Person with the name "Simpson, Bart" is created in the person register.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testNewDuplicateFamilyNames() {
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		//------------
		assertPostcondition("FamiliesWithSameName", "PersonWithSameName");
	}
	
	/**
	 * <b>Test</b> for creation of another family member with the same name (Bart).<br/>
	 * <b>Expect</b> a new male Person with the name "Simpson, Bart" is created in the person register.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testDuplicateFamilyMemberNames() {
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSonBart));
		//------------
		assertPostcondition("FamilyWithDuplicateMember", "PersonWithSameName");
	}
}
