package org.emoflon.ibex.tgg.run.vhdltggcodeadapter.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.vhdltggcodeadapter.RuntimeTGGAttrConstraintFactoryContainer;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.options.IbexOptions;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.runtime.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;

import MocaTree.impl.MocaTreePackageImpl;
import VHDLModel.impl.VHDLModelPackageImpl;
import VHDLTGGCodeAdapter.VHDLTGGCodeAdapterPackage;
import VHDLTGGCodeAdapter.impl.VHDLTGGCodeAdapterPackageImpl;

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
		EPackage vhdlmodelPack = null;
		EPackage vhdltggcodeadapterPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/VHDLModel/model/VHDLModel.ecore");
			vhdlmodelPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/VHDLTGGCodeAdapter/model/VHDLTGGCodeAdapter.ecore");
			vhdltggcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/VHDLTGGCodeAdapter/model/VHDLTGGCodeAdapter.ecore");
			vhdltggcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(mocatreePack == null)
			mocatreePack = MocaTreePackageImpl.init();
				
		if(vhdlmodelPack == null)
			vhdlmodelPack = VHDLModelPackageImpl.init();
		
		if(vhdltggcodeadapterPack == null) {
			vhdltggcodeadapterPack = VHDLTGGCodeAdapterPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/VHDLTGGCodeAdapter/model/VHDLTGGCodeAdapter.ecore", VHDLTGGCodeAdapterPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/VHDLTGGCodeAdapter/model/VHDLTGGCodeAdapter.ecore", VHDLTGGCodeAdapterPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", mocatreePack);
	    rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", mocatreePack);	
			
		rs.getPackageRegistry().put("platform:/resource/VHDLModel/model/VHDLModel.ecore", vhdlmodelPack);
		rs.getPackageRegistry().put("platform:/plugin/VHDLModel/model/VHDLModel.ecore", vhdlmodelPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("VHDLTGGCodeAdapter");
		options.project.path("VHDLTGGCodeAdapter");
		options.debug.ibexDebug(false);
		options.csp.registerConstraintFactories(new RuntimeTGGAttrConstraintFactoryContainer().getFactories());
			
		options.registrationHelper(this);
		return options;
	}
}
