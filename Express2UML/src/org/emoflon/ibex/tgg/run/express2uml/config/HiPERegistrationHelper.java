package org.emoflon.ibex.tgg.run.express2uml.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.express2uml.RuntimeTGGAttrConstraintFactoryContainer;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.options.IbexOptions;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.runtime.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;

import Express2UML.Express2UMLPackage;
import Express2UML.impl.Express2UMLPackageImpl;
import ExpressModel.impl.ExpressModelPackageImpl;
import uml.impl.UmlPackageImpl;

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
		EPackage expressmodelPack = null;
		EPackage umlPack = null;
		EPackage express2umlPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/UML/model/UML.ecore");
			umlPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Express2UML/model/Express2UML.ecore");
			express2umlPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/ExpressModel/model/ExpressModel.ecore");
			expressmodelPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/Express2UML/model/Express2UML.ecore");
			express2umlPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(expressmodelPack == null)
			expressmodelPack = ExpressModelPackageImpl.init();
				
		if(umlPack == null)
			umlPack = UmlPackageImpl.init();
		
		if(express2umlPack == null) {
			express2umlPack = Express2UMLPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/Express2UML/model/Express2UML.ecore", Express2UMLPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/Express2UML/model/Express2UML.ecore", Express2UMLPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/ExpressModel/model/ExpressModel.ecore", expressmodelPack);
	    rs.getPackageRegistry().put("platform:/plugin/ExpressModel/model/ExpressModel.ecore", expressmodelPack);	
			
		rs.getPackageRegistry().put("platform:/resource/UML/model/UML.ecore", umlPack);
		rs.getPackageRegistry().put("platform:/plugin/UML/model/UML.ecore", umlPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("Express2UML");
		options.project.path("Express2UML");
		options.debug.ibexDebug(false);
		options.csp.registerConstraintFactories(new RuntimeTGGAttrConstraintFactoryContainer().getFactories());
			
		options.registrationHelper(this);
		return options;
	}
}
