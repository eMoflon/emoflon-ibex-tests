package org.emoflon.ibex.tgg.run.java2doc.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.java2doc.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.viatra.ViatraTGGEngine;

import simpleJava.impl.SimpleJavaPackageImpl;
import simpleDoc.impl.SimpleDocPackageImpl;

public class ViatraRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		// Load and register source and target metamodels
		SimpleJavaPackageImpl.init();
		SimpleDocPackageImpl.init();
	
	if(executable instanceof FWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/simpleDoc/model/simpleDoc.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/simpleDoc/model/simpleDoc.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/simpleDoc/model/simpleDoc.ecore", pack);
		}
								
	if(executable instanceof BWD_OPT) {
		Resource res = executable.getResourceHandler().loadResource("platform:/resource/simpleJava/model/simpleJava.ecore");
		EPackage pack = (EPackage) res.getContents().get(0);
		rs.getPackageRegistry().put("platform:/resource/simpleJava/model/simpleJava.ecore", pack);
		rs.getPackageRegistry().put("platform:/plugin/simpleJava/model/simpleJava.ecore", pack);
		}
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new ViatraTGGEngine());
		options.project.name("Java2Doc");
		options.project.path("Java2Doc");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
