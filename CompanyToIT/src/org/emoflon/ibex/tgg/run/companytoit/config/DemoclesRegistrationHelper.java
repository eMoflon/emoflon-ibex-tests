package org.emoflon.ibex.tgg.run.companytoit.config;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.companytoit.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		CompanyLanguagePackageImpl.init();
		ITLanguagePackageImpl.init();
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.getResourceHandler().loadResource("platform:/resource/ITLanguage/model/ITLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", pack);
			res.setURI(URI.createURI(pack.getNsURI()));
			rs.getResources().remove(res);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.getResourceHandler().loadResource("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", pack);
			res.setURI(URI.createURI(pack.getNsURI()));
			rs.getResources().remove(res);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("CompanyToIT");
		options.projectPath("CompanyToIT");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
