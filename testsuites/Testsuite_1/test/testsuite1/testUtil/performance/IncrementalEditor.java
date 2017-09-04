package testsuite1.testUtil.performance;

import java.util.function.Consumer;

import org.benchmarx.classInheritanceHierarchy.core.ClassInheritanceHierarchyHelper;
import org.benchmarx.database.core.DatabaseHelper;
import org.benchmarx.families.core.SimpleFamiliesHelper;
import org.benchmarx.persons.core.SimplePersonsHelper;
import org.eclipse.emf.ecore.EObject;

import ClassInheritanceHierarchy.ClassPackage;
import Database.DB;
import SimpleFamilies.FamilyRegister;
import SimplePersons.PersonRegister;

public class IncrementalEditor {
	private SimpleFamiliesHelper families = new SimpleFamiliesHelper();
	private SimplePersonsHelper persons = new SimplePersonsHelper();
	private ClassInheritanceHierarchyHelper classInhHier = new ClassInheritanceHierarchyHelper();
	private DatabaseHelper databases = new DatabaseHelper();
	
	public Consumer<EObject> getEdit(String tggName, boolean isFwd) {
		switch (tggName) {
			case "ClassInhHier2DB":
				if (isFwd)
					return this::classInhHierAddClass;
				else
					return this::dbAddTable;
			case "FamiliesToPersons_V0":
			case "FamiliesToPersons_V1":
				if (isFwd)
					return this::familiesAddDaughter;
				else
					return this::personsAddDaughter;
		}
		
		throw new IllegalArgumentException("There is no edit for the "+(isFwd ? "source" : "target")+" model of the TGG "+tggName+".");
	}
	
	public void familiesAddDaughter(EObject familyRegister) {
		families.createDaughterInSingleTestFamily((FamilyRegister)familyRegister, "newDaughter");
	}
	
	public void personsAddDaughter(EObject personRegister) {
		persons.createFemale((PersonRegister)personRegister, "newDaughter");
	}
	
	public void classInhHierAddClass(EObject classPackage) {
		classInhHier.createClass((ClassPackage)classPackage, "newClass");
	}

	public void dbAddTable(EObject db) {
		databases.createTable((DB)db, "newTable");
	}

}
