package org.emoflon.ibex.tgg.run.class2testclass_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.class2testclass_ma.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		ClassInheritanceHierarchyPackageImpl.init();
		DatabasePackageImpl.init();
		
		if(strategy instanceof FWD_OPT) {
		}
		
		if(strategy instanceof BWD_OPT) {
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("Class2TestClass_MA");
		options.projectPath("Class2TestClass_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
