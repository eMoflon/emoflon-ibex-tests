package org.emoflon.ibex.tgg.run.algorithmtostrategy_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OPT;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import Algorithms.impl.AlgorithmsPackageImpl;
import Strategies.impl.StrategiesPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		AlgorithmsPackageImpl.init();
		StrategiesPackageImpl.init();
		
		if(strategy instanceof OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/Strategies/model/Strategies.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/Strategies/model/Strategies.ecore", pack);
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("AlgorithmToStrategy_MA");
		options.projectPath("AlgorithmToStrategy_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
