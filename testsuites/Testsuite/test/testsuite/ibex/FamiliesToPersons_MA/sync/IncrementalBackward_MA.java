package testsuite.ibex.FamiliesToPersons_MA.sync;

import org.junit.Ignore;
import org.junit.Test;

import testsuite.ibex.BenchmarxFamiliesToPersons.sync.IncrementalBackward;
import testsuite.ibex.FamiliesToPersons_MA.sync.util.IbexFamiliesToPersons_MA;
import testsuite.ibex.testUtil.Decisions;


public class IncrementalBackward_MA extends IncrementalBackward {
	
	static { 
		projectName = "FamiliesToPersons_MA";
	}
	 
	public IncrementalBackward_MA() {
		tool = new IbexFamiliesToPersons_MA(projectName);
	}
	 
	/**
	 * <b>Test</b> for deleting Persons from the PersonRegister.<br/>
	 * <b>Expect</b> : FamilyRegister and Person model are structured as specified in the corresponding
	 * assertPostcondition statements.<br/>
	 * <b>Features</b>: bwd, del
	 */

	@Test
	public void testIncrementalDeletions1() {
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		// reconfigure, to allow the creation of a child in the existing family
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createMaggie);	
		tool.performIdleTargetEdit(helperPerson::setBirthdaysOfSimpson);
		assertPrecondition("Pre_IncrBwdFamilyFatherChild", "Pre_IncrBwdPerson");
		
		//------------		
		tool.performAndPropagateTargetEdit(helperPerson::deleteHomer);
		tool.performAndPropagateTargetEdit(helperPerson::deleteMaggie);
		assertPostcondition("FamilyAfterBwdDeletion", "PersonAfterBwdDeletion");
		//------------
	}
	
	/**
	 * Same test as testIncremenalDeletions1, but with expected behaviour that can
	 * be modelled with TGG.  Note that this is not the behaviour as specified in the F2P benchmarx!
	 */
	@Ignore("This requires 1..* complement rules")
	@Test
	public void testIncrementalDeletions2() {
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(helperPerson::createHomer);
		// reconfigure, to allow the creation of a child in the existing family
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, true)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, false);
		tool.performAndPropagateTargetEdit(helperPerson::createMaggie);	
		tool.performIdleTargetEdit(helperPerson::setBirthdaysOfSimpson);
		assertPrecondition("Pre_IncrBwdFamilyFatherChild", "Pre_IncrBwdPerson");
		
		//------------		
		tool.performAndPropagateTargetEdit(helperPerson::deleteHomer);
		tool.performAndPropagateTargetEdit(helperPerson::deleteMaggie);
		assertPostcondition("FamilyAfterBwdDeletion2", "PersonAfterBwdDeletion2");
		//------------
	}
}
