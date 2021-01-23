package org.emoflon.ibex.tgg.run.exttype2doc_shortcut.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.exttype2doc_shortcut.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import ExtType2Doc_ShortCut.ExtType2Doc_ShortCutPackage;
import ExtType2Doc_ShortCut.impl.ExtType2Doc_ShortCutPackageImpl;
import ExtTypeModel.impl.ExtTypeModelPackageImpl;
import ExtDocModel.impl.ExtDocModelPackageImpl;

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
		EPackage exttypemodelPack = null;
		EPackage extdocmodelPack = null;
		EPackage exttype2doc_shortcutPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ExtDocModel/model/ExtDocModel.ecore");
			extdocmodelPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/ExtType2Doc_ShortCut/model/ExtType2Doc_ShortCut.ecore");
			exttype2doc_shortcutPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ExtTypeModel/model/ExtTypeModel.ecore");
			exttypemodelPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/ExtType2Doc_ShortCut/model/ExtType2Doc_ShortCut.ecore");
			exttype2doc_shortcutPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(exttypemodelPack == null)
			exttypemodelPack = ExtTypeModelPackageImpl.init();
				
		if(extdocmodelPack == null)
			extdocmodelPack = ExtDocModelPackageImpl.init();
		
		if(exttype2doc_shortcutPack == null) {
			exttype2doc_shortcutPack = ExtType2Doc_ShortCutPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/ExtType2Doc_ShortCut/model/ExtType2Doc_ShortCut.ecore", ExtType2Doc_ShortCutPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/ExtType2Doc_ShortCut/model/ExtType2Doc_ShortCut.ecore", ExtType2Doc_ShortCutPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/ExtTypeModel/model/ExtTypeModel.ecore", exttypemodelPack);
	    rs.getPackageRegistry().put("platform:/plugin/ExtTypeModel/model/ExtTypeModel.ecore", exttypemodelPack);	
			
		rs.getPackageRegistry().put("platform:/resource/ExtDocModel/model/ExtDocModel.ecore", extdocmodelPack);
		rs.getPackageRegistry().put("platform:/plugin/ExtDocModel/model/ExtDocModel.ecore", extdocmodelPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("ExtType2Doc_ShortCut");
		options.project.path("ExtType2Doc_ShortCut");
		options.debug.ibexDebug(false);
		options.csp.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
