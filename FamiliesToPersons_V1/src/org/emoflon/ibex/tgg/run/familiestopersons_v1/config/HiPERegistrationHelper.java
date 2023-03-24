package org.emoflon.ibex.tgg.run.familiestopersons_v1.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.familiestopersons_v1.RuntimeTGGAttrConstraintFactoryContainer;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.options.IbexOptions;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.runtime.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;

import FamiliesToPersons_V1.FamiliesToPersons_V1Package;
import FamiliesToPersons_V1.impl.FamiliesToPersons_V1PackageImpl;
import SimpleFamilies.impl.SimpleFamiliesPackageImpl;
import SimplePersons.impl.SimplePersonsPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage simplefamiliesPack = null;
		EPackage simplepersonsPack = null;
		EPackage familiestopersons_v1Pack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimplePersons/model/SimplePersons.ecore");
			simplepersonsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore");
			familiestopersons_v1Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimpleFamilies/model/SimpleFamilies.ecore");
			simplefamiliesPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/FamiliesToPersons_V1/model/FamiliesToPersons_V1.ecore");
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
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("FamiliesToPersons_V1");
		options.project.path("FamiliesToPersons_V1");
		options.debug.ibexDebug(false);
		for(var factory : new RuntimeTGGAttrConstraintFactoryContainer().getFactories())
			options.csp.constraintProvider().registerFactory(factory);
		options.registrationHelper(this);
		return options;
	}
}
