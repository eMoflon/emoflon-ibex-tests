package org.emoflon.ibex.tgg.run.familiestopersons_v1;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_v1.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import FamiliesToPersons_V1.FamiliesToPersons_V1Package;
import FamiliesToPersons_V1.impl.FamiliesToPersons_V1PackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		SimpleFamiliesPackageImpl.init();
		SimplePersonsPackageImpl.init();
		
		FamiliesToPersons_V1PackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore", FamiliesToPersons_V1Package.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore", FamiliesToPersons_V1Package.eINSTANCE);
		
		if(strategy instanceof FWD_OPT) {
		}
		
		if(strategy instanceof BWD_OPT) {
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FamiliesToPersons_V1");
		options.projectPath("FamiliesToPersons_V1");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
