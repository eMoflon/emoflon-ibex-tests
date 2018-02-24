package org.emoflon.ibex.gt.testsuite;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.emoflon.ibex.common.operational.IPatternInterpreter;
import org.emoflon.ibex.gt.api.GraphTransformationAPI;
import org.emoflon.ibex.gt.democles.runtime.DemoclesGTEngine;

/**
 * An abstract test case for Graph Transformation.
 *
 * @param <API>
 *            the API to test
 */
public abstract class GTTestCase<API extends GraphTransformationAPI> {
	/**
	 * Relative path to the directory with the projects with the graph
	 * transformation rules.
	 */
	public static String workspacePath = "../../gt-rules/";

	/**
	 * Relative path to the instances directory. Files from this directory are
	 * changed during the transformations.
	 */
	private static String instancesPath = "./instances/";

	/**
	 * Relative path to the resources directory. Files from this directory are just
	 * loaded, but never changed during transformation.
	 */
	private static String resourcePath = "./resources/";

	/**
	 * Creates an API instance. This method must be implemented for each API.
	 * 
	 * @return the created API
	 */
	protected abstract API getAPI(final IPatternInterpreter engine, final ResourceSet model);

	/**
	 * Defines the meta-model packages as a mapping between their URI and the
	 * EPackage.
	 * 
	 * @return a Map containing the meta-model packages
	 */
	protected abstract Map<String, EPackage> getMetaModelPackages();

	/**
	 * Initializes the API for the tests.
	 * 
	 * @param name
	 *            the name of the API which is tested.
	 * @param modelFileName
	 *            the name of the model file
	 * @return the created API
	 */
	protected API initAPI(final String name, final String modelFileName) {
		DemoclesGTEngine engine = new DemoclesGTEngine();
		engine.setDebugPath("./debug/" + name);
		return this.getAPI(engine, this.initResourceSet(modelFileName));
	}

	/**
	 * Initializes the API for the tests.
	 * 
	 * @param name
	 *            the name of the API which is tested.
	 * @param model
	 *            the model file
	 * @return the created API
	 */
	protected API initAPI(final String name, final ResourceSet model) {
		DemoclesGTEngine engine = new DemoclesGTEngine();
		engine.setDebugPath("./debug/" + name);
		return this.getAPI(engine, model);
	}

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory. The content of the
	 * resource file is copied to the newly created file (optional).
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @param resourceFileName
	 *            the name of the resource file to copy
	 * @return a resource set containing the model file
	 */
	protected ResourceSet initResourceSet(final String modelInstanceFileName, final String resourceFileName) {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());

		URI instanceURI = URI.createFileURI(instancesPath + modelInstanceFileName);
		ResourceSet resourceSet = new ResourceSetImpl();
		Registry packageRegistry = resourceSet.getPackageRegistry();
		this.getMetaModelPackages().forEach((eNS_URI, eINSTANCE) -> packageRegistry.put(eNS_URI, eINSTANCE));

		Resource instanceResource = resourceSet.createResource(instanceURI);

		// If a file with the given name exists in the resource folder, copy its
		// contents to the instance file.
		if (null != resourceFileName) {
			File file = new File(resourcePath + resourceFileName);
			if (file.exists()) {
				URI resourceURI = URI.createFileURI(resourcePath + resourceFileName);
				Resource res = resourceSet.getResource(resourceURI, true);
				instanceResource.getContents().addAll(res.getContents());
			}
		}

		// Save the resource.
		try {
			instanceResource.save(null);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resourceSet;
	}

	/**
	 * Initializes the resource set with the given name.
	 * 
	 * The resource is created in the instances directory. If a equally named
	 * resource exists in the resources directory, its content is copied to the new
	 * resource.
	 * 
	 * @param modelInstanceFileName
	 *            the name of the model file
	 * @return a resource set containing the model file
	 */
	protected ResourceSet initResourceSet(final String modelInstanceFileName) {
		return this.initResourceSet(modelInstanceFileName, modelInstanceFileName);
	}
}
