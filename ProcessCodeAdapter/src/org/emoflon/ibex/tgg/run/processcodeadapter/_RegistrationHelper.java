package org.emoflon.ibex.tgg.run.processcodeadapter;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.processcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessCodeAdapter.ProcessCodeAdapterPackage;
import ProcessCodeAdapter.impl.ProcessCodeAdapterPackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		ProcessDefinitionPackageImpl.init();
		MocaTreePackageImpl.init();
		
		ProcessCodeAdapterPackageImpl.init();
		
		rs.getPackageRegistry().put("platform:/resource/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore", ProcessCodeAdapterPackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore", ProcessCodeAdapterPackage.eINSTANCE);
		
		if(strategy instanceof FWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/MocaTree/model/MocaTree.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			// Load and register source and target metamodels
			Resource res = strategy.loadResource("platform:/resource/../metamodels/ProcessDefinition/model/ProcessDefinition.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", pack);
			rs.getPackageRegistry().put("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore", pack);
		}
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("ProcessCodeAdapter");
		options.projectPath("ProcessCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
