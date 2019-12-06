package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config;

import java.io.IOException;
	
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

public class _DefaultRegistrationHelper implements IRegistrationHelper{

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		new DemoclesRegistrationHelper().registerMetamodels(rs, strategy);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		return new DemoclesRegistrationHelper().createIbexOptions();
	}
}
