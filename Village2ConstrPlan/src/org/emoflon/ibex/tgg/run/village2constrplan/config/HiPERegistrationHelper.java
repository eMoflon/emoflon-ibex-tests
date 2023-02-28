package org.emoflon.ibex.tgg.run.village2constrplan.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.village2constrplan.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Village2ConstrPlan.Village2ConstrPlanPackage;
import Village2ConstrPlan.impl.Village2ConstrPlanPackageImpl;
import Village.impl.VillagePackageImpl;
import ConstructionPlan.impl.ConstructionPlanPackageImpl;

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
		EPackage villagePack = null;
		EPackage constructionplanPack = null;
		EPackage village2constrplanPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ConstructionPlan/model/ConstructionPlan.ecore");
			constructionplanPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Village2ConstrPlan/model/Village2ConstrPlan.ecore");
			village2constrplanPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Village/model/Village.ecore");
			villagePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Village2ConstrPlan/model/Village2ConstrPlan.ecore");
			village2constrplanPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(villagePack == null)
			villagePack = VillagePackageImpl.init();
				
		if(constructionplanPack == null)
			constructionplanPack = ConstructionPlanPackageImpl.init();
		
		if(village2constrplanPack == null) {
			village2constrplanPack = Village2ConstrPlanPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Village2ConstrPlan/model/Village2ConstrPlan.ecore", Village2ConstrPlanPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Village2ConstrPlan/model/Village2ConstrPlan.ecore", Village2ConstrPlanPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Village/model/Village.ecore", villagePack);
	    rs.getPackageRegistry().put("platform:/plugin/Village/model/Village.ecore", villagePack);	
			
		rs.getPackageRegistry().put("platform:/resource/ConstructionPlan/model/ConstructionPlan.ecore", constructionplanPack);
		rs.getPackageRegistry().put("platform:/plugin/ConstructionPlan/model/ConstructionPlan.ecore", constructionplanPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Village2ConstrPlan");
		options.project.path("Village2ConstrPlan");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
