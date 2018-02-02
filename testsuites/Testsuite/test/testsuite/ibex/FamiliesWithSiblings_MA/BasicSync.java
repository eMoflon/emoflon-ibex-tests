package testsuite.ibex.FamiliesWithSiblings_MA;

import org.benchmarx.familiessiblings.core.FamilySiblingsHelper;
import org.benchmarx.persons.core.PersonHelper;
import org.junit.Test;

import FamiliesWithSiblings.FamilyRegister;
import Persons.PersonRegister;
import testsuite.ibex.FamiliesWithSiblings_MA.util.IbexFamilyWithSiblings;
import testsuite.ibex.testUtil.Decisions;
import testsuite.ibex.testUtil.SyncTestCase;


public class BasicSync extends SyncTestCase<FamilyRegister, PersonRegister>{

	private static final String projectName = "FamilyWithSiblingsToPersons_MA";
	
	private FamilySiblingsHelper helperFamily;
	private PersonHelper helperPerson;

	public BasicSync() {
		super(new IbexFamilyWithSiblings(projectName));
	}
	
	protected void initHelpers() {
		helperFamily = new FamilySiblingsHelper();
		helperPerson = new PersonHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Test
	public void testInitialiseSynchronisation()
	{
		assertPostcondition("in/01_OnlyRegisters", "expected/01_OnlyRegisters");
	}
	
	/*--------------------CREATE-------------------------------------*/

	
	@Test
	public void testSiblingFamilies_FWD()
	{
		tool.performAndPropagateSourceEdit(r -> helperFamily.createFamily(r, "Test"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.addFatherToSpecificFamily(r, 0, "father1"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createFamily(r, "Test"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.addMotherToSpecificFamily(r, 1, "mother2"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createSiblingRelations(r, 0, 1));
		//------------
		assertPostcondition("in/02_RegisterWithTwoFamiliesTwoSiblings", "expected/02_RegisterWithTwoPeople");
	}
	
	@Test
	public void testSiblingFamilies_BWD() {
		util.configure()
			.makeDecision(Decisions.PREFER_EXISTING_FAMILY_TO_NEW, false)
			.makeDecision(Decisions.PREFER_CREATING_PARENT_TO_CHILD, true);
		tool.performAndPropagateTargetEdit(r -> helperPerson.createHomer(r));
		tool.performAndPropagateTargetEdit(r -> helperPerson.createMarge(r));
		tool.performAndPropagateTargetEdit(r -> helperPerson.createLisa(r));
		//------------
		assertPostcondition("in/03_RegisterWithThreeFamiliesThreeSiblings", "expected/03_RegisterWithThreePeople");
	}
	
}
