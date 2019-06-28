package org.emoflon.ibex.tgg.run.featuremodelconcisetosafe;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.featuremodelconcisetosafe.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import FeatureModelConciseToSafe.FeatureModelConciseToSafePackage;
import FeatureModelConciseToSafe.impl.FeatureModelConciseToSafePackageImpl;
import FeatureModelConcise.impl.FeatureModelConcisePackageImpl;
import FeatureModelSafe.impl.FeatureModelSafePackageImpl;

public class DefaultRegistrationHelper {
	
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
		EPackage featuremodelconcisePack = null;
		EPackage featuremodelsafePack = null;
		
		FeatureModelConciseToSafePackageImpl.init();
		rs.getPackageRegistry().put("platform:/resource/FeatureModelConciseToSafe/model/FeatureModelConciseToSafe.ecore", FeatureModelConciseToSafePackage.eINSTANCE);
		rs.getPackageRegistry().put("platform:/plugin/FeatureModelConciseToSafe/model/FeatureModelConciseToSafe.ecore", FeatureModelConciseToSafePackage.eINSTANCE);
				
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore");
			featuremodelsafePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore");
			featuremodelconcisePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
		
		if(featuremodelconcisePack == null)
			featuremodelconcisePack = FeatureModelConcisePackageImpl.init();
				
		if(featuremodelsafePack == null)
			featuremodelsafePack = FeatureModelSafePackageImpl.init();
			
		rs.getPackageRegistry().put("platform:/resource/FeatureModelConcise/model/FeatureModelConcise.ecore", featuremodelconcisePack);
	    rs.getPackageRegistry().put("platform:/plugin/FeatureModelConcise/model/FeatureModelConcise.ecore", featuremodelconcisePack);	
			
		rs.getPackageRegistry().put("platform:/resource/FeatureModelSafe/model/FeatureModelSafe.ecore", featuremodelsafePack);
		rs.getPackageRegistry().put("platform:/plugin/FeatureModelSafe/model/FeatureModelSafe.ecore", featuremodelsafePack);
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("FeatureModelConciseToSafe");
		options.projectPath("FeatureModelConciseToSafe");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
