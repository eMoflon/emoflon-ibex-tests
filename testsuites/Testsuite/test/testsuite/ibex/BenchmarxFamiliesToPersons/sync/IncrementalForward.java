package testsuite.ibex.BenchmarxFamiliesToPersons.sync;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.FamiliesToPersonsTestCase;

public class IncrementalForward extends FamiliesToPersonsTestCase {
	
	/**
	 * <b>Test</b> for inserting of a family members into an existing family after
	 * the birthday dates in the Person register have been changed. <br/>
	 * <b>Expect</b> : New persons are added to the register, while the old persons
	 * remain unchanged (their altered birthday dates are preserved). <br/>
	 * <b>Features</b>: fwd, add, fixed
	 */
	@Test
	public void testIncrementalInserts() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");

		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createFatherNed)
				.andThen(helperFamily::createMotherMaude)
				.andThen(helperFamily::createSonTodd));
		//------------
		assertPostcondition("FamilyAfterInsertion", "PersonAfterInsertion");
	}
	
	/**
	 * <b>Test</b> for deleting family members. After creating the person register,
	 * set birthdays and make sure that the sons with the name Bart can be 
	 * distinguished. Then delete the younger son Bart from the Family register.
	 * <b>Expect</b>: Delete the correct Person in the Person Register
	 * <b>Features</b>: fwd, del, corr-based, structural
	 */
	@Test
	public void testIncrementalDeletions() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::deleteFirstSonBart));
		//------------
		assertPostcondition("FamilyAfterDeletion", "PersonAfterDeletion");
	}
	
	/**
	 * <b>Test</b> for renaming a family. After creating the person register,
	 * set birthdays. Then rename the complete Family Simpson to Bouvier.
	 * <b>Expect</b>: Change the name of the affected Persons in the Person Register
	 * <b>Features</b>: fwd, attribute, fixed, structural, corr-based
	 */
	@Ignore("We do not support incremental attribute changes yet.")
	@Test
	public void testIncrementalRename() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::renameSimpsonToBouvier));
		//------------
		assertPostcondition("FamilyAfterRename", "PersonAfterRename");
	}
	
	/**
	 * <b>Test</b> for moving family members to different families and also changing their roles. 
	 * After creating the person register, set birthdays. Then move Lisa to Flanders as mother
	 * and Marge to Skinner as mother.
	 * <b>Expect</b>: Change the name of the affected Persons in the Person Register
	 * <b>Features</b>: fwd, del+add, fixed, structural
	 */
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testIncrementalMove() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::moveLisa)
				.andThen(helperFamily::moveMarge));
		//------------
		assertPostcondition("FamilyAfterMove", "PersonAfterMove");
	}
	
	/**
	 * <b>Test</b> for deleting and re-creating family members.
	 * After creating the person register, set birthdays. Then delete and re-create Homer
	 * <b>Expect</b>: Person register remains unchanged, except for "Simpson, Homer", who
	 * should be re-created with the default birthday.
	 * <b>Features</b>: fwd, structural, add+del, fixed 
	 */
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testIncrementalMixed() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::deleteFatherHomer)
				.andThen(helperFamily::createFatherHomer));
		//------------
		assertPostcondition("FamilyAfterMixed", "PersonAfterMixed");
	}
	
	/**
	 * <b>Test</b> for moving a family member to a new family and changing her role from daughter to son.
	 * After creating the person register, set birthdays. Then move daughter Maggie to the Flanders family
	 * as a son.
	 * <b>Expect</b>: A new male person should be created in the PersonRegister, but the birthday of Maggie
	 * should be retained.
	 * <b>Features</b>: fwd, structural, add+del, fixed 
	 */
	
	@Ignore ("Fails due to least change problems.")
	@Test
	public void testIncrementalMoveRoleChange() {
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createSkinnerFamily)
				.andThen(helperFamily::createFlandersFamily)
				.andThen(helperFamily::createSonRod)
				.andThen(helperFamily::createSimpsonFamily)
				.andThen(helperFamily::createFatherBart));
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfRod);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfFatherBart);
		tool.performAndPropagateSourceEdit(helperFamily::createNewFamilySimpsonWithMembers);
		tool.performIdleTargetEdit(helperPerson::changeAllBirthdays);
		tool.performAndPropagateSourceEdit(helperFamily::createSonBart);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfYoungerBart);
		
		assertPrecondition("Pre_IncrFwdFamily", "Pre_IncrFwdPerson");
		//------------
		tool.performAndPropagateSourceEdit(helperFamily::moveMaggieAndChangeRole);
		//------------
		assertPostcondition("FamilyAfterMoveRoleChange", "PersonAfterMoveRoleChange");
	}
	
	/**
	 * <b>Test</b> for stability of the transformation.<br/>
	 * <b>Expect</b> re-running the transformation after an idle source delta does not change the target model.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testStability() {
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSonBart));
		//------------
		assertPostcondition("FamilyWithDuplicateMember", "PersonWithSameName");
		
		tool.performAndPropagateSourceEdit(helperFamily::idleDelta);
		assertPostcondition("FamilyWithDuplicateMember", "PersonWithSameName");
	}
	
	/**
	 * <b>Test</b> for hippocraticness of the transformation.<br/>
	 * <b>Expect</b> re-running the transformation after creating an empty family does not change the person register.<br/>
	 * <b>Features:</b>: fwd, fixed
	 */
	@Test
	public void testHippocraticness() {
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util
				.execute(helperFamily::createNewFamilySimpsonWithMembers)
				.andThen(helperFamily::createSonBart));
		//------------
		assertPostcondition("FamilyWithDuplicateMember", "PersonWithSameName");
		
		tool.performAndPropagateSourceEdit(helperFamily::hippocraticDelta);
		assertPostcondition("FamilyWithDuplicateMember2", "PersonWithSameName");
	}

}
