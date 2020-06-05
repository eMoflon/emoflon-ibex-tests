package org.emoflon.ibex.tgg.run.traintovehicle.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.traintovehicle.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import TrainToVehicle.TrainToVehiclePackage;
import TrainToVehicle.impl.TrainToVehiclePackageImpl;
import TrainLanguage.impl.TrainLanguagePackageImpl;
import VehicleLanguage.impl.VehicleLanguagePackageImpl;

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
		EPackage trainlanguagePack = null;
		EPackage vehiclelanguagePack = null;
		EPackage traintovehiclePack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/VehicleLanguage/model/VehicleLanguage.ecore");
			vehiclelanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/TrainToVehicle/model/TrainToVehicle.ecore");
			traintovehiclePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/TrainLanguage/model/TrainLanguage.ecore");
			trainlanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/TrainToVehicle/model/TrainToVehicle.ecore");
			traintovehiclePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(trainlanguagePack == null)
			trainlanguagePack = TrainLanguagePackageImpl.init();
				
		if(vehiclelanguagePack == null)
			vehiclelanguagePack = VehicleLanguagePackageImpl.init();
		
		if(traintovehiclePack == null) {
			traintovehiclePack = TrainToVehiclePackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/TrainToVehicle/model/TrainToVehicle.ecore", TrainToVehiclePackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/TrainToVehicle/model/TrainToVehicle.ecore", TrainToVehiclePackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/TrainLanguage/model/TrainLanguage.ecore", trainlanguagePack);
	    rs.getPackageRegistry().put("platform:/plugin/TrainLanguage/model/TrainLanguage.ecore", trainlanguagePack);	
			
		rs.getPackageRegistry().put("platform:/resource/VehicleLanguage/model/VehicleLanguage.ecore", vehiclelanguagePack);
		rs.getPackageRegistry().put("platform:/plugin/VehicleLanguage/model/VehicleLanguage.ecore", vehiclelanguagePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("TrainToVehicle");
		options.project.path("TrainToVehicle");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
