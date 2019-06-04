package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.companytoit.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;


import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import CompanyToIT.CompanyToITPackage;
import CompanyToIT.impl.CompanyToITPackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		CompanyLanguagePackageImpl.init();
		ITLanguagePackageImpl.init();
		CompanyToITPackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/CompanyToIT/model/CompanyToIT.ecore", CompanyToITPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/CompanyToIT/model/CompanyToIT.ecore", CompanyToITPackage.eINSTANCE);
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/ITLanguage/model/ITLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", pack);
			res.setURI(URI.createURI(pack.getNsURI()));
			rs.getResources().remove(res);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", pack);
			res.setURI(URI.createURI(pack.getNsURI()));
			rs.getResources().remove(res);
		}
		
		EcoreUtil.resolveAll(rs);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("CompanyToIT");
		options.projectPath("CompanyToIT");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
