package org.emoflon.ibex.tgg.run.adeletoaadl;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.csp.constraints.factories.adeletoaadl.UserDefinedRuntimeTGGAttrConstraintFactory;
import org.emoflon.ibex.tgg.operational.defaults.IbexOptions;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;

import Aadl.impl.AadlPackageImpl;
import Adele.AdelePackage;
import Adele.impl.AdelePackageImpl;





public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy) throws IOException {
		// Replace to register generated code or handle other URI-related requirements
		
		 
		 AadlPackageImpl.init();		
		 AdelePackageImpl.init();
		 rs.getPackageRegistry().put("platform:/resource/Adele/model/generated/Adele.ecore", AdelePackage.eINSTANCE);
		  
	}

	/** Create default options **/
	public static IbexOptions createIbexOptions() {
		IbexOptions options = new IbexOptions();
		options.projectName("AdeleToAadl");
		options.projectPath("AdeleToAadl");
		options.debug(false);
		options.userDefinedConstraints(new UserDefinedRuntimeTGGAttrConstraintFactory());
		return options;
	}
}
