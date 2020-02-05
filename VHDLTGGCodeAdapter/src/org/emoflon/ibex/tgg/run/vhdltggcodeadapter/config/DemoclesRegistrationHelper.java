package org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.vhdltggcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import MocaTree.impl.MocaTreePackageImpl;
import VHDLModel.impl.VHDLModelPackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable)  throws IOException {
		// Load and register source and target metamodels
		VHDLModelPackageImpl.init();
		MocaTreePackageImpl.init();
		
		if(executable instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/../metamodels/MocaTree/model/MocaTree.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
		}
		
		if(executable instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/../metamodels/VHDLModel/model/VHDLModel.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/VHDLModel/model/VHDLModel.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/VHDLModel/model/VHDLModel.ecore", pack);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new DemoclesTGGEngine());
		options.project.name("VHDLTGGCodeAdapter");
		options.project.path("VHDLTGGCodeAdapter");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
