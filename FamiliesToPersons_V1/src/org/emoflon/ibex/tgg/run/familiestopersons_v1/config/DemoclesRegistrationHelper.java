package org.emoflon.ibex.tgg.run.familiestopersons_v1.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_v1.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable)  throws IOException {
		// Load and register source and target metamodels
		SimpleFamiliesPackageImpl.init();
		SimplePersonsPackageImpl.init();
		
		if(executable instanceof FWD_OPT) {
		}
		
		if(executable instanceof BWD_OPT) {
		}
	}
	
	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new DemoclesTGGEngine());
		options.project.name("FamiliesToPersons_V1");
		options.project.path("FamiliesToPersons_V1");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
