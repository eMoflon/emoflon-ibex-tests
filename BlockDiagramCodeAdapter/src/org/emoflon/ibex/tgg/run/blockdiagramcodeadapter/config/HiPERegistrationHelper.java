package org.emoflon.ibex.tgg.run.blockdiagramcodeadapter.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.blockdiagramcodeadapter.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import BlockDiagramCodeAdapter.BlockDiagramCodeAdapterPackage;
import BlockDiagramCodeAdapter.impl.BlockDiagramCodeAdapterPackageImpl;
import BlockDiagram.impl.BlockDiagramPackageImpl;
import MocaTree.impl.MocaTreePackageImpl;

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
		EPackage blockdiagramPack = null;
		EPackage mocatreePack = null;
		EPackage blockdiagramcodeadapterPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/MocaTree/model/MocaTree.ecore");
			mocatreePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore");
			blockdiagramcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/BlockDiagram/model/BlockDiagram.ecore");
			blockdiagramPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore");
			blockdiagramcodeadapterPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(blockdiagramPack == null)
			blockdiagramPack = BlockDiagramPackageImpl.init();
				
		if(mocatreePack == null)
			mocatreePack = MocaTreePackageImpl.init();
		
		if(blockdiagramcodeadapterPack == null) {
			blockdiagramcodeadapterPack = BlockDiagramCodeAdapterPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore", BlockDiagramCodeAdapterPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/BlockDiagramCodeAdapter/model/BlockDiagramCodeAdapter.ecore", BlockDiagramCodeAdapterPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/BlockDiagram/model/BlockDiagram.ecore", blockdiagramPack);
	    rs.getPackageRegistry().put("platform:/plugin/BlockDiagram/model/BlockDiagram.ecore", blockdiagramPack);	
			
		rs.getPackageRegistry().put("platform:/resource/MocaTree/model/MocaTree.ecore", mocatreePack);
		rs.getPackageRegistry().put("platform:/plugin/MocaTree/model/MocaTree.ecore", mocatreePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("BlockDiagramCodeAdapter");
		options.project.path("BlockDiagramCodeAdapter");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
