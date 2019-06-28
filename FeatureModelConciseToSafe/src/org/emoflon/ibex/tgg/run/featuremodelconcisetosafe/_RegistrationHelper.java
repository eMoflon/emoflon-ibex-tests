package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe;

import java.io.IOException;
	
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.featuremodelconcisetosafe.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.run.featuremodelconcisetosafe.DefaultRegistrationHelper;

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
