package org.emoflon.ibex.tgg.run.java2doc.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.java2doc.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Java2Doc.Java2DocPackage;
import Java2Doc.impl.Java2DocPackageImpl;
import simpleJava.impl.SimpleJavaPackageImpl;
import simpleDoc.impl.SimpleDocPackageImpl;

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
		EPackage simplejavaPack = null;
		EPackage simpledocPack = null;
		EPackage java2docPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimpleDoc/model/SimpleDoc.ecore");
			simpledocPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Java2Doc/model/Java2Doc.ecore");
			java2docPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimpleJava/model/SimpleJava.ecore");
			simplejavaPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Java2Doc/model/Java2Doc.ecore");
			java2docPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(simplejavaPack == null)
			simplejavaPack = SimpleJavaPackageImpl.init();
				
		if(simpledocPack == null)
			simpledocPack = SimpleDocPackageImpl.init();
		
		if(java2docPack == null) {
			java2docPack = Java2DocPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Java2Doc/model/Java2Doc.ecore", Java2DocPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Java2Doc/model/Java2Doc.ecore", Java2DocPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/SimpleJava/model/SimpleJava.ecore", simplejavaPack);
	    rs.getPackageRegistry().put("platform:/plugin/SimpleJava/model/SimpleJava.ecore", simplejavaPack);	
			
		rs.getPackageRegistry().put("platform:/resource/SimpleDoc/model/SimpleDoc.ecore", simpledocPack);
		rs.getPackageRegistry().put("platform:/plugin/SimpleDoc/model/SimpleDoc.ecore", simpledocPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("Java2Doc");
		options.projectPath("Java2Doc");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
