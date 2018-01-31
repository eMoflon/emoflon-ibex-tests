package testsuite.ibex.FamiliesWithSiblings_MA;

import org.benchmarx.familiessiblings.core.FamilySiblingsHelper;
import org.benchmarx.persons.core.PersonHelper;
import org.junit.Ignore;
import org.junit.Test;

import FamiliesWithSiblings.FamilyRegister;
import Persons.PersonRegister;
import testsuite.ibex.FamiliesWithSiblings_MA.util.IbexFamilyWithSiblings;
import testsuite.ibex.testUtil.SyncTestCase;


//@Ignore("Waiting for sync implementation")
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
		tool.performAndPropagateSourceEdit(r -> helperFamily.addMotherToSpecificFamily(r, 1, "mother1"));
		//------------
		assertPostcondition("in/02_RegisterWithTwoFamiliesTwoSiblings", "expected/02_RegisterWithTwoFamiliesTwoSiblings");
	}
	
	// Check names and how to adjust this!!! 
	@Test
	public void testSiblingFamilies_BWD() {
		//TODO:[Milica] You will need Update Policy to prefer new family over existing!!
		tool.performAndPropagateTargetEdit(r -> helperPerson.createHomer(r));
		tool.performAndPropagateTargetEdit(r -> helperPerson.createMarge(r));
		//------------
		assertPostcondition("in/02_RegisterWithTwoFamiliesTwoSiblings", "expected/02_RegisterWithTwoFamiliesTwoSiblings");
	}
	
	/*--------------------DELETE-------------------------------------*/
	
	// 
	
	@Test
	public void testDeleteOneFamily_FWD() {
	}
	
	// This is not feasable at the moment because in BWD we do not support 1..* so Family can exist without members!
	@Test
	public void testDeleteOnePerson_BWD() {
	}
}
