package org.emoflon.ibex.tgg.run.terracehouses2blockset.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.terracehouses2blockset.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import TerraceHouses2BlockSet.TerraceHouses2BlockSetPackage;
import TerraceHouses2BlockSet.impl.TerraceHouses2BlockSetPackageImpl;
import TerraceHouses.impl.TerraceHousesPackageImpl;
import WoodenBlockSet.impl.WoodenBlockSetPackageImpl;

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
		EPackage terracehousesPack = null;
		EPackage woodenblocksetPack = null;
		EPackage terracehouses2blocksetPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/WoodenBlockSet/model/WoodenBlockSet.ecore");
			woodenblocksetPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/TerraceHouses2BlockSet/model/TerraceHouses2BlockSet.ecore");
			terracehouses2blocksetPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/TerraceHouses/model/TerraceHouses.ecore");
			terracehousesPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/TerraceHouses2BlockSet/model/TerraceHouses2BlockSet.ecore");
			terracehouses2blocksetPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(terracehousesPack == null)
			terracehousesPack = TerraceHousesPackageImpl.init();
				
		if(woodenblocksetPack == null)
			woodenblocksetPack = WoodenBlockSetPackageImpl.init();
		
		if(terracehouses2blocksetPack == null) {
			terracehouses2blocksetPack = TerraceHouses2BlockSetPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/TerraceHouses2BlockSet/model/TerraceHouses2BlockSet.ecore", TerraceHouses2BlockSetPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/TerraceHouses2BlockSet/model/TerraceHouses2BlockSet.ecore", TerraceHouses2BlockSetPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/TerraceHouses/model/TerraceHouses.ecore", terracehousesPack);
	    rs.getPackageRegistry().put("platform:/plugin/TerraceHouses/model/TerraceHouses.ecore", terracehousesPack);	
			
		rs.getPackageRegistry().put("platform:/resource/WoodenBlockSet/model/WoodenBlockSet.ecore", woodenblocksetPack);
		rs.getPackageRegistry().put("platform:/plugin/WoodenBlockSet/model/WoodenBlockSet.ecore", woodenblocksetPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("TerraceHouses2BlockSet");
		options.projectPath("TerraceHouses2BlockSet");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
