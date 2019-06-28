package org.emoflon.ibex.tgg.run.companytoit;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.companytoit.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import CompanyToIT.CompanyToITPackage;
import CompanyToIT.impl.CompanyToITPackageImpl;
import CompanyLanguage.impl.CompanyLanguagePackageImpl;
import ITLanguage.impl.ITLanguagePackageImpl;

public class DefaultRegistrationHelper {
	
	/** Create default options **/
	public static final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage companylanguagePack = null;
		EPackage itlanguagePack = null;
		
		CompanyToITPackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/CompanyToIT/model/CompanyToIT.ecore", CompanyToITPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/CompanyToIT/model/CompanyToIT.ecore", CompanyToITPackage.eINSTANCE);
				
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/ITLanguage/model/ITLanguage.ecore");
			itlanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore");
			companylanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
		
		if(companylanguagePack == null)
			companylanguagePack = CompanyLanguagePackageImpl.init();
				
		if(itlanguagePack == null)
			itlanguagePack = ITLanguagePackageImpl.init();
			
		rs.getPackageRegistry().put("platform:/resource/CompanyLanguage/model/CompanyLanguage.ecore", companylanguagePack);
	    rs.getPackageRegistry().put("platform:/plugin/CompanyLanguage/model/CompanyLanguage.ecore", companylanguagePack);	
			
		rs.getPackageRegistry().put("platform:/resource/ITLanguage/model/ITLanguage.ecore", itlanguagePack);
		rs.getPackageRegistry().put("platform:/plugin/ITLanguage/model/ITLanguage.ecore", itlanguagePack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("CompanyToIT");
		options.projectPath("CompanyToIT");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
