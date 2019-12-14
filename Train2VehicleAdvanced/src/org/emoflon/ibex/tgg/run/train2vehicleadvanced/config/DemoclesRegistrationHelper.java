package org.emoflon.ibex.tgg.run.train2vehicleadvanced.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.train2vehicleadvanced.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		strategy.loadAndRegisterMetamodel("platform:/resource/AdvancedTrain/model/AdvancedTrain.ecore");
		strategy.loadAndRegisterMetamodel("platform:/resource/AdvancedVehicle/model/AdvancedVehicle.ecore");
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("Train2VehicleAdvanced");
		options.projectPath("Train2VehicleAdvanced");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
