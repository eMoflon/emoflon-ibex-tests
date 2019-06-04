package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.featuremodelconcisetosafe.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import FeatureModelConcise.impl.FeatureModelConcisePackageImpl;
import FeatureModelConciseToSafe.FeatureModelConciseToSafePackage;
import FeatureModelConciseToSafe.impl.FeatureModelConciseToSafePackageImpl;
import FeatureModelSafe.impl.FeatureModelSafePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		FeatureModelConcisePackageImpl.init();
		FeatureModelSafePackageImpl.init();
		
		FeatureModelConciseToSafePackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/FeatureModelConciseToSafe/model/FeatureModelConciseToSafe.ecore", FeatureModelConciseToSafePackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/FeatureModelConciseToSafe/model/FeatureModelConciseToSafe.ecore", FeatureModelConciseToSafePackage.eINSTANCE);
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/FeatureModelSafe/model/FeatureModelSafe.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/FeatureModelConcise/model/FeatureModelConcise.ecore", pack);
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("FeatureModelConciseToSafe");
		options.projectPath("FeatureModelConciseToSafe");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
