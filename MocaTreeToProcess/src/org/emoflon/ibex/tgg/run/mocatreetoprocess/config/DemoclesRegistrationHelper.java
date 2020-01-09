package org.emoflon.ibex.tgg.run.mocatreetoprocess.config;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.mocatreetoprocess.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.democles.DemoclesTGGEngine;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class DemoclesRegistrationHelper implements IRegistrationHelper {

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable)  throws IOException {
		// Load and register source and target metamodels
		MocaTreePackageImpl.init();
		ProcessDefinitionPackageImpl.init();
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore", pack);
		}
		
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
		}
	}
	
	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new DemoclesTGGEngine());
		options.projectName("MocaTreeToProcess");
		options.projectPath("MocaTreeToProcess");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
