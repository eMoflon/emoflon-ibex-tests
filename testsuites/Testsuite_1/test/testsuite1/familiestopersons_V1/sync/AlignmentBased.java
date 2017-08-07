package testsuite1.familiestopersons_V1.sync;

import org.benchmarx.families.core.SimpleFamiliesHelper;
import org.benchmarx.persons.core.SimplePersonsHelper;
import org.junit.Ignore;
import org.junit.Test;

import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import testsuite1.familiestopersons_V1.sync.util.IbexSimpleFamiliesToPersons;
import testsuite1.testUtil.SyncTestCase;


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
	
	protected void assertPrecondition(String source, String target) {
		util.assertPrecondition(projectName+"/"+source, projectName+"/"+target);
	}
	
	protected void assertPostcondition(String source, String target) {
		util.assertPostcondition(projectName+"/"+source, projectName+"/"+target);
	}
	
	@Ignore("Not yet implemented")
	public void testRenameMother()
	{
		// No precondition!
		//------------
		tool.performAndPropagateTargetEdit(r -> helperPerson.createMotherAsFemale(r, "Lisa"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Magdalena"));
		tool.performAndPropagateTargetEdit(r -> helperPerson.renamePerson(r, "Lisa", "Theresa"));
		
		//------------
		assertPostcondition("singleFamilyWithDaughters", "singlePersonRegisterWithFemalePersons");
	}
	
	
	@Test
	public void testDeleteDaughter()
	{
		tool.performAndPropagateTargetEdit(r -> helperPerson.createMotherAsFemale(r, "Theresa"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Magdalena"));
		tool.performAndPropagateSourceEdit(r -> helperFamily.createDaughterInSingleTestFamily(r, "Lisa"));
				

		assertPrecondition("singleFamilyWithThreeDaughters", "singlePersonRegisterWithThreeDaughters");
		
		//------------
		tool.performAndPropagateTargetEdit(r -> helperPerson.deletePerson(r, "Lisa"));
		//------------

		assertPostcondition("singleFamilyWithDaughters", "singlePersonRegisterWithFemalePersons");
	}
}
