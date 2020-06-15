package org.emoflon.ibex.tgg.run.adele2aadl.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.adele2aadl.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/trg/aadl2.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/trg/instance.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Components.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Features.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/ADELE_Relations.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/BA_components.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/BA_features.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/BA_relations.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/KernelSpices.ecore");
		executable.getResourceHandler().loadAndRegisterMetamodel("platform:/resource/Adele2Aadl/metamodels/src/ObjectDescriptionModel.ecore");
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("Adele2Aadl");
		options.projectPath("Adele2Aadl");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
