package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.IncrementalForward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;


public class IncrementalForward_MA extends IncrementalForward {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public IncrementalForward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	 
	//TODO:[Milica] Check if this is relevatn for MA
	 @Ignore
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
	 
	 //TODO:[Milica] Check if this is relevatn for MA
	 @Ignore
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
	 
}
