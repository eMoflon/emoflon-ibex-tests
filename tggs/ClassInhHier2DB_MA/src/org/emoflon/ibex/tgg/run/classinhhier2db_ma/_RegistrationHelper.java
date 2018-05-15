package org.emoflon.ibex.tgg.run.classinhhier2db_ma;

import java.io.IOException;

import org.apache.commons.lang3.NotImplementedException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.emoflon.ibex.tgg.operational.strategies.OperationalStrategy;


public class _RegistrationHelper {

	/** Load and register source and target metamodels */
	public static void registerMetamodels(ResourceSet rs, OperationalStrategy strategy)  throws IOException {
		throw new NotImplementedException("You need to register your source and target metamodels.");
		
		// For both source and target metamodels (and any other dependencies you might require)
		
		// Option 1 (recommended): If you have generated code for your metamodel <Foo> and use eMoflon projects and defaults,
		//                         just add the project Foo as a plugin dependency and simply use:
		// FooPackageImpl.init();

		// Option 2:  If you wish to use the .ecore file directly without generating code
		// strategy.loadAndRegisterMetamodel("<pathToEcoreFile>");
		
		// Option 3 (advanced): If you have an .ecore file with an arbitrary URI "<URIOfPackage>"
		// String pathToEcoreFile = "<pathToEcoreFile>";
		// URI key = URI.createURI("<URIOfPackage>");
		// URI value = URI.createURI(pathToEcoreFile);
		// strategy.loadAndRegisterMetamodel(pathToEcoreFile);
		// rs.getURIConverter().getURIMap().put(key, value);
	}
}
