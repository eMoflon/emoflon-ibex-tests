package org.emoflon.ibex.tgg.run.blockcodeadapter.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.blockcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import BlockCodeAdapter.BlockCodeAdapterPackage;
import BlockCodeAdapter.impl.BlockCodeAdapterPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;
import BlockLanguage.impl.BlockLanguagePackageImpl;

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
		EPackage blocklanguagePack = null;
		EPackage blockcodeadapterPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/BlockLanguage/model/BlockLanguage.ecore");
			blocklanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BlockCodeAdapter/model/BlockCodeAdapter.ecore");
			blockcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BlockCodeAdapter/model/BlockCodeAdapter.ecore");
			blockcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(mocatreePack == null)
			mocatreePack = MocaTreePackageImpl.init();
				
		if(blocklanguagePack == null)
			blocklanguagePack = BlockLanguagePackageImpl.init();
		
		if(blockcodeadapterPack == null) {
			blockcodeadapterPack = BlockCodeAdapterPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/BlockCodeAdapter/model/BlockCodeAdapter.ecore", BlockCodeAdapterPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/BlockCodeAdapter/model/BlockCodeAdapter.ecore", BlockCodeAdapterPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", mocatreePack);
	    rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", mocatreePack);	
			
		rs.getPackageRegistry().put("platform:/resource/BlockLanguage/model/BlockLanguage.ecore", blocklanguagePack);
		rs.getPackageRegistry().put("platform:/plugin/BlockLanguage/model/BlockLanguage.ecore", blocklanguagePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("BlockCodeAdapter");
		options.project.path("BlockCodeAdapter");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
