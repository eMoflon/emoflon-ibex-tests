package org.emoflon.ibex.tgg.run.class2doc_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import Documents.impl.DocumentsPackageImpl;
import classMultipleInheritanceHierarchy.impl.ClassMultipleInheritanceHierarchyPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		ClassMultipleInheritanceHierarchyPackageImpl.init();
		DocumentsPackageImpl.init();		
		
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/ClassMultipleInheritanceHierarchy/model/ClassMultipleInheritanceHierarchy.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			rs.getPackageRegistry().put("platform:/resource/ClassMultipleInheritanceHierarchy/model/ClassMultipleInheritanceHierarchy.ecore", pack);
		}
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../metamodels/Documents/model/Documents.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			rs.getPackageRegistry().put("platform:/resource/Documents/model/Documents.ecore", pack);
		}
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("Class2Doc_MA");
		options.projectPath("Class2Doc_MA");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
