package org.emoflon.ibex.tgg.run.modiscoibextgg;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		strategy.loadAndRegisterMetamodel("platform:/resource/MoDiscoIbexTGG/metamodels/java.ecore");
		strategy.loadAndRegisterMetamodel("platform:/resource/MoDiscoIbexTGG/metamodels/UML.ecore");
			
		if(strategy instanceof FWD_OPT) {
		}
		
		if(strategy instanceof BWD_OPT) {
		}
	}
}
