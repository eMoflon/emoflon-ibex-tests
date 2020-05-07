package org.emoflon.ibex.tgg.run.clazz2glossardoc.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.clazz2glossardoc.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import Clazz2GlossarDoc.Clazz2GlossarDocPackage;
import Clazz2GlossarDoc.impl.Clazz2GlossarDocPackageImpl;
import simpleClassInheritance.impl.SimpleClassInheritancePackageImpl;
import glossarDocumentation.impl.GlossarDocumentationPackageImpl;

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
		EPackage simpleclassinheritancePack = null;
		EPackage glossardocumentationPack = null;
		EPackage clazz2glossardocPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/GlossarDocumentation/model/GlossarDocumentation.ecore");
			glossardocumentationPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Clazz2GlossarDoc/model/Clazz2GlossarDoc.ecore");
			clazz2glossardocPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/SimpleClassInheritance/model/SimpleClassInheritance.ecore");
			simpleclassinheritancePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Clazz2GlossarDoc/model/Clazz2GlossarDoc.ecore");
			clazz2glossardocPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(simpleclassinheritancePack == null)
			simpleclassinheritancePack = SimpleClassInheritancePackageImpl.init();
				
		if(glossardocumentationPack == null)
			glossardocumentationPack = GlossarDocumentationPackageImpl.init();
		
		if(clazz2glossardocPack == null) {
			clazz2glossardocPack = Clazz2GlossarDocPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Clazz2GlossarDoc/model/Clazz2GlossarDoc.ecore", Clazz2GlossarDocPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Clazz2GlossarDoc/model/Clazz2GlossarDoc.ecore", Clazz2GlossarDocPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/SimpleClassInheritance/model/SimpleClassInheritance.ecore", simpleclassinheritancePack);
	    rs.getPackageRegistry().put("platform:/plugin/SimpleClassInheritance/model/SimpleClassInheritance.ecore", simpleclassinheritancePack);	
			
		rs.getPackageRegistry().put("platform:/resource/GlossarDocumentation/model/GlossarDocumentation.ecore", glossardocumentationPack);
		rs.getPackageRegistry().put("platform:/plugin/GlossarDocumentation/model/GlossarDocumentation.ecore", glossardocumentationPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Clazz2GlossarDoc");
		options.project.path("Clazz2GlossarDoc");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
