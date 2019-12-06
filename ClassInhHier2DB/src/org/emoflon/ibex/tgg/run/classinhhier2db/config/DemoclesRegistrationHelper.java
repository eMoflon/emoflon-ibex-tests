package org.emoflon.ibex.tgg.run.classinhhier2db.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.classinhhier2db.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Load and register source and target metamodels
		ClassInheritanceHierarchyPackageImpl.init();
		DatabasePackageImpl.init();

		if (strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/Database/model/Database.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", pack);
		}

		if (strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", pack);
		}
	}
	
	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("ClassInhHier2DB");
		options.projectPath("ClassInhHier2DB");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}