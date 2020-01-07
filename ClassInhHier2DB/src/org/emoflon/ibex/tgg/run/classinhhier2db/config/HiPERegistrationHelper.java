package org.emoflon.ibex.tgg.run.classinhhier2db.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.classinhhier2db.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;

import ClassInhHier2DB.ClassInhHier2DBPackage;
import ClassInhHier2DB.impl.ClassInhHier2DBPackageImpl;
import ClassInheritanceHierarchy.impl.ClassInheritanceHierarchyPackageImpl;
import Database.impl.DatabasePackageImpl;

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
		EPackage classinheritancehierarchyPack = null;
		EPackage databasePack = null;
		EPackage classinhhier2dbPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Database/model/Database.ecore");
			databasePack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/ClassInhHier2DB/model/ClassInhHier2DB.ecore");
			classinhhier2dbPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore");
			classinheritancehierarchyPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/ClassInhHier2DB/model/ClassInhHier2DB.ecore");
			classinhhier2dbPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(classinheritancehierarchyPack == null)
			classinheritancehierarchyPack = ClassInheritanceHierarchyPackageImpl.init();
				
		if(databasePack == null)
			databasePack = DatabasePackageImpl.init();
		
		if(classinhhier2dbPack == null) {
			classinhhier2dbPack = ClassInhHier2DBPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/ClassInhHier2DB/model/ClassInhHier2DB.ecore", ClassInhHier2DBPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/ClassInhHier2DB/model/ClassInhHier2DB.ecore", ClassInhHier2DBPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", classinheritancehierarchyPack);
	    rs.getPackageRegistry().put("platform:/plugin/ClassInheritanceHierarchy/model/ClassInheritanceHierarchy.ecore", classinheritancehierarchyPack);	
			
		rs.getPackageRegistry().put("platform:/resource/Database/model/Database.ecore", databasePack);
		rs.getPackageRegistry().put("platform:/plugin/Database/model/Database.ecore", databasePack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("ClassInhHier2DB");
		options.projectPath("ClassInhHier2DB");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
