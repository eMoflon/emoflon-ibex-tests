package org.emoflon.ibex.tgg.run.classmultipleinhhier2db_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.classmultipleinhhier2db_ma.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;


import Database.impl.DatabasePackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		ClassMultipleInheritanceHierarchyPackageImpl.init();
		DatabasePackageImpl.init();

		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/Database/model/Database.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/classInheritanceHierarchy.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ClassInheritanceHierarchy/model/classInheritanceHierarchy.ecore", pack);
		}
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("ClassMultipleInhHier2DB_MA");
		options.projectPath("ClassMultipleInhHier2DB_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
