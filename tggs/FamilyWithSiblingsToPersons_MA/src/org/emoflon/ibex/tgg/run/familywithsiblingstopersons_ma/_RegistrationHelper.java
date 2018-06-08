package org.emoflon.ibex.tgg.run.familywithsiblingstopersons_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familywithsiblingstopersons_ma.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import FamiliesWithSiblings.impl.FamiliesWithSiblingsPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		EPackage familyPack = FamiliesWithSiblingsPackageImpl.init();
		EPackage personsPack = PersonsPackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", familyPack);
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", personsPack);
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamilyWithSiblingsToPersons_MA");
		options.projectPath("FamilyWithSiblingsToPersons_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
