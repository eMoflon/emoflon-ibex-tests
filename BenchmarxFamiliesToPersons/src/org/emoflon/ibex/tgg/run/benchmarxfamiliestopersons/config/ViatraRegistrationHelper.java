package org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.benchmarxfamiliestopersons.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.viatra.ViatraTGGEngine;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

public class ViatraRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		EPackage familyPack = null;
		EPackage personsPack = null;

		if (executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource(
					"platform:/resource/../benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore");
			personsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		} else if (executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource(
					"platform:/resource/../benchmarx/examples/familiestopersons/metamodels/Families/model/Families.ecore");
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
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new ViatraTGGEngine());
		options.project.name("BenchmarxFamiliesToPersons");
		options.project.path("BenchmarxFamiliesToPersons");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
