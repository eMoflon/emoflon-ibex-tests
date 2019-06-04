package org.emoflon.ibex.tgg.run.familiestopersons_v0;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_v0.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import FamiliesToPersons_V0.FamiliesToPersons_V0Package;
import FamiliesToPersons_V0.impl.FamiliesToPersons_V0PackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		SimpleFamiliesPackageImpl.init();
		SimplePersonsPackageImpl.init();
		
		FamiliesToPersons_V0PackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/FamiliesToPersons_V0/model/FamiliesToPersons_V0.ecore", FamiliesToPersons_V0Package.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/FamiliesToPersons_V0/model/FamiliesToPersons_V0.ecore", FamiliesToPersons_V0Package.eINSTANCE);
		
		if(strategy instanceof FWD_OPT) {
		}
		
		if(strategy instanceof BWD_OPT) {
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamiliesToPersons_V0");
		options.projectPath("FamiliesToPersons_V0");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
