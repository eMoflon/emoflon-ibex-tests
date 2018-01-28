package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.IncrementalBackward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;
import testsuite.ibex.testUtil.Decisions;

//@Ignore("Fails due to not implemented logic for complement rules.")
public class IncrementalBackward_MA extends IncrementalBackward {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public IncrementalBackward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	 
	 
	@Test
	public void testIncrementalMixedDynamic() {
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createMaggie);	
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		tool.performIdleTargetEdit(helperPerson::setBirthdaysOfSimpson);
		assertPrecondition("Pre_IncrBwdFamily", "Pre_IncrBwdPerson");

		//------------		
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(util
				.execute(helperPerson::deleteHomer)
				.andThen(helperPerson::createHomer));
		assertPostcondition("FamilyAfterBwdMixed", "PersonAfterBwdMixed");
	}
}
