package org.emoflon.ibex.tgg.run.java2doc;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import simpleDoc.impl.SimpleDocPackageImpl;
import simpleJava.impl.SimpleJavaPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		SimpleDocPackageImpl.init();
		SimpleJavaPackageImpl.init();
	}
	
	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("Java2Doc");
		options.projectPath("Java2Doc");
		options.debug(false);
		options.repairUsingShortcutRules(true);
		options.repairAttributes(true);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
