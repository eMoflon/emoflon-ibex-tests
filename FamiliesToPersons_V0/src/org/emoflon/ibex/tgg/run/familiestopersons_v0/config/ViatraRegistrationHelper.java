package org.emoflon.ibex.tgg.run.familiestopersons_v0.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_v0.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.viatra.ViatraTGGEngine;

import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class ViatraRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Load and register source and target metamodels
		SimpleFamiliesPackageImpl.init();
		SimplePersonsPackageImpl.init();
	
	if(executable instanceof FWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimplePersons/model/SimplePersons.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/SimplePersons/model/SimplePersons.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/SimplePersons/model/SimplePersons.ecore", pack);
		}
								
	if(executable instanceof BWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/SimpleFamilies/model/SimpleFamilies.ecore", pack);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new ViatraTGGEngine());
		options.project.name("FamiliesToPersons_V0");
		options.project.path("FamiliesToPersons_V0");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
