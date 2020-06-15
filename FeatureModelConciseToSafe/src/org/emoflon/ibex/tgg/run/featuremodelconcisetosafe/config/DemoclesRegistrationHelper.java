package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.featuremodelconcisetosafe.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import FeatureModelConcise.impl.FeatureModelConcisePackageImpl;
import FeatureModelSafe.impl.FeatureModelSafePackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable)  throws IOException {
		// Load and register source and target metamodels
		FeatureModelConcisePackageImpl.init();
		FeatureModelSafePackageImpl.init();
		
		if(executable instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/FeatureModelSafe/model/FeatureModelSafe.ecore", pack);
		}
		
		if(executable instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/FeatureModelConcise/model/FeatureModelConcise.ecore", pack);
		}
	}
	
	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new DemoclesTGGEngine());
		options.project.name("FeatureModelConciseToSafe");
		options.project.path("FeatureModelConciseToSafe");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
