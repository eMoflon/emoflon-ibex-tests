package org.emoflon.ibex.tgg.run.companytoit.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.companytoit.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.viatra.ViatraTGGEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class ViatraRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Load and register source and target metamodels
		CompanyLanguagePackageImpl.init();
		ITLanguagePackageImpl.init();
	
	if(executable instanceof FWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/ITLanguage/model/ITLanguage.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", pack);
		}
								
	if(executable instanceof BWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", pack);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new ViatraTGGEngine());
		options.project.name("CompanyToIT");
		options.project.path("CompanyToIT");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
