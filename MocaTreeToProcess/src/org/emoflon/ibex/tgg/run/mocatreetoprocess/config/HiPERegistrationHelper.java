package org.emoflon.ibex.tgg.run.mocatreetoprocess.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.mocatreetoprocess.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import MocaTreeToProcess.MocaTreeToProcessPackage;
import MocaTreeToProcess.impl.MocaTreeToProcessPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;
import ProcessDefinition.impl.ProcessDefinitionPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, IbexExecutable executable) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage mocatreePack = null;
		EPackage processdefinitionPack = null;
		EPackage mocatreetoprocessPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore");
			processdefinitionPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/MocaTreeToProcess/model/MocaTreeToProcess.ecore");
			mocatreetoprocessPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/MocaTreeToProcess/model/MocaTreeToProcess.ecore");
			mocatreetoprocessPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(mocatreePack == null)
			mocatreePack = MocaTreePackageImpl.init();
				
		if(processdefinitionPack == null)
			processdefinitionPack = ProcessDefinitionPackageImpl.init();
		
		if(mocatreetoprocessPack == null) {
			mocatreetoprocessPack = MocaTreeToProcessPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/MocaTreeToProcess/model/MocaTreeToProcess.ecore", MocaTreeToProcessPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/MocaTreeToProcess/model/MocaTreeToProcess.ecore", MocaTreeToProcessPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", mocatreePack);
	    rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", mocatreePack);	
			
		rs.getPackageRegistry().put("platform:/resource/ProcessDefinition/model/ProcessDefinition.ecore", processdefinitionPack);
		rs.getPackageRegistry().put("platform:/plugin/ProcessDefinition/model/ProcessDefinition.ecore", processdefinitionPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("MocaTreeToProcess");
		options.project.path("MocaTreeToProcess");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
