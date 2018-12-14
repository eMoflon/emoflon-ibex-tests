package testsuite.ibex.BenchmarxFamiliesToPersons;

import org.benchmarx.families.core.FamilyHelper;
import org.benchmarx.persons.core.PersonHelper;
import org.benchmarx.util.BenchmarxUtil;

import Families.FamiliesPackage;
import Families.FamilyRegister;
import Persons.PersonRegister;
import Persons.PersonsPackage;
import testsuite.ibex.testUtil.SyncTestCase;

public abstract class FamiliesToPersonsTestCase extends SyncTestCase<FamilyRegister, PersonRegister> {
	public FamiliesToPersonsTestCase() {
		super(new IbexFamiliesToPersons(projectName));
	}
	
	protected FamilyHelper helperFamily;
	protected PersonHelper helperPerson;
	protected final static String projectName = "BenchmarxFamiliesToPersons";


	@Override
	protected void initHelpers() {
		// Make sure packages are registered
		FamiliesPackage.eINSTANCE.getName();
		PersonsPackage.eINSTANCE.getName();
		
		// Initialise all helpers
		util = new BenchmarxUtil<>(tool);
		helperFamily = new FamilyHelper();
		helperPerson = new PersonHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
}
