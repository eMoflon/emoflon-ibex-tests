package org.emoflon.ibex.tgg.run.mocatreetoprocess;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy op) {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", MocaTreePackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", ProcessDefinitionPackageImpl.init());
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("MocaTreeToProcess");
		options.projectPath("MocaTreeToProcess");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
