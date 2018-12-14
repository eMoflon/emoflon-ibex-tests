package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.vhdltggcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;


import MocaTree.impl.MocaTreePackageImpl;
import VHDLModel.impl.VHDLModelPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		VHDLModelPackageImpl.init();
		MocaTreePackageImpl.init();
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/MocaTree/model/MocaTree.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/VHDLModel/model/VHDLModel.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/VHDLModel/model/VHDLModel.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/VHDLModel/model/VHDLModel.ecore", pack);
		}
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("VHDLTGGCodeAdapter");
		options.projectPath("VHDLTGGCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
