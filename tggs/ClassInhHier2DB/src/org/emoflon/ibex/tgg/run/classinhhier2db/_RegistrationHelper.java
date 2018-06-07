package org.emoflon.ibex.tgg.run.classinhhier2db;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", ClassInheritanceHierarchyPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", DatabasePackageImpl.init());

		if (strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/Database/model/Database.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			// pack.setNsURI("platform:/plugin/Database/model/Database.ecore");
			rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", pack);
		}

		if (strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			// pack.setNsURI("platform:/plugin/Database/model/Database.ecore");
			rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", pack);
		}
	}
}
