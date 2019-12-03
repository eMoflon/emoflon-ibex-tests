package org.emoflon.ibex.tgg.run.familiestopersons_v1.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.familiestopersons_v1.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import FamiliesToPersons_V1.FamiliesToPersons_V1Package;
import FamiliesToPersons_V1.impl.FamiliesToPersons_V1PackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class HiPERegistrationHelper {
	
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
		EPackage simplefamiliesPack = null;
		EPackage simplepersonsPack = null;
		EPackage familiestopersons_v1Pack = null;
		
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/SimplePersons/model/SimplePersons.ecore");
			simplepersonsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore");
			familiestopersons_v1Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore");
			simplefamiliesPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore");
			familiestopersons_v1Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(simplefamiliesPack == null)
			simplefamiliesPack = SimpleFamiliesPackageImpl.init();
				
		if(simplepersonsPack == null)
			simplepersonsPack = SimplePersonsPackageImpl.init();
		
		if(familiestopersons_v1Pack == null) {
			familiestopersons_v1Pack = FamiliesToPersons_V1PackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore", FamiliesToPersons_V1Package.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore", FamiliesToPersons_V1Package.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore", simplefamiliesPack);
	    rs.getPackageRegistry().put("platform:/plugin/SimpleFamilies/model/SimpleFamilies.ecore", simplefamiliesPack);	
			
		rs.getPackageRegistry().put("platform:/resource/SimplePersons/model/SimplePersons.ecore", simplepersonsPack);
		rs.getPackageRegistry().put("platform:/plugin/SimplePersons/model/SimplePersons.ecore", simplepersonsPack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("FamiliesToPersons_V1");
		options.projectPath("FamiliesToPersons_V1");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
