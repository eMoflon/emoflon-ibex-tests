package org.emoflon.ibex.tgg.run.artoqou.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.artoqou.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import Ar.impl.ArPackageImpl;
import Qou.impl.QouPackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		ArPackageImpl.init();
		QouPackageImpl.init();
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("ArToQou");
		options.projectPath("ArToQou");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
