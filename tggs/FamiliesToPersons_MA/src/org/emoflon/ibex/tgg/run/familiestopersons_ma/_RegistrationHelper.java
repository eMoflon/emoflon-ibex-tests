package org.emoflon.ibex.tgg.run.familiestopersons_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_ma.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Load and register source and target metamodels
		EPackage familyPack = null;
		EPackage personsPack = null;

		if (strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource(
					"platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore");
			personsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		} else if (strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource(
					"platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Families/model/Families.ecore");
			familyPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
		
		if(familyPack == null)
			familyPack = FamiliesPackageImpl.init();
		
		if(personsPack == null)
			personsPack = PersonsPackageImpl.init();

		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", familyPack);
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", personsPack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamiliesToPersons_MA");
		options.projectPath("FamiliesToPersons_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
