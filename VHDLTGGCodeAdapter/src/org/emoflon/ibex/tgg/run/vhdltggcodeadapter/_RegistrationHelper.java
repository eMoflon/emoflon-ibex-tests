package org.emoflon.ibex.tgg.run.vhdltggcodeadapter;

import java.io.IOException;
	
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.vhdltggcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.run.vhdltggcodeadapter.DefaultRegistrationHelper;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		DefaultRegistrationHelper.registerMetamodels(rs, strategy);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		return DefaultRegistrationHelper.createIbexOptions();
	}
}
