package testsuite.ibex.FamiliesToPersons_V1.sync;

import org.benchmarx.simplefamilies.core.SimpleFamiliesHelper;
import org.benchmarx.simplepersons.core.SimplePersonsHelper;
import org.junit.Ignore;
import org.junit.Test;

import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import testsuite.ibex.FamiliesToPersons_V1.sync.util.IbexSimpleFamiliesToPersons;
import testsuite.ibex.testUtil.SyncTestCase;


public class AlignmentBased extends SyncTestCase<FamilyRegister, PersonRegister> {
	private static final String projectName = "FamiliesToPersons_V1";
	
	private SimpleFamiliesHelper helperFamily;
	private SimplePersonsHelper helperPerson;

	public AlignmentBased(boolean flatten) {
		super(new IbexSimpleFamiliesToPersons(flatten, projectName), flatten);
	}
	
	protected void initHelpers() {
		helperFamily = new SimpleFamiliesHelper();
		helperPerson = new SimplePersonsHelper();
	}
	
	@Override
	protected String getProjectName() {
		return projectName;
	}
	
	@Ignore("Not yet implemented")
	public void testRenameMother()
	{
		// No precondition!
		//------------
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "Lisa"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Magdalena"));
		tool.performAndPropagateTargetEdit(r -> helperPerson.renamePerson(r, "Lisa", "Theresa"));
		
		//------------
		assertPostcondition("singleFamilyWithDaughters", "singlePersonRegisterWithFemalePersons");
	}
	
	
	@Test
	public void testDeleteDaughter()
	{
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "Theresa"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Magdalena"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Lisa"));
				

		assertPrecondition("singleFamilyWithThreeDaughters", "singlePersonRegisterWithThreeDaughters");
		
		//------------
		tool.performAndPropagateTargetEdit(r -> helperPerson.deletePerson(r, "Lisa"));
		//------------

		assertPostcondition("singleFamilyWithDaughters", "singlePersonRegisterWithFemalePersons");
	}
	
	@Test
	public void testMotherNAC(){
		// This female can only be propagated as a mother because a daughter requires an existing family
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "Theresa"));
		
		// But once one of them gets a daughter
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"));
		
		// You can't create new families anymore!
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "Magdalena"));
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "Lisa"));
		
		assertPrecondition("singleFamilyWithThreeDaughters", "singlePersonRegisterWithThreeDaughters");
	}
}
