package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter_edgerules;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.blockdiagramcodeadapter_edgerules.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import BlockDiagram.impl.BlockDiagramPackageImpl;
import BlockDiagramCodeAdapter_EdgeRules.BlockDiagramCodeAdapter_EdgeRulesPackage;
import BlockDiagramCodeAdapter_EdgeRules.impl.BlockDiagramCodeAdapter_EdgeRulesPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		DefaultRegistrationHelper.registerMetamodels(rs, strategy);
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		return DefaultRegistrationHelper.createIbexOptions();
	}
}
