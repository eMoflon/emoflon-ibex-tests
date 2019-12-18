package org.emoflon.ibex.tgg.run.artoqou.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.artoqou.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import Ar.impl.ArPackageImpl;
import ArToQou.ArToQouPackage;
import ArToQou.impl.ArToQouPackageImpl;
import Qou.impl.QouPackageImpl;

public class HiPERegistrationHelper implements IRegistrationHelper {
	
	/** Create default options **/
	public final void setWorkspaceRootDirectory(ResourceSet resourceSet) throws IOException {
		final String root = "../";
		URI key = URI.createPlatformResourceURI("/", true);
		URI value = URI.createFileURI(new File(root).getCanonicalPath() + File.separatorChar);
		resourceSet.getURIConverter().getURIMap().put(key, value);
	}

	/** Load and register source and target metamodels */
	public void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		
		// Set correct workspace root
		setWorkspaceRootDirectory(rs);
		
		// Load and register source and target metamodels
		EPackage arPack = null;
		EPackage qouPack = null;
		EPackage artoqouPack = null;
		
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/Qou/model/Qou.ecore");
			qouPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/ArToQou/model/ArToQou.ecore");
			artoqouPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/Ar/model/Ar.ecore");
			arPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = strategy.loadResource("platform:/resource/ArToQou/model/ArToQou.ecore");
			artoqouPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(arPack == null)
			arPack = ArPackageImpl.init();
				
		if(qouPack == null)
			qouPack = QouPackageImpl.init();
		
		if(artoqouPack == null) {
			artoqouPack = ArToQouPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/ArToQou/model/ArToQou.ecore", ArToQouPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/ArToQou/model/ArToQou.ecore", ArToQouPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Ar/model/Ar.ecore", arPack);
	    rs.getPackageRegistry().put("platform:/plugin/Ar/model/Ar.ecore", arPack);	
			
		rs.getPackageRegistry().put("platform:/resource/Qou/model/Qou.ecore", qouPack);
		rs.getPackageRegistry().put("platform:/plugin/Qou/model/Qou.ecore", qouPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("ArToQou");
		options.projectPath("ArToQou");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
