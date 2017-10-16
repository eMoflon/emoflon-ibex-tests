package testsuite.ibex.BenchmarxFamiliesToPersons;

import org.benchmarx.emf.Comparator;
import org.benchmarx.families.core.FamiliesComparator;
import org.benchmarx.families.core.FamilyHelper;
import org.benchmarx.persons.core.PersonHelper;
import org.benchmarx.persons.core.PersonsComparator;
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

	protected static String projectName = "BenchmarxFamiliesToPersons";

	protected Comparator<FamilyRegister> familiesComparator;
	protected Comparator<PersonRegister> personsComparator;
	protected FamilyHelper helperFamily;
	protected PersonHelper helperPerson;


	@Override
	protected void initHelpers() {
		// Make sure packages are registered
		FamiliesPackage.eINSTANCE.getName();
		PersonsPackage.eINSTANCE.getName();
		
		// Initialise all helpers
		familiesComparator = new FamiliesComparator();
		personsComparator = new PersonsComparator();
		util = new BenchmarxUtil<>(tool);
		helperFamily = new FamilyHelper();
		helperPerson = new PersonHelper();
	}

	@Override
	protected String getProjectName() {
		return projectName;
	}
}
