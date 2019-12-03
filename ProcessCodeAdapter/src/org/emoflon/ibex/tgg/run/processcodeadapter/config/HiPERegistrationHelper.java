package org.emoflon.ibex.tgg.run.processcodeadapter.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.processcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import MocaTree.impl.MocaTreePackageImpl;
import ProcessCodeAdapter.ProcessCodeAdapterPackage;
import ProcessCodeAdapter.impl.ProcessCodeAdapterPackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class HiPERegistrationHelper {
	
	/** Create default options **/
	public static final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage mocatreePack = null;
		EPackage processdefinitionPack = null;
		EPackage processcodeadapterPack = null;
		
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore");
			processdefinitionPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore");
			processcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore");
			processcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(mocatreePack == null)
			mocatreePack = MocaTreePackageImpl.init();
				
		if(processdefinitionPack == null)
			processdefinitionPack = ProcessDefinitionPackageImpl.init();
		
		if(processcodeadapterPack == null) {
			processcodeadapterPack = ProcessCodeAdapterPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore", ProcessCodeAdapterPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/ProcessCodeAdapter/model/ProcessCodeAdapter.ecore", ProcessCodeAdapterPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", mocatreePack);
	    rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", mocatreePack);	
			
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", processdefinitionPack);
		rs.getPackageRegistry().put("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore", processdefinitionPack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("ProcessCodeAdapter");
		options.projectPath("ProcessCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
