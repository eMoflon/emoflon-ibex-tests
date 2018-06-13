package org.emoflon.ibex.tgg.run.companytoit;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.companytoit.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		CompanyLanguagePackageImpl.init();
		ITLanguagePackageImpl.init();
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/ITLanguage/model/ITLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/CompanyLanguage/model/CompanyLanguage.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", pack);
		}
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
