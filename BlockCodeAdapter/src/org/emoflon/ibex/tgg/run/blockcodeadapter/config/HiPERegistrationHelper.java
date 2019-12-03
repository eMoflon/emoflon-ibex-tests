package org.emoflon.ibex.tgg.run.blockcodeadapter.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.blockcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import BlockCodeAdapter.BlockCodeAdapterPackage;
import BlockCodeAdapter.impl.BlockCodeAdapterPackageImpl;
import BlockLanguage.impl.BlockLanguagePackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

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
		EPackage blocklanguagePack = null;
		EPackage blockcodeadapterPack = null;
		
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/BlockLanguage/model/BlockLanguage.ecore");
			blocklanguagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/BlockCodeAdapter/model/BlockCodeAdapter.ecore");
			blockcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/BlockCodeAdapter/model/BlockCodeAdapter.ecore");
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
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("BlockCodeAdapter");
		options.projectPath("BlockCodeAdapter");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
