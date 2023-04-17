package org.emoflon.ibex.tgg.run.modiscoibextgg.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.custom.modiscoibextgg.RuntimeTGGAttrConstraintFactoryContainer;
import org.emoflon.ibex.tgg.runtime.config.IRegistrationHelper;
import org.emoflon.ibex.tgg.runtime.config.options.IbexOptions;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;
import org.emoflon.ibex.tgg.runtime.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.runtime.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.runtime.strategies.opt.FWD_OPT;

import Java.impl.JavaPackageImpl;
import MoDiscoIbexTGG.MoDiscoIbexTGGPackage;
import MoDiscoIbexTGG.impl.MoDiscoIbexTGGPackageImpl;
import UML2.impl.UML2PackageImpl;

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
		EPackage javaPack = null;
		EPackage uml2Pack = null;
		EPackage modiscoibextggPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/UML2/model/UML2.ecore");
			uml2Pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/MoDiscoIbexTGG/model/MoDiscoIbexTGG.ecore");
			modiscoibextggPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Java/model/Java.ecore");
			javaPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/MoDiscoIbexTGG/model/MoDiscoIbexTGG.ecore");
			modiscoibextggPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(javaPack == null)
			javaPack = JavaPackageImpl.init();
				
		if(uml2Pack == null)
			uml2Pack = UML2PackageImpl.init();
		
		if(modiscoibextggPack == null) {
			modiscoibextggPack = MoDiscoIbexTGGPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/MoDiscoIbexTGG/model/MoDiscoIbexTGG.ecore", MoDiscoIbexTGGPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/MoDiscoIbexTGG/model/MoDiscoIbexTGG.ecore", MoDiscoIbexTGGPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Java/model/Java.ecore", javaPack);
	    rs.getPackageRegistry().put("platform:/plugin/Java/model/Java.ecore", javaPack);	
			
		rs.getPackageRegistry().put("platform:/resource/UML2/model/UML2.ecore", uml2Pack);
		rs.getPackageRegistry().put("platform:/plugin/UML2/model/UML2.ecore", uml2Pack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.blackInterpreter(new HiPETGGEngine());
		options.project.name("MoDiscoIbexTGG");
		options.project.path("MoDiscoIbexTGG");
		options.debug.ibexDebug(false);
		options.csp.registerConstraintFactories(new RuntimeTGGAttrConstraintFactoryContainer().getFactories());
			
		options.registrationHelper(this);
		return options;
	}
}
