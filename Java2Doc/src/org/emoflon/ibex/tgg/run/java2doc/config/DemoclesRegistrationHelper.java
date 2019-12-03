package org.emoflon.ibex.tgg.run.java2doc.config;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.java2doc.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import simpleDoc.impl.SimpleDocPackageImpl;
import simpleJava.impl.SimpleJavaPackageImpl;

public class DemoclesRegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		SimpleDocPackageImpl.init();
		SimpleJavaPackageImpl.init();
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("Java2Doc");
		options.projectPath("Java2Doc");
		options.debug(false);
		options.repairAttributes(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
