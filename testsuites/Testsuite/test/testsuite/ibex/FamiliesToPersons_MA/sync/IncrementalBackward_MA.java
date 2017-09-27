package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.IncrementalBackward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;
import testsuite.ibex.testUtil.Decisions;

@Ignore("Fails due to not implemented logic for complement rules.")
public class IncrementalBackward_MA extends IncrementalBackward {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public IncrementalBackward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	 
	 @Override
	 @Test
	 public void testIncrementalOperational() {
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createMaggie);
		tool.performIdleTargetEdit(helperPerson::setBirthdayOfMaggie);
		assertPrecondition("Pre_IncrBwdOpFamily", "Pre_IncrBwdOpPerson");
			
		//------------		
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::createMarge)
				.andThen(helperPerson::createLisa)				
				.andThen(helperPerson::createHomer)
				.andThen(helperPerson::createBart)
				.andThen(helperPerson::createMaggie)
				.andThen(helperPerson::createLisa));
		util.configure()
				.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
				.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createLisa);					
		assertPostcondition("FamilyAfterIncrOp", "PersonAfterIncrOp");
	}
}
