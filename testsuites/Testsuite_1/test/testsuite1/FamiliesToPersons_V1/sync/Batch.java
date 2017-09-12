package testsuite1.FamiliesToPersons_V1.sync;

import org.benchmarx.families.core.SimpleFamiliesHelper;
import org.benchmarx.persons.core.SimplePersonsHelper;
import org.junit.Test;

import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;
import testsuite1.FamiliesToPersons_V1.sync.util.IbexSimpleFamiliesToPersons;
import testsuite1.testUtil.SyncTestCase;


public class Batch extends SyncTestCase<FamilyRegister, PersonRegister> {
	private static final String projectName = "FamiliesToPersons_V1";
	
	private SimpleFamiliesHelper helperFamily;
	private SimplePersonsHelper helperPerson;

	public Batch(boolean flatten) {
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
	
	/**
	 * <b>Test</b> for agreed upon starting state.<br/>
	 * <b>Expect</b> root elements of both source and target models.<br/>
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testInitialiseSynchronisation()
	{
		// No precondition!
		//------------
		assertPostcondition("singleFamilyReg", "singlePersonReg");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testMotherToFemale()
	{
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createTestFamily)
											   .andThen(r -> helperFamily.createMotherInSingleTestFamily(r, "mother")));
		//------------
		assertPostcondition("singleFamilyWithMother", "singlePersonRegisterWithFemalePerson");
	}
	
	/**
	 * <b>Features</b>: bwd
	 */
	@Test
	public void testFemaleToMother()
	{
		// No precondition!
		//------------
		tool.performAndPropagateTargetEdit(r -> helperPerson.createFemale(r, "mother"));
		//------------
		assertPostcondition("singleFamilyWithMother", "singlePersonRegisterWithFemalePerson");
	}
	
	/**
	 * <b>Features</b>: fwd
	 */
	@Test
	public void testDaughtersToFemales()
	{
		// No precondition!
		//------------
		tool.performAndPropagateSourceEdit(util.execute(helperFamily::createTestFamily)
											   .andThen(r -> helperFamily.createMotherInSingleTestFamily(r, "Theresa"))
											   .andThen(r -> helperFamily.createDaughterInSingleTestFamily(r, "Maria"))
											   .andThen(r -> helperFamily.createDaughterInSingleTestFamily(r, "Magdalena"))
										);
		//------------
		assertPostcondition("singleFamilyWithDaughters", "singlePersonRegisterWithFemalePersons");
	}
}
