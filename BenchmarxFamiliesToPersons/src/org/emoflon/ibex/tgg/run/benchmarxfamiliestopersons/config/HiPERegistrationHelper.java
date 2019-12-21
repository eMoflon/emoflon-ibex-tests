package org.emoflon.ibex.tgg.run.benchmarxfamiliestopersons.config;

import java.io.File;
import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.compiler.defaults.IRegistrationHelper;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.benchmarxfamiliestopersons.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.modules.IbexExecutable;
import org.emoflon.ibex.tgg.operational.strategies.opt.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.opt.FWD_OPT;
import org.emoflon.ibex.tgg.runtime.hipe.HiPETGGEngine;

import BenchmarxFamiliesToPersons.BenchmarxFamiliesToPersonsPackage;
import BenchmarxFamiliesToPersons.impl.BenchmarxFamiliesToPersonsPackageImpl;
import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;

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
		EPackage familiesPack = null;
		EPackage personsPack = null;
		EPackage benchmarxfamiliestopersonsPack = null;
		
		if(executable instanceof FWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Persons/model/Persons.ecore");
			personsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BenchmarxFamiliesToPersons/model/BenchmarxFamiliesToPersons.ecore");
			benchmarxfamiliestopersonsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}
				
		if(executable instanceof BWD_OPT) {
			Resource res = executable.getResourceHandler().loadResource("platform:/resource/Families/model/Families.ecore");
			familiesPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			
			res = executable.getResourceHandler().loadResource("platform:/resource/BenchmarxFamiliesToPersons/model/BenchmarxFamiliesToPersons.ecore");
			benchmarxfamiliestopersonsPack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
		}

		if(familiesPack == null)
			familiesPack = FamiliesPackageImpl.init();
				
		if(personsPack == null)
			personsPack = PersonsPackageImpl.init();
		
		if(benchmarxfamiliestopersonsPack == null) {
			benchmarxfamiliestopersonsPack = BenchmarxFamiliesToPersonsPackageImpl.init();
			rs.getPackageRegistry().put("platform:/resource/BenchmarxFamiliesToPersons/model/BenchmarxFamiliesToPersons.ecore", BenchmarxFamiliesToPersonsPackage.eINSTANCE);
			rs.getPackageRegistry().put("platform:/plugin/BenchmarxFamiliesToPersons/model/BenchmarxFamiliesToPersons.ecore", BenchmarxFamiliesToPersonsPackage.eINSTANCE);
		}
			
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", familiesPack);
	    rs.getPackageRegistry().put("platform:/plugin/Families/model/Families.ecore", familiesPack);	
			
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", personsPack);
		rs.getPackageRegistry().put("platform:/plugin/Persons/model/Persons.ecore", personsPack);
	}

	/** Create default options **/
	public IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.setBlackInterpreter(new HiPETGGEngine());
		options.projectName("BenchmarxFamiliesToPersons");
		options.projectPath("BenchmarxFamiliesToPersons");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		options.registrationHelper(this);
		return options;
	}
}
