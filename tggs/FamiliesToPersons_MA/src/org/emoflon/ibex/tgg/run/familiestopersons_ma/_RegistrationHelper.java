package org.emoflon.ibex.tgg.run.familiestopersons_ma;

import java.io.IOException;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;
import org.emoflon.ibex.tgg.operational.strategies.sync.BWD_OPT;
import org.emoflon.ibex.tgg.operational.strategies.sync.FWD_OPT;

import Families.impl.FamiliesPackageImpl;
import Persons.impl.PersonsPackageImpl;


public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		// Load and register source and target metamodels
		rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", FamiliesPackageImpl.init());
		rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", PersonsPackageImpl.init());
		
		if(strategy instanceof FWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Persons/model/Persons.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			rs.getPackageRegistry().put("platform:/resource/Persons/model/Persons.ecore", pack);
		}
		
		if(strategy instanceof BWD_OPT) {
			Resource res = strategy.loadResource("platform:/resource/../../benchmarx/examples/familiestopersons/metamodels/Families/model/Families.ecore");
			EPackage pack = (EPackage) res.getContents().get(0);
			rs.getResources().remove(res);
			rs.getPackageRegistry().put("platform:/resource/Families/model/Families.ecore", pack);
		}
	}
}
