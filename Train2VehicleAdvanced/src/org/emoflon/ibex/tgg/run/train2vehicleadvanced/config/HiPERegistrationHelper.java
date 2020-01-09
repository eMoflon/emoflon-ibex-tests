package org.emoflon.ibex.tgg.run.train2vehicleadvanced.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.train2vehicleadvanced.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Train2VehicleAdvanced.Train2VehicleAdvancedPackage;
import Train2VehicleAdvanced.impl.Train2VehicleAdvancedPackageImpl;
import AdvancedTrain.impl.AdvancedTrainPackageImpl;
import AdvancedVehicle.impl.AdvancedVehiclePackageImpl;

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
		EPackage advancedtrainPack = null;
		EPackage advancedvehiclePack = null;
		EPackage train2vehicleadvancedPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/AdvancedVehicle/model/AdvancedVehicle.ecore");
			advancedvehiclePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Train2VehicleAdvanced/model/Train2VehicleAdvanced.ecore");
			train2vehicleadvancedPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/AdvancedTrain/model/AdvancedTrain.ecore");
			advancedtrainPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Train2VehicleAdvanced/model/Train2VehicleAdvanced.ecore");
			train2vehicleadvancedPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(advancedtrainPack == null)
			advancedtrainPack = AdvancedTrainPackageImpl.init();
				
		if(advancedvehiclePack == null)
			advancedvehiclePack = AdvancedVehiclePackageImpl.init();
		
		if(train2vehicleadvancedPack == null) {
			train2vehicleadvancedPack = Train2VehicleAdvancedPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Train2VehicleAdvanced/model/Train2VehicleAdvanced.ecore", Train2VehicleAdvancedPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Train2VehicleAdvanced/model/Train2VehicleAdvanced.ecore", Train2VehicleAdvancedPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/AdvancedTrain/model/AdvancedTrain.ecore", advancedtrainPack);
	    rs.getPackageRegistry().put("platform:/plugin/AdvancedTrain/model/AdvancedTrain.ecore", advancedtrainPack);	
			
		rs.getPackageRegistry().put("platform:/resource/AdvancedVehicle/model/AdvancedVehicle.ecore", advancedvehiclePack);
		rs.getPackageRegistry().put("platform:/plugin/AdvancedVehicle/model/AdvancedVehicle.ecore", advancedvehiclePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("Train2VehicleAdvanced");
		options.projectPath("Train2VehicleAdvanced");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
